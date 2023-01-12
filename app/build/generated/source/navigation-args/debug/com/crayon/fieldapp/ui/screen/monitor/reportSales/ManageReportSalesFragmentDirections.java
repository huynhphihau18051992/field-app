package com.crayon.fieldapp.ui.screen.monitor.reportSales;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class ManageReportSalesFragmentDirections {
  private ManageReportSalesFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionReportSalesToListReportSales() {
    return new ActionOnlyNavDirections(R.id.action_reportSales_to_list_reportSales);
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
