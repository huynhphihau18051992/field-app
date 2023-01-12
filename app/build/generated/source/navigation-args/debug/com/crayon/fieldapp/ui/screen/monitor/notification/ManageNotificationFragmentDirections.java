package com.crayon.fieldapp.ui.screen.monitor.notification;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class ManageNotificationFragmentDirections {
  private ManageNotificationFragmentDirections() {
  }

  @NonNull
  public static NavDirections toDetailNotification() {
    return new ActionOnlyNavDirections(R.id.to_detail_notification);
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
