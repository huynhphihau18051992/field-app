package com.crayon.fieldapp.ui.screen.detailTask;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class DetailTaskFragmentDirections {
  private DetailTaskFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionDetailTaskFragmentToDetailAttachmentFragment() {
    return new ActionOnlyNavDirections(R.id.action_detailTaskFragment_to_detailAttachmentFragment);
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
