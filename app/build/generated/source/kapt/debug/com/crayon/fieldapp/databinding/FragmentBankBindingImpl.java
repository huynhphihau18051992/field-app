package com.crayon.fieldapp.databinding;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentBankBindingImpl extends FragmentBankBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rl_toolbar, 4);
        sViewsWithIds.put(R.id.tv_title, 5);
        sViewsWithIds.put(R.id.imb_ic_back, 6);
        sViewsWithIds.put(R.id.imb_ic_filter, 7);
        sViewsWithIds.put(R.id.sp_bank_name, 8);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentBankBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentBankBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.EditText) bindings[2]
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[1]
            , (android.widget.ImageButton) bindings[6]
            , (android.widget.ImageButton) bindings[7]
            , (android.widget.RelativeLayout) bindings[4]
            , (android.widget.Spinner) bindings[8]
            , (android.widget.TextView) bindings[5]
            );
        this.edtBankId.setTag(null);
        this.edtBrand.setTag(null);
        this.edtTax.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
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
            setViewModel((com.crayon.fieldapp.ui.screen.bank.BankViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.crayon.fieldapp.ui.screen.bank.BankViewModel ViewModel) {
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
        java.lang.String viewModelUserProfileBankNumber = null;
        com.crayon.fieldapp.data.remote.response.UserResponse viewModelUserGetValue = null;
        androidx.lifecycle.MutableLiveData<com.crayon.fieldapp.data.remote.response.UserResponse> viewModelUser = null;
        com.crayon.fieldapp.data.remote.response.Profile viewModelUserProfile = null;
        com.crayon.fieldapp.ui.screen.bank.BankViewModel viewModel = mViewModel;
        java.lang.String viewModelUserProfileBankBranch = null;
        java.lang.String viewModelUserProfileTax = null;

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
                    // read viewModel.user.getValue().profile
                    viewModelUserProfile = viewModelUserGetValue.getProfile();
                }


                if (viewModelUserProfile != null) {
                    // read viewModel.user.getValue().profile.bankNumber
                    viewModelUserProfileBankNumber = viewModelUserProfile.getBankNumber();
                    // read viewModel.user.getValue().profile.bankBranch
                    viewModelUserProfileBankBranch = viewModelUserProfile.getBankBranch();
                    // read viewModel.user.getValue().profile.tax
                    viewModelUserProfileTax = viewModelUserProfile.getTax();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtBankId, viewModelUserProfileBankNumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtBrand, viewModelUserProfileBankBranch);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.edtTax, viewModelUserProfileTax);
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