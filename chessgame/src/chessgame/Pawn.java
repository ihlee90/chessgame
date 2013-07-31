package chessgame;

public class Pawn {
	private String color ;

	Pawn( ){
		color = "white";
	}
	
	Pawn( String pColor){
		color = pColor;
	}

	public void setColor(String pColor) {
		color = pColor;
	}

	public String getColor() {
		return color;
	}
}