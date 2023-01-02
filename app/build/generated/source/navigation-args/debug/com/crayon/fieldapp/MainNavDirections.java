package com.crayon.fieldapp;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class MainNavDirections {
  private MainNavDirections() {
  }

  @NonNull
  public static NavDirections actionGlobalLoginFragment() {
    return new ActionOnlyNavDirections(R.id.action_global_loginFragment);
  }

  @NonNull
  public static NavDirections actionGlobalCameraFragment() {
    return new ActionOnlyNavDirections(R.id.action_global_CameraFragment);
  }
}
