// Generated by data binding compiler. Do not edit!
package com.crayon.fieldapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.ui.screen.monitor.reportTracking.listTask.ListReportTrackingAtStoreViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentListReportTrackingAtStoreBinding extends ViewDataBinding {
  @NonNull
  public final RelativeLayout btnFilterStore;

  @NonNull
  public final ImageButton icSelectDate;

  @NonNull
  public final ImageButton imbIcBack;

  @NonNull
  public final ImageView imgIcFilter;

  @NonNull
  public final ProgressBar pbLoading;

  @NonNull
  public final RelativeLayout rlToolbar;

  @NonNull
  public final RecyclerView rvMembers;

  @NonNull
  public final TextView tvEmpty;

  @NonNull
  public final TextView tvFilter;

  @NonNull
  public final TextView tvTitle;

  @NonNull
  public final TextView txtFilterRoleStatus;

  @NonNull
  public final TextView txtStartDate;

  @Bindable
  protected ListReportTrackingAtStoreViewModel mViewModel;

  protected FragmentListReportTrackingAtStoreBinding(Object _bindingComponent, View _root,
      int _localFieldCount, RelativeLayout btnFilterStore, ImageButton icSelectDate,
      ImageButton imbIcBack, ImageView imgIcFilter, ProgressBar pbLoading, RelativeLayout rlToolbar,
      RecyclerView rvMembers, TextView tvEmpty, TextView tvFilter, TextView tvTitle,
      TextView txtFilterRoleStatus, TextView txtStartDate) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnFilterStore = btnFilterStore;
    this.icSelectDate = icSelectDate;
    this.imbIcBack = imbIcBack;
    this.imgIcFilter = imgIcFilter;
    this.pbLoading = pbLoading;
    this.rlToolbar = rlToolbar;
    this.rvMembers = rvMembers;
    this.tvEmpty = tvEmpty;
    this.tvFilter = tvFilter;
    this.tvTitle = tvTitle;
    this.txtFilterRoleStatus = txtFilterRoleStatus;
    this.txtStartDate = txtStartDate;
  }

  public abstract void setViewModel(@Nullable ListReportTrackingAtStoreViewModel viewModel);

  @Nullable
  public ListReportTrackingAtStoreViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentListReportTrackingAtStoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_list_report_tracking_at_store, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentListReportTrackingAtStoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentListReportTrackingAtStoreBinding>inflateInternal(inflater, R.layout.fragment_list_report_tracking_at_store, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentListReportTrackingAtStoreBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_list_report_tracking_at_store, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentListReportTrackingAtStoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentListReportTrackingAtStoreBinding>inflateInternal(inflater, R.layout.fragment_list_report_tracking_at_store, null, false, component);
  }

  public static FragmentListReportTrackingAtStoreBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentListReportTrackingAtStoreBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentListReportTrackingAtStoreBinding)bind(component, view, R.layout.fragment_list_report_tracking_at_store);
  }
}
