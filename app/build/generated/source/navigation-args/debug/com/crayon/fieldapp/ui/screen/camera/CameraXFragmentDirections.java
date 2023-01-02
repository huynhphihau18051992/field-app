package com.crayon.fieldapp.ui.screen.camera;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class CameraXFragmentDirections {
  private CameraXFragmentDirections() {
  }

  @NonNull
  public static NavDirections cameraBackToDetailTask() {
    return new ActionOnlyNavDirections(R.id.camera_back_toDetailTask);
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
