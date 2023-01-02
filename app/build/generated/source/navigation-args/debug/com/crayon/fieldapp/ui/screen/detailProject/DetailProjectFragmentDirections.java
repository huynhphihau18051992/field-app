package com.crayon.fieldapp.ui.screen.detailProject;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class DetailProjectFragmentDirections {
  private DetailProjectFragmentDirections() {
  }

  @NonNull
  public static NavDirections toMemberProject() {
    return new ActionOnlyNavDirections(R.id.to_member_project);
  }

  @NonNull
  public static NavDirections toStoreProject() {
    return new ActionOnlyNavDirections(R.id.to_store_project);
  }

  @NonNull
  public static NavDirections toAddMemberProject() {
    return new ActionOnlyNavDirections(R.id.to_addMember_project);
  }

  @NonNull
  public static NavDirections toManageJobProject() {
    return new ActionOnlyNavDirections(R.id.to_manageJob_project);
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
