package com.crayon.fieldapp.ui.screen.requireLogin;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class RequireLoginFragmentDirections {
  private RequireLoginFragmentDirections() {
  }

  @NonNull
  public static NavDirections toRegister() {
    return new ActionOnlyNavDirections(R.id.to_register);
  }

  @NonNull
  public static NavDirections toLogin() {
    return new ActionOnlyNavDirections(R.id.to_login);
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
