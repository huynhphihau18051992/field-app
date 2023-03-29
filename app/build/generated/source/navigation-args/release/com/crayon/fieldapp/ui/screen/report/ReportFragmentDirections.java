package com.crayon.fieldapp.ui.screen.report;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class ReportFragmentDirections {
  private ReportFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionReportToLoginFragment() {
    return new ActionOnlyNavDirections(R.id.action_report_to_loginFragment);
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
