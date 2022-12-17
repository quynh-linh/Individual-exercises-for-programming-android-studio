package com.example.baitapcanhan.BaiTapAndroid4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.baitapcanhan.R;

public class Bai1AndroidSecondActivity extends AppCompatActivity {
    TextView textViewName , textViewEmail, textViewProject;
    Button buttonFinish;
    public void AnhXa(){
        textViewName = (TextView) findViewById(R.id.textViewName);
        textViewEmail = (TextView) findViewById(R.id.textViewEmail);
        textViewProject = (TextView) findViewById(R.id.textViewProject);
        buttonFinish = (Button) findViewById(R.id.buttonFinish);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1_android_second);
        AnhXa();
        Bundle bundle = getIntent().getExtras();
        textViewName.setText(bundle.getString("name"));
        textViewEmail.setText(bundle.getString("email"));
        textViewProject.setText(bundle.getString("project"));
        buttonFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}