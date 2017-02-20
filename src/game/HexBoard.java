package game;

public class HexBoard extends Board {

	public HexBoard(int x, int y) {
		super(x, y);
	}
	
	//Maybe this should be an interface
	//Tested - HexBoard_Test
	// @overide
	public String toString() {

		String str = "";
		String b = "";

		for (int i = 0; i < sizeX; i++) {
			str = str + b;
			b = b + " ";
			for (int j = 0; j < sizeY; j++) {
				str = str + " " + board[i][j].getCharacter();
			}
			str = str + "\n";
		}

		return str;
	}

	//Maybe this should be interface?
	//@overide
	public boolean gameWon() {
		return false;
	}
	
	
	private boolean  connected(String color, String direction, int x,int y){
		
		if(getPeice(x,y).getDirection().equals(direction))
			return true;
		if(getPeice(x, y).getColor().equals(color))
			return  connected(color,direction,x-1,y)
					|| connected(color,direction,x-1,y-1)
					|| connected(color,direction,x,y+1)
					|| connected(color,direction,x+1,y)
					|| connected(color,direction,x+1,y-1)
					|| connected(color,direction,x,y-1);//recursion goes here
		
		return false;
	}

}
