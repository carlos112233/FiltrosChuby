package com.wanosoft.filtroschuby;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView imageView = (ImageView) findViewById(R.id.imagen);

        filtro filtr = new filtro();

        BitmapDrawable bitmapDrawable=(BitmapDrawable) imageView.getDrawable();
        //Bitmap bmp=filtros.greyScale(bitmapDrawable.getBitmap());
        Bitmap bmp=filtr.invert(bitmapDrawable.getBitmap());
        imageView.setImageBitmap(bmp);
    }
}
