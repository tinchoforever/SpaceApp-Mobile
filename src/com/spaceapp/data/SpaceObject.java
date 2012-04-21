package com.spaceapp.data;

import java.io.Serializable;

public class SpaceObject implements Serializable{
	
	private String name;
	private long distance;
	
	public SpaceObject(String name, long distance){
		this.name = name;
		this.distance = distance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getDistance() {
		return distance;
	}

	public void setDistance(long distance) {
		this.distance = distance;
	}

	
}
