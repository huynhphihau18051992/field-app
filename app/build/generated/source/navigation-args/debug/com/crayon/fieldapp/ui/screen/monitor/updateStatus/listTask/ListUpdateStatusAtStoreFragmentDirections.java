package com.crayon.fieldapp.ui.screen.monitor.updateStatus.listTask;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class ListUpdateStatusAtStoreFragmentDirections {
  private ListUpdateStatusAtStoreFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionListUpdateStatusToDetailUpdateStatus() {
    return new ActionOnlyNavDirections(R.id.action_list_updateStatus_to_detail_updateStatus);
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
