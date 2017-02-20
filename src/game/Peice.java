package game;

import java.util.Vector;

public class Peice {

	String color;
	String character;
	String direction;

	public Peice() {
		color = null;
		character = null;
	}

	public Peice(String n, String a) {
		character = n;
		color = a;
	}

	public Peice(String n) {
		character = n.substring(0, 1).toUpperCase();
		color = null;
	}

	public String getColor() {
		return color;
	}

	public String getCharacter() {
		return character;
	}


	public String toString() {
		return color;
	}

	public void setColor(String chara) {
		this.color = chara;
	}
	
	public String getDirection(){
		return direction;
	}

}
