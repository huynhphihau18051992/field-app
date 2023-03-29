package com.crayon.fieldapp.databinding;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentInfoBindingImpl extends FragmentInfoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rl_toolbar, 11);
        sViewsWithIds.put(R.id.tv_title, 12);
        sViewsWithIds.put(R.id.imb_ic_back, 13);
        sViewsWithIds.put(R.id.imb_ic_filter, 14);
        sViewsWithIds.put(R.id.sv_profile, 15);
        sViewsWithIds.put(R.id.img_birth_day, 16);
        sViewsWithIds.put(R.id.sp_gender, 17);
        sViewsWithIds.put(R.id.img_gender, 18);
        sViewsWithIds.put(R.id.edt_id_front, 19);
        sViewsWithIds.put(R.id.img_id_front, 20);
        sViewsWithIds.put(R.id.edt_id_back, 21);
        sViewsWithIds.put(R.id.img_id_back, 22);
        sViewsWithIds.put(R.id.sp_city, 23);
        sViewsWithIds.put(R.id.sp_district, 24);
        sViewsWithIds.put(R.id.sp_current_city, 25);
        sViewsWithIds.put(R.id.sp_current_district, 26);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentInfoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 27, sIncludes, sViewsWithIds));
    }
    private FragmentInfoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.EditText) bindings[9]
            , (android.widget.EditText) bindings[10]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[6]
            , (android.widget.EditText) bindings[8]
            , (android.widget.RelativeLayout) bindings[21]
            , (android.widget.RelativeLayout) bindings[19]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[5]
            , (android.widget.EditText) bindings[7]
            , (android.widget.ImageButton) bindings[13]
            , (android.widget.ImageButton) bindings[14]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.RelativeLayout) bindings[11]
            , (android.widget.Spinner) bindings[23]
            , (android.widget.Spinner) bindings[25]
            , (android.widget.Spinner) bindings[26]
            , (android.widget.Spinner) bindings[24]
            , (android.widget.Spinner) bindings[17]
            , (android.widget.ScrollView) bindings[15]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[3]
            );
        this.edtAddress.setTag(null);
        this.edtCurrentAddress.setTag(null);
        this.edtEmail.setTag(null);
        this.edtFirstName.setTag(null);
        this.edtHeight.setTag(null);
        this.edtId.setTag(null);
        this.edtLastName.setTag(null);
        this.edtPhone.setTag(null);
        this.edtWeight.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.txtBirthDay.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.crayon.fieldapp.ui.screen.info.InfoViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.crayon.fieldapp.ui.screen.info.InfoViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelUser((androidx.lifecycle.MutableLiveData<com.crayon.fieldapp.data.remote.response.UserResponse>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelUser(androidx.lifecycle.MutableLiveData<com.crayon.fieldapp.data.remote.response.UserResponse> ViewModelUser, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String viewModelUserMobileNumber = null;
        com.crayon.fieldapp.data.remote.response.UserResponse viewModelUserGetValue = null;
        java.lang.String viewModelUserProfileAddress = null;
        androidx.lifecycle.MutableLiveData<com.crayon.fieldapp.data.remote.response.UserResponse> viewModelUser = null;
        java.lang.String viewModelUserIdentificationNumber = null;
        java.lang.String viewModelUserFirstName = null;
        com.crayon.fieldapp.data.remote.response.Profile viewModelUserProfile = null;
        int viewModelUserProfileWeight = 0;
        int viewModelUserProfileHeight = 0;
        java.lang.String viewModelUserProfileBirthDate = null;
        java.lang.String viewModelUserEmailAddress = null;
        com.crayon.fieldapp.ui.screen.info.InfoViewModel viewModel = mViewModel;
        java.lang.String viewModelUserLastName = null;
        java.lang.String viewModelUserProfileTemporaryAddress = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.user
                    viewModelUser = viewModel.getUser();
                }
                updateLiveDataRegistration(0, viewModelUser);


                if (viewModelUser != null) {
                    // read viewModel.user.getValue()
                    viewModelUserGetValue = viewModelUser.getValue();
                }


                if (viewModelUserGetValue != null) {
                    // read viewModel.user.getValue().mobileNumber
                    viewModelUserMobileNumber = viewModelUserGetValue.getMobileNumber();
                    // read viewModel.user.getValue().identificationNumber
                    viewModelUserIdentificationNumber = viewModelUserGetValue.getIdentificationNumber();
                    // read viewModel.user.getValue().firstName
                    viewModelUserFirstName = viewModelUserGetValue.getFirstName();
                    // read viewModel.user.getValue().profile
                    viewModelUserProfile = viewModelUserGetValue.getProfile();
                    // read viewModel.user.getValue().emailAddress
                    viewModelUserEmailAddress = viewModelUserGetValue.getEmailAddress();
                    // read viewModel.user.getValue().lastName
                    viewModelUserLastName = viewModelUserGetValue.getLastName();
                }


                if (viewModelUserProfile != null) {
                    // read viewModel.user.getValue().profile.address
                    viewModelUserProfileAddress = viewModelUserProfile.getAddress();
                    // read viewModel.user.getValue().profile.weight
                    viewModelUserProfileWeight = viewModelUserProfile.getWeight();
                    // read viewModel.user.getValue().profile.height
                    viewModelUserProfileHeight = viewModelUserProfile.getHeight();
                    // read viewModel.user.getValue().profile.birthDate
                    viewModelUserProfileBirthDate = viewModelUserProfile.getBirthDate();
                    // read viewModel.user.getValue().profile.temporary_address
                    viewModelUserProfileTemporaryAddress = viewModelUserProfile.getTemporary_address();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtAddress, viewModelUserProfileAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtCurrentAddress, viewModelUserProfileTemporaryAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtEmail, viewModelUserEmailAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtFirstName, viewModelUserFirstName);
            com.crayon.fieldapp.utils.BindingUtilsKt.toString(this.edtHeight, viewModelUserProfileHeight);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtId, viewModelUserIdentificationNumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtLastName, viewModelUserLastName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtPhone, viewModelUserMobileNumber);
            com.crayon.fieldapp.utils.BindingUtilsKt.toString(this.edtWeight, viewModelUserProfileWeight);
            com.crayon.fieldapp.utils.BindingUtilsKt.customDateFormat(this.txtBirthDay, viewModelUserProfileBirthDate);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.user
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}