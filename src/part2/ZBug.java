package part2;

import info.gridworld.actor.Bug;


public class ZBug extends Bug {

	private int steps;
	private int sideLength;
	private int stroke;
	
	

	/**
	 * Constructs a box bug that traces a square of a given side length
	 * 
	 * @param length
	 *            the side length
	 */
	public ZBug(int length) {
		steps = 0;
		sideLength = length;
		stroke = 0;
		
	}

	/**
	 * Moves to the next location of the square.
	 */
	public void act() {
		
		
		
		if (steps < sideLength && canMove()){
			move();
			steps++;				
		} else if (stroke == 0){
			turnRight();
			turn();
			steps = 0;
			stroke++;
		} else if (stroke == 1) {
				turnRight();
				turnRight();
				turn();
				steps = 0;
				stroke++;
			
		}
		
	}
	
	private void turnRight(){
		turn();
		turn();
	}
	
	private void turnLeft(){
		turnRight();
		turnRight();
		turnRight();
	}

	
	


}