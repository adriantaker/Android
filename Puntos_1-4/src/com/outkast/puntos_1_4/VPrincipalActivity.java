package com.outkast.puntos_1_4;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class VPrincipalActivity extends ListActivity {
	
	public String arrayTest[] = {"CicloDeVidaTest","Op2","Op3","Op4","Op5","Op6","Op7","Op8"};
	
	public void  onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,arrayTest));
	}
	@Override
	protected void onListItemClick(ListView list, View view, int position, long id) {
		super.onListItemClick(list, view, position, id);
		String  nombreArrayTest = arrayTest[position];
		try {
		
			Class clase = Class.forName("com.outkast.puntos_1_4."+nombreArrayTest);
			Intent intent = new Intent(this,clase);
			startActivity(intent);
		}
		catch (ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}