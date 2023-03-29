package com.crayon.fieldapp.ui.screen.detailTask.reportSales;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class ReportSalesFragmentDirections {
  private ReportSalesFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionReportSalesFragmentToAddOrderFragment() {
    return new ActionOnlyNavDirections(R.id.action_reportSalesFragment_to_addOrderFragment);
  }

  @NonNull
  public static NavDirections actionReportSalesFragmentToDetailOrderFragment() {
    return new ActionOnlyNavDirections(R.id.action_reportSalesFragment_to_detailOrderFragment);
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
