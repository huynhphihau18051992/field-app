package com.crayon.fieldapp.ui.screen.detailTask.attendance;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class AttendanceFragmentDirections {
  private AttendanceFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionReportAttendanceFragmentToDetailAttachmentFragment() {
    return new ActionOnlyNavDirections(R.id.action_reportAttendanceFragment_to_detailAttachmentFragment);
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
