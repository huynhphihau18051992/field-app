package com.crayon.fieldapp.ui.screen.monitor.project;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class ManageProjectFragmentDirections {
  private ManageProjectFragmentDirections() {
  }

  @NonNull
  public static NavDirections toDetailProject() {
    return new ActionOnlyNavDirections(R.id.to_detail_project);
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
