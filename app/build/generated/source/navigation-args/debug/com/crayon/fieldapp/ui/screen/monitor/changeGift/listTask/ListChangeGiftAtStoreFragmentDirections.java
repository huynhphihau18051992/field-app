package com.crayon.fieldapp.ui.screen.monitor.changeGift.listTask;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class ListChangeGiftAtStoreFragmentDirections {
  private ListChangeGiftAtStoreFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionListChangeGiftToDetailChangeGift() {
    return new ActionOnlyNavDirections(R.id.action_list_changeGift_to_detail_changeGift);
  }

  @NonNull
  public static NavDirections actionListChangeGiftToListCustomer() {
    return new ActionOnlyNavDirections(R.id.action_list_changeGift_to_listCustomer);
  }

  @NonNull
  public static NavDirections actionListChangeGiftToListPromotion() {
    return new ActionOnlyNavDirections(R.id.action_list_changeGift_to_listPromotion);
  }

  @NonNull
  public static NavDirections actionListChangeGiftToListGift() {
    return new ActionOnlyNavDirections(R.id.action_list_changeGift_to_listGift);
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
