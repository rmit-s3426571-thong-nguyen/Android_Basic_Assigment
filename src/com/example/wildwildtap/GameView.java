package com.example.wildwildtap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;

public class GameView extends View {
	private Bitmap bmp;

	public GameView(Context context) {
		super(context);
		bmp = BitmapFactory.decodeResource(getResources(), R.drawable.hansen);
    }
    @Override
    protected void onDraw(Canvas canvas) {
            canvas.drawColor(Color.BLACK);
            canvas.drawBitmap(bmp, 10, 10, null);
 
    }
}
