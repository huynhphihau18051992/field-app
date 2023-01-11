package com.crayon.fieldapp.ui.screen.monitor.changeGift;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class ManageChangeGiftFragmentDirections {
  private ManageChangeGiftFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionChangeGiftToListChangeGift() {
    return new ActionOnlyNavDirections(R.id.action_changeGift_to_list_changeGift);
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
