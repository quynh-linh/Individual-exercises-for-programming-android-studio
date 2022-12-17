package com.example.baitapcanhan.BaiTapAndroid4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.baitapcanhan.R;

public class Bai1Android4Activity extends AppCompatActivity {
    EditText editTextName , editTextEmail , editTextProject;
    Button buttonSend;
    public void AnhXa(){
        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextEmail = (EditText) findViewById(R.id.editTextTextEmail);
        editTextProject = (EditText) findViewById(R.id.editTextTextProject);
        buttonSend = (Button) findViewById(R.id.buttonSend);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1_android4);
        AnhXa();
        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("name",editTextName.getText().toString().trim());
                bundle.putString("email",editTextEmail.getText().toString().trim());
                bundle.putString("project",editTextProject.getText().toString().trim());
                Intent intent = new Intent(Bai1Android4Activity.this,Bai1AndroidSecondActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}