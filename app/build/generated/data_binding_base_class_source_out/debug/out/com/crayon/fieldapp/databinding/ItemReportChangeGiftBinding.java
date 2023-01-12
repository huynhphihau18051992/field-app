// Generated by view binder compiler. Do not edit!
package com.crayon.fieldapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.crayon.fieldapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemReportChangeGiftBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView txtAm;

  @NonNull
  public final TextView txtCustomerNum;

  @NonNull
  public final TextView txtDate;

  @NonNull
  public final TextView txtDateTitle;

  @NonNull
  public final TextView txtName;

  @NonNull
  public final TextView txtNameTitle;

  @NonNull
  public final TextView txtShift;

  @NonNull
  public final TextView txtShiftTitle;

  @NonNull
  public final TextView txtType;

  @NonNull
  public final TextView txtTypeTitle;

  private ItemReportChangeGiftBinding(@NonNull LinearLayout rootView, @NonNull TextView txtAm,
      @NonNull TextView txtCustomerNum, @NonNull TextView txtDate, @NonNull TextView txtDateTitle,
      @NonNull TextView txtName, @NonNull TextView txtNameTitle, @NonNull TextView txtShift,
      @NonNull TextView txtShiftTitle, @NonNull TextView txtType, @NonNull TextView txtTypeTitle) {
    this.rootView = rootView;
    this.txtAm = txtAm;
    this.txtCustomerNum = txtCustomerNum;
    this.txtDate = txtDate;
    this.txtDateTitle = txtDateTitle;
    this.txtName = txtName;
    this.txtNameTitle = txtNameTitle;
    this.txtShift = txtShift;
    this.txtShiftTitle = txtShiftTitle;
    this.txtType = txtType;
    this.txtTypeTitle = txtTypeTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemReportChangeGiftBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemReportChangeGiftBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_report_change_gift, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemReportChangeGiftBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.txt_am;
      TextView txtAm = rootView.findViewById(id);
      if (txtAm == null) {
        break missingId;
      }

      id = R.id.txt_customer_num;
      TextView txtCustomerNum = rootView.findViewById(id);
      if (txtCustomerNum == null) {
        break missingId;
      }

      id = R.id.txt_date;
      TextView txtDate = rootView.findViewById(id);
      if (txtDate == null) {
        break missingId;
      }

      id = R.id.txt_date_title;
      TextView txtDateTitle = rootView.findViewById(id);
      if (txtDateTitle == null) {
        break missingId;
      }

      id = R.id.txt_name;
      TextView txtName = rootView.findViewById(id);
      if (txtName == null) {
        break missingId;
      }

      id = R.id.txt_name_title;
      TextView txtNameTitle = rootView.findViewById(id);
      if (txtNameTitle == null) {
        break missingId;
      }

      id = R.id.txt_shift;
      TextView txtShift = rootView.findViewById(id);
      if (txtShift == null) {
        break missingId;
      }

      id = R.id.txt_shift_title;
      TextView txtShiftTitle = rootView.findViewById(id);
      if (txtShiftTitle == null) {
        break missingId;
      }

      id = R.id.txt_type;
      TextView txtType = rootView.findViewById(id);
      if (txtType == null) {
        break missingId;
      }

      id = R.id.txt_type_title;
      TextView txtTypeTitle = rootView.findViewById(id);
      if (txtTypeTitle == null) {
        break missingId;
      }

      return new ItemReportChangeGiftBinding((LinearLayout) rootView, txtAm, txtCustomerNum,
          txtDate, txtDateTitle, txtName, txtNameTitle, txtShift, txtShiftTitle, txtType,
          txtTypeTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
