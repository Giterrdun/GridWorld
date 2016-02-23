package part3;


import java.awt.Color;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import part3.JumperBug;


public class JumperBugRunner {
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		
		JumperBug alice = new JumperBug();
		alice.setColor(Color.ORANGE);
		Rock rocky = new Rock();
		world.add(new Location(3,8), rocky);
		world.add(new Location(7, 8), alice);
		
		world.show();
	}
}
