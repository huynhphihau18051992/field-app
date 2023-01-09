package com.crayon.fieldapp.ui.screen.detailPicJob;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class DetailPicJobFragmentDirections {
  private DetailPicJobFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionDetailPicJobToDetailTask() {
    return new ActionOnlyNavDirections(R.id.action_detailPicJob_to_detailTask);
  }

  @NonNull
  public static NavDirections actionDetailPicJobFragmentToReportEndShiftFragment() {
    return new ActionOnlyNavDirections(R.id.action_detailPicJobFragment_to_reportEndShiftFragment);
  }

  @NonNull
  public static NavDirections actionDetailPicJobFragmentToReportAttendanceFragment() {
    return new ActionOnlyNavDirections(R.id.action_detailPicJobFragment_to_reportAttendanceFragment);
  }

  @NonNull
  public static NavDirections actionDetailPicJobFragmentToReportUpdateStatusFragment() {
    return new ActionOnlyNavDirections(R.id.action_detailPicJobFragment_to_reportUpdateStatusFragment);
  }

  @NonNull
  public static NavDirections actionDetailPicJobFragmentToChangeGiftFragment() {
    return new ActionOnlyNavDirections(R.id.action_detailPicJobFragment_to_changeGiftFragment);
  }

  @NonNull
  public static NavDirections actionDetailPicJobFragmentToReportCompetitorFragment() {
    return new ActionOnlyNavDirections(R.id.action_detailPicJobFragment_to_reportCompetitorFragment);
  }

  @NonNull
  public static NavDirections actionDetailPicJobFragmentToReportSalesFragment() {
    return new ActionOnlyNavDirections(R.id.action_detailPicJobFragment_to_reportSalesFragment);
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
