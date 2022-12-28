package com.crayon.fieldapp.ui.base.dialog.selectAgency

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.RecyclerView
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.remote.response.RoleResponse
import com.crayon.fieldapp.ui.base.dialog.selectRole.SelectAgencyRVAdapter

class SelectAgencyDialog() : DialogFragment(),
    SelectAgencyRVAdapter.SelectRoleListener {
    lateinit var rvAgency: RecyclerView
    lateinit var btnChoose: Button

    private var mListener: SelectAgencyListener? = null
    lateinit var adapter: SelectAgencyRVAdapter
    lateinit var mLayoutManager: RecyclerView.LayoutManager

    fun setListener(listener: SelectAgencyListener) {
        this.mListener = listener
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(R.layout.dialog_select_agency, container, false).apply {
            rvAgency = findViewById(R.id.rv_agency)
            btnChoose = findViewById(R.id.btn_choose)

            btnChoose.setOnClickListener {
                val agency = adapter.getSelectedRole()
                agency?.let {
                    mListener?.onSelectAgencyItemClicked(it)
                }
                this@SelectAgencyDialog.dismiss()
            }

            this@SelectAgencyDialog.arguments?.let {
                val items = it.getSerializable("agency") as ArrayList<RoleResponse>
                this@SelectAgencyDialog.activity?.let {
                    adapter = SelectAgencyRVAdapter(items, it, this@SelectAgencyDialog)
                    mLayoutManager = androidx.recyclerview.widget.LinearLayoutManager(it)
                    rvAgency.setLayoutManager(mLayoutManager)
                    rvAgency.adapter = adapter
                }

            }
        }

    interface SelectAgencyListener {
        fun onSelectAgencyItemClicked(agencyId: RoleResponse)
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

    override fun onRoleItemClicked(agencyId: String) {
        btnChoose.setBackgroundColor(resources.getColor(R.color.colorAccent, null))
        btnChoose.isEnabled = true
    }
}