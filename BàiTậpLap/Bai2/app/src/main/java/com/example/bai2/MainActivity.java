package com.example.bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button bntchangelmg;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bntchangelmg = (Button) findViewById(R.id.bntchangelmg);
        imageView = (ImageView) findViewById(R.id.imgView);
        //
        imageView.setBackgroundResource(R.mipmap.tttt);
        bntchangelmg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
                //
                //
                imageView.setBackgroundResource(R.mipmap.fff);
            }
        });
    }
}
