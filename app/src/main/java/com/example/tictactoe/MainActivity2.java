package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView tv=findViewById(R.id.txt);
        Intent intent=getIntent();
        String st=intent.getStringExtra("Winner");
        tv.setText("Player " + st + " is the WINNER!!");
        VideoView vv=findViewById(R.id.videoView);
        vv.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video);
//        MediaController mc=new MediaController(this);
//        mc.setAnchorView(vv);
//        vv.setMediaController(mc);
        vv.start();
        MediaPlayer mp=MediaPlayer.create(this,R.raw.sound);
        mp.start();
        //control audio

    }

    @Override
    public void onBackPressed() {
        System.exit(0);

    }
}