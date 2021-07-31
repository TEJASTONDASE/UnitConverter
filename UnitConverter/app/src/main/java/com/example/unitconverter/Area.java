package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Area extends AppCompatActivity {

    TextView title, tv1, tv2,tv3,tv4;
    EditText et1 ,et2, et3, et4;
    ImageView image, img1, img2, img3, img4;
    Animation bttone, bttwo, btthree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_area);

        bttone = AnimationUtils.loadAnimation(this, R.anim.bttone);
        bttwo = AnimationUtils.loadAnimation(this, R.anim.bttwo);
        btthree = AnimationUtils.loadAnimation(this, R.anim.btthree);

        title=findViewById(R.id.title);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        tv4=findViewById(R.id.tv4);
        et1=findViewById(R.id.et1);

        et2=findViewById(R.id.et2);
        et3=findViewById(R.id.et3);
        et4=findViewById(R.id.et4);
        image=findViewById(R.id.image);
        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);
        img3=findViewById(R.id.img3);
        img4=findViewById(R.id.img4);


        title.startAnimation(bttone);
        tv1.startAnimation(btthree);
        tv2.startAnimation(btthree);
        tv3.startAnimation(btthree);
        tv4.startAnimation(btthree);
        et1.startAnimation(btthree);
        et2.startAnimation(btthree);
        et3.startAnimation(btthree);
        et4.startAnimation(btthree);
        image.startAnimation(bttwo);
        img1.startAnimation(bttwo);
        img2.startAnimation(bttwo);
        img3.startAnimation(bttwo);
        img4.startAnimation(bttwo);

        // code

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1.getText().toString().length() != 0) {
                    int a = Integer.parseInt(et1.getText().toString());
                    double b = a * 1000000;
                    tv1.setText("" + b + " Sq.M.");
                }
                else {
                    Log.d("error", "show error");
                    Toast.makeText(Area.this, "Enter a valid number.", Toast.LENGTH_LONG).show();
                }
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et2.getText().toString().length() != 0) {
                int a = Integer.parseInt(et2.getText().toString());
                double b = a * 10.78391;
                tv2.setText(""+b+" Sq.ft");
            }
                else {
                    Toast.makeText(Area.this, "Enter a valid number.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(et3.getText().toString());
                double b = a * 0.092903;
                tv3.setText(""+b+" Sq.M.");
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(et4.getText().toString());
                double b = a * 10000;
                tv4.setText(""+b+" Sq.CM");
            }
        });

    }
}