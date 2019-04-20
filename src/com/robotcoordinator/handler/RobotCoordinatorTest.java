/**
 * 
 */
package com.robotcoordinator.handler;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Lucas Abr�o (lucaspiano@gmail.com)
 *
 */
class RobotCoordinatorTest {
	
	RobotCoordinatorMain robotCoordinatorMain = new RobotCoordinatorMain();

	@Test
	void test() {
		assertEquals(robotCoordinatorMain.getDataMovementsForRobot("FF"),"0,2");
	}

}
