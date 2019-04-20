package com.robotcoordinator.handler;

/**
 * This software gets the coordinator of a robot that lands on Mars following some rules:
 * F --> Moves Forward.
 * L --> Moves to the left
 * R --> Moves to the right.
 * The main idea of this software is based on a Math Grid where there are the X, Y and cartesian 
 * plain. 
 * 
 * @author Lucas Abrão (lucaspiano@gmail.com)
 *
 */
public class RobotCoordinatorMain {

	/**
	 * 
	 * @param dataCoordinates
	 * @return the current position of the Robot on Mars based on a given coordinate
	 */
	public String getDataMovementsForRobot(String dataCoordinates) {
		int xScale = 0;
		int yScale = 0;
		int direction = 0;
		
		String actualPosition = null;
		
		int [][] movement = {{ 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 }};
		
		for (char c : dataCoordinates.toCharArray()) {
			if (c == 'R') {
				direction = direction + 1;
			}
			else 
				if (c == 'L') {
					direction = direction - 1;
				}
				else 
					if (c == 'F') {
						xScale = xScale + movement[direction][0];
						yScale = yScale + movement[direction][1];
					}
		}
		
		actualPosition = xScale + "," + yScale;
		
		return actualPosition;
	}
	
	public static void main(String[] args) {
		RobotCoordinatorMain robCoordinatorMain = new RobotCoordinatorMain();
		String coordinator = robCoordinatorMain.getDataMovementsForRobot("FF");
		
		System.out.println(coordinator);
		
	}

}
