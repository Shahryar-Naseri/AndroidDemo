package net.csarchive.androiddemo;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class Menu extends ListActivity{
	
	String classes[] = {"MainActivity", "exampl1", "exampl2", "exampl3", "exampl4", "exampl5", "exampl6"};

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onPostCreate(savedInstanceState);
	}

}
