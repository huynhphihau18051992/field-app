// Generated by data binding compiler. Do not edit!
package com.crayon.fieldapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crayon.fieldapp.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentJobContainerBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout container;

  protected FragmentJobContainerBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout container) {
    super(_bindingComponent, _root, _localFieldCount);
    this.container = container;
  }

  @NonNull
  public static FragmentJobContainerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_job_container, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentJobContainerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentJobContainerBinding>inflateInternal(inflater, R.layout.fragment_job_container, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentJobContainerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_job_container, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentJobContainerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentJobContainerBinding>inflateInternal(inflater, R.layout.fragment_job_container, null, false, component);
  }

  public static FragmentJobContainerBinding bind(@NonNull View view) {
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
  public static FragmentJobContainerBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentJobContainerBinding)bind(component, view, R.layout.fragment_job_container);
  }
}
