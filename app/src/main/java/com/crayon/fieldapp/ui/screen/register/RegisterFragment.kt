package com.crayon.fieldapp.ui.screen.register

import android.app.Activity.RESULT_OK
import android.app.DatePickerDialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.request.RequestOptions
import com.crayon.fieldapp.R
import com.crayon.fieldapp.data.model.Gender
import com.crayon.fieldapp.data.model.SimpleModel
import com.crayon.fieldapp.data.remote.request.UpdateProfileForm
import com.crayon.fieldapp.databinding.FragmentRegisterBinding
import com.crayon.fieldapp.ui.base.BaseFragment
import com.crayon.fieldapp.ui.base.adapter.CityAdapter
import com.crayon.fieldapp.ui.base.adapter.GenderSPAdapter
import com.crayon.fieldapp.ui.base.adapter.SimpleSPAdapter
import com.crayon.fieldapp.ui.base.dialog.DatePickerSpinnerDialog
import com.crayon.fieldapp.ui.base.dialog.getPhoto.GetPhotoDialogFragment
import com.crayon.fieldapp.utils.*
import kotlinx.android.synthetic.main.fragment_register.*
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.io.File
import java.text.SimpleDateFormat
import java.util.*


class RegisterFragment : BaseFragment<FragmentRegisterBinding, RegisterViewModel>(),
    DatePickerSpinnerDialog.DatePickerDialogListener,
    GetPhotoDialogFragment.GetPhotoDialogListener {

    override val layoutId: Int = R.layout.fragment_register

    override val viewModel: RegisterViewModel by viewModel()

    private val calendar: Calendar = Calendar.getInstance()
    private lateinit var selectedImageUri: Uri
    private var tyeImage: String? = null
    private var cityCode: String? = null
    private var currentCityCode: String? = null
    private var districtCode: String? = null
    private var currentDistrictCode: String? = null
    lateinit var bankAdapter: SimpleSPAdapter
    lateinit var genderAdapter: GenderSPAdapter
    lateinit var cityAdapter: CityAdapter
    lateinit var currentCityAdapter: CityAdapter
    lateinit var currentDistrictAdapter: CityAdapter
    lateinit var districtAdapter: CityAdapter
    private var avatarRef: Uri? = null
    private var bodyRef: Uri? = null
    private var idFrontRef: Uri? = null
    private var idBackRef: Uri? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.apply {
            result.observe(viewLifecycleOwner, Observer {
                when (it.status) {
                    Status.LOADING -> {
                        showLoading()
                    }
                    Status.SUCCESS -> {
                        hideLoading()
                        requireContext().showDialog(
                            title = "Đăng kí thành công, vui lòng tiến hành đăng nhập",
                            textPositive = "Có",
                            positiveListener = {
                                findNavController().navigate(R.id.action_global_loginFragment)
                            }
                        )
                    }
                    Status.ERROR -> {
                        hideLoading()
                    }
                }
            })
        }

        findNavController().currentBackStackEntry?.savedStateHandle?.getLiveData<String>("url")
            ?.observe(viewLifecycleOwner, Observer { result ->
                Log.d("AAA-result", result)
                val file = File(result)
                when (tyeImage) {
                    "avatar" -> {
                        val options: RequestOptions = RequestOptions()
                            .centerCrop()
                            .circleCrop()
                            .placeholder(R.mipmap.ic_launcher_round)
                            .error(R.mipmap.ic_launcher_round)
                        GlideApp.with(requireContext()).load(result).apply(options).into(img_avatar)
                        avatarRef = Uri.fromFile(file)
                    }
                    "full_body" -> {
                        val options: RequestOptions = RequestOptions()
                            .centerCrop()
                            .fitCenter()
                            .placeholder(R.mipmap.ic_launcher_round)
                            .error(R.mipmap.ic_launcher_round)
                        GlideApp.with(requireContext()).load(result).apply(options)
                            .into(img_full_body)
                        bodyRef = Uri.fromFile(file)
                    }
                    "id_back" -> {
                        val options: RequestOptions = RequestOptions()
                            .centerCrop()
                            .fitCenter()
                            .placeholder(R.mipmap.ic_launcher_round)
                            .error(R.mipmap.ic_launcher_round)
                        GlideApp.with(requireContext()).load(result).apply(options)
                            .into(img_id_back)
                        idBackRef = Uri.fromFile(file)
                    }
                    "id_front" -> {
                        val options: RequestOptions = RequestOptions()
                            .centerCrop()
                            .fitCenter()
                            .placeholder(R.mipmap.ic_launcher_round)
                            .error(R.mipmap.ic_launcher_round)
                        GlideApp.with(requireContext()).load(result).apply(options)
                            .into(img_id_front)
                        idFrontRef = Uri.fromFile(file)
                    }
                }
            })
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        cityAdapter = CityAdapter(requireContext(), arrayListOf())
        currentCityAdapter = CityAdapter(requireContext(), arrayListOf())
        districtAdapter = CityAdapter(requireContext(), arrayListOf())
        currentDistrictAdapter = CityAdapter(requireContext(), arrayListOf())

        // Bank name
        var banks = ArrayList<SimpleModel>()
        CityUtils.getAllBank(requireContext()).forEach {
            banks.add(SimpleModel(it.name, it.id))
        }
        bankAdapter = SimpleSPAdapter(requireContext(), banks)
        sp_bank_name.setAdapter(bankAdapter)

        // Gender
        genderAdapter = GenderSPAdapter(Gender.values(), requireContext())
        sp_gender.adapter = genderAdapter

        // City
        val cities = CityUtils.getAllCity(requireContext())
        cityAdapter.setData(cities)
        currentCityAdapter.setData(cities)
        sp_city.setAdapter(cityAdapter)
        sp_current_city.setAdapter(cityAdapter)

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
                currentCityCode = currentCityAdapter.getItem(position).id
                val districts = CityUtils.getAllDistrictOfCity(requireContext(), currentCityCode!!)
                currentDistrictAdapter.setData(districts)
                sp_current_district.setAdapter(currentDistrictAdapter)
            }
        }

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

        sp_current_district?.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?, position: Int, id: Long
            ) {
                if (currentDistrictAdapter.items.size != 0) {
                    currentDistrictCode = currentDistrictAdapter.getItem(position).id
                }
            }
        }

        imb_ic_back?.setSingleClick {
            findNavController().navigateUp()
        }

        btn_tax.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW).apply {
                setData(Uri.parse("http://tracuunnt.gdt.gov.vn/tcnnt/mstcn.jsp"))
            })
        }

        img_avatar?.setSingleClick {
            tyeImage = "avatar"
            val getPhotoDialogFragment = GetPhotoDialogFragment()
            getPhotoDialogFragment.setListener(this)
            getPhotoDialogFragment.show(childFragmentManager, getPhotoDialogFragment.getTag())
        }

        img_full_body?.setSingleClick {
            tyeImage = "full_body"
            val getPhotoDialogFragment = GetPhotoDialogFragment()
            getPhotoDialogFragment.setListener(this)
            getPhotoDialogFragment.show(childFragmentManager, getPhotoDialogFragment.getTag())
        }

        img_id_front?.setSingleClick {
            tyeImage = "id_front"
            val getPhotoDialogFragment = GetPhotoDialogFragment()
            getPhotoDialogFragment.setListener(this)
            getPhotoDialogFragment.show(childFragmentManager, getPhotoDialogFragment.getTag())
        }

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

        imgRegister?.setSingleClick {
            val firstName = edt_first_name.text.toString().trim()
            val lastName = edt_last_name.text.toString().trim()
            val email = edt_email.text.toString().trim()
            val password = edt_password.text.toString().trim()
            val confirmPassword = edt_confirm_password.text.toString().trim()
            val gender = genderAdapter.getItem(sp_gender.selectedItemPosition).value
            val birthDate = txt_birth_day.text.toString().trim()
            val phone = edt_phone.text.toString().trim()
            val bankBrand = edt_brand.text.toString().trim()
            val bankNumber = edt_bank_number.text.toString().trim()
            val bankName = bankAdapter.getItem(sp_bank_name.selectedItemPosition).name.trim()
            val id = edt_id.text.toString().trim()
            val tax = edt_tax.text.toString().trim()
            val height = edt_height.text.toString().trim()
            val weight = edt_weight.text.toString().trim()
            val city = cityAdapter.getItem(sp_city.selectedItemPosition).id
            val current_city = currentCityAdapter.getItem(sp_current_city.selectedItemPosition).id
            val district = districtAdapter.getItem(sp_district.selectedItemPosition).id
            val current_district =
                currentDistrictAdapter.getItem(sp_current_district.selectedItemPosition).id
            val address = edt_address.text.toString()
            val current_address = edt_current_address.text.toString()

            val userForm = UpdateProfileForm(
                firstName = firstName,
                lastName = lastName,
                birthDay = birthDate,
                email = email,
                password = password,
                confirmPassword = confirmPassword,
                phone = phone,
                gender = gender,
                tax = tax,
                bank_number = bankNumber,
                bank_name = bankName,
                bank_brand = bankBrand,
                heigth = height,
                weigth = weight,
                id = id,
                city = city.toString(),
                district = district.toString(),
                avatar = avatarRef,
                full_body = bodyRef,
                id_front = idFrontRef,
                id_back = idBackRef,
                address = address,
                temporary_address = current_address,
                temporary_city = current_city.toString(),
                temporary_district = current_district.toString()
            )

            userForm.validate().also { result ->
                if (result.first) {
                    viewModel.register(userForm)
                } else {
                    handleErrorMessage(result.second)
                }
            }
        }

    }

    override fun selectFromGallery() {
        openGallery()
    }

    override fun selectFromCamera() {
        openCamera()
    }

    private fun openCamera() {
        val bundle = bundleOf("isTakeImage" to true)
        findNavController().navigate(R.id.action_global_CameraFragment, bundle)
    }


    override fun getDate(date: Int, month: Int, year: Int) {
        calendar.set(Calendar.YEAR, year)
        calendar.set(Calendar.MONTH, month)
        calendar.set(Calendar.DAY_OF_MONTH, date)
        updateBirthDay()
    }

    private val dateSetListener =
        DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
            calendar.set(Calendar.YEAR, year)
            calendar.set(Calendar.MONTH, monthOfYear)
            calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
        }

    private fun updateBirthDay() {
        val myFormat = "yyyy-MM-dd"
        val sdf = SimpleDateFormat(myFormat, Locale.getDefault())
        txt_birth_day.text = sdf.format(calendar.time).toString()
    }

    private fun openGallery() {
        val intent = Intent()
        intent.type = "image/*"
        intent.action = Intent.ACTION_GET_CONTENT
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), CODE_REQUEST_GALLERY)
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (resultCode == RESULT_OK && null != data) {
            when (requestCode) {
                CODE_REQUEST_GALLERY -> {
                    var selectedImageUri = data.data
                    val path = FileManager.getPath(requireContext(), selectedImageUri)
                    val file = File(path)
                    when (tyeImage) {
                        "avatar" -> {
                            val options: RequestOptions = RequestOptions()
                                .centerCrop()
                                .circleCrop()
                                .placeholder(R.mipmap.ic_launcher_round)
                                .error(R.mipmap.ic_launcher_round)
                            GlideApp.with(requireContext()).load(selectedImageUri).apply(options)
                                .into(img_avatar)
                            avatarRef = Uri.fromFile(file)
                        }
                        "full_body" -> {
                            val options: RequestOptions = RequestOptions()
                                .centerCrop()
                                .fitCenter()
                                .placeholder(R.mipmap.ic_launcher_round)
                                .error(R.mipmap.ic_launcher_round)
                            GlideApp.with(requireContext()).load(selectedImageUri).apply(options)
                                .into(img_full_body)
                            bodyRef = Uri.fromFile(file)
                        }
                        "id_back" -> {
                            val options: RequestOptions = RequestOptions()
                                .centerCrop()
                                .fitCenter()
                                .placeholder(R.mipmap.ic_launcher_round)
                                .error(R.mipmap.ic_launcher_round)
                            GlideApp.with(requireContext()).load(selectedImageUri).apply(options)
                                .into(img_id_back)
                            idBackRef = Uri.fromFile(file)
                        }
                        "id_front" -> {
                            val options: RequestOptions = RequestOptions()
                                .centerCrop()
                                .fitCenter()
                                .placeholder(R.mipmap.ic_launcher_round)
                                .error(R.mipmap.ic_launcher_round)
                            GlideApp.with(requireContext()).load(selectedImageUri).apply(options)
                                .into(img_id_front)
                            idFrontRef = Uri.fromFile(file)
                        }
                    }
                }
            }
        } else {
            handleErrorMessage("Có lỗi xảy ra")
        }
    }

    companion object {
        const val CODE_REQUEST_GALLERY = 1
    }
}