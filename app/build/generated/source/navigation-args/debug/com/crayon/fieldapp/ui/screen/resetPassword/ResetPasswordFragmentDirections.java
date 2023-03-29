package com.crayon.fieldapp.ui.screen.resetPassword;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class ResetPasswordFragmentDirections {
  private ResetPasswordFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionResetPasswordFragmentToMain() {
    return new ActionOnlyNavDirections(R.id.action_resetPasswordFragment_to_main);
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
