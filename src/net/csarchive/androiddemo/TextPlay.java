package net.csarchive.androiddemo;

import android.app.Activity;
import android.os.Bundle;
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
		ToggleButton tbtn = (ToggleButton) findViewById(R.id.tbtn);
		EditText et = (EditText) findViewById(R.id.et1);
		TextView display = (TextView) findViewById(R.id.tv1);
	}

}
