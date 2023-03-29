package com.crayon.fieldapp.ui.screen.detailProject.createJob;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class CreateJobFragmentDirections {
  private CreateJobFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionAddJobProjectToDetailUser() {
    return new ActionOnlyNavDirections(R.id.action_AddJobProject_to_detailUser);
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
