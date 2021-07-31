package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Temperature extends AppCompatActivity {

    TextView title, tv1, tv2,tv3,tv4;
    EditText et1 ,et2, et3, et4;
    ImageView image, img1, img2, img3, img4;
    Animation bttone, bttwo, btthree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_temperature);

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
                int a = Integer.parseInt(et1.getText().toString());
                double b = (a-32)*5/9 ;
                tv1.setText(""+b+" C");


            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(et2.getText().toString());
                double b = (a*9/5)+32;
                tv2.setText(""+b+" F");
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(et3.getText().toString());
                double b = a + 273;
                tv3.setText(""+b+" K");
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(et4.getText().toString());
                double b = (a-32)*5/9+273.15;
                tv4.setText(""+b+" K");
            }
        });



    }
}