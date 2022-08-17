// Generated by view binder compiler. Do not edit!
package com.thesis.firesafe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import com.thesis.firesafe.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDriverSettingsBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button confirm;

  @NonNull
  public final EditText license;

  @NonNull
  public final Toolbar myToolbar;

  @NonNull
  public final EditText name;

  @NonNull
  public final EditText phone;

  @NonNull
  public final ImageView profileImage;

  private ActivityDriverSettingsBinding(@NonNull ScrollView rootView, @NonNull Button confirm,
      @NonNull EditText license, @NonNull Toolbar myToolbar, @NonNull EditText name,
      @NonNull EditText phone, @NonNull ImageView profileImage) {
    this.rootView = rootView;
    this.confirm = confirm;
    this.license = license;
    this.myToolbar = myToolbar;
    this.name = name;
    this.phone = phone;
    this.profileImage = profileImage;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDriverSettingsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDriverSettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_driver_settings, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDriverSettingsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.confirm;
      Button confirm = rootView.findViewById(id);
      if (confirm == null) {
        break missingId;
      }

      id = R.id.license;
      EditText license = rootView.findViewById(id);
      if (license == null) {
        break missingId;
      }

      id = R.id.my_toolbar;
      Toolbar myToolbar = rootView.findViewById(id);
      if (myToolbar == null) {
        break missingId;
      }

      id = R.id.name;
      EditText name = rootView.findViewById(id);
      if (name == null) {
        break missingId;
      }

      id = R.id.phone;
      EditText phone = rootView.findViewById(id);
      if (phone == null) {
        break missingId;
      }

      id = R.id.profileImage;
      ImageView profileImage = rootView.findViewById(id);
      if (profileImage == null) {
        break missingId;
      }

      return new ActivityDriverSettingsBinding((ScrollView) rootView, confirm, license, myToolbar,
          name, phone, profileImage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
