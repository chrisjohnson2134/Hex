package game;

public class Human {

	String name;
	Board board;
	String color;
	String character;
	String accepted_spot = "*";

	public Human(String name, Board board, String color) {
		this.board = board;
		this.color = color;
		this.character = color.substring(0, 1).toUpperCase();
		this.name = name;
	}

	// Tested-HumanTest
	public boolean place_peice(int x, int y) {
		return board.put_peice(new Peice(character, color), accepted_spot, x, y);
	}

	public String getName() {
		return name;
	}
}
