package com.crayon.fieldapp.ui.screen.monitor.reportSales.listTask;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class ListReportSalesAtStoreFragmentDirections {
  private ListReportSalesAtStoreFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionListReportSalesToDetailReportSales() {
    return new ActionOnlyNavDirections(R.id.action_list_reportSales_to_detail_reportSales);
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
