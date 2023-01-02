// Generated by data binding compiler. Do not edit!
package com.crayon.fieldapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import com.crayon.fieldapp.ui.screen.detailAttendance.DetailAttendanceViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentDetailAttendanceBinding extends ViewDataBinding {
  @NonNull
  public final ImageButton imbIcBack;

  @NonNull
  public final ImageButton imbIcFilter;

  @NonNull
  public final ImageView imgClockEarly;

  @NonNull
  public final ImageView imgClockLate;

  @NonNull
  public final ImageView imgIcRightEarly;

  @NonNull
  public final ImageView imgIcRightLate;

  @NonNull
  public final LinearLayout llDidTimekeeping;

  @NonNull
  public final LinearLayout llNotYetTimekeeping;

  @NonNull
  public final LinearLayout llOff;

  @NonNull
  public final ProgressBar pbLoading;

  @NonNull
  public final RelativeLayout rlEarl;

  @NonNull
  public final RelativeLayout rlLate;

  @NonNull
  public final RelativeLayout rlToolbar;

  @NonNull
  public final RecyclerView rvEmployee;

  @NonNull
  public final TextView tvTitle;

  @NonNull
  public final TextView txtDidTimekeeping;

  @NonNull
  public final TextView txtEarly;

  @NonNull
  public final TextView txtEmpty;

  @NonNull
  public final TextView txtLate;

  @NonNull
  public final TextView txtMember;

  @NonNull
  public final TextView txtNotYetTimekeeping;

  @NonNull
  public final TextView txtOff;

  @NonNull
  public final TextView txtTitle;

  @Bindable
  protected DetailAttendanceViewModel mViewModel;

  protected FragmentDetailAttendanceBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ImageButton imbIcBack, ImageButton imbIcFilter, ImageView imgClockEarly,
      ImageView imgClockLate, ImageView imgIcRightEarly, ImageView imgIcRightLate,
      LinearLayout llDidTimekeeping, LinearLayout llNotYetTimekeeping, LinearLayout llOff,
      ProgressBar pbLoading, RelativeLayout rlEarl, RelativeLayout rlLate, RelativeLayout rlToolbar,
      RecyclerView rvEmployee, TextView tvTitle, TextView txtDidTimekeeping, TextView txtEarly,
      TextView txtEmpty, TextView txtLate, TextView txtMember, TextView txtNotYetTimekeeping,
      TextView txtOff, TextView txtTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imbIcBack = imbIcBack;
    this.imbIcFilter = imbIcFilter;
    this.imgClockEarly = imgClockEarly;
    this.imgClockLate = imgClockLate;
    this.imgIcRightEarly = imgIcRightEarly;
    this.imgIcRightLate = imgIcRightLate;
    this.llDidTimekeeping = llDidTimekeeping;
    this.llNotYetTimekeeping = llNotYetTimekeeping;
    this.llOff = llOff;
    this.pbLoading = pbLoading;
    this.rlEarl = rlEarl;
    this.rlLate = rlLate;
    this.rlToolbar = rlToolbar;
    this.rvEmployee = rvEmployee;
    this.tvTitle = tvTitle;
    this.txtDidTimekeeping = txtDidTimekeeping;
    this.txtEarly = txtEarly;
    this.txtEmpty = txtEmpty;
    this.txtLate = txtLate;
    this.txtMember = txtMember;
    this.txtNotYetTimekeeping = txtNotYetTimekeeping;
    this.txtOff = txtOff;
    this.txtTitle = txtTitle;
  }

  public abstract void setViewModel(@Nullable DetailAttendanceViewModel viewModel);

  @Nullable
  public DetailAttendanceViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentDetailAttendanceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_detail_attendance, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDetailAttendanceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentDetailAttendanceBinding>inflateInternal(inflater, R.layout.fragment_detail_attendance, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentDetailAttendanceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_detail_attendance, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDetailAttendanceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentDetailAttendanceBinding>inflateInternal(inflater, R.layout.fragment_detail_attendance, null, false, component);
  }

  public static FragmentDetailAttendanceBinding bind(@NonNull View view) {
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
  public static FragmentDetailAttendanceBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentDetailAttendanceBinding)bind(component, view, R.layout.fragment_detail_attendance);
  }
}