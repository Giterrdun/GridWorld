package part2;

import info.gridworld.actor.Bug;


public class ZBug extends Bug {

	private int steps;
	private int sideLength;

	/**
	 * Constructs a box bug that traces a square of a given side length
	 * 
	 * @param length
	 *            the side length
	 */
	public ZBug(int length) {
		steps = 0;
		sideLength = length;
	}

	/**
	 * Moves to the next location of the square.
	 */
	public void act() {
		
		boolean done = false;
		boolean secondPhase = false;
		boolean thirdPhase = false;
		
		if (steps < sideLength && canMove() && !done && !secondPhase)  {			
			move();
			steps++;
			
		} else {
			if (!secondPhase){
				turnRight();
				turn();
				secondPhase = true;
				steps = 0;
			}
			
				
			
			
		}
		
		
		
		if (steps< sideLength && canMove() && !done && secondPhase){
			
			move();
			steps++;
			
		}else{
			if(secondPhase){
				turnRight();
				turnRight();
				turn();
				thirdPhase = true;
				steps = 0;
				
			}
		}
		if (steps< sideLength && canMove() && !done && thirdPhase){
			move();
			steps++;
		}else{
			done = true;
		}
	}
	
	private void turnRight(){
		turn();
		turn();
	}
	
	private void turnLeft(){
		turn();
		turn();
		turn();
		turn();
		turn();
		turn();
	}

	
	



}