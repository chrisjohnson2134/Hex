package game;


/*
 * 
 * 
 * I need to make this an interface everything is way to specific
 */
import java.util.Scanner;

public class Game {

	Human player1;
	Human player2;
	Board board;
	int turn = 1;
	Scanner in = new Scanner(System.in);
	boolean good_move = false;
	String x;
	int y;
	String[] alpabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
			"t", "u", "v", "w", "x", "y", "z" };

	public void start() {

		// init sequence
		init();

		while (!board.gameWon()) {

			// print board
			System.out.println(board.toString());

			// swap player
			swap();

		}

	}
	
	
	//Maybe this should be interface?
		public boolean gameWon() {
			
			return false;
		}
	

	protected void init() {
		String name1 = null, name2 = null, color1 = null, color2 = null;
		System.out.println("2 hours later their was hex");
		System.out.println("please press enter after each insertion");
		System.out.println("enter player1 name and color: ");
		name1 = in.nextLine();
		color1 = in.nextLine();
		System.out.println("enter player2 name and color: ");
		name2 = in.nextLine();
		color2 = in.nextLine();

		gameSetup(name1, color1, name2, color2);

		System.out.println("Game On!\nEnter move seperated by a space.\n");
	}

	
	//expandibility idea index current player turn 
	protected void swap() {
		if (turn == 1) {
			System.out.println(player1.getName() + " turn.");
			try {
				x = in.next();
				y = in.nextInt();

				if (player1.place_peice(y, getIndex(x) + 1))
					good_move = true;
				else
					System.out.println("try again.");
			} catch (Exception e) {
				System.out.println("Try again.");
			}
		}

		if (turn == 2) {
			System.out.println(player2.getName() + " turn.");
			try {
				x = in.next();
				y = in.nextInt();

				if (player2.place_peice(y, getIndex(x) + 1))
					good_move = true;
				else
					System.out.println("try again.");
			} catch (Exception e) {
				System.out.println("Try again");
			}
		}

		if (good_move == true && turn == 1) {
			good_move = false;
			turn = 2;
		}

		if (good_move == true && turn == 2) {
			good_move = false;
			turn = 1;
		}

	}

	protected int getIndex(String B) {
		int ind = -1;
		for (int i = 0; i < alpabet.length; i++) {
			if (alpabet[i].equals(B.toLowerCase()))
				ind = i;
		}
		return ind;
	}

	protected void gameSetup(String name1, String color1, String name2, String color2) {
		board = new HexBoard(8, 8);
		player1 = new Human(name1, board, color1);
		player2 = new Human(name2, board, color2);
	}
}
