package com.example.lab2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView orientationText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        orientationText = this.findViewById(R.id.orientationText);
        updateOrientationText(getResources().getConfiguration().orientation);
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        updateOrientationText(newConfig.orientation);
    }

    private void updateOrientationText(int orientation) {
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            orientationText.setText(R.string.landscape_view);
        }
        else if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            orientationText.setText(R.string.portrait_view);
        }
        else {
            orientationText.setText(R.string.unknown_orientation);
        }
    }
}