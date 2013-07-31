package chess;

import chess.Pawn;
import junit.framework.TestCase;

public class PawnTest extends TestCase {
	final String COLOR_WHITE = "white";
	final String COLOR_BLACK = "black";
	
	public void testCreate() {

		Pawn vPawn = new Pawn("white");
		Pawn v2Pawn = new Pawn("black");

		assertEquals(COLOR_WHITE, vPawn.getColor());
		assertEquals(COLOR_BLACK, v2Pawn.getColor());

	}
	
	public void testPawn() {
		Pawn vPawn = new Pawn();

		assertEquals(COLOR_WHITE, vPawn.getColor());
		//assertEquals(COLOR_BLACK, v2Pawn.getColor());

	}
}
