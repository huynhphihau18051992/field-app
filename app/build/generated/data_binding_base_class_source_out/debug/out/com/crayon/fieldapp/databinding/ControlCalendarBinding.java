// Generated by view binder compiler. Do not edit!
package com.crayon.fieldapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.crayon.fieldapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ControlCalendarBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView calendarDateDisplay;

  @NonNull
  public final GridView calendarGrid;

  @NonNull
  public final LinearLayout calendarHeader;

  @NonNull
  public final ImageView calendarNextButton;

  @NonNull
  public final ImageView calendarPrevButton;

  private ControlCalendarBinding(@NonNull LinearLayout rootView,
      @NonNull TextView calendarDateDisplay, @NonNull GridView calendarGrid,
      @NonNull LinearLayout calendarHeader, @NonNull ImageView calendarNextButton,
      @NonNull ImageView calendarPrevButton) {
    this.rootView = rootView;
    this.calendarDateDisplay = calendarDateDisplay;
    this.calendarGrid = calendarGrid;
    this.calendarHeader = calendarHeader;
    this.calendarNextButton = calendarNextButton;
    this.calendarPrevButton = calendarPrevButton;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ControlCalendarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ControlCalendarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.control_calendar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ControlCalendarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.calendar_date_display;
      TextView calendarDateDisplay = rootView.findViewById(id);
      if (calendarDateDisplay == null) {
        break missingId;
      }

      id = R.id.calendar_grid;
      GridView calendarGrid = rootView.findViewById(id);
      if (calendarGrid == null) {
        break missingId;
      }

      id = R.id.calendar_header;
      LinearLayout calendarHeader = rootView.findViewById(id);
      if (calendarHeader == null) {
        break missingId;
      }

      id = R.id.calendar_next_button;
      ImageView calendarNextButton = rootView.findViewById(id);
      if (calendarNextButton == null) {
        break missingId;
      }

      id = R.id.calendar_prev_button;
      ImageView calendarPrevButton = rootView.findViewById(id);
      if (calendarPrevButton == null) {
        break missingId;
      }

      return new ControlCalendarBinding((LinearLayout) rootView, calendarDateDisplay, calendarGrid,
          calendarHeader, calendarNextButton, calendarPrevButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
