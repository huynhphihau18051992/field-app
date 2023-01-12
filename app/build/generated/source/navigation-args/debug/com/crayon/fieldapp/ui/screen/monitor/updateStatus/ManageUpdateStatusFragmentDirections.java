package com.crayon.fieldapp.ui.screen.monitor.updateStatus;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class ManageUpdateStatusFragmentDirections {
  private ManageUpdateStatusFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionUpdateStatusToListUpdateStatus() {
    return new ActionOnlyNavDirections(R.id.action_updateStatus_to_list_updateStatus);
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
