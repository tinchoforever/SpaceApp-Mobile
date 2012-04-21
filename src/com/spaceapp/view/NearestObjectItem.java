package com.spaceapp.view;


import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.spaceapp.R;
import com.spaceapp.data.SpaceObject;
import com.spaceapp.util.Formatter;



public class NearestObjectItem extends LinearLayout{

	private ImageView image;
	private TextView name;
	private TextView distance;
	
	public NearestObjectItem(Context context) {
		super(context);
		inflate(context, R.layout.nearest_object_item, this);
		
		image = (ImageView)findViewById(R.id.nearest_satellite_image);
		name = (TextView)findViewById(R.id.nearest_satellite_name);
		distance = (TextView)findViewById(R.id.nearest_satellite_distance);
	}
	
	
	public void setSatellite(SpaceObject satellite){
		name.setText(satellite.getName());
		distance.setText(Formatter.formatDistance(satellite.getDistance()));
	}
	

}
