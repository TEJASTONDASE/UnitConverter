package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    ImageView imageView2, imageView3, imageView4, imageView5, imageView6, imageView7;
    TextView textView2, textView3, textView4, textView5, textView6, textView7;
    Animation bttone, btthree;
    LinearLayout kg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bttone = AnimationUtils.loadAnimation(this, R.anim.bttone);
        btthree = AnimationUtils.loadAnimation(this, R.anim.btthree);

        imageView2= findViewById(R.id.imageView2);
        imageView3= findViewById(R.id.imageView3);
        imageView4= findViewById(R.id.imageView4);
        imageView5= findViewById(R.id.imageView5);
        imageView6= findViewById(R.id.imageView6);
        imageView7= findViewById(R.id.imageView7);
        textView2= findViewById(R.id.textView2);
        textView3= findViewById(R.id.textView3);
        textView4= findViewById(R.id.textView4);
        textView5= findViewById(R.id.textView5);
        textView6= findViewById(R.id.textView6);
        textView7= findViewById(R.id.textView7);

        imageView2.startAnimation(bttone);
        imageView3.startAnimation(bttone);
        imageView4.startAnimation(bttone);
        imageView5.startAnimation(bttone);
        imageView6.startAnimation(bttone);
        imageView7.startAnimation(bttone);
        textView2.startAnimation(btthree);
        textView3.startAnimation(btthree);
        textView4.startAnimation(btthree);
        textView5.startAnimation(btthree);
        textView6.startAnimation(btthree);
        textView7.startAnimation(btthree);


        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go = new Intent(MainActivity2.this, Weight.class);
                startActivity(go);
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go = new Intent(MainActivity2.this, Length.class);
                startActivity(go);
            }
        });

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go = new Intent(MainActivity2.this, Temperature.class);
                startActivity(go);
            }
        });

        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go = new Intent(MainActivity2.this, Volume.class);
                startActivity(go);
            }
        });

        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go = new Intent(MainActivity2.this, Time.class);
                startActivity(go);
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go = new Intent(MainActivity2.this, Area.class);
                startActivity(go);
            }
        });




    }
    }






