package com.crayon.fieldapp.ui.screen.notification;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.R;

public class NotificationFragmentDirections {
  private NotificationFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionNotificationToDetailNotificationFragment() {
    return new ActionOnlyNavDirections(R.id.action_notification_to_detailNotificationFragment);
  }
}
