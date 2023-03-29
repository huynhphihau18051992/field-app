package com.crayon.fieldapp.databinding;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentLoadmoreRefreshBindingImpl extends FragmentLoadmoreRefreshBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentLoadmoreRefreshBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentLoadmoreRefreshBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ProgressBar) bindings[1]
            , (android.widget.ProgressBar) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[2]
            );
        this.container.setTag(null);
        this.progressLoadMore.setTag(null);
        this.progressLoading.setTag(null);
        this.recyclerView.setTag(null);
        this.refreshLayout.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setViewModel((com.crayon.fieldapp.ui.base.BaseLoadMoreRefreshViewModel<java.lang.Object>) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.crayon.fieldapp.ui.base.BaseLoadMoreRefreshViewModel<java.lang.Object> ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsLoading((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelIsRefreshing((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelIsLoadMore((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsLoading(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsRefreshing(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsRefreshing, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsLoadMore(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsLoadMore, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        java.lang.Boolean viewModelIsRefreshingGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue = false;
        androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener viewModelOnRefreshListener = null;
        int viewModelIsLoadMoreViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadMoreGetValue = false;
        int viewModelIsLoadingViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelIsLoadingGetValue = null;
        com.crayon.fieldapp.ui.widgets.EndlessRecyclerOnScrollListener viewModelOnScrollListener = null;
        java.lang.Boolean viewModelIsLoadMoreGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsLoading = null;
        com.crayon.fieldapp.ui.base.BaseLoadMoreRefreshViewModel<java.lang.Object> viewModel = mViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsRefreshing = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsLoadMore = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x18L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.onRefreshListener
                        viewModelOnRefreshListener = viewModel.getOnRefreshListener();
                        // read viewModel.onScrollListener
                        viewModelOnScrollListener = viewModel.getOnScrollListener();
                    }
            }
            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLoading
                        viewModelIsLoading = viewModel.isLoading();
                    }
                    updateLiveDataRegistration(0, viewModelIsLoading);


                    if (viewModelIsLoading != null) {
                        // read viewModel.isLoading.getValue()
                        viewModelIsLoadingGetValue = viewModelIsLoading.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsLoadingGetValue);
                if((dirtyFlags & 0x19L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue()) ? View.VISIBLE : View.GONE
                    viewModelIsLoadingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isRefreshing
                        viewModelIsRefreshing = viewModel.isRefreshing();
                    }
                    updateLiveDataRegistration(1, viewModelIsRefreshing);


                    if (viewModelIsRefreshing != null) {
                        // read viewModel.isRefreshing.getValue()
                        viewModelIsRefreshingGetValue = viewModelIsRefreshing.getValue();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLoadMore
                        viewModelIsLoadMore = viewModel.isLoadMore();
                    }
                    updateLiveDataRegistration(2, viewModelIsLoadMore);


                    if (viewModelIsLoadMore != null) {
                        // read viewModel.isLoadMore.getValue()
                        viewModelIsLoadMoreGetValue = viewModelIsLoadMore.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoadMore.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadMoreGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsLoadMoreGetValue);
                if((dirtyFlags & 0x1cL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadMoreGetValue) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoadMore.getValue()) ? View.VISIBLE : View.GONE
                    viewModelIsLoadMoreViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadMoreGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            this.progressLoadMore.setVisibility(viewModelIsLoadMoreViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.progressLoading.setVisibility(viewModelIsLoadingViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            com.crayon.fieldapp.utils.BindingUtilsKt.customScrollListener(this.recyclerView, viewModelOnScrollListener);
            com.crayon.fieldapp.utils.BindingUtilsKt.customRefreshListener(this.refreshLayout, viewModelOnRefreshListener);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            com.crayon.fieldapp.utils.BindingUtilsKt.customRefreshing(this.refreshLayout, viewModelIsRefreshingGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isLoading
        flag 1 (0x2L): viewModel.isRefreshing
        flag 2 (0x3L): viewModel.isLoadMore
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoadMore.getValue()) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoadMore.getValue()) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}