package com.crayon.fieldapp.ui.screen.monitor.reportCompetitor.listTask;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class ListReportCompetitorAtStoreFragmentDirections {
  private ListReportCompetitorAtStoreFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionListReportCompetitorToDetailReportCompetitor() {
    return new ActionOnlyNavDirections(R.id.action_list_reportCompetitor_to_detail_reportCompetitor);
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
