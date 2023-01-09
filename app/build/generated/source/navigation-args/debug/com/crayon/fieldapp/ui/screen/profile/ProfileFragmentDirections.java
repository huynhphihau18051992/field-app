package com.crayon.fieldapp.ui.screen.profile;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.R;

public class ProfileFragmentDirections {
  private ProfileFragmentDirections() {
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
}
