package com.example.wildwildtap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class Main extends Activity {
	public static int bgchecked = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		bgMusicOff();
	}
	public void bgMusicOff(){
		  CheckBox checkbox1 =(CheckBox) findViewById(R.id.checkBox1);
		  checkbox1.setOnCheckedChangeListener(new OnCheckedChangeListener(){
			  public void onCheckedChanged(CompoundButton buttonview,boolean isChecked){
				  if (buttonview.isChecked()){
					  //the check box is checked
					  bgchecked = 1;
				  }else {
					  bgchecked = 0;
				  }
			  }
		  });
		
		
		
		Button playb = (Button) findViewById(R.id.playb);
		playb.setOnClickListener(new View.OnClickListener() {
				
			public void onClick(View v) {
						Intent intent = new Intent(v.getContext(),Activity2.class);
						startActivityForResult(intent,0);
						
						
			}
		});
		
		Button options = (Button) findViewById(R.id.options2);
		options.setOnClickListener(new View.OnClickListener() {
				
			public void onClick(View v) {
						Intent intent = new Intent(Main.this,Options.class);
						startActivityForResult(intent,0);
			}
		});
		
	}
}
