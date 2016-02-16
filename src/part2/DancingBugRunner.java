package part2;

import java.awt.Color;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class DancingBugRunner {
	public static void main(String[] args) {
		int[] turns = {1, 5, 3};
		ActorWorld world = new ActorWorld();
		DancingBug alice = new DancingBug(turns);
		alice.setColor(Color.ORANGE);
	
		world.add(new Location(7, 8), alice);
	
		world.show();
	}
}
