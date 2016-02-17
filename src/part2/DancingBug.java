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

	/**
	 * Moves to the next location of the square.
	 */
	public void act() {
		
		for (int i = 0; i < turnArray.length; i++){
			while (turnArray[i] > 0){
				turn();
				turnArray[i] = turnArray[i] - 1;
			}
			move();
		}
}
	
}
