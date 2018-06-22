package com.example.asus.suppa;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Intent intent;

    private ImageButton imageButtonCammera;
    private ImageButton imageButtonTags;
    private ImageButton imageButtonMaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButtonCammera = (ImageButton) findViewById(R.id.cameraMBtn);
        imageButtonMaps = ( ImageButton ) findViewById(R.id.mapMBtn);
        imageButtonTags = (ImageButton) findViewById(R.id.tagMBtn);

        imageButtonCammera.setOnClickListener(this);
        imageButtonTags.setOnClickListener(this);
        imageButtonMaps.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.cameraMBtn:
                intent = new Intent(this,Camara.class);
                startActivity(intent);
                break;
            case R.id.mapMBtn:
                intent = new Intent(this,MapsActivity.class);
                startActivity(intent);
                break;
            case R.id.tagMBtn:
                intent = new Intent(this,TagsActivity.class);
                startActivity(intent);
                break;
        }
    }
}
