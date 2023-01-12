package com.crayon.fieldapp.ui.screen.monitor.reportTracking.listTask;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class ListReportTrackingAtStoreFragmentDirections {
  private ListReportTrackingAtStoreFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionListReportTrackingToDetailReportTracking() {
    return new ActionOnlyNavDirections(R.id.action_list_reportTracking_to_detail_reportTracking);
  }

  @NonNull
  public static NavDirections actionListReportTrackingToHistory() {
    return new ActionOnlyNavDirections(R.id.action_list_reportTracking_to_history);
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
