package com.crayon.fieldapp.databinding;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentInputNameBindingImpl extends FragmentInputNameBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.edt_name, 1);
        sViewsWithIds.put(R.id.edt_phone, 2);
        sViewsWithIds.put(R.id.btn_next, 3);
        sViewsWithIds.put(R.id.pb_loading, 4);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentInputNameBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentInputNameBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[3]
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[2]
            , (android.widget.ProgressBar) bindings[4]
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
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
        if (BR.shareViewModel == variableId) {
            setShareViewModel((com.crayon.fieldapp.ui.screen.detailTask.changeGift.ChangeGiftViewModel) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.crayon.fieldapp.ui.screen.detailTask.changeGift.step1.InputNameViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setShareViewModel(@Nullable com.crayon.fieldapp.ui.screen.detailTask.changeGift.ChangeGiftViewModel ShareViewModel) {
        this.mShareViewModel = ShareViewModel;
    }
    public void setViewModel(@Nullable com.crayon.fieldapp.ui.screen.detailTask.changeGift.step1.InputNameViewModel ViewModel) {
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
        flag 0 (0x1L): shareViewModel
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}