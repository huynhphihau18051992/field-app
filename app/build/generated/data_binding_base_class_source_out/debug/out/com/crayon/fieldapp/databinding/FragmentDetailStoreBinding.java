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
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.ui.screen.monitor.store.listStore.detail.DetailStoreViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentDetailStoreBinding extends ViewDataBinding {
  @NonNull
  public final ImageButton imbIcBack;

  @NonNull
  public final ImageButton imbIcFilter;

  @NonNull
  public final RelativeLayout rlToolbar;

  @NonNull
  public final TextView tvTitle;

  @NonNull
  public final TextView txtAddress;

  @Bindable
  protected DetailStoreViewModel mViewModel;

  protected FragmentDetailStoreBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageButton imbIcBack, ImageButton imbIcFilter, RelativeLayout rlToolbar, TextView tvTitle,
      TextView txtAddress) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imbIcBack = imbIcBack;
    this.imbIcFilter = imbIcFilter;
    this.rlToolbar = rlToolbar;
    this.tvTitle = tvTitle;
    this.txtAddress = txtAddress;
  }

  public abstract void setViewModel(@Nullable DetailStoreViewModel viewModel);

  @Nullable
  public DetailStoreViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentDetailStoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_detail_store, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDetailStoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentDetailStoreBinding>inflateInternal(inflater, R.layout.fragment_detail_store, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentDetailStoreBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_detail_store, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDetailStoreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentDetailStoreBinding>inflateInternal(inflater, R.layout.fragment_detail_store, null, false, component);
  }

  public static FragmentDetailStoreBinding bind(@NonNull View view) {
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
  public static FragmentDetailStoreBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentDetailStoreBinding)bind(component, view, R.layout.fragment_detail_store);
  }
}
