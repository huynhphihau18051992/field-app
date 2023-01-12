package com.crayon.fieldapp.ui.screen.detailProject.manageJob;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class ManageJobProjectFragmentDirections {
  private ManageJobProjectFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionJobProjectToDetailJob() {
    return new ActionOnlyNavDirections(R.id.action_JobProject_to_detailJob);
  }

  @NonNull
  public static NavDirections toCreateJob() {
    return new ActionOnlyNavDirections(R.id.to_createJob);
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
