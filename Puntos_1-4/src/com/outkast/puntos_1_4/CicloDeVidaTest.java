package com.outkast.puntos_1_4;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.util.Log;
public class CicloDeVidaTest extends Activity{

	StringBuilder builder = new StringBuilder();
	TextView textV;
	
	private void log(String text) {
		Log.d("CicloDeVidaTest",text);
		builder.append(text+"\n");
		textV.setText(builder.toString());
	}
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		textV = new TextView(this);
		textV.setText(builder.toString());
		setContentView(textV);
		log("Created - llamada al metodo onCreate");
	}
	
	@Override
	public void onResume() {
		super.onResume();
		log("Resumed - llamada al metodo onResume");
	}
	
	
	@Override
	public void onPause(){
		super.onPause();
		log("Paused - llamada al metodo onPause");
		
		if(isFinishing()) {
			log("finishing");
		}
	}
	
	@Override
	public void onStop(){
		super.onStop();
		log("Stopped - llamada al metodo onStop");
	}
	
	@Override
	public void onStart(){
		super.onStart();
		log("Started - llamada al metodo onStart");
	}
	@Override
	public void onRestart(){
		super.onRestart();
		log("Restarted - llamada al metodo onRestart");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*private void log(String text) {
		Log.d("LifeCycleTest",text);
		textoV.setText(texto.toString());
		
	}*/
	/*
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView textoV = new TextView(this);

		textoV.setText("pringao");
		setContentView(textoV);
		
		
		
	}*/
	
}
