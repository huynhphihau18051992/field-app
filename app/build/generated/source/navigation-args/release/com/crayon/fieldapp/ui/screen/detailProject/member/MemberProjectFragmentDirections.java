package com.crayon.fieldapp.ui.screen.detailProject.member;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class MemberProjectFragmentDirections {
  private MemberProjectFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionMemberProjectToDetailUser() {
    return new ActionOnlyNavDirections(R.id.action_memberProject_to_detailUser);
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
