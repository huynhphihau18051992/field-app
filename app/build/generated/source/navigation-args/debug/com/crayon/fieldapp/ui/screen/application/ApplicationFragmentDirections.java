package com.crayon.fieldapp.ui.screen.application;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.R;

public class ApplicationFragmentDirections {
  private ApplicationFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionApplicationFragmentToCreateApplicationFragment() {
    return new ActionOnlyNavDirections(R.id.action_applicationFragment_to_createApplicationFragment);
  }
}
