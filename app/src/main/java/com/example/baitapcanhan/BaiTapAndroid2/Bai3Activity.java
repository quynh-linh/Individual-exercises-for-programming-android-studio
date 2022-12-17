package com.example.baitapcanhan.BaiTapAndroid2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.baitapcanhan.R;

import java.util.Date;

public class Bai3Activity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        button = (Button) findViewById(R.id.button);
        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Date date = new Date();
                String mess = "Thời gian hiện tại là :" + date.toLocaleString();
                alertDialog.setMessage(mess);
                alertDialog.show();
            }
        });
    }
}