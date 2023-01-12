package com.crayon.fieldapp.databinding;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProfileBindingImpl extends FragmentProfileBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rl_user, 2);
        sViewsWithIds.put(R.id.img_avatar, 3);
        sViewsWithIds.put(R.id.rl_avatar, 4);
        sViewsWithIds.put(R.id.img_ic_avatar, 5);
        sViewsWithIds.put(R.id.tv_avatar, 6);
        sViewsWithIds.put(R.id.ic_avatar_right, 7);
        sViewsWithIds.put(R.id.rl_contact_info, 8);
        sViewsWithIds.put(R.id.img_ic_contact_info, 9);
        sViewsWithIds.put(R.id.tv_contact_info, 10);
        sViewsWithIds.put(R.id.ic_contact_info_right, 11);
        sViewsWithIds.put(R.id.rl_bank, 12);
        sViewsWithIds.put(R.id.img_ic_bank, 13);
        sViewsWithIds.put(R.id.tv_bank, 14);
        sViewsWithIds.put(R.id.ic_bank_right, 15);
        sViewsWithIds.put(R.id.rl_login_qrcod, 16);
        sViewsWithIds.put(R.id.img_ic_qrcode, 17);
        sViewsWithIds.put(R.id.tv_login_qrcode, 18);
        sViewsWithIds.put(R.id.ic_qrcode_right, 19);
        sViewsWithIds.put(R.id.rl_application, 20);
        sViewsWithIds.put(R.id.img_ic_application, 21);
        sViewsWithIds.put(R.id.tv_application, 22);
        sViewsWithIds.put(R.id.ic_application_right, 23);
        sViewsWithIds.put(R.id.rl_about_terms, 24);
        sViewsWithIds.put(R.id.img_ic_term, 25);
        sViewsWithIds.put(R.id.tv_about_terms, 26);
        sViewsWithIds.put(R.id.ic_about_terms_right, 27);
        sViewsWithIds.put(R.id.rl_about_privacy, 28);
        sViewsWithIds.put(R.id.img_ic_privacy, 29);
        sViewsWithIds.put(R.id.tv_about_privacy, 30);
        sViewsWithIds.put(R.id.ic_about_privacy_right, 31);
        sViewsWithIds.put(R.id.rl_contact, 32);
        sViewsWithIds.put(R.id.img_ic_phone, 33);
        sViewsWithIds.put(R.id.tv_about_contact, 34);
        sViewsWithIds.put(R.id.ic_contact_right, 35);
        sViewsWithIds.put(R.id.tv_logout, 36);
        sViewsWithIds.put(R.id.img_ic_logout, 37);
        sViewsWithIds.put(R.id.txt_log_out, 38);
        sViewsWithIds.put(R.id.ic_logout_right, 39);
        sViewsWithIds.put(R.id.tv_version, 40);
        sViewsWithIds.put(R.id.pb_loading, 41);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 42, sIncludes, sViewsWithIds));
    }
    private FragmentProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[31]
            , (android.widget.ImageView) bindings[27]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[35]
            , (android.widget.ImageView) bindings[39]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[37]
            , (android.widget.ImageView) bindings[33]
            , (android.widget.ImageView) bindings[29]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.ProgressBar) bindings[41]
            , (android.widget.RelativeLayout) bindings[28]
            , (android.widget.RelativeLayout) bindings[24]
            , (android.widget.RelativeLayout) bindings[20]
            , (android.widget.RelativeLayout) bindings[4]
            , (android.widget.RelativeLayout) bindings[12]
            , (android.widget.RelativeLayout) bindings[32]
            , (android.widget.RelativeLayout) bindings[8]
            , (android.widget.RelativeLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.TextView) bindings[34]
            , (android.widget.TextView) bindings[30]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[18]
            , (android.widget.RelativeLayout) bindings[36]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[40]
            , (android.widget.TextView) bindings[38]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvUsername.setTag(null);
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
            setViewModel((com.crayon.fieldapp.ui.screen.profile.ProfileViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.crayon.fieldapp.ui.screen.profile.ProfileViewModel ViewModel) {
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
        com.crayon.fieldapp.data.remote.response.UserResponse viewModelUserGetValue = null;
        androidx.lifecycle.MutableLiveData<com.crayon.fieldapp.data.remote.response.UserResponse> viewModelUser = null;
        java.lang.String viewModelUserFirstName = null;
        com.crayon.fieldapp.ui.screen.profile.ProfileViewModel viewModel = mViewModel;
        java.lang.String viewModelUserLastName = null;

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
                    // read viewModel.user.getValue().firstName
                    viewModelUserFirstName = viewModelUserGetValue.getFirstName();
                    // read viewModel.user.getValue().lastName
                    viewModelUserLastName = viewModelUserGetValue.getLastName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.crayon.fieldapp.utils.BindingUtilsKt.setName(this.tvUsername, viewModelUserFirstName, viewModelUserLastName);
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