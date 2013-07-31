package chessgame;

import java.util.ArrayList;
import java.lang.System;

import chessgame.Pawn;

public class Board {
	private static int numOfItems=0;
		
	private ArrayList<Pawn> board = new ArrayList<Pawn>(); 
	
	
	public void addPawn( final String str) {
		if ( str == "white") {
			board.add( new Pawn("white") );
			numOfItems++;
		}
		else if ( str == "black") {
			board.add( new Pawn("black") );
			numOfItems++;
		}
		else {
			System.out.println("The color of pawn is wrong!");
		}
		
	}
	
	public int getNumOfItems() {
		return numOfItems;
	}
	
	public void printItems() {
		System.out.println( numOfItems);
		
		for ( int i =board.size(); i < board.size() ;i++ ) {
			System.out.println( board.get( i ) );
		}
		
	}
}
