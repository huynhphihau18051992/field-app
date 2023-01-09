package com.crayon.fieldapp.databinding;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDetailProjectBindingImpl extends FragmentDetailProjectBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rl_toolbar, 9);
        sViewsWithIds.put(R.id.imb_ic_back, 10);
        sViewsWithIds.put(R.id.imb_ic_filter, 11);
        sViewsWithIds.put(R.id.img_time, 12);
        sViewsWithIds.put(R.id.rl_member, 13);
        sViewsWithIds.put(R.id.img_people, 14);
        sViewsWithIds.put(R.id.txt_member, 15);
        sViewsWithIds.put(R.id.txt_task, 16);
        sViewsWithIds.put(R.id.rv_store, 17);
        sViewsWithIds.put(R.id.pb_loading, 18);
        sViewsWithIds.put(R.id.fab, 19);
        sViewsWithIds.put(R.id.fab_add_employee, 20);
        sViewsWithIds.put(R.id.fab_add_store, 21);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDetailProjectBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private FragmentDetailProjectBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.getbase.floatingactionbutton.FloatingActionsMenu) bindings[19]
            , (com.getbase.floatingactionbutton.FloatingActionButton) bindings[20]
            , (com.getbase.floatingactionbutton.FloatingActionButton) bindings[21]
            , (android.widget.ImageButton) bindings[10]
            , (android.widget.ImageButton) bindings[11]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ProgressBar) bindings[18]
            , (android.widget.RelativeLayout) bindings[13]
            , (android.widget.RelativeLayout) bindings[9]
            , (androidx.recyclerview.widget.RecyclerView) bindings[17]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[16]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvTitle.setTag(null);
        this.txtAgencyName.setTag(null);
        this.txtBrand.setTag(null);
        this.txtCreator.setTag(null);
        this.txtEndTime.setTag(null);
        this.txtIndustry.setTag(null);
        this.txtStartDate.setTag(null);
        this.txtStatus.setTag(null);
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
            setViewModel((com.crayon.fieldapp.ui.screen.detailProject.DetailProjectViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.crayon.fieldapp.ui.screen.detailProject.DetailProjectViewModel ViewModel) {
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
                return onChangeViewModelProject((androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.ProjectResponse>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelProject(androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.ProjectResponse>> ViewModelProject, int fieldId) {
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
        java.lang.String viewModelProjectDataEndDate = null;
        java.lang.String viewModelProjectDataStartDate = null;
        com.crayon.fieldapp.data.remote.response.AgencyResponse viewModelProjectDataAgency = null;
        java.lang.String viewModelProjectDataStatus = null;
        androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.ProjectResponse>> viewModelProject = null;
        com.crayon.fieldapp.data.remote.response.ProjectResponse viewModelProjectData = null;
        com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.ProjectResponse> viewModelProjectGetValue = null;
        java.lang.String viewModelProjectDataAgencyName = null;
        java.lang.String viewModelProjectDataIndustry = null;
        java.lang.String viewModelProjectDataName = null;
        java.lang.String viewModelProjectDataBrandName = null;
        com.crayon.fieldapp.ui.screen.detailProject.DetailProjectViewModel viewModel = mViewModel;
        java.lang.String viewModelProjectDataCreatedAt = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.project
                    viewModelProject = viewModel.getProject();
                }
                updateLiveDataRegistration(0, viewModelProject);


                if (viewModelProject != null) {
                    // read viewModel.project.getValue()
                    viewModelProjectGetValue = viewModelProject.getValue();
                }


                if (viewModelProjectGetValue != null) {
                    // read viewModel.project.getValue().data
                    viewModelProjectData = viewModelProjectGetValue.getData();
                }


                if (viewModelProjectData != null) {
                    // read viewModel.project.getValue().data.endDate
                    viewModelProjectDataEndDate = viewModelProjectData.getEndDate();
                    // read viewModel.project.getValue().data.startDate
                    viewModelProjectDataStartDate = viewModelProjectData.getStartDate();
                    // read viewModel.project.getValue().data.agency
                    viewModelProjectDataAgency = viewModelProjectData.getAgency();
                    // read viewModel.project.getValue().data.status
                    viewModelProjectDataStatus = viewModelProjectData.getStatus();
                    // read viewModel.project.getValue().data.industry
                    viewModelProjectDataIndustry = viewModelProjectData.getIndustry();
                    // read viewModel.project.getValue().data.name
                    viewModelProjectDataName = viewModelProjectData.getName();
                    // read viewModel.project.getValue().data.brandName
                    viewModelProjectDataBrandName = viewModelProjectData.getBrandName();
                    // read viewModel.project.getValue().data.createdAt
                    viewModelProjectDataCreatedAt = viewModelProjectData.getCreatedAt();
                }


                if (viewModelProjectDataAgency != null) {
                    // read viewModel.project.getValue().data.agency.name
                    viewModelProjectDataAgencyName = viewModelProjectDataAgency.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, viewModelProjectDataName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAgencyName, viewModelProjectDataAgencyName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtBrand, viewModelProjectDataBrandName);
            com.crayon.fieldapp.utils.BindingUtilsKt.customFullDateFormat(this.txtCreator, viewModelProjectDataCreatedAt);
            com.crayon.fieldapp.utils.BindingUtilsKt.customFullDateFormat(this.txtEndTime, viewModelProjectDataEndDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtIndustry, viewModelProjectDataIndustry);
            com.crayon.fieldapp.utils.BindingUtilsKt.customFullDateFormat(this.txtStartDate, viewModelProjectDataStartDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtStatus, viewModelProjectDataStatus);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.project
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}