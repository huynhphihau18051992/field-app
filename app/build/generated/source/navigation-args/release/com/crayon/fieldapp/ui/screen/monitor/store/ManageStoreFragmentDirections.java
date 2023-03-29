package com.crayon.fieldapp.ui.screen.monitor.store;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class ManageStoreFragmentDirections {
  private ManageStoreFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionManageStoreFragmentToDetailGroupFragment() {
    return new ActionOnlyNavDirections(R.id.action_manageStoreFragment_to_detailGroupFragment);
  }

  @NonNull
  public static NavDirections actionManageStoreFragmentToDetailStoreFragment() {
    return new ActionOnlyNavDirections(R.id.action_manageStoreFragment_to_detailStoreFragment);
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
