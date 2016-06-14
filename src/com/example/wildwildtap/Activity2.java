package com.example.wildwildtap;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Window;

public class Activity2 extends Activity  {
	MediaPlayer bkgrdmcs;
	private int lastbkgrchecked = Main.bgchecked;
	Bitmap cloud;
	int x=0;
	int y=0;
	/** Called when the activity is first created. */
	   public void onCreate(Bundle savedInstanceState) {
		   super.onCreate(savedInstanceState);
		   requestWindowFeature(Window.FEATURE_NO_TITLE);
		   setContentView(R.layout.activity2);
		   
		   if (lastbkgrchecked == 0){
				bkgrdmcs = MediaPlayer.create(Activity2.this, R.raw.bg);
				bkgrdmcs.setLooping(true);
				bkgrdmcs.start();
			}
		   
		   
		   ObjectAnimator cloudAnim = ObjectAnimator.ofFloat(findViewById(R.id.cloud), "x" ,-350);
		   cloudAnim.setDuration(3000);
		   cloudAnim.setRepeatCount(ValueAnimator.INFINITE);
		   cloudAnim.setRepeatMode(ValueAnimator.REVERSE);
		   cloudAnim.start();
	   }
	   public void onPause(){
		   if (lastbkgrchecked == 0){   
			   bkgrdmcs.release();
		   }
		   Main.bgchecked = 0;
		   super.onPause();
		   finish();
		   
	   }

}

		