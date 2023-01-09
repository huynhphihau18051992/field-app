package com.crayon.fieldapp.databinding;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemManagementApplicationBindingImpl extends ItemManagementApplicationBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.img_people, 9);
        sViewsWithIds.put(R.id.img_time, 10);
        sViewsWithIds.put(R.id.img_project, 11);
        sViewsWithIds.put(R.id.img_reason, 12);
        sViewsWithIds.put(R.id.btn_reject, 13);
        sViewsWithIds.put(R.id.btn_accept, 14);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView8;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemManagementApplicationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private ItemManagementApplicationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[14]
            , (android.widget.Button) bindings[13]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.imgStatus.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView8 = (android.widget.LinearLayout) bindings[8];
        this.mboundView8.setTag(null);
        this.txtName.setTag(null);
        this.txtProject.setTag(null);
        this.txtReason.setTag(null);
        this.txtStatus.setTag(null);
        this.txtTime.setTag(null);
        this.txtTitle.setTag(null);
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
        if (BR.item == variableId) {
            setItem((com.crayon.fieldapp.data.remote.response.ApplicationResponse) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.crayon.fieldapp.data.remote.response.ApplicationResponse Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
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
        com.crayon.fieldapp.data.remote.response.ApplicationResponse item = mItem;
        com.crayon.fieldapp.data.remote.response.MemberResponse itemEmployee = null;
        java.lang.String itemCreatedAt = null;
        java.lang.String itemProjectName = null;
        java.lang.String itemReason = null;
        com.crayon.fieldapp.data.remote.response.Project itemProject = null;
        java.lang.String itemType = null;
        java.lang.String itemStatus = null;
        java.lang.String itemEmployeeLastName = null;
        java.lang.String itemEmployeeFirstName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (item != null) {
                    // read item.employee
                    itemEmployee = item.getEmployee();
                    // read item.createdAt
                    itemCreatedAt = item.getCreatedAt();
                    // read item.reason
                    itemReason = item.getReason();
                    // read item.project
                    itemProject = item.getProject();
                    // read item.type
                    itemType = item.getType();
                    // read item.status
                    itemStatus = item.getStatus();
                }


                if (itemEmployee != null) {
                    // read item.employee.lastName
                    itemEmployeeLastName = itemEmployee.getLastName();
                    // read item.employee.firstName
                    itemEmployeeFirstName = itemEmployee.getFirstName();
                }
                if (itemProject != null) {
                    // read item.project.name
                    itemProjectName = itemProject.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.crayon.fieldapp.utils.BindingUtilsKt.setIconStatus(this.imgStatus, itemStatus);
            com.crayon.fieldapp.utils.BindingUtilsKt.isDisplayAcceptButton(this.mboundView8, itemStatus);
            com.crayon.fieldapp.utils.BindingUtilsKt.setName(this.txtName, itemEmployeeFirstName, itemEmployeeLastName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtProject, itemProjectName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtReason, itemReason);
            com.crayon.fieldapp.utils.BindingUtilsKt.setApplicationStatus(this.txtStatus, itemStatus);
            com.crayon.fieldapp.utils.BindingUtilsKt.customDateFormat(this.txtTime, itemCreatedAt);
            com.crayon.fieldapp.utils.BindingUtilsKt.setApplicationType(this.txtTitle, itemType);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}