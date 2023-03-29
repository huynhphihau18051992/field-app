package com.crayon.fieldapp.ui.screen.monitor.changeGift.listCustomer;

import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;

public class ListCustomerFragmentDirections {
  private ListCustomerFragmentDirections() {
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
