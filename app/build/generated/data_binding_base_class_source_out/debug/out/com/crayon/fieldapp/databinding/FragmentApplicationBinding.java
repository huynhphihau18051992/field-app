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
import com.crayon.fieldapp.ui.screen.application.ApplicationViewModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentApplicationBinding extends ViewDataBinding {
  @NonNull
  public final FloatingActionButton fabCreate;

  @NonNull
  public final ImageButton imbIcBack;

  @NonNull
  public final ImageButton imbIcFilter;

  @NonNull
  public final RelativeLayout rlToolbar;

  @NonNull
  public final TabLayout tabMyApplication;

  @NonNull
  public final TextView tvTitle;

  @NonNull
  public final ViewPager vpMyApplication;

  @Bindable
  protected ApplicationViewModel mViewModel;

  protected FragmentApplicationBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FloatingActionButton fabCreate, ImageButton imbIcBack, ImageButton imbIcFilter,
      RelativeLayout rlToolbar, TabLayout tabMyApplication, TextView tvTitle,
      ViewPager vpMyApplication) {
    super(_bindingComponent, _root, _localFieldCount);
    this.fabCreate = fabCreate;
    this.imbIcBack = imbIcBack;
    this.imbIcFilter = imbIcFilter;
    this.rlToolbar = rlToolbar;
    this.tabMyApplication = tabMyApplication;
    this.tvTitle = tvTitle;
    this.vpMyApplication = vpMyApplication;
  }

  public abstract void setViewModel(@Nullable ApplicationViewModel viewModel);

  @Nullable
  public ApplicationViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentApplicationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_application, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentApplicationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentApplicationBinding>inflateInternal(inflater, R.layout.fragment_application, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentApplicationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_application, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentApplicationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentApplicationBinding>inflateInternal(inflater, R.layout.fragment_application, null, false, component);
  }

  public static FragmentApplicationBinding bind(@NonNull View view) {
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
  public static FragmentApplicationBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentApplicationBinding)bind(component, view, R.layout.fragment_application);
  }
}
