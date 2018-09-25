package com.example.sachinshrestha.depttraining_sept12.mero_menu_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.sachinshrestha.depttraining_sept12.R;

public class AboutUs extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        imageView = findViewById(R.id.ivAboutUs);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.test_animation);
        imageView.startAnimation(animation);
    }
}
