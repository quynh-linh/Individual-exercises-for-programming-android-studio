package com.example.baitapcanhan.BaiTapAndroid5;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

import com.example.baitapcanhan.R;

public class Bai3Android5Activity extends AppCompatActivity {
    GraphicsViewBai3Activity graphicsViewBai3Activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new GraphicsViewBai3Activity(this));
    }
    @Override
    public void onBackPressed() {
        graphicsViewBai3Activity.mediaPlayer.release();
        finish();
    }
}