// Generated by view binder compiler. Do not edit!
package com.thesis.firesafe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import com.thesis.firesafe.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityHistorySingleBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final LinearLayout driverContainer;

  @NonNull
  public final Toolbar myToolbar;

  @NonNull
  public final TextView pickupLocation;

  @NonNull
  public final LinearLayout ratingBarContainer;

  @NonNull
  public final TextView time;

  @NonNull
  public final ImageView userImage;

  @NonNull
  public final TextView userName;

  @NonNull
  public final TextView userPhone;

  private ActivityHistorySingleBinding(@NonNull NestedScrollView rootView,
      @NonNull LinearLayout driverContainer, @NonNull Toolbar myToolbar,
      @NonNull TextView pickupLocation, @NonNull LinearLayout ratingBarContainer,
      @NonNull TextView time, @NonNull ImageView userImage, @NonNull TextView userName,
      @NonNull TextView userPhone) {
    this.rootView = rootView;
    this.driverContainer = driverContainer;
    this.myToolbar = myToolbar;
    this.pickupLocation = pickupLocation;
    this.ratingBarContainer = ratingBarContainer;
    this.time = time;
    this.userImage = userImage;
    this.userName = userName;
    this.userPhone = userPhone;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHistorySingleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHistorySingleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_history_single, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHistorySingleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.driverContainer;
      LinearLayout driverContainer = rootView.findViewById(id);
      if (driverContainer == null) {
        break missingId;
      }

      id = R.id.my_toolbar;
      Toolbar myToolbar = rootView.findViewById(id);
      if (myToolbar == null) {
        break missingId;
      }

      id = R.id.pickup_location;
      TextView pickupLocation = rootView.findViewById(id);
      if (pickupLocation == null) {
        break missingId;
      }

      id = R.id.ratingBar_container;
      LinearLayout ratingBarContainer = rootView.findViewById(id);
      if (ratingBarContainer == null) {
        break missingId;
      }

      id = R.id.time;
      TextView time = rootView.findViewById(id);
      if (time == null) {
        break missingId;
      }

      id = R.id.userImage;
      ImageView userImage = rootView.findViewById(id);
      if (userImage == null) {
        break missingId;
      }

      id = R.id.userName;
      TextView userName = rootView.findViewById(id);
      if (userName == null) {
        break missingId;
      }

      id = R.id.userPhone;
      TextView userPhone = rootView.findViewById(id);
      if (userPhone == null) {
        break missingId;
      }

      return new ActivityHistorySingleBinding((NestedScrollView) rootView, driverContainer,
          myToolbar, pickupLocation, ratingBarContainer, time, userImage, userName, userPhone);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
