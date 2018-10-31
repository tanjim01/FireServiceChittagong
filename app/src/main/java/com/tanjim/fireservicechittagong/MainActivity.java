package com.tanjim.fireservicechittagong;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Animation animation= AnimationUtils.loadAnimation(this,R.anim.fade);
//        linearLayout.setAnimation(animation);
//
//        Thread thread= new Thread(){
//            @Override
//            public void run() {
//
//                try {
//                    sleep(5000);
//                    Intent intent= new Intent(MainActivity.this,SecondActivity.class);
//                    startActivity(intent);
//                    finish();
//                    super.run();
//                }
//                catch (InterruptedException e){
//                    e.printStackTrace();
//                }
//
//            }
//        };
//        thread.start();
        ImageView imageView = findViewById(R.id.imagev);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
    }


}
