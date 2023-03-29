package com.crayon.fieldapp.databinding;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDetailPicJobBindingImpl extends FragmentDetailPicJobBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rl_toolbar, 6);
        sViewsWithIds.put(R.id.tv_title, 7);
        sViewsWithIds.put(R.id.imb_ic_back, 8);
        sViewsWithIds.put(R.id.imb_ic_filter, 9);
        sViewsWithIds.put(R.id.img_time, 10);
        sViewsWithIds.put(R.id.txt_task, 11);
        sViewsWithIds.put(R.id.rv_task, 12);
        sViewsWithIds.put(R.id.pb_loading, 13);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDetailPicJobBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentDetailPicJobBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageButton) bindings[8]
            , (android.widget.ImageButton) bindings[9]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ProgressBar) bindings[13]
            , (android.widget.RelativeLayout) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[12]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[11]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.txtAgencyName.setTag(null);
        this.txtEndTime.setTag(null);
        this.txtProjectName.setTag(null);
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
            setViewModel((com.crayon.fieldapp.ui.screen.detailPicJob.DetailPicJobViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.crayon.fieldapp.ui.screen.detailPicJob.DetailPicJobViewModel ViewModel) {
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
                return onChangeViewModelJob((androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.JobResponse>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelJob(androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.JobResponse>> ViewModelJob, int fieldId) {
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
        com.crayon.fieldapp.data.remote.response.Project viewModelJobDataProject = null;
        com.crayon.fieldapp.data.remote.response.JobResponse viewModelJobData = null;
        androidx.lifecycle.LiveData<com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.JobResponse>> viewModelJob = null;
        java.lang.String viewModelJobDataAgencyName = null;
        com.crayon.fieldapp.utils.Resource<com.crayon.fieldapp.data.remote.response.JobResponse> viewModelJobGetValue = null;
        java.lang.String viewModelJobDataEndTime = null;
        java.lang.String viewModelJobDataProjectName = null;
        java.lang.String viewModelJobDataStartTime = null;
        java.lang.String viewModelJobDataStatus = null;
        com.crayon.fieldapp.data.remote.response.Agency viewModelJobDataAgency = null;
        com.crayon.fieldapp.ui.screen.detailPicJob.DetailPicJobViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.job
                    viewModelJob = viewModel.getJob();
                }
                updateLiveDataRegistration(0, viewModelJob);


                if (viewModelJob != null) {
                    // read viewModel.job.getValue()
                    viewModelJobGetValue = viewModelJob.getValue();
                }


                if (viewModelJobGetValue != null) {
                    // read viewModel.job.getValue().data
                    viewModelJobData = viewModelJobGetValue.getData();
                }


                if (viewModelJobData != null) {
                    // read viewModel.job.getValue().data.project
                    viewModelJobDataProject = viewModelJobData.getProject();
                    // read viewModel.job.getValue().data.endTime
                    viewModelJobDataEndTime = viewModelJobData.getEndTime();
                    // read viewModel.job.getValue().data.startTime
                    viewModelJobDataStartTime = viewModelJobData.getStartTime();
                    // read viewModel.job.getValue().data.status
                    viewModelJobDataStatus = viewModelJobData.getStatus();
                    // read viewModel.job.getValue().data.agency
                    viewModelJobDataAgency = viewModelJobData.getAgency();
                }


                if (viewModelJobDataProject != null) {
                    // read viewModel.job.getValue().data.project.name
                    viewModelJobDataProjectName = viewModelJobDataProject.getName();
                }
                if (viewModelJobDataAgency != null) {
                    // read viewModel.job.getValue().data.agency.name
                    viewModelJobDataAgencyName = viewModelJobDataAgency.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAgencyName, viewModelJobDataAgencyName);
            com.crayon.fieldapp.utils.BindingUtilsKt.customFullDateFormat(this.txtEndTime, viewModelJobDataEndTime);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtProjectName, viewModelJobDataProjectName);
            com.crayon.fieldapp.utils.BindingUtilsKt.customFullDateFormat(this.txtStartDate, viewModelJobDataStartTime);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtStatus, viewModelJobDataStatus);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.job
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}