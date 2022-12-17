package com.example.baitapcanhan.BaiTapAndroid3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.baitapcanhan.R;

public class Bai2Android3Activity extends AppCompatActivity {
    EditText editTextContent;
    CheckBox checkBoxBold , checkBoxColor;
    Button buttonClickme;
    int count = 0 ;
    public void AnhXa(){
        editTextContent = (EditText) findViewById(R.id.editTextContent);
        checkBoxBold = (CheckBox) findViewById(R.id.checkBoxbold);
        checkBoxColor = (CheckBox) findViewById(R.id.checkBoxColor);
        buttonClickme = (Button) findViewById(R.id.buttonClickme);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2_android3);
        AnhXa();
        buttonClickme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBoxBold.isChecked()){
                    editTextContent.setTypeface(Typeface.DEFAULT_BOLD);
                } else if (checkBoxColor.isChecked()){
                    editTextContent.setTextColor(Color.GREEN);
                } else {
                    editTextContent.setTextColor(Color.BLACK);
                    editTextContent.setTypeface(Typeface.DEFAULT);
                    editTextContent.setText("You`ve Clicked "+ ++count + "times");
                }
            }
        });
    }
}