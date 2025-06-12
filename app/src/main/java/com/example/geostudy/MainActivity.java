package com.example.geostudy;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
    FrameLayout worldButton;
    FrameLayout europeButton;
    FrameLayout africaButton;
    FrameLayout americaButton;
    FrameLayout asiaButton;
    FrameLayout oceaniaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        worldButton = findViewById(R.id.world_button);
        europeButton = findViewById(R.id.europe_button);
        africaButton = findViewById(R.id.africa_button);
        americaButton = findViewById(R.id.america_button);
        asiaButton = findViewById(R.id.asia_button);
        oceaniaButton = findViewById(R.id.oceania_button);
        ImageView globe = findViewById(R.id.globe);
        Animation globeRotateAnimation = AnimationUtils.loadAnimation(this, R.anim.globe_rotation_infinite);
        globe.startAnimation(globeRotateAnimation);
        Intent intent = new Intent(MainActivity.this, WorldActivity.class);
        worldButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("gameClass", new String[] {"world", getString(R.string.world)});
                startActivity(intent);
            }
        });
        europeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("gameClass", new String[] {"europe", getString(R.string.europe)});
                startActivity(intent);
            }
        });
        africaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("gameClass", new String[] {"africa", getString(R.string.africa)});
                startActivity(intent);
            }
        });
        americaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("gameClass", new String[] {"america", getString(R.string.america)});
                startActivity(intent);
            }
        });
        asiaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("gameClass", new String[] {"asia", getString(R.string.asia)});
                startActivity(intent);
            }
        });
        oceaniaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("gameClass", new String[] {"oceania", getString(R.string.oceania)});
                startActivity(intent);
            }
        });
    }
}