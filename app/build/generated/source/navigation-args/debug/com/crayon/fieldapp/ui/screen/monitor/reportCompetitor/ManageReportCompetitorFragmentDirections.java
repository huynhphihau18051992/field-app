package com.crayon.fieldapp.ui.screen.monitor.reportCompetitor;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class ManageReportCompetitorFragmentDirections {
  private ManageReportCompetitorFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionReportCompetitorToListReportCompetitor() {
    return new ActionOnlyNavDirections(R.id.action_reportCompetitor_to_list_reportCompetitor);
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
