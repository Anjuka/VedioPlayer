package com.productions.vedioplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView iv_videoView ;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_videoView = findViewById(R.id.iv_videoView);
        mediaController = new MediaController(this);

        Uri uri = Uri.parse("https://drive.google.com/file/d/1KV2TFhH3_255tX_n4aNDyJQMNb_St48D/view?usp=sharing");

        iv_videoView.setMediaController(mediaController);
        iv_videoView.setVideoURI(uri);
        //iv_videoView.requestFocus();
        iv_videoView.start();

    }
}