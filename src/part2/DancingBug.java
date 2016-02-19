package part2;

import info.gridworld.actor.Bug;

public class DancingBug extends Bug {
	private int turns;
	private int[] turnArray;

	/**
	 * Constructs a box bug that traces a square of a given side length
	 * 
	 * @param length
	 *            the side length
	 */
	public DancingBug(int[] turn) {
		turns = 0;
		turnArray = turn;
		
	}
	
	public void turn(int n){
		turns = 0;
		while(turns < n){
			turn();
			turns++;
		}
	}

	/**
	 * Moves to the next location of the square.
	 */
	public void act() {
		for (int x : turnArray){			
			turn(x);
			move();
			
		}
		
}
	
}
