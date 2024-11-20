package com.crayon.fieldapp.utils

import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.SystemClock
import android.view.View
import android.webkit.WebView
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.signature.ObjectKey
import com.crayon.fieldapp.BuildConfig
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.constants.Constants
import com.crayon.fieldapp.data.model.Attendance
import com.crayon.fieldapp.data.remote.response.*
import java.text.SimpleDateFormat
import java.util.*

@BindingAdapter("onRefreshListener")
fun SwipeRefreshLayout.customRefreshListener(listener: SwipeRefreshLayout.OnRefreshListener?) {
    if (listener != null) setOnRefreshListener(listener)
}

@BindingAdapter("isRefreshing")
fun SwipeRefreshLayout.customRefreshing(refreshing: Boolean?) {
    isRefreshing = refreshing == true
}

@BindingAdapter("onScrollListener")
fun RecyclerView.customScrollListener(listener: RecyclerView.OnScrollListener?) {
    if (listener != null) addOnScrollListener(listener)
}

@BindingAdapter("glideSrc")
fun ImageView.setGlideSrc(@DrawableRes src: Int?) {
    Glide.with(context).load(src).into(this)
}

@BindingAdapter("loadUri")
fun ImageView.loadLocalImage(uri: Uri?) {
    Glide.with(context).load(uri).into(this)
}

@BindingAdapter(value = ["loadImageLocal"])
fun ImageView.loadLocalImage(imageName: String?) {
    if (imageName.isNullOrBlank().not()) {
        Glide.with(context)
            .load(resources.getIdentifier(imageName, "drawable", BuildConfig.APPLICATION_ID))
            .into(this)
    }
}

@BindingAdapter(
    value = ["imageUrl", "thumbnailUrl", "placeholder", "errorDrawable", "requestListener", "centerCrop", "fitCenter", "circleCrop", "diskCacheStrategy", "skipMemoryCache", "signatureKey"],
    requireAll = false
)
fun ImageView.loadImage(
    imageUrl: String? = null,
    thumbnailUrl: String? = null,
    placeHolder: Drawable? = null,
    errorDrawable: Drawable? = null,
    requestListener: RequestListener<Drawable>? = null,
    centerCrop: Boolean = false,
    fitCenter: Boolean = false,
    circleCrop: Boolean = false,
    diskCacheStrategy: DiskCacheStrategy? = null,
    skipMemoryCache: Boolean? = false,
    signatureKey: String? = null
) {
    if (imageUrl.isNullOrBlank()) {
        setImageDrawable(placeHolder)
        return
    }

    val requestOptions = RequestOptions().apply {

        // cache type: https://futurestud.io/tutorials/glide-how-to-choose-the-best-caching-preference
        // Glide 4.x: DiskCacheStrategy.RESOURCE Glide 3.x: DiskCacheStrategy.RESULT caches only the final image, after reducing the resolution (and possibly transformations) (default behavior of Glide 3.x)
        // Glide 4.x: DiskCacheStrategy.DATA, Glide 3.x: DiskCacheStrategy.SOURCE caches only the original full-resolution image
        // Glide 4.x only: DiskCacheStrategy.AUTOMATIC intelligently chooses a cache strategy based on the resource (default behavior of Glide 4.x)
        // Glide 3.x & 4.x: DiskCacheStrategy.ALL caches all versions of the image
        // Glide 3.x & 4.x: DiskCacheStrategy.NONE caches nothing
        diskCacheStrategy(diskCacheStrategy ?: DiskCacheStrategy.RESOURCE)
        skipMemoryCache?.let {
            skipMemoryCache(it)
        }
        placeholder(placeHolder)
        error(errorDrawable)

        // crop type
        if (centerCrop) centerCrop()
        if (fitCenter) fitCenter()
        if (circleCrop) circleCrop()

        if (!signatureKey.isNullOrBlank()) {
            signature(ObjectKey(signatureKey))
        }
    }

    GlideApp.with(context).load(imageUrl).apply {
        transition(DrawableTransitionOptions.withCrossFade())
        addListener(requestListener)
        // breaks sharedElementEnterTransition
        /*if (thumbnailUrl.isNullOrBlank().not()) {
            thumbnail(Glide.with(context).load(thumbnailUrl).apply(requestOptions))
        } else {
            thumbnail(0.2f)
        }*/
        apply(requestOptions)
    }.into(this)
}

@BindingAdapter("clickSafe")
fun View.setClickSafe(listener: View.OnClickListener?) {
    setOnClickListener(object : View.OnClickListener {
        var lastClickTime: Long = 0

        override fun onClick(v: View) {
            if (SystemClock.elapsedRealtime() - lastClickTime < Constants.THRESHOLD_CLICK_TIME) {
                return
            }
            listener?.onClick(v)
            lastClickTime = SystemClock.elapsedRealtime()
        }
    })
}

@BindingAdapter("onSingleClick")
fun View.setSingleClick(execution: () -> Unit) {
    setOnClickListener(object : View.OnClickListener {
        var lastClickTime: Long = 0

        override fun onClick(p0: View?) {
            if (SystemClock.elapsedRealtime() - lastClickTime < Constants.THRESHOLD_CLICK_TIME) {
                return
            }
            lastClickTime = SystemClock.elapsedRealtime()
            execution.invoke()
        }
    })
}

@BindingAdapter("loadUrl")
fun WebView.loadWebUrl(url: String?) {
    url?.apply {
        loadUrl(url)
    }
}

@BindingAdapter("backgroundTint")
fun TextView.customBackgroundTint(color: Int?) {
    if (color == null) return
    background?.setTint(color)
}

@BindingAdapter(
    value = ["firstName", "lastName"],
    requireAll = true
)
fun TextView.setName(firstName: String? = null, lastName: String? = null) {
    text = lastName + " " + firstName
}

@BindingAdapter("loadDate")
fun TextView.customDateFormat(origin: String? = null) {
    try {
        val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm")
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"))
        text = SimpleDateFormat("dd/MM/yyyy").format(
            simpleDateFormat.parse(
                origin!!.substring(
                    0,
                    16
                )
            )
        )
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

@BindingAdapter("loadFullDate")
fun TextView.customFullDateFormat(origin: String? = null) {
    try {
        val simpleDateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm")
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"))
        text = SimpleDateFormat("dd/MM/yyyy HH:mm").format(
            simpleDateFormat.parse(
                origin!!.substring(
                    0,
                    16
                )
            )
        )
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

@BindingAdapter("loadFullDate")
fun TextView.customFullDateFormat(origin: Long) {
    text = origin.toTimeString("dd/MM/yyyy HH:mm")
}

@BindingAdapter("toString")
fun EditText.toString(origin: Int) {
    setText(origin.toString())
}

@BindingAdapter("tint")
fun ImageView.customTint(color: Int?) {
    if (color == null) return
    imageTintList = ColorStateList.valueOf(color)
}

@BindingAdapter("projectInfo")
fun TextView.setProjectInfo(item: ProjectResponse) {
    val startDate = formatDate(item.startDate!!)
    val endDate = formatDate(item.endDate!!)

    text = startDate + "-" + endDate
}

@BindingAdapter("attendanceInfo")
fun TextView.setAttendance(item: AttendanceResponse) {
    val startDate = formatDate(item.startTime.toString())
    val endDate = formatDate(item.endTime.toString())

    text = startDate + "-" + endDate
}

@BindingAdapter("attendanceStatus")
fun TextView.setAttendanceStatus(item: AttendanceResponse) {
    var totalTask = 0
    var totalCompletedTask = 0
    totalTask = item.totalCount!!.toInt()
    totalCompletedTask = item.noTaskCompleted!!.toInt()

    if (totalTask > totalCompletedTask) {
        text = "Chưa chấm công"
        setTextColor(resources.getColor(R.color.colorPrimary, null))
    } else {
        text = "Đã chấm công"
        setTextColor(resources.getColor(R.color.colorGreen, null))
    }
}

@BindingAdapter("shiftJob")
fun TextView.setShift(item: JobResponse) {
    val startDate = formatHour(item.startTime.toString())
    val endDate = formatHour(item.endTime.toString())

    text = startDate + "-" + endDate
}

@BindingAdapter("shiftTask")
fun TextView.setShift(item: TaskResponse) {
    val startDate = formatHour(item.job!!.startTime.toString())
    val endDate = formatHour(item.job!!.endTime.toString())

    text = startDate + "-" + endDate
}

@BindingAdapter("durationTime")
fun TextView.setDurationTime(createDate: String) {
    text = formatNotification(createDate.toDate("yyyy-MM-dd'T'HH:mm", Locale.getDefault())!!)
}

@BindingAdapter("contentSwitchShift")
fun TextView.setContentSwitchShift(item: ApplicationResponse) {
    text =
        item.employee!!.lastName + " " + item.employee.firstName + " muốn đổi ca làm việc với bạn"
}

@BindingAdapter("contentMemberRequest")
fun TextView.setContentMemberRequest(item: MemberRequestResponse) {
    text =
        "Công ty: " + item.agency!!.name + " " + "đã gửi lời mời làm việc tới bạn"
}

@BindingAdapter("applicationStatus")
fun TextView.setApplicationStatus(status: String) {
    var displayText = ""
    when (status) {
        ApplicationStatus.PENDING.value -> {
            displayText = ApplicationStatus.PENDING.text
        }
        ApplicationStatus.ACCEPTED.value -> {
            displayText = ApplicationStatus.ACCEPTED.text
        }
        ApplicationStatus.REJECTED.value -> {
            displayText = ApplicationStatus.REJECTED.text
        }
        ApplicationStatus.WAIT_REPLACE.value -> {
            displayText = ApplicationStatus.WAIT_REPLACE.text
        }
        ApplicationStatus.ACCEPT_REPLACE.value -> {
            displayText = ApplicationStatus.ACCEPT_REPLACE.text
        }
        ApplicationStatus.REJECT_REPLACE.value -> {
            displayText = ApplicationStatus.REJECT_REPLACE.text
        }
    }
    text = displayText
}

@BindingAdapter("applicationType")
fun TextView.setApplicationType(type: String) {
    var displayText = ""
    when (type) {
        ApplicationType.TAKE_LEAVE.value -> {
            displayText = ApplicationType.TAKE_LEAVE.text
        }
        ApplicationType.SWITCH_SHIFT.value -> {
            displayText = ApplicationType.SWITCH_SHIFT.text
        }
        ApplicationType.WITHDRAW_FROM_PROJECT.value -> {
            displayText = ApplicationType.WITHDRAW_FROM_PROJECT.text
        }
    }
    text = displayText
}

@BindingAdapter("applicationStatus")
fun ImageView.setIconStatus(status: String) {
    var icon = 0
    when (status) {
        ApplicationStatus.PENDING.value,
        ApplicationStatus.WAIT_REPLACE.value,
        ApplicationStatus.ACCEPT_REPLACE.value,
        ApplicationStatus.REJECT_REPLACE.value ->
            icon = R.drawable.ic_tick_inside_circle
        ApplicationStatus.REJECTED.value -> {
            icon = R.drawable.ic_no_entry
        }
        ApplicationStatus.ACCEPTED.value -> {
            icon = R.drawable.ic_green_check
        }
    }
    setImageResource(icon)
}

@BindingAdapter("displayAcceptButton")
fun LinearLayout.isDisplayAcceptButton(status: String) {
    visibility = if (status.equals("Pending")) View.VISIBLE else View.GONE
}



