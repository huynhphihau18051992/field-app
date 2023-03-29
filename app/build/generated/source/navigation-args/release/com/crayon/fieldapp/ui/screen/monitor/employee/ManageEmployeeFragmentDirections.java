package com.crayon.fieldapp.ui.screen.monitor.employee;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class ManageEmployeeFragmentDirections {
  private ManageEmployeeFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionMangagEmployeFragmentToDetailUserFragment() {
    return new ActionOnlyNavDirections(R.id.action_mangagEmployeFragment_to_DetailUserFragment);
  }

  @NonNull
  public static NavDirections actionManageEmployeeFragmentToDetailGroupUserFragment() {
    return new ActionOnlyNavDirections(R.id.action_manageEmployeeFragment_to_detailGroupUserFragment);
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
