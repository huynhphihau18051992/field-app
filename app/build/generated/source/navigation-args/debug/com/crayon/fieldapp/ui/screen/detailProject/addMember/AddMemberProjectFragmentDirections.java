package com.crayon.fieldapp.ui.screen.detailProject.addMember;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class AddMemberProjectFragmentDirections {
  private AddMemberProjectFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionAddMemberProjectToDetailUser() {
    return new ActionOnlyNavDirections(R.id.action_addMemberProject_to_detailUser);
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
