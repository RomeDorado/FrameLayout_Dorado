package com.example.simon.myapplication_4itg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button bChange;
    ImageView iv_Image1, iv_Image2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_Image1 = (ImageView) findViewById(R.id.ivImage1);
        iv_Image2 = (ImageView) findViewById(R.id.ivImage2);

    }

    public void changeImage(View view){
        if(iv_Image1.getVisibility()==View.VISIBLE){
            iv_Image1.setVisibility(View.GONE);
            iv_Image2.setVisibility(View.VISIBLE);
        }else{
            iv_Image2.setVisibility(View.GONE);
            iv_Image1.setVisibility(View.VISIBLE);
        }
    }
}
