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
import com.crayon.fieldapp.data.remote.response.MemberResponse;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemMemberBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imgAvatar;

  @NonNull
  public final TextView txtName;

  @Bindable
  protected MemberResponse mItem;

  protected ItemMemberBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imgAvatar, TextView txtName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imgAvatar = imgAvatar;
    this.txtName = txtName;
  }

  public abstract void setItem(@Nullable MemberResponse item);

  @Nullable
  public MemberResponse getItem() {
    return mItem;
  }

  @NonNull
  public static ItemMemberBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_member, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemMemberBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemMemberBinding>inflateInternal(inflater, R.layout.item_member, root, attachToRoot, component);
  }

  @NonNull
  public static ItemMemberBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_member, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemMemberBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemMemberBinding>inflateInternal(inflater, R.layout.item_member, null, false, component);
  }

  public static ItemMemberBinding bind(@NonNull View view) {
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
  public static ItemMemberBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemMemberBinding)bind(component, view, R.layout.item_member);
  }
}
