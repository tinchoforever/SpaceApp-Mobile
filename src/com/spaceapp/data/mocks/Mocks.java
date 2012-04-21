package com.spaceapp.data.mocks;

import java.util.ArrayList;
import java.util.List;

import com.spaceapp.data.SpaceObject;

public class Mocks {

	public static List<SpaceObject> getSatellites(){
		List<SpaceObject> satellites = new ArrayList<SpaceObject>();
		
		satellites.add(new SpaceObject("Satelite 1", 10029));
		satellites.add(new SpaceObject("Satelite 2", 122178));
		satellites.add(new SpaceObject("Satelite 3", 327183));
		satellites.add(new SpaceObject("Satelite 4", 7328783));
		satellites.add(new SpaceObject("Satelite 5", 321837));
		satellites.add(new SpaceObject("Satelite 6", 893273));
		satellites.add(new SpaceObject("Satelite 7", 1838921));
		satellites.add(new SpaceObject("Satelite 7", 81293));
		satellites.add(new SpaceObject("Satelite 9", 812318));
		
		return satellites;
	}
}
