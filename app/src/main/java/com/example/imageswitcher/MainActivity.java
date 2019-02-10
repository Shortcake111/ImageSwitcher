package com.example.imageswitcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView image;

    public void switchImages(View view){
        Log.i("Info", "buttonSwitch pressed");
        image = (ImageView) findViewById(R.id.imageViewIcon);

        if (image.getDrawable().getConstantState() == getResources().getDrawable(R.drawable.aeroplane).getConstantState()){
            image.setImageResource(R.drawable.monitor);
        } else {
            image.setImageResource(R.drawable.aeroplane);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
