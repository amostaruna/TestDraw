package com.example.testdraw;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity {

    ImageView ourView;

    // This is the entry point to our game
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Do all our drawing in a separate method
        draw();

        // Make ourView ImageView object the view for the Activity
        setContentView(ourView);

    }
    // This is our draw() method
    public void draw(){

        // Declare an object of type Bitmap
        Bitmap blankBitmap;
        // Make it 600 x 600 pixels in size and an appropriate format
        blankBitmap = Bitmap.createBitmap(600,600,Bitmap.Config.ARGB_8888);
        // Declare an object of type canvas
        Canvas canvas;
        // Initialize it by making its surface our previously created blank bitmap
        canvas = new Canvas(blankBitmap);

        // Initialize our previously declared member object of type ImageView
        ourView = new ImageView(this);
        // Put our blank bitmap on ourView
        ourView.setImageBitmap(blankBitmap);

        // We now have a surface ready to draw on
        // But we need something to draw with

        // Declare an object of type Paint
        Paint paint, brown, purple;
        // Initialize it ready for painting our canvas
        paint = new Paint();
        brown = new Paint();
        purple=new Paint();

        // Make the canvas white
        canvas.drawColor(Color.argb(255, 255, 255, 255));

        // Color Palette
        paint.setColor(Color.argb(255,  26, 128, 182));
        brown.setColor(Color.argb(200,  67, 32, 21));
        purple.setColor(Color.argb(255,  49, 25, 33));
        // We can change this around as well

        // Declare an object of type Bitmap
        Bitmap bitmapBob;
        // Initialize it using the kucink.png file
        bitmapBob = BitmapFactory.decodeResource(this.getResources(), R.drawable.kucink);
        // Now draw kucink to our canvas
        canvas.drawBitmap(bitmapBob, 70, 70, paint);

        // Draw a line
        canvas.drawLine(500,240,600,50,brown);
        canvas.drawLine(50,240,300,50,brown);

        // Draw some text
        canvas.drawText("Percobaan Draw di Android Studio", 50, 50, paint);

        // Draw a pixel
        canvas.drawPoint(40,50,paint);

        // Change the brush color
        paint.setColor(Color.argb(255,  249, 129, 0));

        // Draw a rectangle
        canvas.drawRect(50,240,500,300,paint);
        canvas.drawRect(500,240,550,300,purple);
        // Draw a circle
        canvas.drawCircle(350,268,10,brown);
        canvas.drawCircle(250,268,10,brown);
        canvas.drawCircle(150,268,10,brown);

        // Back to onCreate method to set our canvas as the view

    }
}
