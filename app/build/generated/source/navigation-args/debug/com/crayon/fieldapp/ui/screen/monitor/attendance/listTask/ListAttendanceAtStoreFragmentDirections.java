package com.crayon.fieldapp.ui.screen.monitor.attendance.listTask;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class ListAttendanceAtStoreFragmentDirections {
  private ListAttendanceAtStoreFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionListAttendanceToDetailAttendance() {
    return new ActionOnlyNavDirections(R.id.action_list_attendance_to_detail_attendance);
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
