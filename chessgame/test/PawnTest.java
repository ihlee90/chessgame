package chessgame;

import junit.framework.TestCase;

public class PawnTest extends TestCase {
	public void testCreate() {
		final String COLOR_WHITE = "white";
		final String COLOR_BLACK = "black";

		Pawn vPawn = new Pawn("white");
		Pawn v2Pawn = new Pawn("black");

		assertEquals(COLOR_WHITE, vPawn.getColor());
		assertEquals(COLOR_BLACK, v2Pawn.getColor());

	}
}
