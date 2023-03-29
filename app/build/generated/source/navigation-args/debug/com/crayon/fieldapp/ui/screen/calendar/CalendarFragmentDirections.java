package com.crayon.fieldapp.ui.screen.calendar;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.MainNavDirections;
import com.crayon.fieldapp.R;

public class CalendarFragmentDirections {
  private CalendarFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionCalendarToJobDetail() {
    return new ActionOnlyNavDirections(R.id.action_calendar_to_jobDetail);
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
