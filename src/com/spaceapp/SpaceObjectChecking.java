package com.spaceapp;

import java.util.List;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;

public class SpaceObjectChecking extends MapActivity{
	
	private MapView mapView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.space_object_checking);
		
		mapView = (MapView)findViewById(R.id.space_object_checking_map);
		
		// Acquire a reference to the system Location Manager
		LocationManager locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
		// Register the listener with the Location Manager to receive location updates
		locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 0, locationListener);
	}
	
	// Define a listener that responds to location updates
	LocationListener locationListener = new LocationListener() {
	    public void onLocationChanged(Location location) {
	      // Called when a new location is found by the network location provider.
	    	GeoPoint point = new GeoPoint((int)(location.getLatitude() * 1000000),(int)(location.getLongitude() * 1000000));
	    	OverlayItem overlayitem = new OverlayItem(point, "", "");
	    	
	    	List<Overlay> mapOverlays = mapView.getOverlays();
	    	Drawable drawable = SpaceObjectChecking.this.getResources().getDrawable(R.drawable.satellite);
	    	HelloItemizedOverlay itemizedoverlay = new HelloItemizedOverlay(drawable);
	

	    	
//	    	overlayitem.addOverlay(itemizedoverlay);
//	    	mapOverlays.add(itemizedOverlay);
	    }

	    public void onStatusChanged(String provider, int status, Bundle extras) {}

	    public void onProviderEnabled(String provider) {}

	    public void onProviderDisabled(String provider) {}
	  };

	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}
	
	private class HelloItemizedOverlay extends Overlay{
		
		public HelloItemizedOverlay(Drawable defaultMarker) {
			  super();
		}
	}
	
}
