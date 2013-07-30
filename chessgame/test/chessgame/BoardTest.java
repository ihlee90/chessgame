package chessgame;

import junit.framework.TestCase;

public class BoardTest extends TestCase {
	final String COLOR_WHITE = "white";
	final String COLOR_BLACK = "black";
	
	public void testBoard() {
		Board vBoard = new Board();

		vBoard.addPawn(COLOR_WHITE);
		assertEquals( 1, vBoard.getNumOfItems());
		
		vBoard.addPawn(COLOR_BLACK);
		assertEquals( 2, vBoard.getNumOfItems());
		
		vBoard.printItems();

	}
}
