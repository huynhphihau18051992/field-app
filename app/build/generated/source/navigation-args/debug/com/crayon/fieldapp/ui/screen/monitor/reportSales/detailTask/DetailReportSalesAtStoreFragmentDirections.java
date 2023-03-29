package com.crayon.fieldapp.ui.screen.monitor.reportSales.detailTask;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class DetailReportSalesAtStoreFragmentDirections {
  private DetailReportSalesAtStoreFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionDetailReportSalesToDetailOrder() {
    return new ActionOnlyNavDirections(R.id.action_detail_reportSales_to_detail_order);
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
