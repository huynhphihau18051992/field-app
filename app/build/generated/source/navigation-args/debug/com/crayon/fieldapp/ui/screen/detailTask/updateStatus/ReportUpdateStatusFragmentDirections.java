package com.crayon.fieldapp.ui.screen.detailTask.updateStatus;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class ReportUpdateStatusFragmentDirections {
  private ReportUpdateStatusFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionReportUpdateStatusFragmentToDetailAttachmentFragment() {
    return new ActionOnlyNavDirections(R.id.action_reportUpdateStatusFragment_to_detailAttachmentFragment);
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
