package com.crayon.fieldapp.ui.screen.detailGroupStore;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class DetailGroupFragmentDirections {
  private DetailGroupFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionDetailGroupFragmentToDetailStoreFragment() {
    return new ActionOnlyNavDirections(R.id.action_detailGroupFragment_to_detailStoreFragment);
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
