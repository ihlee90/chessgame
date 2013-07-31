package pieces;

public class Pawn {
	private String color ;

	public Pawn( ){
		color = "white";
	}
	
	public Pawn( String pColor){
		color = pColor;
	}

	public void setColor(String pColor) {
		color = pColor;
	}

	public String getColor() {
		return color;
	}
}