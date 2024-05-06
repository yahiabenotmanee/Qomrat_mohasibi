package com.yahiee.myqm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.VideoView;

public class Spash_screen extends AppCompatActivity {

    private VideoView mVideoView;
    private static final long DELAY_TIME_MS = 3000; // 3 seconds delay

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spash_screen);// mVideoView =(VideoView) findViewById(R.id.videoView);
        mVideoView = (VideoView)findViewById(R.id.videoView);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.videobg);
        mVideoView.setVideoURI(uri);
        mVideoView.start();
        mVideoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });
        //startActivity(new Intent(getBaseContext(),Login.class));
        // Using Handler to post a delayed action
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your second activity
                Intent intent = new Intent(Spash_screen.this, MainActivity.class);
                startActivity(intent);

                // close this activity
                finish();
            }
        }, DELAY_TIME_MS);

    }
}