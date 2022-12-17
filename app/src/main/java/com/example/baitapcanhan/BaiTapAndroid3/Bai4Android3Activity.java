package com.example.baitapcanhan.BaiTapAndroid3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.baitapcanhan.R;

public class Bai4Android3Activity extends AppCompatActivity {
    EditText editTextResult;
    Button button0, button1 , button2,button3,button4,button5,button6,button7,button8
            ,button9,buttonTru,buttonCong,buttonChia,buttonNhan,buttonResult,buttonResets;
    View.OnClickListener onClickListener;
    float mValueOne, mValueTwo;
    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision;
    public void AnhXa(){
        editTextResult = (EditText) findViewById(R.id.editTextResult);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonTru = (Button) findViewById(R.id.buttonTru);
        buttonCong = (Button) findViewById(R.id.buttonplus);
        buttonChia = (Button) findViewById(R.id.buttonChia);
        buttonNhan = (Button) findViewById(R.id.buttonNhan);
        buttonResult = (Button) findViewById(R.id.buttonResult);
        buttonResets = (Button) findViewById(R.id.buttonResets);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4_android3);
        AnhXa();
        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button button = (Button) view;
                switch (button.getId()){
                    case R.id.button0:
                        setValue(editTextResult,"0");break;
                    case R.id.button1:
                        setValue(editTextResult,"1");break;
                    case R.id.button2:
                        setValue(editTextResult,"2");break;
                    case R.id.button3:
                        setValue(editTextResult,"3");break;
                    case R.id.button4:
                        setValue(editTextResult,"4");break;
                    case R.id.button5:
                        setValue(editTextResult,"5");break;
                    case R.id.button6:
                        setValue(editTextResult,"6");break;
                    case R.id.button7:
                        setValue(editTextResult,"7");break;
                    case R.id.button8:
                        setValue(editTextResult,"8");break;
                    case R.id.button9:
                        setValue(editTextResult,"9");break;
                    case R.id.buttonplus:
                        if (editTextResult == null) {
                            editTextResult.setText("");
                        } else {
                            mValueOne = Float.parseFloat(editTextResult.getText() + "");
                            crunchifyAddition = true;
                            editTextResult.setText(null);
                        }
                        break;
                    case R.id.buttonTru:
                        mValueOne = Float.parseFloat(editTextResult.getText() + "");
                        mSubtract = true;
                        editTextResult.setText(null);
                        break;
                    case R.id.buttonNhan:
                        mValueOne = Float.parseFloat(editTextResult.getText() + "");
                        crunchifyMultiplication = true;
                        editTextResult.setText(null);
                        break;
                    case R.id.buttonChia:
                        mValueOne = Float.parseFloat(editTextResult.getText() + "");
                        crunchifyDivision = true;
                        editTextResult.setText(null);
                        break;
                    case R.id.buttonResult:
                        mValueTwo = Float.parseFloat(editTextResult.getText() + "");
                        if (crunchifyAddition == true) {
                            editTextResult.setText(mValueOne + mValueTwo + "");
                            crunchifyAddition = false;
                        }
                        if (mSubtract == true) {
                            editTextResult.setText(mValueOne - mValueTwo + "");
                            mSubtract = false;
                        }
                        if (crunchifyMultiplication == true) {
                            editTextResult.setText(mValueOne * mValueTwo + "");
                            crunchifyMultiplication = false;
                        }
                        if (crunchifyDivision == true) {
                            editTextResult.setText(mValueOne / mValueTwo + "");
                            crunchifyDivision = false;
                        }
                        break;
                    case R.id.buttonResets:
                        editTextResult.setText("");
                        break;
                }
            }
        };
        button0.setOnClickListener(onClickListener);
        button1.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener);
        button3.setOnClickListener(onClickListener);
        button4.setOnClickListener(onClickListener);
        button5.setOnClickListener(onClickListener);
        button6.setOnClickListener(onClickListener);
        button7.setOnClickListener(onClickListener);
        button8.setOnClickListener(onClickListener);
        button9.setOnClickListener(onClickListener);
        buttonCong.setOnClickListener(onClickListener);
        buttonTru.setOnClickListener(onClickListener);
        buttonNhan.setOnClickListener(onClickListener);
        buttonChia.setOnClickListener(onClickListener);
        buttonResets.setOnClickListener(onClickListener);
        buttonResult.setOnClickListener(onClickListener);
    }
    public void setValue(EditText a , String b){
        String last = a.getText().toString();
        last+=b;
        b=last;
        a.setText(last);
    }
}