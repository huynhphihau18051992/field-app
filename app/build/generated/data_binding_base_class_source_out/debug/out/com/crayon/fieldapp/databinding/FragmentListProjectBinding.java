// Generated by data binding compiler. Do not edit!
package com.crayon.fieldapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.ui.screen.monitor.listProject.ListProjectViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentListProjectBinding extends ViewDataBinding {
  @NonNull
  public final ProgressBar pbLoading;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final SearchView svProject;

  @NonNull
  public final TextView txtEmpty;

  @Bindable
  protected ListProjectViewModel mViewModel;

  protected FragmentListProjectBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ProgressBar pbLoading, RecyclerView recyclerView, SearchView svProject, TextView txtEmpty) {
    super(_bindingComponent, _root, _localFieldCount);
    this.pbLoading = pbLoading;
    this.recyclerView = recyclerView;
    this.svProject = svProject;
    this.txtEmpty = txtEmpty;
  }

  public abstract void setViewModel(@Nullable ListProjectViewModel viewModel);

  @Nullable
  public ListProjectViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentListProjectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_list_project, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentListProjectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentListProjectBinding>inflateInternal(inflater, R.layout.fragment_list_project, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentListProjectBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_list_project, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentListProjectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentListProjectBinding>inflateInternal(inflater, R.layout.fragment_list_project, null, false, component);
  }

  public static FragmentListProjectBinding bind(@NonNull View view) {
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
  public static FragmentListProjectBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentListProjectBinding)bind(component, view, R.layout.fragment_list_project);
  }
}
