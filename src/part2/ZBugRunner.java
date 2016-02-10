package part2;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;



public class ZBugRunner {
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		ZBug alice = new ZBug(4);
		alice.setColor(Color.ORANGE);
		alice.setDirection(90);
		ZBug bob = new ZBug(4);
		bob.setDirection(90);
		world.add(new Location(7, 8), alice);
		world.add(new Location(5, 5), bob);
		world.show();
	}
}

