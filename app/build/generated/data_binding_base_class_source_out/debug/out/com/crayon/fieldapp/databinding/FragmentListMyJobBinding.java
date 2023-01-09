// Generated by data binding compiler. Do not edit!
package com.crayon.fieldapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.ui.screen.job.listJob.ListJobViewModel  ;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentListMyJobBinding extends ViewDataBinding {
  @NonNull
  public final ProgressBar pbLoading;

  @NonNull
  public final SwipeRefreshLayout refreshLayout;

  @NonNull
  public final Button retryButton;

  @NonNull
  public final RecyclerView rvJob;

  @NonNull
  public final TextView txtEmpty;

  @Bindable
  protected ListJobViewModel   mViewModel;

  protected FragmentListMyJobBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ProgressBar pbLoading, SwipeRefreshLayout refreshLayout, Button retryButton,
      RecyclerView rvJob, TextView txtEmpty) {
    super(_bindingComponent, _root, _localFieldCount);
    this.pbLoading = pbLoading;
    this.refreshLayout = refreshLayout;
    this.retryButton = retryButton;
    this.rvJob = rvJob;
    this.txtEmpty = txtEmpty;
  }

  public abstract void setViewModel(@Nullable ListJobViewModel   viewModel);

  @Nullable
  public ListJobViewModel   getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentListMyJobBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_list_my_job, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentListMyJobBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentListMyJobBinding>inflateInternal(inflater, R.layout.fragment_list_my_job, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentListMyJobBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_list_my_job, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentListMyJobBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentListMyJobBinding>inflateInternal(inflater, R.layout.fragment_list_my_job, null, false, component);
  }

  public static FragmentListMyJobBinding bind(@NonNull View view) {
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
  public static FragmentListMyJobBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentListMyJobBinding)bind(component, view, R.layout.fragment_list_my_job);
  }
}
