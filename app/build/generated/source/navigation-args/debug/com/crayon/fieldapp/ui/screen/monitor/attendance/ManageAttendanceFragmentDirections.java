package com.crayon.fieldapp.ui.screen.monitor.attendance;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class ManageAttendanceFragmentDirections {
  private ManageAttendanceFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionAttendanceToListAttendance() {
    return new ActionOnlyNavDirections(R.id.action_attendance_to_list_attendance);
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
