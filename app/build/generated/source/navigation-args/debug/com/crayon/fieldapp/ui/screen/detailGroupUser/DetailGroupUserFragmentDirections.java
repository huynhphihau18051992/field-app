package com.crayon.fieldapp.ui.screen.detailGroupUser;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class DetailGroupUserFragmentDirections {
  private DetailGroupUserFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionDetailGroupUserFragmentToDetailUserFragment() {
    return new ActionOnlyNavDirections(R.id.action_detailGroupUserFragment_to_detailUserFragment);
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
