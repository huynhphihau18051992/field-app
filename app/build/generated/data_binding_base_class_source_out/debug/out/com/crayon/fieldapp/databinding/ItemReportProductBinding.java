// Generated by view binder compiler. Do not edit!
package com.crayon.fieldapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.crayon.fieldapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemReportProductBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView tvProductName;

  @NonNull
  public final TextView tvQuality;

  private ItemReportProductBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView tvProductName, @NonNull TextView tvQuality) {
    this.rootView = rootView;
    this.tvProductName = tvProductName;
    this.tvQuality = tvQuality;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemReportProductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemReportProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_report_product, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemReportProductBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tv_product_name;
      TextView tvProductName = rootView.findViewById(id);
      if (tvProductName == null) {
        break missingId;
      }

      id = R.id.tv_quality;
      TextView tvQuality = rootView.findViewById(id);
      if (tvQuality == null) {
        break missingId;
      }

      return new ItemReportProductBinding((RelativeLayout) rootView, tvProductName, tvQuality);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
