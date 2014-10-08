package net.csarchive.androiddemo;

import java.util.Random;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class TextPlay extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.text);
		Button btn = (Button) findViewById(R.id.btn1);
		final ToggleButton tbtn = (ToggleButton) findViewById(R.id.tbtn);
		final EditText et = (EditText) findViewById(R.id.et1);
		final TextView display = (TextView) findViewById(R.id.tv1);
		tbtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(tbtn.isChecked()){
					et.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
				}
				else{
					et.setInputType(InputType.TYPE_CLASS_TEXT);
				}
			}
		});
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String check = et.getText().toString();
				display.setText(check);
				if(check.contentEquals("left")){
					display.setGravity(Gravity.LEFT);
				}
				else if(check.contentEquals("center")){
					display.setGravity(Gravity.CENTER);
				}
				else if(check.contentEquals("right")){
					display.setGravity(Gravity.RIGHT);
				}
				else if(check.contentEquals("blue")){
					display.setTextColor(Color.BLUE);
				}
				else if(check.contentEquals("WTF")){
					Random crazy = new Random();
					display.setText("WTF!!!");
					display.setTextSize(crazy.nextInt(75));
					display.setTextColor(Color.rgb(crazy.nextInt(265), crazy.nextInt(265), crazy.nextInt(265)));
				}
				else{
					display.setText("Invalid");
					display.setGravity(Gravity.CENTER);
				}
			}
		});
	}

}
