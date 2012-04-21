package com.spaceapp.view;

import java.util.List;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.spaceapp.data.SpaceObject;

public class NearestObjectList extends ListView{

	private List<SpaceObject> satellites;
	private SatellateAdapter adapter;
	
	public NearestObjectList(Context context, AttributeSet attrs) {
		super(context, attrs);
		
		adapter = new SatellateAdapter();
		setAdapter(adapter);
	}
	
	public void setSatellites(List<SpaceObject> satellites){
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

		public SpaceObject getItem(int position) {
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
			SpaceObject satellite = getItem(position);
			NearestObjectItem v = null;
			if(satellite != null){
				
				if(v instanceof NearestObjectItem){
					v = (NearestObjectItem)convertView;
				}else{
					v = new NearestObjectItem(getContext());
				}
				
				v.setSatellite(satellite);
			}
			return v;
		}
		
	}

}
