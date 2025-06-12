package com.savely.geostudy;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Документация к классу. MainActivity - главная активность приложения с главным меню.
 */
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
        Intent intent = new Intent(MainActivity.this, MapMenuActivity.class);
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