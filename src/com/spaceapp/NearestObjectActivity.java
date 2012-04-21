package com.spaceapp;

import com.spaceapp.data.mocks.Mocks;
import com.spaceapp.view.NearestObjectList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public class NearestObjectActivity extends Activity implements OnItemClickListener{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.nearest_objects);
		
		NearestObjectList satelliteList = (NearestObjectList)findViewById(R.id.nearest_satellite_list);
		satelliteList.setSatellites(Mocks.getSatellites());
		
		satelliteList.setOnItemClickListener(this);
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		startActivity(new Intent(this, SpaceObjectChecking.class));
		
	}

}
