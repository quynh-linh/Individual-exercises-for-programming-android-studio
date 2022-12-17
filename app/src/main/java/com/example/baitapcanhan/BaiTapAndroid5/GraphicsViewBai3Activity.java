package com.example.baitapcanhan.BaiTapAndroid5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import com.example.baitapcanhan.R;

public class GraphicsViewBai3Activity extends View {
    Bitmap[] bitmap = new Bitmap[6];
    int i=0;
    long last_tick =0;
    long period = 20;
    Context context;
    public static MediaPlayer mediaPlayer;
    public GraphicsViewBai3Activity(Context context) {
        super(context);
        context = context;
        bitmap[0] = BitmapFactory.decodeResource(getResources(),R.drawable.messi);
        bitmap[1] = BitmapFactory.decodeResource(getResources(),R.drawable.neymar);
        bitmap[2] = BitmapFactory.decodeResource(getResources(),R.drawable.ibrahimovic);
        bitmap[3] = BitmapFactory.decodeResource(getResources(),R.drawable.kevin);
        bitmap[4] = BitmapFactory.decodeResource(getResources(),R.drawable.ronaldo);
        bitmap[5] = BitmapFactory.decodeResource(getResources(),R.drawable.dybala);
        mediaPlayer = MediaPlayer.create(context,R.raw.glory_gloryman_united);
        mediaPlayer.start();
    }
    @Override
    protected void onDraw(Canvas canvas) {
        if (i<6){
            long  time = (System.currentTimeMillis() - last_tick);
            if (time >= period){
                last_tick = System.currentTimeMillis();
                canvas.drawBitmap(bitmap[i],40,40,new Paint());
                i++;
                postInvalidate();
            } else {
                canvas.drawBitmap(bitmap[i],40,40,new Paint());
                postInvalidate();
            }

        } else {
            i=0;
            postInvalidate();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        i++;
        return true;
    }
}