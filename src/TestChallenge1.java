import org.asl.karelx.Squarebot;

import edu.fcps.karel2.Display;

/**
 * Read and implement all of the TODO items in the main method, below.
 * 
 */
public class TestChallenge1 {
	// TODO Complete the provided Sentry class by implementing its patrol() method
		

	public static void main(String[] args) {
		Display.openWorld("maps/school.map");
		Display.setSize(10, 10);
		Display.setSpeed(10);
		Display.getSpeed();
		
		
		Squarebot kirito = new Squarebot(9, 3);
		for(int i=0; i<4; i++){
			kirito.putBeeper();
			for(int i1=0; i1<5; i1++){
			kirito.move();
			}
			kirito.turnLeft();
			}		
		Sentry asuna = new Sentry(4, 3);
		asuna.patrol();

		// TODO Load a default map 
		// TODO Create a Squarebot and have it place beepers at the corners of a rectangle
		//   	with bottom right corner at (9, 3) and sized for 5 beepers on each side (see picture)
		// TODO Create a Sentry and have it patrol clockwise around the beepers, indefinitely
	}

}
