// Generated by data binding compiler. Do not edit!
package com.crayon.fieldapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crayon.fieldapp.R;
import com.crayon.fieldapp.ui.screen.detailUser.DetailUserViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentDetailUserBinding extends ViewDataBinding {
  @NonNull
  public final Button btnRemove;

  @NonNull
  public final ImageButton imbIcBack;

  @NonNull
  public final ImageButton imbIcFilter;

  @NonNull
  public final ImageView imgAvatar;

  @NonNull
  public final RelativeLayout rlToolbar;

  @NonNull
  public final TextView tvTitle;

  @NonNull
  public final TextView txtBirthDay;

  @NonNull
  public final TextView txtEmail;

  @NonNull
  public final TextView txtId;

  @NonNull
  public final TextView txtPhone;

  @Bindable
  protected DetailUserViewModel mViewModel;

  protected FragmentDetailUserBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnRemove, ImageButton imbIcBack, ImageButton imbIcFilter, ImageView imgAvatar,
      RelativeLayout rlToolbar, TextView tvTitle, TextView txtBirthDay, TextView txtEmail,
      TextView txtId, TextView txtPhone) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnRemove = btnRemove;
    this.imbIcBack = imbIcBack;
    this.imbIcFilter = imbIcFilter;
    this.imgAvatar = imgAvatar;
    this.rlToolbar = rlToolbar;
    this.tvTitle = tvTitle;
    this.txtBirthDay = txtBirthDay;
    this.txtEmail = txtEmail;
    this.txtId = txtId;
    this.txtPhone = txtPhone;
  }

  public abstract void setViewModel(@Nullable DetailUserViewModel viewModel);

  @Nullable
  public DetailUserViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentDetailUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_detail_user, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDetailUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentDetailUserBinding>inflateInternal(inflater, R.layout.fragment_detail_user, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentDetailUserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_detail_user, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDetailUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentDetailUserBinding>inflateInternal(inflater, R.layout.fragment_detail_user, null, false, component);
  }

  public static FragmentDetailUserBinding bind(@NonNull View view) {
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
  public static FragmentDetailUserBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentDetailUserBinding)bind(component, view, R.layout.fragment_detail_user);
  }
}
