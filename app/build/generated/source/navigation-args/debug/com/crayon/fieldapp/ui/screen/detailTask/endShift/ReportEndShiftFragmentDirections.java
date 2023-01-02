package com.crayon.fieldapp.ui.screen.detailTask.endShift;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class ReportEndShiftFragmentDirections {
  private ReportEndShiftFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionReportEndShiftFragmentToDetailAttachmentFragment() {
    return new ActionOnlyNavDirections(R.id.action_reportEndShiftFragment_to_detailAttachmentFragment);
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
