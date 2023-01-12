package studio.phillip.yolo.presentation.add.selectProject.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u0003:\u0001+B;\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0002\u0010\rJ\u001e\u0010\u0016\u001a\u00020\f2\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007J\u0006\u0010\u0018\u001a\u00020\fJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eJ\u001c\u0010 \u001a\u00020\f2\n\u0010!\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\"\u001a\u00020\u001cH\u0016J\u001c\u0010#\u001a\u00060\u0002R\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cH\u0016J\u0006\u0010\'\u001a\u00020\fJ\u000e\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u0006J\u000e\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u0006R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006,"}, d2 = {"Lstudio/phillip/yolo/presentation/add/selectProject/adapter/FilterStoreRVAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lstudio/phillip/yolo/presentation/add/selectProject/adapter/FilterStoreRVAdapter$EmployeeViewHolder;", "Landroid/widget/Filterable;", "contacts", "Ljava/util/ArrayList;", "Lcom/crayon/fieldapp/ui/base/dialog/filterStore/model/ItemStore;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "itemClickListener", "Lkotlin/Function1;", "", "(Ljava/util/ArrayList;Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "contactList", "contactListFiltered", "getContacts", "()Ljava/util/ArrayList;", "getContext", "()Landroid/content/Context;", "getItemClickListener", "()Lkotlin/jvm/functions/Function1;", "addAll", "list", "clearAll", "getFilter", "Landroid/widget/Filter;", "getItemCount", "", "getSelectedItem", "", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "selectAll", "selectItem", "data", "unSelectItem", "EmployeeViewHolder", "app_debug"})
public final class FilterStoreRVAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<studio.phillip.yolo.presentation.add.selectProject.adapter.FilterStoreRVAdapter.EmployeeViewHolder> implements android.widget.Filterable {
    private final java.util.ArrayList<com.crayon.fieldapp.ui.base.dialog.filterStore.model.ItemStore> contactList = null;
    private java.util.ArrayList<com.crayon.fieldapp.ui.base.dialog.filterStore.model.ItemStore> contactListFiltered;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.crayon.fieldapp.ui.base.dialog.filterStore.model.ItemStore> contacts = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.crayon.fieldapp.ui.base.dialog.filterStore.model.ItemStore, kotlin.Unit> itemClickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public studio.phillip.yolo.presentation.add.selectProject.adapter.FilterStoreRVAdapter.EmployeeViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    studio.phillip.yolo.presentation.add.selectProject.adapter.FilterStoreRVAdapter.EmployeeViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void selectAll() {
    }
    
    public final void selectItem(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.ui.base.dialog.filterStore.model.ItemStore data) {
    }
    
    public final void unSelectItem(@org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.ui.base.dialog.filterStore.model.ItemStore data) {
    }
    
    public final void addAll(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.ui.base.dialog.filterStore.model.ItemStore> list) {
    }
    
    public final void clearAll() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getSelectedItem() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.Filter getFilter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.crayon.fieldapp.ui.base.dialog.filterStore.model.ItemStore> getContacts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<com.crayon.fieldapp.ui.base.dialog.filterStore.model.ItemStore, kotlin.Unit> getItemClickListener() {
        return null;
    }
    
    public FilterStoreRVAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.ui.base.dialog.filterStore.model.ItemStore> contacts, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.crayon.fieldapp.ui.base.dialog.filterStore.model.ItemStore, kotlin.Unit> itemClickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lstudio/phillip/yolo/presentation/add/selectProject/adapter/FilterStoreRVAdapter$EmployeeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lstudio/phillip/yolo/presentation/add/selectProject/adapter/FilterStoreRVAdapter;Landroid/view/View;)V", "cbStore", "Landroid/widget/CheckBox;", "getCbStore", "()Landroid/widget/CheckBox;", "setCbStore", "(Landroid/widget/CheckBox;)V", "txtName", "Landroid/widget/TextView;", "getTxtName", "()Landroid/widget/TextView;", "setTxtName", "(Landroid/widget/TextView;)V", "app_debug"})
    public final class EmployeeViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView txtName;
        @org.jetbrains.annotations.NotNull()
        private android.widget.CheckBox cbStore;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTxtName() {
            return null;
        }
        
        public final void setTxtName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.CheckBox getCbStore() {
            return null;
        }
        
        public final void setCbStore(@org.jetbrains.annotations.NotNull()
        android.widget.CheckBox p0) {
        }
        
        public EmployeeViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}