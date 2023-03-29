package com.crayon.fieldapp.databinding;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentListChangeGiftAtStoreBindingImpl extends FragmentListChangeGiftAtStoreBinding  {

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
        sViewsWithIds.put(R.id.ic_select_date, 4);
        sViewsWithIds.put(R.id.btn_customer, 5);
        sViewsWithIds.put(R.id.ic_customer, 6);
        sViewsWithIds.put(R.id.txt_customer_title, 7);
        sViewsWithIds.put(R.id.txt_num_customer, 8);
        sViewsWithIds.put(R.id.btn_promotion, 9);
        sViewsWithIds.put(R.id.ic_promotion, 10);
        sViewsWithIds.put(R.id.txt_promotion_title, 11);
        sViewsWithIds.put(R.id.txt_num_promotion, 12);
        sViewsWithIds.put(R.id.btn_gift, 13);
        sViewsWithIds.put(R.id.ic_gift, 14);
        sViewsWithIds.put(R.id.txt_gift_title, 15);
        sViewsWithIds.put(R.id.txt_gift_customer, 16);
        sViewsWithIds.put(R.id.txt_start_date, 17);
        sViewsWithIds.put(R.id.btn_filter_store, 18);
        sViewsWithIds.put(R.id.img_ic_filter, 19);
        sViewsWithIds.put(R.id.tvFilter, 20);
        sViewsWithIds.put(R.id.txt_filter_role_status, 21);
        sViewsWithIds.put(R.id.rv_members, 22);
        sViewsWithIds.put(R.id.pb_loading, 23);
        sViewsWithIds.put(R.id.tv_empty, 24);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentListChangeGiftAtStoreBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 25, sIncludes, sViewsWithIds));
    }
    private FragmentListChangeGiftAtStoreBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.RelativeLayout) bindings[5]
            , (android.widget.RelativeLayout) bindings[18]
            , (android.widget.RelativeLayout) bindings[13]
            , (android.widget.RelativeLayout) bindings[9]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageButton) bindings[4]
            , (android.widget.ImageButton) bindings[3]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ProgressBar) bindings[23]
            , (android.widget.RelativeLayout) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[22]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[17]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
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
            setViewModel((com.crayon.fieldapp.ui.screen.monitor.changeGift.listTask.ListChangeGiftAtStoreViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.crayon.fieldapp.ui.screen.monitor.changeGift.listTask.ListChangeGiftAtStoreViewModel ViewModel) {
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