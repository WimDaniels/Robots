package ch05;
import becker.robots.*;

/**	mainclass to test robotclasses *
 * 
 * @author arq
 *
 */

public class MyBot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City chart = new City("Chart.txt");
//		HomingBot karel = new HomingBot(chart, 9, 9, Direction.WEST, 0);
//		karel.faceNorth();
//		karel.goHome();
		ProspectorBot prosper = new ProspectorBot(chart, 5, 5, Direction.EAST, 0);
		
		while (prosper.canPickThing()) {
			prosper.followTrail();
			prosper.move();
		}
	}

}