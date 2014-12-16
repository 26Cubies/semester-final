import org.asl.karelx.Uberbot;

import edu.fcps.karel2.Display;

/**
 * Patrols an area defined by four beepers.
 * 
 */
public class Sentry extends Uberbot {

	// Provide one or more constructors, as you wish

	/**
	 * Patrol an area in a clockwise direction.
	 * 
	 * Move forward until next to a beeper then turn right. Repeat indefinitely.
	 *
	 */
	public Sentry(int x, int y) {
		super(x, y, Display.WEST, Display.INFINITY);
	}

	public void patrol() {

		while (true) {
			if (!this.nextToABeeper()) {
				this.move();
			} else {
				this.turnRight();
				this.move();
			}
			// TODO You implement this method.
		}
	}
}
