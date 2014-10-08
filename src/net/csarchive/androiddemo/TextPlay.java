package net.csarchive.androiddemo;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
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
		TextView display = (TextView) findViewById(R.id.tv1);
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
	}

}
