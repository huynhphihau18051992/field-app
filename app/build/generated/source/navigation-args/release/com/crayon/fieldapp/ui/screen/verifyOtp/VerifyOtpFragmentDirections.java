package com.crayon.fieldapp.ui.screen.verifyOtp;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class VerifyOtpFragmentDirections {
  private VerifyOtpFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionVerifyToMain() {
    return new ActionOnlyNavDirections(R.id.action_verify_to_main);
  }

  @NonNull
  public static NavDirections actionVerifyToResetPasswordFragment() {
    return new ActionOnlyNavDirections(R.id.action_verify_to_resetPasswordFragment);
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
