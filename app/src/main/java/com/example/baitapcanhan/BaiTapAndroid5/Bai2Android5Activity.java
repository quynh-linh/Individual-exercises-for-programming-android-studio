package com.example.baitapcanhan.BaiTapAndroid5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.baitapcanhan.R;

public class Bai2Android5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new GraphicsViewTouchBai2Activity(this));
    }
}