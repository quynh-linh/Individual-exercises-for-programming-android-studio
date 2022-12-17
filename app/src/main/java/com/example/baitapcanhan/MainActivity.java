package com.example.baitapcanhan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.PopupMenu;

import com.example.baitapcanhan.BaiTapAndroid3.Bai1Activity;
import com.example.baitapcanhan.BaiTapAndroid3.Bai2Android3Activity;
import com.example.baitapcanhan.BaiTapAndroid3.Bai4Android3Activity;
import com.example.baitapcanhan.BaiTapAndroid1.Bai2Activity;
import com.example.baitapcanhan.BaiTapAndroid2.Bai3Activity;
import com.example.baitapcanhan.BaiTapAndroid2.Bai5Activity;
import com.example.baitapcanhan.BaiTapAndroid4.Bai1Android4Activity;
import com.example.baitapcanhan.BaiTapAndroid4.Bai2Android4Activity;
import com.example.baitapcanhan.BaiTapAndroid5.Bai1Android5Activity;
import com.example.baitapcanhan.BaiTapAndroid5.Bai2Android5Activity;
import com.example.baitapcanhan.BaiTapAndroid5.Bai3Android5Activity;

public class MainActivity extends AppCompatActivity {
    Button button1 ,button2, button3,button4,button5;
    public void AnhXa(){
        button1 = (Button) findViewById(R.id.buttonBt1);
        button2 = (Button) findViewById(R.id.buttonBt2);
        button3 = (Button) findViewById(R.id.buttonBt3);
        button4 = (Button) findViewById(R.id.buttonBt4);
        button5 = (Button) findViewById(R.id.buttonBT5);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        button1.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, Bai2Activity.class)));
        button2.setOnClickListener(view -> ChooseBaiAndroid2());
        button3.setOnClickListener(view -> ChooseBaiAndroid3());
        button4.setOnClickListener(view -> ChooseBaiAndroid4());
        button5.setOnClickListener(view -> ChooseBaiAndroid5());
    }
    public void ChooseBaiAndroid2(){
        PopupMenu popupMenu = new PopupMenu(getApplicationContext(),button2);
        popupMenu.getMenuInflater().inflate(R.menu.menu_bai_android_2,popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.bai3:
                        startActivity(new Intent(MainActivity.this, Bai3Activity.class));
                        break;
                    case R.id.bai5:
                        startActivity(new Intent(MainActivity.this, Bai5Activity.class));
                        break;
                }
                return false;
            }
        });
        popupMenu.show();
    }
    public void ChooseBaiAndroid3(){
        PopupMenu popupMenu = new PopupMenu(getApplicationContext(),button3);
        popupMenu.getMenuInflater().inflate(R.menu.menu_bai_android_3,popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.bai1:
                        startActivity(new Intent(MainActivity.this, Bai1Activity.class));
                        break;
                    case R.id.bai2:
                        startActivity(new Intent(MainActivity.this, Bai2Android3Activity.class));
                        break;
                    case R.id.bai4:
                        startActivity(new Intent(MainActivity.this, Bai4Android3Activity.class));
                        break;
                }
                return false;
            }
        });
        popupMenu.show();
    }
    public void ChooseBaiAndroid4(){
        PopupMenu popupMenu = new PopupMenu(getApplicationContext(),button4);
        popupMenu.getMenuInflater().inflate(R.menu.menu_bai_android_4,popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.bai1:
                        startActivity(new Intent(MainActivity.this, Bai1Android4Activity.class));
                        break;
                    case R.id.bai2:
                        startActivity(new Intent(MainActivity.this, Bai2Android4Activity.class));
                        break;
                }
                return false;
            }
        });
        popupMenu.show();
    }
    public void ChooseBaiAndroid5(){
        PopupMenu popupMenu = new PopupMenu(getApplicationContext(),button5);
        popupMenu.getMenuInflater().inflate(R.menu.menu_bai_android_5,popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.bai1:
                        startActivity(new Intent(MainActivity.this, Bai1Android5Activity.class));
                        break;
                    case R.id.bai2:
                        startActivity(new Intent(MainActivity.this, Bai2Android5Activity.class));
                        break;
                    case R.id.bai3:
                        startActivity(new Intent(MainActivity.this, Bai3Android5Activity.class));
                        break;
                }
                return false;
            }
        });
        popupMenu.show();
    }
}