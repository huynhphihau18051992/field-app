package com.crayon.fieldapp.ui.screen.job;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.crayon.fieldapp.R;

public class JobFragmentDirections {
  private JobFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionJobToDetailJobFragment2() {
    return new ActionOnlyNavDirections(R.id.action_job_to_detailJobFragment2);
  }
}
