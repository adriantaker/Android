package com.example.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;



public class Principal extends Activity {
	

	StringBuilder cadena = new StringBuilder();
	TextView tv;
	
	private void log(String texto) {
		
		Log.d("Actividad Principal LifeCycle", texto);
		cadena.append(texto);
		tv.setText(cadena.toString());
	}
	
	public void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		tv = new TextView(this);
		log("onCreated");
		setContentView(tv);
	}
	
	public void onResume() {
		super.onResume();
		log("onResumed");
		
	}
}
