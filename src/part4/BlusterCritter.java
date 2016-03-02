package part4;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;

public class BlusterCritter extends Critter {
	
	public static final double DARKENING_FACTOR = 0.05;
	
	private int critters;
	
	public BlusterCritter(int c){
		critters = c;
	}
	
	public ArrayList<Actor> getActors(){
		ArrayList<Actor> actors = new ArrayList<Actor>();
		Location loc = getLocation();
		for(int r = loc.getRow() - 2; r <= loc.getRow() + 2; r++ )
			 for(int c = loc.getCol() - 2; c <= loc.getCol() + 2; c++){
			 
				 Location tempLoc = new Location(r,c);
				 if(getGrid().isValid(tempLoc)){
			 
					 Actor a = getGrid().get(tempLoc);
					 if(a != null && a != this)
			 actors.add(a);
			 }
			 }
			 return actors; 
		
	}
	
	public void processActors(ArrayList<Actor> actors) {
		int n = actors.size();
		if (n >= critters){
			darken();
			return;
		}
		if(n < critters){
			brighten();
			return;
		}
			

	}
	
	private void darken(){
		Color c = getColor();
		 int red = (int) ((c.getRed()+2) * (1 - DARKENING_FACTOR));
		 int green = (int) ((c.getGreen()+2) * (1 - DARKENING_FACTOR));
		 int blue = (int) ((c.getBlue()+2) * (1 - DARKENING_FACTOR));
		 if(red > 255)
			 red = 255;
		 if(green > 255)
			green = 255;
		 if(blue > 255)
			 blue = 255;
		 setColor(new Color(red, green, blue)); 
		
	}
	
	private void brighten(){
		Color c = getColor();
		 int red = (int) (c.getRed() * (1 + DARKENING_FACTOR));
		 int green = (int) (c.getGreen() * (1 + DARKENING_FACTOR));
		 int blue = (int) (c.getBlue() * (1 + DARKENING_FACTOR));
		 setColor(new Color(red, green, blue)); 
	}
	
}
