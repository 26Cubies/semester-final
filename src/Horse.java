import java.util.Random;

import org.asl.karelx.Wanderer;


/**
 * Represents a horse wandering around aimlessly in a pasture
 *
 */
public class Horse extends Wanderer {

	public Horse(int x, int y) {
		super(x, y);
	}

	// TODO Add one or more constructors, as needed

	/**
	 * Wander around in random directions until a specified number of steps have
	 * been taken. At regular intervals specified by timer, drop a beeper.
	 * 
	 * @param count
	 *            the total number of steps to take
	 * @param timer
	 *            the interval at which to drop a beeper
	 * 
	 *            Ex. horse.wander(13, 4) should drop a beeper every four steps
	 *            until thirteen steps are taken
	 */
	public void wander(int count, int timer) {
		int numOfSteps = 0;
		int steps = 0;
		
		
		while (numOfSteps < count) {
			Random rand1 = new Random();
			int r = rand1.nextInt(10) + 1;
			if (r >= 3) {
				this.move();
				steps++;
				numOfSteps++;
				System.out.println(r);
			} else if (r == 1) {
				this.turnLeft();
			} else if (r == 2) {
				this.turnRight();
			}
			if (!this.frontIsClear()) {
				this.turnAround();
			}
			if (steps%timer==0) {
				this.putBeeper();
				System.out.println("Beeper placed");
			}
		}
		this.explode();
	}
}
