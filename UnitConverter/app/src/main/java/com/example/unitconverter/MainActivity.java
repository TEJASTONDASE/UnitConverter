package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView, btnexercise, textView8;
    ImageView imageView;
    View bgprogress, bgprogresstop;
    Animation animimgpage, bttone, bttwo, btthree, lefttoright;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animimgpage = AnimationUtils.loadAnimation(this, R.anim.animimgpage);
        bttone = AnimationUtils.loadAnimation(this, R.anim.bttone);
        bttwo = AnimationUtils.loadAnimation(this, R.anim.bttwo);
        btthree = AnimationUtils.loadAnimation(this, R.anim.btthree);
        lefttoright = AnimationUtils.loadAnimation(this, R.anim.lefttoright);

        textView = findViewById(R.id.textView);
        btnexercise = (TextView) findViewById(R.id.btnexercise);
        textView8 = (TextView) findViewById(R.id.textView8);
        imageView = (ImageView) findViewById(R.id.imageView);
        bgprogress = (View) findViewById(R.id.bgprogress);
        bgprogresstop = (View) findViewById(R.id.bgprogresstop);

        imageView.startAnimation(animimgpage);
        textView.startAnimation(bttone);
        textView8.startAnimation(btthree);
        btnexercise.startAnimation(btthree);
        bgprogress.startAnimation(bttwo);
        bgprogresstop.startAnimation(lefttoright);

        btnexercise.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this,MainActivity2.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });
    }
}