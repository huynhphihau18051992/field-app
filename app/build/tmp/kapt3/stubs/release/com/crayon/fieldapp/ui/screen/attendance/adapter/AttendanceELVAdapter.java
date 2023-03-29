package com.crayon.fieldapp.ui.screen.attendance.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u00014BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0016J\u0018\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u0016H\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0016H\u0016J2\u0010%\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020\u001e2\b\u0010(\u001a\u0004\u0018\u00010&2\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0016H\u0016J\u0010\u0010,\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0016H\u0016J\b\u0010-\u001a\u00020\u0016H\u0016J\u0010\u0010.\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u0016H\u0016J*\u0010/\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u001e2\b\u0010(\u001a\u0004\u0018\u00010&2\u0006\u0010)\u001a\u00020*H\u0016J\b\u00101\u001a\u00020\u001eH\u0016J\u0018\u00102\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0016H\u0016J\u0010\u00103\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0016H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u00065"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/attendance/adapter/AttendanceELVAdapter;", "Landroid/widget/BaseExpandableListAdapter;", "_context", "Landroid/content/Context;", "_listener", "Lcom/crayon/fieldapp/ui/screen/attendance/adapter/AttendanceELVAdapter$OnTaskResponseItemClickListener;", "_listDataHeader", "Ljava/util/ArrayList;", "Lcom/crayon/fieldapp/data/model/SimpleItem;", "_listDataChild", "Ljava/util/HashMap;", "", "", "Lcom/crayon/fieldapp/data/remote/response/TaskResponse;", "mExpandableListView", "Landroid/widget/ExpandableListView;", "(Landroid/content/Context;Lcom/crayon/fieldapp/ui/screen/attendance/adapter/AttendanceELVAdapter$OnTaskResponseItemClickListener;Ljava/util/ArrayList;Ljava/util/HashMap;Landroid/widget/ExpandableListView;)V", "getMExpandableListView$app_release", "()Landroid/widget/ExpandableListView;", "setMExpandableListView$app_release", "(Landroid/widget/ExpandableListView;)V", "mLastExpandedGroupPosition", "", "getMLastExpandedGroupPosition$app_release", "()I", "setMLastExpandedGroupPosition$app_release", "(I)V", "changeGroupIcon", "", "isGroupExpand", "", "groupPosition", "getChild", "childPosititon", "getChildId", "", "childPosition", "getChildView", "Landroid/view/View;", "isLastChild", "convertView", "parent", "Landroid/view/ViewGroup;", "getChildrenCount", "getGroup", "getGroupCount", "getGroupId", "getGroupView", "isExpanded", "hasStableIds", "isChildSelectable", "onGroupExpanded", "OnTaskResponseItemClickListener", "app_release"})
public final class AttendanceELVAdapter extends android.widget.BaseExpandableListAdapter {
    private int mLastExpandedGroupPosition = -1;
    private final android.content.Context _context = null;
    private final com.crayon.fieldapp.ui.screen.attendance.adapter.AttendanceELVAdapter.OnTaskResponseItemClickListener _listener = null;
    private final java.util.ArrayList<com.crayon.fieldapp.data.model.SimpleItem> _listDataHeader = null;
    private final java.util.HashMap<java.lang.String, java.util.List<com.crayon.fieldapp.data.remote.response.TaskResponse>> _listDataChild = null;
    @org.jetbrains.annotations.NotNull()
    private android.widget.ExpandableListView mExpandableListView;
    
    public final int getMLastExpandedGroupPosition$app_release() {
        return 0;
    }
    
    public final void setMLastExpandedGroupPosition$app_release(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.crayon.fieldapp.data.remote.response.TaskResponse getChild(int groupPosition, int childPosititon) {
        return null;
    }
    
    @java.lang.Override()
    public long getChildId(int groupPosition, int childPosition) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getChildView(int groupPosition, int childPosition, boolean isLastChild, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    public int getChildrenCount(int groupPosition) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.crayon.fieldapp.data.model.SimpleItem getGroup(int groupPosition) {
        return null;
    }
    
    @java.lang.Override()
    public int getGroupCount() {
        return 0;
    }
    
    @java.lang.Override()
    public long getGroupId(int groupPosition) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getGroupView(int groupPosition, boolean isExpanded, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    public boolean hasStableIds() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
    
    public final void changeGroupIcon(boolean isGroupExpand, int groupPosition) {
    }
    
    @java.lang.Override()
    public void onGroupExpanded(int groupPosition) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ExpandableListView getMExpandableListView$app_release() {
        return null;
    }
    
    public final void setMExpandableListView$app_release(@org.jetbrains.annotations.NotNull()
    android.widget.ExpandableListView p0) {
    }
    
    public AttendanceELVAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context _context, @org.jetbrains.annotations.NotNull()
    com.crayon.fieldapp.ui.screen.attendance.adapter.AttendanceELVAdapter.OnTaskResponseItemClickListener _listener, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.crayon.fieldapp.data.model.SimpleItem> _listDataHeader, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.util.List<com.crayon.fieldapp.data.remote.response.TaskResponse>> _listDataChild, @org.jetbrains.annotations.NotNull()
    android.widget.ExpandableListView mExpandableListView) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/crayon/fieldapp/ui/screen/attendance/adapter/AttendanceELVAdapter$OnTaskResponseItemClickListener;", "", "onCheckInClicked", "", "task", "Lcom/crayon/fieldapp/data/remote/response/TaskResponse;", "onCheckOutClicked", "app_release"})
    public static abstract interface OnTaskResponseItemClickListener {
        
        public abstract void onCheckInClicked(@org.jetbrains.annotations.NotNull()
        com.crayon.fieldapp.data.remote.response.TaskResponse task);
        
        public abstract void onCheckOutClicked(@org.jetbrains.annotations.NotNull()
        com.crayon.fieldapp.data.remote.response.TaskResponse task);
    }
}