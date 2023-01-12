package com.crayon.fieldapp.databinding;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDetailAttendanceBindingImpl extends FragmentDetailAttendanceBinding  {

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
        sViewsWithIds.put(R.id.txt_member, 5);
        sViewsWithIds.put(R.id.ll_did_timekeeping, 6);
        sViewsWithIds.put(R.id.txt_did_timekeeping, 7);
        sViewsWithIds.put(R.id.ll_off, 8);
        sViewsWithIds.put(R.id.txt_off, 9);
        sViewsWithIds.put(R.id.ll_not_yet_timekeeping, 10);
        sViewsWithIds.put(R.id.txt_not_yet_timekeeping, 11);
        sViewsWithIds.put(R.id.rl_late, 12);
        sViewsWithIds.put(R.id.img_clock_late, 13);
        sViewsWithIds.put(R.id.txt_late, 14);
        sViewsWithIds.put(R.id.img_ic_right_late, 15);
        sViewsWithIds.put(R.id.rl_earl, 16);
        sViewsWithIds.put(R.id.img_clock_early, 17);
        sViewsWithIds.put(R.id.txt_early, 18);
        sViewsWithIds.put(R.id.img_ic_right_early, 19);
        sViewsWithIds.put(R.id.txt_title, 20);
        sViewsWithIds.put(R.id.rv_employee, 21);
        sViewsWithIds.put(R.id.txt_empty, 22);
        sViewsWithIds.put(R.id.pb_loading, 23);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDetailAttendanceBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private FragmentDetailAttendanceBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageButton) bindings[3]
            , (android.widget.ImageButton) bindings[4]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.ProgressBar) bindings[23]
            , (android.widget.RelativeLayout) bindings[16]
            , (android.widget.RelativeLayout) bindings[12]
            , (android.widget.RelativeLayout) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[21]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[20]
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
            setViewModel((com.crayon.fieldapp.ui.screen.detailAttendance.DetailAttendanceViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.crayon.fieldapp.ui.screen.detailAttendance.DetailAttendanceViewModel ViewModel) {
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