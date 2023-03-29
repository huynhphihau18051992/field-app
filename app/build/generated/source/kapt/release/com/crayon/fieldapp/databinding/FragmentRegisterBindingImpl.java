package com.crayon.fieldapp.databinding;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRegisterBindingImpl extends FragmentRegisterBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rl_toolbar, 1);
        sViewsWithIds.put(R.id.tv_title, 2);
        sViewsWithIds.put(R.id.imb_ic_back, 3);
        sViewsWithIds.put(R.id.imgRegister, 4);
        sViewsWithIds.put(R.id.sv_profile, 5);
        sViewsWithIds.put(R.id.img_avatar, 6);
        sViewsWithIds.put(R.id.edt_last_name, 7);
        sViewsWithIds.put(R.id.edt_first_name, 8);
        sViewsWithIds.put(R.id.txt_birth_day, 9);
        sViewsWithIds.put(R.id.img_birth_day, 10);
        sViewsWithIds.put(R.id.edt_email, 11);
        sViewsWithIds.put(R.id.edt_password, 12);
        sViewsWithIds.put(R.id.edt_confirm_password, 13);
        sViewsWithIds.put(R.id.edt_phone, 14);
        sViewsWithIds.put(R.id.sp_gender, 15);
        sViewsWithIds.put(R.id.img_gender, 16);
        sViewsWithIds.put(R.id.edt_height, 17);
        sViewsWithIds.put(R.id.edt_weight, 18);
        sViewsWithIds.put(R.id.edt_id, 19);
        sViewsWithIds.put(R.id.edt_id_front, 20);
        sViewsWithIds.put(R.id.img_id_front, 21);
        sViewsWithIds.put(R.id.edt_id_back, 22);
        sViewsWithIds.put(R.id.img_id_back, 23);
        sViewsWithIds.put(R.id.img_full_body, 24);
        sViewsWithIds.put(R.id.sp_city, 25);
        sViewsWithIds.put(R.id.sp_district, 26);
        sViewsWithIds.put(R.id.edt_address, 27);
        sViewsWithIds.put(R.id.sp_current_city, 28);
        sViewsWithIds.put(R.id.sp_current_district, 29);
        sViewsWithIds.put(R.id.edt_current_address, 30);
        sViewsWithIds.put(R.id.edt_tax, 31);
        sViewsWithIds.put(R.id.btn_tax, 32);
        sViewsWithIds.put(R.id.edt_bank_number, 33);
        sViewsWithIds.put(R.id.sp_bank_name, 34);
        sViewsWithIds.put(R.id.edt_brand, 35);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRegisterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 36, sIncludes, sViewsWithIds));
    }
    private FragmentRegisterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[32]
            , (android.widget.EditText) bindings[27]
            , (android.widget.EditText) bindings[33]
            , (android.widget.EditText) bindings[35]
            , (android.widget.EditText) bindings[13]
            , (android.widget.EditText) bindings[30]
            , (android.widget.EditText) bindings[11]
            , (android.widget.EditText) bindings[8]
            , (android.widget.EditText) bindings[17]
            , (android.widget.EditText) bindings[19]
            , (android.widget.RelativeLayout) bindings[22]
            , (android.widget.RelativeLayout) bindings[20]
            , (android.widget.EditText) bindings[7]
            , (android.widget.EditText) bindings[12]
            , (android.widget.EditText) bindings[14]
            , (android.widget.EditText) bindings[31]
            , (android.widget.EditText) bindings[18]
            , (android.widget.ImageButton) bindings[3]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageButton) bindings[4]
            , (android.widget.RelativeLayout) bindings[1]
            , (android.widget.Spinner) bindings[34]
            , (android.widget.Spinner) bindings[25]
            , (android.widget.Spinner) bindings[28]
            , (android.widget.Spinner) bindings[29]
            , (android.widget.Spinner) bindings[26]
            , (android.widget.Spinner) bindings[15]
            , (android.widget.ScrollView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[9]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            setViewModel((com.crayon.fieldapp.ui.screen.register.RegisterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.crayon.fieldapp.ui.screen.register.RegisterViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}