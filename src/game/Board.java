package game;

public class Board {

	// TODO ASCII
	String[] alpabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
			"t", "u", "v", "w", "x", "y", "z" };
	Peice[][] board;
	int sizeX, sizeY;

	// Tested-BoardTest
	public Board(int x, int y) {
		sizeX = y+2;
		sizeY = x+2;
		board = new Peice[sizeX][sizeY];
		set_board_default("*");
		set_border_top_bottom();
	}

	// Tested-BoardTest
	public Peice getPeice(int x, int y) {
		return board[x][y];
	}

	// Test-BoardTest
	public boolean put_peice(Peice p, String validSpace, int x, int y) {
		if (board[x][y].getCharacter().equals(validSpace) && inBounds(x, y)) {
			board[x][y] = p;
			return true;
		}
		return false;

	}

	private boolean inBounds(int x, int y) {
		if (x > 0 && x < sizeX - 1)
			if (y > 0 && y < sizeY - 1) {
				return true;
			}
		return false;
	}

	public void set_board_default() {
		for (int i = 0; i < sizeY; i++) {
			for (int j = 0; j < sizeX; j++) {
				board[i][j] = new nullPeice();
			}
		}
	}

	public void set_board_default(String n) {
		for (int i = 0; i < sizeY; i++) {
			for (int j = 0; j < sizeX; j++) {
				board[i][j] = new Peice(n);
			}
		}
	}

	public void set_border_top_bottom() {
		for (int i = 1; i < sizeX - 1; i++) {
			board[i][0] = new BorderPeice(String.valueOf(i),"Left");
			board[i][sizeY - 1] = new BorderPeice(String.valueOf(i),"Right");
		}

		for (int j = 1; j < sizeY - 1; j++) {
			board[0][j] = new BorderPeice(alpabet[j - 1],"Top");
			board[sizeX - 1][j] = new BorderPeice(alpabet[j - 1],"Bottom");
		}
	}

	//This is a specific board layout and should get it's own class
	//Maybe this should be interface too
	// Tested-BoardTest
	public String toString() {
		System.out.println(sizeY);
		String str;
		
		if(sizeY>9)
			 str = " ";
		else 
			 str = "  ";

		for (int i = 0; i < sizeY; i++) {
			for (int j = 0; j < sizeX; j++) {
					str = str + " " + board[i][j].getCharacter() ;
			}
			
			
			if(sizeY>9 && i<9)
				str = str + "\n" + " ";
			else
				str = str + "\n" ;
			if(sizeY-2==i && sizeY-2>9)
				str = str + " ";
		}

		return str;
	}
	
	public boolean gameWon(){
		return false;
	}

}
