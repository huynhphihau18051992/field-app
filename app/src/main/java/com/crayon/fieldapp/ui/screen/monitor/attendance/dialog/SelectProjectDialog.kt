package studio.phillip.yolo.presentation.manage.timekeeping.dialog

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.model.SelectItem
import com.crayon.fieldapp.ui.screen.monitor.attendance.adapter.SelectProjectRVAdapter
import com.crayon.fieldapp.utils.setSingleClick
import kotlinx.android.synthetic.main.dialog_select_project.*
import kotlinx.android.synthetic.main.dialog_select_project.view.*

class SelectProjectDialog(val itemClickListener: (SelectItem) -> Unit = {}) : DialogFragment() {
    lateinit var adapter: SelectProjectRVAdapter
    lateinit var mLayoutManager: RecyclerView.LayoutManager


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(R.layout.dialog_select_project, container, false).apply {

            btn_choose?.setSingleClick {
                Log.d("AAA", "btn_choose")
                val agency = adapter.getSelectedItem()
                agency?.let {
                    itemClickListener(it)
                }
                this@SelectProjectDialog.dismiss()
            }

            this@SelectProjectDialog.arguments?.let {
                val items = it.getSerializable("projects") as ArrayList<SelectItem>
                this@SelectProjectDialog.activity?.let {
                    adapter = SelectProjectRVAdapter(items, it, {
                        btn_choose?.setBackgroundColor(
                            resources.getColor(
                                R.color.colorAccent,
                                null
                            )
                        )
                        btn_choose?.isEnabled = true
                    })
                    mLayoutManager = androidx.recyclerview.widget.LinearLayoutManager(it)
                    rv_project?.setLayoutManager(mLayoutManager)
                    rv_project?.adapter = adapter
                }

            }
        }


    override fun onStart() {
        super.onStart()
        val dialog = dialog
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false)
            val window = dialog.window
            val wlp = window!!.attributes
            wlp.gravity = Gravity.CENTER
            dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.WHITE))
            window.attributes = wlp
            window.setLayout(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
        }
    }
}