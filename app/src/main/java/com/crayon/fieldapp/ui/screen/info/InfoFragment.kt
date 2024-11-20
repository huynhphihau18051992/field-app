package com.crayon.fieldapp.ui.screen.info

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.AdapterView
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.model.Gender
import com.crayon.fieldapp.databinding.FragmentInfoBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.base.adapter.CityAdapter
import com.crayon.fieldapp.ui.base.adapter.GenderSPAdapter
import com.crayon.fieldapp.ui.base.dialog.DatePickerSpinnerDialog
import com.crayon.fieldapp.ui.base.dialog.getPhoto.GetPhotoDialogFragment
import com.crayon.fieldapp.ui.screen.info.model.UpdateInfoForm
import com.crayon.fieldapp.utils.*
import kotlinx.android.synthetic.main.fragment_info.*
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.io.File
import java.text.SimpleDateFormat
import java.util.*

class InfoFragment : BaseFragment<FragmentInfoBinding, InfoViewModel>(),
    DatePickerSpinnerDialog.DatePickerDialogListener,
    GetPhotoDialogFragment.GetPhotoDialogListener {

    override val layoutId: Int = R.layout.fragment_info

    override val viewModel: InfoViewModel by viewModel()
    private lateinit var cityAdapter: CityAdapter
    private lateinit var currentCityAdapter: CityAdapter
    private lateinit var districtAdapter: CityAdapter
    private lateinit var currentDistrictAdapter: CityAdapter
    private lateinit var genderAdapter: GenderSPAdapter
    private var cityCode: String? = null
    private var current_cityCode: String? = null
    private var districtCode: String? = null
    private var current_districtCode: String? = null
    private var tyeImage: String? = null
    private var idFrontRef: Uri? = null
    private var idBackRef: Uri? = null
    var calendar = Calendar.getInstance()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.apply {
            getUserInfo()
        }

        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }
        sp_city?.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View, position: Int, id: Long
            ) {
            }
        }

        sp_current_city?.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View, position: Int, id: Long
            ) {
            }
        }

        sp_district?.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View, position: Int, id: Long
            ) {
            }
        }

        sp_current_district?.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View, position: Int, id: Long
            ) {
            }
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        cityAdapter = CityAdapter(requireContext(), arrayListOf())
        currentCityAdapter = CityAdapter(requireContext(), arrayListOf())
        districtAdapter = CityAdapter(requireContext(), arrayListOf())
        currentDistrictAdapter = CityAdapter(requireContext(), arrayListOf())
        genderAdapter = GenderSPAdapter(Gender.values(), this@InfoFragment.requireContext())

        sp_gender.isEnabled = false
        sp_gender.isClickable = false
        sp_gender.adapter = genderAdapter
        // City
        val cities = CityUtils.getAllCity(requireContext())
        cityAdapter.setData(cities)
        sp_city.setAdapter(cityAdapter)

        val current_cities = CityUtils.getAllCity(requireContext())
        currentCityAdapter.setData(current_cities)
        sp_current_city.setAdapter(currentCityAdapter)

        sp_city.isEnabled = false
        sp_city.isClickable = false
        sp_city?.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?, position: Int, id: Long
            ) {
                cityCode = cityAdapter.getItem(position).id
                val districts = CityUtils.getAllDistrictOfCity(requireContext(), cityCode!!)
                districtAdapter.setData(districts)
                sp_district.setAdapter(districtAdapter)
            }
        }

        sp_current_city?.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?, position: Int, id: Long
            ) {
                current_cityCode = currentCityAdapter.getItem(position).id
                val current_districts = CityUtils.getAllDistrictOfCity(requireContext(), current_cityCode!!)
                currentDistrictAdapter.setData(current_districts)
                sp_current_district.setAdapter(currentDistrictAdapter)
            }
        }

        sp_district.isEnabled = false
        sp_district.isClickable = false
        sp_district?.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?, position: Int, id: Long
            ) {
                if (districtAdapter.items.size != 0) {
                    districtCode = districtAdapter.getItem(position).id
                }
            }
        }

        sp_current_district.isEnabled = true
        sp_current_district.isClickable = true
        sp_current_district?.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?, position: Int, id: Long
            ) {
                if (currentDistrictAdapter.items.size != 0) {
                    current_districtCode = currentDistrictAdapter.getItem(position).id
                }
            }
        }

        img_id_front?.isEnabled = false
        img_id_front?.isClickable = false
        img_id_front?.setSingleClick {
            tyeImage = "id_front"
            val getPhotoDialogFragment = GetPhotoDialogFragment()
            getPhotoDialogFragment.setListener(this)
            getPhotoDialogFragment.show(childFragmentManager, getPhotoDialogFragment.getTag())
        }

        img_id_back?.isEnabled = false
        img_id_back?.isClickable = false
        img_id_back?.setSingleClick {
            tyeImage = "id_back"
            val getPhotoDialogFragment = GetPhotoDialogFragment()
            getPhotoDialogFragment.setListener(this)
            getPhotoDialogFragment.show(childFragmentManager, getPhotoDialogFragment.getTag())
        }

        txt_birth_day?.setSingleClick {
            val datepicker = DatePickerSpinnerDialog()
            datepicker.setListener(this)
            datepicker.show(childFragmentManager, datepicker.getTag())
        }

        imb_ic_filter?.setSingleClick {
            val firstName = edt_first_name.text.toString().trim()
            val lastName = edt_last_name.text.toString().trim()
            val email = edt_email.text.toString().trim()
            val gender = genderAdapter.getItem(sp_gender.selectedItemPosition).value
            val birthDate = calendar.time.toTimeString("yyyy-MM-dd").toString()
            val phone = edt_phone.text.toString().trim()
            val id = edt_id.text.toString().trim()
            val height = edt_height.text.toString().trim()
            val weight = edt_weight.text.toString().trim()
            val city = cityAdapter.getItem(sp_city.selectedItemPosition).id
            val current_city = currentCityAdapter.getItem(sp_current_city.selectedItemPosition).id
            val district = districtAdapter.getItem(sp_district.selectedItemPosition).id
            val current_district = currentDistrictAdapter.getItem(sp_current_district.selectedItemPosition).id
            val address = edt_address.text.toString()
            val current_address = edt_current_address.text.toString()

            val userForm = UpdateInfoForm(
                firstName = firstName,
                lastName = lastName,
                birthDay = birthDate,
                email = email,
                phone = phone,
                gender = gender,
                heigth = height,
                weigth = weight,
                id = id,
                city = city.toString(),
                district = district.toString(),
                address = address,
                current_address = current_address,
                current_city = current_city.toString(),
                current_district = current_district.toString()
            )

            userForm.validate().also { result ->
                if (result.first) {
                    viewModel.updateInfo(userForm)
                } else {
                    handleErrorMessage(result.second)
                }
            }
        }

        viewModel.apply {
            user.observe(viewLifecycleOwner, Observer { userInfo ->
                val cityCode = userInfo.profile!!.provinceCode?: "5"
                val currentCityCode = userInfo.profile!!.temporary_province_code?: "5"
                val currentDistrictCode = userInfo.profile!!.temporary_district_code?: "136"
                val districtCode = userInfo.profile!!.districtCode?: "136"
                calendar.time = userInfo.profile!!.birthDate.toString().toDate("yyyy-MM-dd'T'HH:mm")

                var current_city = cityAdapter.getPositionByCode(cityCode.toString())
                if (current_city != -1) {
                    sp_city.setSelection(current_city)
                }
                val districts = CityUtils.getAllDistrictOfCity(requireContext(), cityCode!!)
                districtAdapter.setData(districts)
                sp_district.setAdapter(districtAdapter)
                var current_dist = districtAdapter.getPositionByCode(districtCode.toString())
                if (current_dist != -1) {
                    Handler().postDelayed({
                        sp_district?.setSelection(current_dist)
                    }, 1000)
                }


                var temp_city = currentCityAdapter.getPositionByCode(currentCityCode.toString())
                if (temp_city != -1) {
                    sp_current_city.setSelection(temp_city)
                }
                val temp_districts = CityUtils.getAllDistrictOfCity(requireContext(), currentCityCode!!)
                currentDistrictAdapter.setData(temp_districts)
                sp_current_district.setAdapter(currentDistrictAdapter)
                var temp_dist = currentDistrictAdapter.getPositionByCode(currentDistrictCode.toString())
                if (temp_dist != -1) {
                    Handler().postDelayed({
                        sp_current_district?.setSelection(temp_dist)
                    }, 1000)
                }

                img_id_front.loadImage(
                    imageUrl = userInfo.profile.identificationImageFrontUrl,
                    centerCrop = true,
                    signatureKey = userInfo.updatedAt
                )

                img_id_back.loadImage(
                    imageUrl = userInfo.profile.identificationImageBackUrl,
                    centerCrop = true,
                    signatureKey = userInfo.updatedAt
                )
            })

            uploadImage.observe(viewLifecycleOwner, Observer {
                when (it.status) {
                    Status.LOADING -> {
                        showLoading()
                    }
                    Status.SUCCESS -> {
                        hideLoading()
                        if (tyeImage.equals("id_front")) {
                            context?.showMessageDialog("Cập nhật CMND mặt trước thành công")
                        } else {
                            context?.showMessageDialog("Cập nhật CMND mặt sau thành công")
                        }

                    }
                    Status.ERROR -> {
                        hideLoading()
                    }
                }
            })

            updateInfo.observe(viewLifecycleOwner, Observer {
                when (it.status) {
                    Status.LOADING -> {
                        showLoading()
                    }
                    Status.SUCCESS -> {
                        hideLoading()
                        requireContext().showMessageDialog(title = "Cập nhật thông tin cá nhân thành công")
                    }
                    Status.ERROR -> {
                        hideLoading()
                    }
                }
            })

        }

        findNavController().currentBackStackEntry?.savedStateHandle?.getLiveData<String>("url")
            ?.observe(viewLifecycleOwner, Observer { result ->
                val file = File(result)
                when (tyeImage) {
                    "id_front" -> {
                        img_id_front.loadImage(
                            imageUrl = Uri.fromFile(file).path,
                            centerCrop = true
                        )

                        idFrontRef = Uri.fromFile(file)
                        idFrontRef?.let { avatar ->
                            viewModel.updateIdFront(avatar)
                        }
                    }
                    "id_back" -> {
                        img_id_back.loadImage(
                            imageUrl = Uri.fromFile(file).path,
                            centerCrop = true
                        )
                        idBackRef = Uri.fromFile(file)
                        idBackRef?.let { body ->
                            viewModel.updateIdBack(body)
                        }
                    }
                }
            })

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            when (requestCode) {
                CODE_REQUEST_GALLERY -> {
                    var selectedImageUri = data!!.data
                    val path = FileManager.getPath(requireContext(), selectedImageUri)
                    val file = BitmapUtils.createImageFileToUpload(
                        requireContext(),
                        path,
                        tyeImage.toString()
                    )
                    when (tyeImage) {
                        "id_front" -> {
                            img_id_front.loadImage(
                                imageUrl = Uri.fromFile(file).path,
                                centerCrop = true
                            )

                            idFrontRef = Uri.fromFile(file)
                            idFrontRef?.let { avatar ->
                                viewModel.updateIdFront(avatar)
                            }
                        }
                        "id_back" -> {
                            img_id_back.loadImage(
                                imageUrl = Uri.fromFile(file).path,
                                centerCrop = true
                            )
                            idBackRef = Uri.fromFile(file)
                            idBackRef?.let { body ->
                                viewModel.updateIdBack(body)
                            }
                        }
                    }
                }
            }
        }
    }

    override fun selectFromGallery() {
        val intent = Intent()
        intent.type = "image/*"
        intent.action = Intent.ACTION_GET_CONTENT
        startActivityForResult(
            Intent.createChooser(intent, "Select Picture"),
            CODE_REQUEST_GALLERY
        )
    }

    override fun selectFromCamera() {
        val bundle = bundleOf("isTakeImage" to true)
        findNavController().navigate(R.id.action_global_CameraFragment, bundle)
    }

    companion object {
        const val CODE_REQUEST_GALLERY = 123
    }

    override fun getDate(date: Int, month: Int, year: Int) {
        calendar.set(Calendar.YEAR, year)
        calendar.set(Calendar.MONTH, month)
        calendar.set(Calendar.DAY_OF_MONTH, date)
        updateBirthDay()
    }

    private fun updateBirthDay() {
        val myFormat = "dd/MM/yyyy"
        val sdf = SimpleDateFormat(myFormat, Locale.getDefault())
        txt_birth_day.text = sdf.format(calendar.time).toString()
    }
}