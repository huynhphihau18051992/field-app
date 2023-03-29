package com.crayon.fieldapp.databinding;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemPromotionBindingImpl extends ItemPromotionBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cb_product, 1);
        sViewsWithIds.put(R.id.rl_number, 2);
        sViewsWithIds.put(R.id.img_minus, 3);
        sViewsWithIds.put(R.id.txt_number, 4);
        sViewsWithIds.put(R.id.img_plus, 5);
        sViewsWithIds.put(R.id.rv_product, 6);
        sViewsWithIds.put(R.id.ll_total, 7);
        sViewsWithIds.put(R.id.txt_total_price, 8);
        sViewsWithIds.put(R.id.btn_delete, 9);
        sViewsWithIds.put(R.id.img_delete, 10);
        sViewsWithIds.put(R.id.txt_delete, 11);
        sViewsWithIds.put(R.id.btn_edit, 12);
        sViewsWithIds.put(R.id.img_edit, 13);
        sViewsWithIds.put(R.id.txt_edit, 14);
        sViewsWithIds.put(R.id.img_line, 15);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemPromotionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ItemPromotionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.RelativeLayout) bindings[9]
            , (android.widget.RelativeLayout) bindings[12]
            , (android.widget.CheckBox) bindings[1]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.RelativeLayout) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[8]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
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
        if (BR.item == variableId) {
            setItem((com.crayon.fieldapp.data.model.Store) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.crayon.fieldapp.data.model.Store Item) {
        this.mItem = Item;
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
        flag 0 (0x1L): item
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}