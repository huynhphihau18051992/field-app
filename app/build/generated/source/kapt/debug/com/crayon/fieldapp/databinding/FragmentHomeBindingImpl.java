package com.crayon.fieldapp.databinding;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rl_title, 1);
        sViewsWithIds.put(R.id.txt_title, 2);
        sViewsWithIds.put(R.id.btn_filter_store, 3);
        sViewsWithIds.put(R.id.img_ic_filter, 4);
        sViewsWithIds.put(R.id.tvFilter, 5);
        sViewsWithIds.put(R.id.txt_filter_store_status, 6);
        sViewsWithIds.put(R.id.refresh_layout, 7);
        sViewsWithIds.put(R.id.recycler_view, 8);
        sViewsWithIds.put(R.id.txt_empty, 9);
        sViewsWithIds.put(R.id.pb_loading, 10);
        sViewsWithIds.put(R.id.ll_menu, 11);
        sViewsWithIds.put(R.id.btn_job, 12);
        sViewsWithIds.put(R.id.btn_calendar, 13);
        sViewsWithIds.put(R.id.btn_report, 14);
        sViewsWithIds.put(R.id.btn_monitoring, 15);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[13]
            , (android.widget.RelativeLayout) bindings[3]
            , (android.widget.Button) bindings[12]
            , (android.widget.Button) bindings[15]
            , (android.widget.Button) bindings[14]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.ProgressBar) bindings[10]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[7]
            , (android.widget.RelativeLayout) bindings[1]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[2]
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
            setViewModel((com.crayon.fieldapp.ui.screen.home.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.crayon.fieldapp.ui.screen.home.HomeViewModel ViewModel) {
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