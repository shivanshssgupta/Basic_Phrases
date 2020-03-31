package com.example.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public void clickF(View view)
    {
        Button phrase=(Button)view;
        MediaPlayer media=MediaPlayer.create(this,getResources().getIdentifier(phrase.getTag().toString(),"raw",getPackageName()));
        media.start();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
