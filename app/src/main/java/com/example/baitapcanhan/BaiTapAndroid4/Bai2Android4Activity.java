package com.example.baitapcanhan.BaiTapAndroid4;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.baitapcanhan.R;

public class Bai2Android4Activity extends AppCompatActivity {
    Button buttonUri , buttonCall;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2_android4);
        buttonUri = (Button) findViewById(R.id.buttonUri);
        buttonCall = (Button) findViewById(R.id.buttonCall);
        buttonUri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"));
                startActivity(intent);
            }
        });
        buttonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:(+84)981984623"));
                startActivity(intent);
            }
        });
    }
}