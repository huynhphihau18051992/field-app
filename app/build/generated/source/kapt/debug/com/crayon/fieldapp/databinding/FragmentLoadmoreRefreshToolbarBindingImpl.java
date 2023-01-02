package com.crayon.fieldapp.databinding;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentLoadmoreRefreshToolbarBindingImpl extends FragmentLoadmoreRefreshToolbarBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rl_toolbar, 6);
        sViewsWithIds.put(R.id.imb_ic_back, 7);
        sViewsWithIds.put(R.id.imb_ic_filter, 8);
        sViewsWithIds.put(R.id.container, 9);
        sViewsWithIds.put(R.id.search, 10);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentLoadmoreRefreshToolbarBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentLoadmoreRefreshToolbarBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.RelativeLayout) bindings[9]
            , (android.widget.ImageButton) bindings[7]
            , (android.widget.ImageButton) bindings[8]
            , (android.widget.ProgressBar) bindings[2]
            , (android.widget.ProgressBar) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[3]
            , (android.widget.RelativeLayout) bindings[6]
            , (androidx.appcompat.widget.SearchView) bindings[10]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progressLoadMore.setTag(null);
        this.progressLoading.setTag(null);
        this.recyclerView.setTag(null);
        this.refreshLayout.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
            setViewModel((com.crayon.fieldapp.ui.base.BaseLoadMoreRefreshToolbarViewModel<java.lang.Object>) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.crayon.fieldapp.ui.base.BaseLoadMoreRefreshToolbarViewModel<java.lang.Object> ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsLoadMore((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelTitle((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelIsLoading((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelIsRefreshing((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsLoadMore(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsLoadMore, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTitle(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsLoading(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsRefreshing(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsRefreshing, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadMoreGetValue = false;
        com.crayon.fieldapp.ui.widgets.EndlessRecyclerOnScrollListener viewModelOnScrollListener = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsLoadMore = null;
        androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener viewModelOnRefreshListener = null;
        java.lang.String viewModelTitleGetValue = null;
        int viewModelIsLoadMoreViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelTitle = null;
        int viewModelIsLoadingViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelIsLoadingGetValue = null;
        java.lang.Boolean viewModelIsLoadMoreGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsLoading = null;
        com.crayon.fieldapp.ui.base.BaseLoadMoreRefreshToolbarViewModel<java.lang.Object> viewModel = mViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsRefreshing = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x30L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.onScrollListener
                        viewModelOnScrollListener = viewModel.getOnScrollListener();
                        // read viewModel.onRefreshListener
                        viewModelOnRefreshListener = viewModel.getOnRefreshListener();
                    }
            }
            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLoadMore
                        viewModelIsLoadMore = viewModel.isLoadMore();
                    }
                    updateLiveDataRegistration(0, viewModelIsLoadMore);


                    if (viewModelIsLoadMore != null) {
                        // read viewModel.isLoadMore.getValue()
                        viewModelIsLoadMoreGetValue = viewModelIsLoadMore.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoadMore.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadMoreGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsLoadMoreGetValue);
                if((dirtyFlags & 0x31L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadMoreGetValue) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoadMore.getValue()) ? View.VISIBLE : View.GONE
                    viewModelIsLoadMoreViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadMoreGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.title
                        viewModelTitle = viewModel.getTitle();
                    }
                    updateLiveDataRegistration(1, viewModelTitle);


                    if (viewModelTitle != null) {
                        // read viewModel.title.getValue()
                        viewModelTitleGetValue = viewModelTitle.getValue();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLoading
                        viewModelIsLoading = viewModel.isLoading();
                    }
                    updateLiveDataRegistration(2, viewModelIsLoading);


                    if (viewModelIsLoading != null) {
                        // read viewModel.isLoading.getValue()
                        viewModelIsLoadingGetValue = viewModelIsLoading.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsLoadingGetValue);
                if((dirtyFlags & 0x34L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue()) ? View.VISIBLE : View.GONE
                    viewModelIsLoadingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isRefreshing
                        viewModelIsRefreshing = viewModel.isRefreshing();
                    }
                    updateLiveDataRegistration(3, viewModelIsRefreshing);


                    if (viewModelIsRefreshing != null) {
                        // read viewModel.isRefreshing.getValue()
                        viewModelIsRefreshingGetValue = viewModelIsRefreshing.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            this.progressLoadMore.setVisibility(viewModelIsLoadMoreViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            this.progressLoading.setVisibility(viewModelIsLoadingViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            com.crayon.fieldapp.utils.BindingUtilsKt.customScrollListener(this.recyclerView, viewModelOnScrollListener);
            com.crayon.fieldapp.utils.BindingUtilsKt.customRefreshListener(this.refreshLayout, viewModelOnRefreshListener);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            com.crayon.fieldapp.utils.BindingUtilsKt.customRefreshing(this.refreshLayout, viewModelIsRefreshingGetValue);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, viewModelTitleGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isLoadMore
        flag 1 (0x2L): viewModel.title
        flag 2 (0x3L): viewModel.isLoading
        flag 3 (0x4L): viewModel.isRefreshing
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoadMore.getValue()) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoadMore.getValue()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}