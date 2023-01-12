package com.crayon.fieldapp.databinding;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentReportProjectBindingImpl extends FragmentReportProjectBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll_project, 1);
        sViewsWithIds.put(R.id.sp_project, 2);
        sViewsWithIds.put(R.id.btn_load_more, 3);
        sViewsWithIds.put(R.id.calendar_view, 4);
        sViewsWithIds.put(R.id.view_color, 5);
        sViewsWithIds.put(R.id.txt_select_date, 6);
        sViewsWithIds.put(R.id.rv_today_shift, 7);
        sViewsWithIds.put(R.id.txt_summary_date, 8);
        sViewsWithIds.put(R.id.ic_circle_hour, 9);
        sViewsWithIds.put(R.id.txt_summary_hour, 10);
        sViewsWithIds.put(R.id.ic_circle_shift, 11);
        sViewsWithIds.put(R.id.txt_summary_shift, 12);
        sViewsWithIds.put(R.id.rv_summary_shift, 13);
        sViewsWithIds.put(R.id.ic_circle_invalid_shift, 14);
        sViewsWithIds.put(R.id.txt_summary_invalid_shift, 15);
        sViewsWithIds.put(R.id.pb_loading, 16);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentReportProjectBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private FragmentReportProjectBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[3]
            , (com.crayon.fieldapp.ui.widgets.CalendarView) bindings[4]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.ProgressBar) bindings[16]
            , (androidx.recyclerview.widget.RecyclerView) bindings[13]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (android.widget.Spinner) bindings[2]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[12]
            , (android.view.View) bindings[5]
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
            setViewModel((com.crayon.fieldapp.ui.screen.report.project.ReportProjectViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.crayon.fieldapp.ui.screen.report.project.ReportProjectViewModel ViewModel) {
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