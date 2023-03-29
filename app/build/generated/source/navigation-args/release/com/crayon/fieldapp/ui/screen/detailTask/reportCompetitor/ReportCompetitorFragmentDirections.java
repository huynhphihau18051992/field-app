package com.crayon.fieldapp.ui.screen.detailTask.reportCompetitor;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class ReportCompetitorFragmentDirections {
  private ReportCompetitorFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionReportCompetitorFragmentToAddReportCompetitorFragment() {
    return new ActionOnlyNavDirections(R.id.action_reportCompetitorFragment_to_addReportCompetitorFragment);
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
