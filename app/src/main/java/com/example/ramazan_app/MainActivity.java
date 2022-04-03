package com.example.ramazan_app;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageView i1;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAGS_CHANGED,WindowManager.LayoutParams.FLAGS_CHANGED);
        getSupportActionBar().hide();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, NavigationActivity.class);
                startActivity(intent);
            }
        },3000);

        setContentView(R.layout.activity_main);
        i1=(ImageView) findViewById(R.id.i1);
        t1=(TextView) findViewById(R.id.t1);
        t2=(TextView) findViewById(R.id.t2);

        @SuppressLint("ResourceType") Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),R.animator.blink);
        t1.setVisibility(View.VISIBLE);
        t1.startAnimation(anim);

        @SuppressLint("ResourceType") Animation an = AnimationUtils.loadAnimation(getApplicationContext(),R.animator.moveup);
        t2.setVisibility(View.VISIBLE);
        t2.startAnimation(an);


        @SuppressLint("ResourceType") Animation a = AnimationUtils.loadAnimation(getApplicationContext(),R.animator.fade);
        i1.setVisibility(View.VISIBLE);
        i1.startAnimation(a);
    }
}