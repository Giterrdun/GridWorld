package part4;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid; 


import java.util.ArrayList;
import java.awt.Color;

public class ChameleonKid extends ChameleonCritter {

	public ArrayList<Actor> getActors(){
		ArrayList<Actor> actors = new ArrayList<Actor>();
		int[] directions = { Location.AHEAD, Location.HALF_CIRCLE };
		for (Location loc : getLocationsInDirections(directions)){
			Actor jeff = getGrid().get(loc);
			if (jeff != null)
				actors.add(jeff);
		}
		return actors;
	}
	
	public ArrayList<Location> getLocationsInDirections(int[] directions){
		ArrayList<Location> locs = new ArrayList<Location>();
		Grid grd = getGrid();
		Location loc = getLocation();
		
		for (int direction : directions){
			Location neighborLoc = loc.getAdjacentLocation(getDirection() + direction);
			if (grd.isValid(neighborLoc))
				locs.add(neighborLoc);
			}
		return locs;
	}

}
