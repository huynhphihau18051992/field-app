package com.crayon.fieldapp.ui.screen.monitor.changeGift.detailTask;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class DetailChangeGiftAtStoreFragmentDirections {
  private DetailChangeGiftAtStoreFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionDetailChangeGiftToDetailCustomer() {
    return new ActionOnlyNavDirections(R.id.action_detail_changeGift_to_detail_customer);
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
