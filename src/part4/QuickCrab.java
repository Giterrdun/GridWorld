package part4;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

public class QuickCrab extends CrabCritter {
	
	
	public ArrayList<Location> getMoveLocations(){
		ArrayList<Location> locs = new ArrayList<Location>();
		Grid gr = getGrid();
		
		addTwo(locs,getDirection() + -90);
		addTwo(locs,getDirection() + 90);
		
		if (locs.size() ==0){
			return super.getMoveLocations();
		}
			return locs;
		
	}
	
	public void addTwo(ArrayList<Location> locs, int dir){
		Grid gr = getGrid();
		Location loc = getLocation();
		
		Location temp = loc.getAdjacentLocation(dir);
		
		if(gr.isValid(temp) && gr.get(temp) == null){
			Location loc2 = temp.getAdjacentLocation(dir);
			if(gr.isValid(loc2) && gr.get(loc2) == null){
				locs.add(loc2);
			}
			
		}
	}

}
