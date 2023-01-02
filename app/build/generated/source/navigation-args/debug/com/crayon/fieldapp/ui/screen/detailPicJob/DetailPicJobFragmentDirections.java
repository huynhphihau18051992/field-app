package com.crayon.fieldapp.ui.screen.detailPicJob;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.R;

public class DetailPicJobFragmentDirections {
  private DetailPicJobFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionDetailPicJobToDetailTask() {
    return new ActionOnlyNavDirections(R.id.action_detailPicJob_to_detailTask);
  }
}
