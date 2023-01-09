package com.crayon.fieldapp.ui.screen.job;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class JobFragmentDirections {
  private JobFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionListjobToJobDetail() {
    return new ActionOnlyNavDirections(R.id.action_listjob_to_jobDetail);
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
