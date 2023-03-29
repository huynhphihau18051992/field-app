package com.crayon.fieldapp.ui.widgets

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.TaskResponse
import com.crayon.fieldapp.utils.toDate
import studio.phillip.yolo.utils.TimeFormatUtils
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class MtsCalendarView : LinearLayout {

    // date format
    private var dateFormat: String? = null

    // current displayed month
    private val currentDate = Calendar.getInstance()

    //event handling
    private var eventHandler: EventHandler? = null

    // internal components
    private var header: LinearLayout? = null
    private var btnPrev: ImageView? = null
    private var btnNext: ImageView? = null
    private var txtDate: TextView? = null
    private var grid: GridView? = null

    // seasons' rainbow
    internal var rainbow = intArrayOf(R.color.summer, R.color.fall, R.color.winter, R.color.spring)

    // month-season association (northern hemisphere, sorry australia :)
    internal var monthSeason = intArrayOf(2, 2, 3, 3, 3, 0, 0, 0, 1, 1, 1, 2)

    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        initControl(context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        initControl(context, attrs)
    }


    /**
     * Load control xml layout
     */
    private fun initControl(context: Context, attrs: AttributeSet) {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.control_calendar, this)

        loadDateFormat(attrs)
        assignUiElements()
        assignClickHandlers()

        updateCalendar()
    }

    private fun loadDateFormat(attrs: AttributeSet) {
        val ta = context.obtainStyledAttributes(attrs, R.styleable.CalendarView)

        try {
            // try to load provided date format, and fallback to default otherwise
            dateFormat = ta.getString(R.styleable.CalendarView_dateFormat)
            if (dateFormat == null)
                dateFormat = DATE_FORMAT
        } finally {
            ta.recycle()
        }
    }

    private fun assignUiElements() {
        // layout is inflated, assign local variables to components
        header = findViewById<View>(R.id.calendar_header) as LinearLayout
        btnPrev = findViewById<View>(R.id.calendar_prev_button) as ImageView
        btnNext = findViewById<View>(R.id.calendar_next_button) as ImageView
        txtDate = findViewById<View>(R.id.calendar_date_display) as TextView
        grid = findViewById<View>(R.id.calendar_grid) as GridView
    }

    private fun assignClickHandlers() {
        // add one month and refresh UI
        btnNext!!.setOnClickListener {
            currentDate.add(Calendar.MONTH, 1)
            updateCalendar()
            eventHandler!!.onMonthPress(currentDate)
        }

        // subtract one month and refresh UI
        btnPrev!!.setOnClickListener {
            currentDate.add(Calendar.MONTH, -1)
            updateCalendar()
            eventHandler!!.onMonthPress(currentDate)
        }

        grid!!.onItemLongClickListener =
            AdapterView.OnItemLongClickListener { view, cell, position, id ->
                if (eventHandler == null)
                    return@OnItemLongClickListener false

                eventHandler!!.onDayLongPress(view.getItemAtPosition(position) as Date)
                true
            }

        grid!!.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            eventHandler!!.onDayShortPress(parent.getItemAtPosition(position) as Date)
        }
    }

    /**
     * Display dates correctly in grid
     */
    @JvmOverloads
    fun updateCalendar(events: HashMap<Date, ArrayList<TaskResponse>>? = null) {
        val cells = ArrayList<Date>()
        val calendar = currentDate.clone() as Calendar

        calendar.set(Calendar.DAY_OF_MONTH, 1)
        val monthBeginningCell = calendar.get(Calendar.DAY_OF_WEEK) - 1

        calendar.add(Calendar.DAY_OF_MONTH, -monthBeginningCell)

        while (cells.size < DAYS_COUNT) {
            cells.add(calendar.time)
            calendar.add(Calendar.DAY_OF_MONTH, 1)
        }

        grid!!.adapter = CalendarAdapter(context, cells, events)

        val sdf = SimpleDateFormat(dateFormat)
        txtDate!!.text = sdf.format(currentDate.time)

        val month = currentDate.get(Calendar.MONTH)
        val season = monthSeason[month]
        val color = rainbow[season]

        header!!.setBackgroundColor(resources.getColor(color, null))
    }


    private inner class CalendarAdapter(
        context: Context, days: ArrayList<Date>, // days with events
        private val eventDays: HashMap<Date, ArrayList<TaskResponse>>?
    ) : ArrayAdapter<Date>(context, R.layout.control_calendar_day, days) {

        // for view inflation
        private val inflater: LayoutInflater

        init {
            inflater = LayoutInflater.from(context)
        }


        override fun getView(position: Int, view: View?, parent: ViewGroup): View {
            var view = view
            // day in question
            val date = getItem(position)
            val day = TimeFormatUtils.getDate(date!!)
            val month = TimeFormatUtils.getMonth(date!!)
            val year = TimeFormatUtils.getYear(date!!)

            // today
            val today = Date()

            if (view == null)
                view = inflater.inflate(R.layout.control_calendar_day, parent, false)

            val tvDate = view!!.findViewById<TextView>(R.id.txt_date)
            val tvNumShift = view!!.findViewById<TextView>(R.id.txt_num_shift)
            tvDate.setBackgroundColor(resources.getColor(R.color.colorGray, null))
            tvNumShift.setBackgroundColor(resources.getColor(R.color.colorGray, null))
            if (eventDays != null) {
                eventDays.keys.forEach {
                    if (TimeFormatUtils.getDate(it) == day &&
                        TimeFormatUtils.getMonth(it) == month &&
                        TimeFormatUtils.getYear(it) == year
                    ) {
                        val tasks = eventDays.get(it)
                        tvNumShift.text = tasks!!.size.toString()

                        tvDate.setBackgroundColor(resources.getColor(R.color.colorWhite, null))
                        tvNumShift.setBackgroundColor(resources.getColor(R.color.colorWhite, null))

                        var invalidShift = 0
                        tasks.forEach {
                            val attendances = it.attendances

                            if (attendances != null && attendances.size > 0) {
                                if (attendances.get(0).checkInTime != null && attendances.get(0).checkOutTime != null) {
                                    val checkInTime =
                                        attendances.get(0).checkInTime!!.toDate("yyyy-MM-dd'T'HH:mm")
                                    val startTime =
                                        it.job!!.startTime!!.toDate("yyyy-MM-dd'T'HH:mm")
                                    val checkOutTime =
                                        attendances.get(0).checkOutTime!!.toDate("yyyy-MM-dd'T'HH:mm")
                                    val endTime = it.job!!.endTime!!.toDate("yyyy-MM-dd'T'HH:mm")
                                    if (checkInTime!!.after(startTime) || checkOutTime!!.before(
                                            endTime
                                        )
                                    ) {
                                        invalidShift++
                                    }
                                }
                            } else {
                                it.job!!.startTime?.let {
                                    if (it.toDate("yyyy-MM-dd'T'HH:mm")!!.before(Date())) {
                                        invalidShift++
                                    }
                                }
                            }
                        }
                        if (invalidShift > 0) {
                            tvNumShift.setBackgroundColor(
                                resources.getColor(
                                    R.color.colorRed,
                                    null
                                )
                            )
                            tvNumShift.setTextColor(resources.getColor(R.color.colorWhite, null))
                        }
                    }
                }
            }
            tvDate.text = TimeFormatUtils.getDate(date).toString()
            if (month != TimeFormatUtils.getMonth(today) || year != TimeFormatUtils.getYear(today)) {
                tvDate.setTextColor(resources.getColor(R.color.colorBlack, null))
            } else if (day == TimeFormatUtils.getDate(today)) {
                tvDate.setTextColor(resources.getColor(R.color.today, null))
            }
            return view
        }
    }

    /**
     * Assign event handler to be passed needed events
     */
    fun setEventHandler(eventHandler: EventHandler) {
        this.eventHandler = eventHandler
    }

    /**
     * This interface defines what events to be reported to
     * the outside world
     */
    interface EventHandler {
        fun onDayLongPress(date: Date)
        fun onDayShortPress(date: Date)
        fun onMonthPress(cal: Calendar)
    }

    companion object {
        // for logging
        private val LOGTAG = "Calendar View"

        // how many days to show, defaults to six weeks, 42 days
        private val DAYS_COUNT = 42

        // default date format
        private val DATE_FORMAT = "MMM yyyy"
    }
}
/**
 * Display dates correctly in grid
 */
