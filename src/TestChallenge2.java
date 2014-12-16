import edu.fcps.karel2.Display;

/**
 * Read and implement all of the TODO items in the main method, below.
 * 
 */
public class TestChallenge2 {
	// TODO Complete the Horse class, provided

	public static void main(String[] args) {
		Display.openWorld("src/maps/pasture.map");
		Display.setSize(15, 15);
		Display.setSpeed(4);
		Display.getSpeed();
		
		Horse epona = new Horse(8, 4);
		epona.wander(12, 4);
		// TODO Load the "pasture" map at size 15 by 15
		// TODO Create an instance of a Horse inside the pasture
		// TODO Have the horse wander for 36 steps with a timer of 7
		// TODO Have the horse explode()
	}

}
