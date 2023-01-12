package com.crayon.fieldapp.ui.screen.detailProject.addStore;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class StoreProjectFragmentDirections {
  private StoreProjectFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionStoreProjectToDetailStore() {
    return new ActionOnlyNavDirections(R.id.action_storeProject_to_detailStore);
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
