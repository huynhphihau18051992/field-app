package com.crayon.fieldapp.ui.screen.detailTask.changeGift;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class ChangeGiftFragmentDirections {
  private ChangeGiftFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionChangeGiftFragmentToAddCustomerFragment() {
    return new ActionOnlyNavDirections(R.id.action_changeGiftFragment_to_addCustomerFragment);
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
