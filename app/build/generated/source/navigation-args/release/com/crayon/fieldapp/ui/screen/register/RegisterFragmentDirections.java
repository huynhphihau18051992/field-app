package com.crayon.fieldapp.ui.screen.register;

import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;

public class RegisterFragmentDirections {
  private RegisterFragmentDirections() {
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
