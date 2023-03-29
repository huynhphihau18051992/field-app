package com.crayon.fieldapp.databinding;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemTodayJobBindingImpl extends ItemTodayJobBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemTodayJobBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemTodayJobBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.txtAgencyName.setTag(null);
        this.txtProjectName.setTag(null);
        this.txtShift.setTag(null);
        this.txtStoreName.setTag(null);
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
            setItem((com.crayon.fieldapp.data.remote.response.JobResponse) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.crayon.fieldapp.data.remote.response.JobResponse Item) {
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
        java.lang.String itemAgencyName = null;
        com.crayon.fieldapp.data.remote.response.JobResponse item = mItem;
        java.lang.String itemProjectName = null;
        com.crayon.fieldapp.data.remote.response.Store itemStore = null;
        com.crayon.fieldapp.data.remote.response.Project itemProject = null;
        com.crayon.fieldapp.data.remote.response.Agency itemAgency = null;
        java.lang.String itemStoreName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (item != null) {
                    // read item.store
                    itemStore = item.getStore();
                    // read item.project
                    itemProject = item.getProject();
                    // read item.agency
                    itemAgency = item.getAgency();
                }


                if (itemStore != null) {
                    // read item.store.name
                    itemStoreName = itemStore.getName();
                }
                if (itemProject != null) {
                    // read item.project.name
                    itemProjectName = itemProject.getName();
                }
                if (itemAgency != null) {
                    // read item.agency.name
                    itemAgencyName = itemAgency.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAgencyName, itemAgencyName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtProjectName, itemProjectName);
            com.crayon.fieldapp.utils.BindingUtilsKt.setShift(this.txtShift, item);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtStoreName, itemStoreName);
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