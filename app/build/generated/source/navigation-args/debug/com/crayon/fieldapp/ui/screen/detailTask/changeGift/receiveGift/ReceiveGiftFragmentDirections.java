package com.crayon.fieldapp.ui.screen.detailTask.changeGift.receiveGift;

import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;

public class ReceiveGiftFragmentDirections {
  private ReceiveGiftFragmentDirections() {
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
