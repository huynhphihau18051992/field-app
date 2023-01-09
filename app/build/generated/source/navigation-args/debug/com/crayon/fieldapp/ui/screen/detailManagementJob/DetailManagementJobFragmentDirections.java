package com.crayon.fieldapp.ui.screen.detailManagementJob;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class DetailManagementJobFragmentDirections {
  private DetailManagementJobFragmentDirections() {
  }

  @NonNull
  public static NavDirections toAddTask() {
    return new ActionOnlyNavDirections(R.id.to_addTask);
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
