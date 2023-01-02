package com.crayon.fieldapp.ui.screen.monitor;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class MonitorFragmentDirections {
  private MonitorFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionMonitorFragmentToManageEmployeeFragment() {
    return new ActionOnlyNavDirections(R.id.action_monitorFragment_to_manageEmployeeFragment);
  }

  @NonNull
  public static NavDirections actionMonitorFragmentToManageAttendanceFragment() {
    return new ActionOnlyNavDirections(R.id.action_monitorFragment_to_manageAttendanceFragment);
  }

  @NonNull
  public static NavDirections actionMonitorFragmentToManageUpdateStatusFragment() {
    return new ActionOnlyNavDirections(R.id.action_monitorFragment_to_manageUpdateStatusFragment);
  }

  @NonNull
  public static NavDirections actionMonitorFragmentToManageApplicationFragment() {
    return new ActionOnlyNavDirections(R.id.action_monitorFragment_to_manageApplicationFragment);
  }

  @NonNull
  public static NavDirections actionMonitorFragmentToManageNotificationFragment() {
    return new ActionOnlyNavDirections(R.id.action_monitorFragment_to_manageNotificationFragment);
  }

  @NonNull
  public static NavDirections actionMonitorFragmentToManageStoreFragment() {
    return new ActionOnlyNavDirections(R.id.action_monitorFragment_to_manageStoreFragment);
  }

  @NonNull
  public static NavDirections actionMonitorFragmentToManageProjectFragment() {
    return new ActionOnlyNavDirections(R.id.action_monitorFragment_to_manageProjectFragment);
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
