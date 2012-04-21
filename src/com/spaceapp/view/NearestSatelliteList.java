package com.spaceapp.view;

import java.util.List;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.spaceapp.data.Satellite;

public class NearestSatelliteList extends ListView{

	private List<Satellite> satellites;
	private SatellateAdapter adapter;
	
	public NearestSatelliteList(Context context, AttributeSet attrs) {
		super(context, attrs);
		
		adapter = new SatellateAdapter();
		setAdapter(adapter);
	}
	
	public void setSatellites(List<Satellite> satellites){
		this.satellites = satellites;
		adapter.notifyDataSetChanged();
	}
	
	private class SatellateAdapter extends BaseAdapter{

		public int getCount() {
			if(satellites != null){
				return satellites.size();
			}
			return 0;
		}

		public Satellite getItem(int position) {
			if(satellites != null){
				if(position >= 0 && position < satellites.size()){
					return satellites.get(position);
				}
			}
			return null;
		}

		public long getItemId(int position) {
			return position;
		}

		public View getView(int position, View convertView, ViewGroup parent) {
			Satellite satellite = getItem(position);
			NearestSatelliteItem v = null;
			if(satellite != null){
				
				if(v instanceof NearestSatelliteItem){
					v = (NearestSatelliteItem)convertView;
				}else{
					v = new NearestSatelliteItem(getContext());
				}
				
				v.setSatellite(satellite);
			}
			return v;
		}
		
	}

}
