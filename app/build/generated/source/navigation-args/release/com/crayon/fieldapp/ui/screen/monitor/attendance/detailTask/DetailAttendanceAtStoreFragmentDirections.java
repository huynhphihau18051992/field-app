package com.crayon.fieldapp.ui.screen.monitor.attendance.detailTask;

import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;

public class DetailAttendanceAtStoreFragmentDirections {
  private DetailAttendanceAtStoreFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionGlobalLoginFragment() {
    return MainNavDirections.actionGlobalLoginFragment();
  }

  @NonNull
  public static NavDirections actionGlobalCameraFragment() {
    return MainNavDirections.actionGlobalCameraFragment();
  }
}
