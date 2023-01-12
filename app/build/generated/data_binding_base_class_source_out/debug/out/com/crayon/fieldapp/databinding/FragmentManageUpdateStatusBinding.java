// Generated by data binding compiler. Do not edit!
package com.crayon.fieldapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.ui.screen.monitor.updateStatus.ManageUpdateStatusViewModel;
import com.google.android.material.tabs.TabLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentManageUpdateStatusBinding extends ViewDataBinding {
  @NonNull
  public final ImageButton imbIcBack;

  @NonNull
  public final ImageButton imbIcFilter;

  @NonNull
  public final RelativeLayout rlToolbar;

  @NonNull
  public final TabLayout tabProject;

  @NonNull
  public final TextView tvSubTitle;

  @NonNull
  public final TextView tvTitle;

  @NonNull
  public final ViewPager vpProject;

  @Bindable
  protected ManageUpdateStatusViewModel mViewModel;

  protected FragmentManageUpdateStatusBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ImageButton imbIcBack, ImageButton imbIcFilter,
      RelativeLayout rlToolbar, TabLayout tabProject, TextView tvSubTitle, TextView tvTitle,
      ViewPager vpProject) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imbIcBack = imbIcBack;
    this.imbIcFilter = imbIcFilter;
    this.rlToolbar = rlToolbar;
    this.tabProject = tabProject;
    this.tvSubTitle = tvSubTitle;
    this.tvTitle = tvTitle;
    this.vpProject = vpProject;
  }

  public abstract void setViewModel(@Nullable ManageUpdateStatusViewModel viewModel);

  @Nullable
  public ManageUpdateStatusViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentManageUpdateStatusBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_manage_update_status, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentManageUpdateStatusBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentManageUpdateStatusBinding>inflateInternal(inflater, R.layout.fragment_manage_update_status, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentManageUpdateStatusBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_manage_update_status, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentManageUpdateStatusBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentManageUpdateStatusBinding>inflateInternal(inflater, R.layout.fragment_manage_update_status, null, false, component);
  }

  public static FragmentManageUpdateStatusBinding bind(@NonNull View view) {
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
  public static FragmentManageUpdateStatusBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentManageUpdateStatusBinding)bind(component, view, R.layout.fragment_manage_update_status);
  }
}
