package com.crayon.fieldapp.databinding;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDetailUserBindingImpl extends FragmentDetailUserBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rl_toolbar, 7);
        sViewsWithIds.put(R.id.imb_ic_back, 8);
        sViewsWithIds.put(R.id.imb_ic_filter, 9);
        sViewsWithIds.put(R.id.btn_remove, 10);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDetailUserBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentDetailUserBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[10]
            , (android.widget.ImageButton) bindings[8]
            , (android.widget.ImageButton) bindings[9]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.RelativeLayout) bindings[7]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            );
        this.imgAvatar.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvTitle.setTag(null);
        this.txtBirthDay.setTag(null);
        this.txtEmail.setTag(null);
        this.txtId.setTag(null);
        this.txtPhone.setTag(null);
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
            setViewModel((com.crayon.fieldapp.ui.screen.detailUser.DetailUserViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.crayon.fieldapp.ui.screen.detailUser.DetailUserViewModel ViewModel) {
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
                return onChangeViewModelUser((androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.model.User>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelUser(androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.model.User>> ViewModelUser, int fieldId) {
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
        com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.model.User> viewModelUserGetValue = null;
        androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.model.User>> viewModelUser = null;
        java.lang.String viewModelUserDataBirthDay = null;
        java.lang.String viewModelUserDataAvatarUrl = null;
        java.lang.String viewModelUserDataFullName = null;
        java.lang.String viewModelUserDataMobileNumber = null;
        java.lang.String viewModelUserDataEmailAddress = null;
        java.lang.String viewModelUserDataIdentificationNumber = null;
        com.crayon.fieldapp.ui.screen.detailUser.DetailUserViewModel viewModel = mViewModel;
        com.crayon.fieldapp.data.model.User viewModelUserData = null;

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
                    // read viewModel.user.getValue().data
                    viewModelUserData = viewModelUserGetValue.getData();
                }


                if (viewModelUserData != null) {
                    // read viewModel.user.getValue().data.birth_day
                    viewModelUserDataBirthDay = viewModelUserData.getBirth_day();
                    // read viewModel.user.getValue().data.avatar_url
                    viewModelUserDataAvatarUrl = viewModelUserData.getAvatar_url();
                    // read viewModel.user.getValue().data.fullName
                    viewModelUserDataFullName = viewModelUserData.getFullName();
                    // read viewModel.user.getValue().data.mobile_number
                    viewModelUserDataMobileNumber = viewModelUserData.getMobile_number();
                    // read viewModel.user.getValue().data.email_address
                    viewModelUserDataEmailAddress = viewModelUserData.getEmail_address();
                    // read viewModel.user.getValue().data.identification_number
                    viewModelUserDataIdentificationNumber = viewModelUserData.getIdentification_number();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.crayon.fieldapp.utils.BindingUtilsKt.loadImage(this.imgAvatar, viewModelUserDataAvatarUrl, (java.lang.String)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (com.bumptech.glide.request.RequestListener<android.graphics.drawable.Drawable>)null, (boolean)false, true, true, (com.bumptech.glide.load.engine.DiskCacheStrategy)null, (java.lang.Boolean)null, (java.lang.String)null);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, viewModelUserDataFullName);
            com.crayon.fieldapp.utils.BindingUtilsKt.customDateFormat(this.txtBirthDay, viewModelUserDataBirthDay);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtEmail, viewModelUserDataEmailAddress);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtId, viewModelUserDataIdentificationNumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtPhone, viewModelUserDataMobileNumber);
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