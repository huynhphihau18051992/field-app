package com.crayon.fieldapp.databinding;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentExportGiftBindingImpl extends FragmentExportGiftBinding  {

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
        sViewsWithIds.put(R.id.imb_ic_filter, 4);
        sViewsWithIds.put(R.id.sv_product, 5);
        sViewsWithIds.put(R.id.txtGift, 6);
        sViewsWithIds.put(R.id.rl_number, 7);
        sViewsWithIds.put(R.id.txt_import, 8);
        sViewsWithIds.put(R.id.txt_nhap, 9);
        sViewsWithIds.put(R.id.txt_1, 10);
        sViewsWithIds.put(R.id.txt_consume, 11);
        sViewsWithIds.put(R.id.txt_tang, 12);
        sViewsWithIds.put(R.id.txt_2, 13);
        sViewsWithIds.put(R.id.txt_remain_plan, 14);
        sViewsWithIds.put(R.id.txt_ton_plan, 15);
        sViewsWithIds.put(R.id.txt_1_2, 16);
        sViewsWithIds.put(R.id.txt_remain_actual, 17);
        sViewsWithIds.put(R.id.txt_ton_actual, 18);
        sViewsWithIds.put(R.id.txt_actual, 19);
        sViewsWithIds.put(R.id.rv_product, 20);
        sViewsWithIds.put(R.id.pb_loading, 21);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentExportGiftBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private FragmentExportGiftBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageButton) bindings[3]
            , (android.widget.ImageButton) bindings[4]
            , (android.widget.ProgressBar) bindings[21]
            , (android.widget.RelativeLayout) bindings[7]
            , (android.widget.RelativeLayout) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[20]
            , (androidx.appcompat.widget.SearchView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[19]
            , (android.widget.RelativeLayout) bindings[11]
            , (android.widget.TextView) bindings[6]
            , (android.widget.RelativeLayout) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.RelativeLayout) bindings[17]
            , (android.widget.RelativeLayout) bindings[14]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[15]
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
            setViewModel((com.crayon.fieldapp.ui.screen.detailTask.changeGift.export.ExportGiftViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.crayon.fieldapp.ui.screen.detailTask.changeGift.export.ExportGiftViewModel ViewModel) {
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