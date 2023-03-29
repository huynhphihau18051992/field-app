package com.crayon.fieldapp.ui.screen.monitor.reportTracking.history;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class HistoryTrackingAtStoreFragmentDirections {
  private HistoryTrackingAtStoreFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionHistoryTrackingToDetailTracking() {
    return new ActionOnlyNavDirections(R.id.action_history_tracking_to_detail_tracking);
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
