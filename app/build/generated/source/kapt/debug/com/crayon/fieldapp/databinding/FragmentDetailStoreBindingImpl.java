package com.crayon.fieldapp.databinding;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDetailStoreBindingImpl extends FragmentDetailStoreBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rl_toolbar, 3);
        sViewsWithIds.put(R.id.imb_ic_back, 4);
        sViewsWithIds.put(R.id.imb_ic_filter, 5);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDetailStoreBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentDetailStoreBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageButton) bindings[4]
            , (android.widget.ImageButton) bindings[5]
            , (android.widget.RelativeLayout) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvTitle.setTag(null);
        this.txtAddress.setTag(null);
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
            setViewModel((com.crayon.fieldapp.ui.screen.monitor.store.listStore.detail.DetailStoreViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.crayon.fieldapp.ui.screen.monitor.store.listStore.detail.DetailStoreViewModel ViewModel) {
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
                return onChangeViewModelStore((androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.StoreResponse>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelStore(androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.StoreResponse>> ViewModelStore, int fieldId) {
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
        java.lang.String viewModelStoreDataName = null;
        com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.StoreResponse> viewModelStoreGetValue = null;
        java.lang.String viewModelStoreDataAddress = null;
        com.crayon.fieldapp.data.remote.response.StoreResponse viewModelStoreData = null;
        com.crayon.fieldapp.ui.screen.monitor.store.listStore.detail.DetailStoreViewModel viewModel = mViewModel;
        androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.StoreResponse>> viewModelStore = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.store
                    viewModelStore = viewModel.getStore();
                }
                updateLiveDataRegistration(0, viewModelStore);


                if (viewModelStore != null) {
                    // read viewModel.store.getValue()
                    viewModelStoreGetValue = viewModelStore.getValue();
                }


                if (viewModelStoreGetValue != null) {
                    // read viewModel.store.getValue().data
                    viewModelStoreData = viewModelStoreGetValue.getData();
                }


                if (viewModelStoreData != null) {
                    // read viewModel.store.getValue().data.name
                    viewModelStoreDataName = viewModelStoreData.getName();
                    // read viewModel.store.getValue().data.address
                    viewModelStoreDataAddress = viewModelStoreData.getAddress();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, viewModelStoreDataName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAddress, viewModelStoreDataAddress);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.store
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}