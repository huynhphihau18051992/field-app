package com.crayon.fieldapp.ui.screen.detailProject.createTask;

import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;

public class CreateTaskFragmentDirections {
  private CreateTaskFragmentDirections() {
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
