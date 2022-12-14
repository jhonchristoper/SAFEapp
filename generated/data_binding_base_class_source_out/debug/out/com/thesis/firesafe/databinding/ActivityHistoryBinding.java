// Generated by view binder compiler. Do not edit!
package com.thesis.firesafe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.thesis.firesafe.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityHistoryBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout emptyLayout;

  @NonNull
  public final RecyclerView historyRecyclerView;

  @NonNull
  public final LinearLayout layout;

  @NonNull
  public final Toolbar myToolbar;

  private ActivityHistoryBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout emptyLayout,
      @NonNull RecyclerView historyRecyclerView, @NonNull LinearLayout layout,
      @NonNull Toolbar myToolbar) {
    this.rootView = rootView;
    this.emptyLayout = emptyLayout;
    this.historyRecyclerView = historyRecyclerView;
    this.layout = layout;
    this.myToolbar = myToolbar;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHistoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHistoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_history, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHistoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.empty_layout;
      LinearLayout emptyLayout = rootView.findViewById(id);
      if (emptyLayout == null) {
        break missingId;
      }

      id = R.id.historyRecyclerView;
      RecyclerView historyRecyclerView = rootView.findViewById(id);
      if (historyRecyclerView == null) {
        break missingId;
      }

      LinearLayout layout = (LinearLayout) rootView;

      id = R.id.my_toolbar;
      Toolbar myToolbar = rootView.findViewById(id);
      if (myToolbar == null) {
        break missingId;
      }

      return new ActivityHistoryBinding((LinearLayout) rootView, emptyLayout, historyRecyclerView,
          layout, myToolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
