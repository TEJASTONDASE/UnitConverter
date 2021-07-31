package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Volume extends AppCompatActivity {
    TextView title, tv1, tv2;
    EditText et1 ,et2;
    ImageView image, img1, img2;
    Animation bttone, bttwo, btthree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_volume);

        bttone = AnimationUtils.loadAnimation(this, R.anim.bttone);
        bttwo = AnimationUtils.loadAnimation(this, R.anim.bttwo);
        btthree = AnimationUtils.loadAnimation(this, R.anim.btthree);

        title=findViewById(R.id.title);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        image=findViewById(R.id.image);
        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);



        title.startAnimation(bttone);
        tv1.startAnimation(btthree);
        tv2.startAnimation(btthree);

        et1.startAnimation(btthree);
        et2.startAnimation(btthree);

        image.startAnimation(bttwo);
        img1.startAnimation(bttwo);
        img2.startAnimation(bttwo);


        // code

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(et1.getText().toString());
                double b = a * 1000000;
                tv1.setText(""+b+"");


            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(et2.getText().toString());
                double b = a * 0.0000006;
                tv2.setText(""+b+"");
            }
        });




    }
}