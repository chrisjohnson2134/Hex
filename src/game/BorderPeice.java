package game;

public class BorderPeice extends Peice {
	
	
	public BorderPeice(String character,String direction){
		this.direction = direction;
		this.character = character.toUpperCase();
	}
}
