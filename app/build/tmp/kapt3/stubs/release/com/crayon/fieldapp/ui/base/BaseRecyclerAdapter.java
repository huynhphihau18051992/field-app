package com.crayon.fieldapp.ui.base;

import java.lang.System;

/**
 * base recycler view adapter
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004B\u0013\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0014\u00a2\u0006\u0002\u0010\fJ%\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u00012\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0010H\u0014\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H$J\u001e\u0010\u0014\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0018\u0010\u0019\u001a\u00020\n2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001bH\u0016\u00a8\u0006\u001c"}, d2 = {"Lcom/crayon/fieldapp/ui/base/BaseRecyclerAdapter;", "Item", "ViewBinding", "Landroidx/databinding/ViewDataBinding;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/crayon/fieldapp/ui/base/BaseViewHolder;", "callBack", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "bindFirstTime", "", "binding", "(Landroidx/databinding/ViewDataBinding;)V", "bindView", "item", "position", "", "(Landroidx/databinding/ViewDataBinding;Ljava/lang/Object;I)V", "getLayoutRes", "viewType", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "submitList", "list", "", "app_release"})
public abstract class BaseRecyclerAdapter<Item extends java.lang.Object, ViewBinding extends androidx.databinding.ViewDataBinding> extends androidx.recyclerview.widget.ListAdapter<Item, com.crayon.fieldapp.ui.base.BaseViewHolder<ViewBinding>> {
    
    /**
     * override this with new list to pass check "if (newList == mList)" in AsyncListDiffer
     */
    @java.lang.Override()
    public void submitList(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends Item> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.crayon.fieldapp.ui.base.BaseViewHolder<ViewBinding> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.ui.base.BaseViewHolder<ViewBinding> holder, int position) {
    }
    
    /**
     * get layout res based on view type
     */
    protected abstract int getLayoutRes(int viewType);
    
    /**
     * bind first time
     * use for set item onClickListener, something only set one time
     */
    protected void bindFirstTime(@org.jetbrains.annotations.NotNull()
    ViewBinding binding) {
    }
    
    /**
     * bind view
     */
    protected void bindView(@org.jetbrains.annotations.NotNull()
    ViewBinding binding, Item item, int position) {
    }
    
    public BaseRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.DiffUtil.ItemCallback<Item> callBack) {
        super(null);
    }
}