package com.crayon.fieldapp.ui.screen.verifyOtp;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class VerifyOtpFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private VerifyOtpFragmentArgs() {
  }

  private VerifyOtpFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static VerifyOtpFragmentArgs fromBundle(@NonNull Bundle bundle) {
    VerifyOtpFragmentArgs __result = new VerifyOtpFragmentArgs();
    bundle.setClassLoader(VerifyOtpFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("phone")) {
      String phone;
      phone = bundle.getString("phone");
      if (phone == null) {
        throw new IllegalArgumentException("Argument \"phone\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("phone", phone);
    } else {
      __result.arguments.put("phone", "None");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getPhone() {
    return (String) arguments.get("phone");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("phone")) {
      String phone = (String) arguments.get("phone");
      __result.putString("phone", phone);
    } else {
      __result.putString("phone", "None");
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    VerifyOtpFragmentArgs that = (VerifyOtpFragmentArgs) object;
    if (arguments.containsKey("phone") != that.arguments.containsKey("phone")) {
      return false;
    }
    if (getPhone() != null ? !getPhone().equals(that.getPhone()) : that.getPhone() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getPhone() != null ? getPhone().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "VerifyOtpFragmentArgs{"
        + "phone=" + getPhone()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(VerifyOtpFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder() {
    }

    @NonNull
    public VerifyOtpFragmentArgs build() {
      VerifyOtpFragmentArgs result = new VerifyOtpFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setPhone(@NonNull String phone) {
      if (phone == null) {
        throw new IllegalArgumentException("Argument \"phone\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("phone", phone);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getPhone() {
      return (String) arguments.get("phone");
    }
  }
}
