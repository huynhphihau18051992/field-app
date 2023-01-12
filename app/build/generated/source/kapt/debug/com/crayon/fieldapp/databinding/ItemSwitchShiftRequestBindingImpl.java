package com.crayon.fieldapp.databinding;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemSwitchShiftRequestBindingImpl extends ItemSwitchShiftRequestBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.txt_title, 4);
        sViewsWithIds.put(R.id.ic_job, 5);
        sViewsWithIds.put(R.id.ll_action, 6);
        sViewsWithIds.put(R.id.btn_reject, 7);
        sViewsWithIds.put(R.id.btn_accept, 8);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemSwitchShiftRequestBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ItemSwitchShiftRequestBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[8]
            , (android.widget.Button) bindings[7]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            );
        this.imgAvatar.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.txtContent.setTag(null);
        this.txtTime.setTag(null);
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
        java.lang.String itemEmployeeAvatarUrl = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (item != null) {
                    // read item.employee
                    itemEmployee = item.getEmployee();
                    // read item.createdAt
                    itemCreatedAt = item.getCreatedAt();
                }


                if (itemEmployee != null) {
                    // read item.employee.avatarUrl
                    itemEmployeeAvatarUrl = itemEmployee.getAvatarUrl();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.crayon.fieldapp.utils.BindingUtilsKt.loadImage(this.imgAvatar, itemEmployeeAvatarUrl, (java.lang.String)null, (android.graphics.drawable.Drawable)null, (android.graphics.drawable.Drawable)null, (com.bumptech.glide.request.RequestListener<android.graphics.drawable.Drawable>)null, true, (boolean)false, true, (com.bumptech.glide.load.engine.DiskCacheStrategy)null, (java.lang.Boolean)null, (java.lang.String)null);
            com.crayon.fieldapp.utils.BindingUtilsKt.setContentSwitchShift(this.txtContent, item);
            com.crayon.fieldapp.utils.BindingUtilsKt.setDurationTime(this.txtTime, itemCreatedAt);
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