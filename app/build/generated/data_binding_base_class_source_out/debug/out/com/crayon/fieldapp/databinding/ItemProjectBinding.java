// Generated by data binding compiler. Do not edit!
package com.crayon.fieldapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.data.remote.response.ProjectResponse;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemProjectBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imgTime;

  @NonNull
  public final TextView txtAgencyName;

  @NonNull
  public final TextView txtInfo;

  @NonNull
  public final TextView txtProjectName;

  @Bindable
  protected ProjectResponse mItem;

  protected ItemProjectBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imgTime, TextView txtAgencyName, TextView txtInfo, TextView txtProjectName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imgTime = imgTime;
    this.txtAgencyName = txtAgencyName;
    this.txtInfo = txtInfo;
    this.txtProjectName = txtProjectName;
  }

  public abstract void setItem(@Nullable ProjectResponse item);

  @Nullable
  public ProjectResponse getItem() {
    return mItem;
  }

  @NonNull
  public static ItemProjectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_project, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemProjectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemProjectBinding>inflateInternal(inflater, R.layout.item_project, root, attachToRoot, component);
  }

  @NonNull
  public static ItemProjectBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_project, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemProjectBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemProjectBinding>inflateInternal(inflater, R.layout.item_project, null, false, component);
  }

  public static ItemProjectBinding bind(@NonNull View view) {
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
  public static ItemProjectBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemProjectBinding)bind(component, view, R.layout.item_project);
  }
}
