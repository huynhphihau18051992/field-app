package com.crayon.fieldapp.ui.screen.main;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class MainFragmentDirections {
  private MainFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionMonitor() {
    return new ActionOnlyNavDirections(R.id.action_monitor);
  }

  @NonNull
  public static NavDirections actionMainToLogin() {
    return new ActionOnlyNavDirections(R.id.action_main_to_login);
  }

  @NonNull
  public static NavDirections actionProfileToAvatar() {
    return new ActionOnlyNavDirections(R.id.action_profile_to_avatar);
  }

  @NonNull
  public static NavDirections actionProfileToInfoFragment() {
    return new ActionOnlyNavDirections(R.id.action_profile_to_infoFragment);
  }

  @NonNull
  public static NavDirections actionProfileToBankFragment() {
    return new ActionOnlyNavDirections(R.id.action_profile_to_bankFragment);
  }

  @NonNull
  public static NavDirections actionProfileToApplicationFragment() {
    return new ActionOnlyNavDirections(R.id.action_profile_to_applicationFragment);
  }

  @NonNull
  public static NavDirections actionProfileToInfo() {
    return new ActionOnlyNavDirections(R.id.action_profile_to_info);
  }

  @NonNull
  public static NavDirections actionProfileToTermFragment() {
    return new ActionOnlyNavDirections(R.id.action_profile_to_termFragment);
  }

  @NonNull
  public static NavDirections actionProfileToPrivacyFragment() {
    return new ActionOnlyNavDirections(R.id.action_profile_to_privacyFragment);
  }

  @NonNull
  public static NavDirections actionProfileToContactFragment() {
    return new ActionOnlyNavDirections(R.id.action_profile_to_contactFragment);
  }

  @NonNull
  public static NavDirections actionNotificationToDetailNotificationFragment() {
    return new ActionOnlyNavDirections(R.id.action_notification_to_detailNotificationFragment);
  }

  @NonNull
  public static NavDirections toReport() {
    return new ActionOnlyNavDirections(R.id.to_report);
  }

  @NonNull
  public static NavDirections toCalendar() {
    return new ActionOnlyNavDirections(R.id.to_calendar);
  }

  @NonNull
  public static NavDirections mainToListJob() {
    return new ActionOnlyNavDirections(R.id.main_to_list_job);
  }

  @NonNull
  public static NavDirections toListJob() {
    return new ActionOnlyNavDirections(R.id.to_list_job);
  }

  @NonNull
  public static NavDirections actionDetailJob() {
    return new ActionOnlyNavDirections(R.id.action_detail_job);
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
