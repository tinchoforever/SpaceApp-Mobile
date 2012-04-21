package com.spaceapp.view;


import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.spaceapp.R;
import com.spaceapp.data.Satellite;
import com.spaceapp.util.Formatter;



public class NearestSatelliteItem extends LinearLayout{

	private ImageView image;
	private TextView name;
	private TextView distance;
	
	public NearestSatelliteItem(Context context) {
		super(context);
		
		image = (ImageView)findViewById(R.id.nearest_satellite_image);
		name = (TextView)findViewById(R.id.nearest_satellite_name);
		distance = (TextView)findViewById(R.id.nearest_satellite_distance);
	}
	
	
	public void setSatellite(Satellite satellite){
		name.setText(satellite.name);
		distance.setText(Formatter.formatDistance(satellite.distance));
	}
	

}
