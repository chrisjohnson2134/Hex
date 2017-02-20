package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import game.Board;
import game.HexBoard;
import game.Peice;
import game.nullPeice;

public class BoardTest {

	@Test
	public void eightXeight_Board() {
		Board a = new Board(8, 8);
		
		String str =
						"  * A B C D E F G H *\n"+
						"  1 * * * * * * * * 1\n"+
						"  2 * * * * * * * * 2\n"+
						"  3 * * * * * * * * 3\n"+
						"  4 * * * * * * * * 4\n"+
						"  5 * * * * * * * * 5\n"+
						"  6 * * * * * * * * 6\n"+
						"  7 * * * * * * * * 7\n"+
						"  8 * * * * * * * * 8\n"+
						"  * A B C D E F G H *\n";
		
		//System.out.println(a.toString());
		assertEquals(str,a.toString());
	}
	
	@Test 
	public void elevenXeleven_board()
	{
		Board a = new Board(11,11);
		String str = 
		 "  * A B C D E F G H I J K *\n"+
		 "  1 * * * * * * * * * * * 1\n"+
		 "  2 * * * * * * * * * * * 2\n"+
		 "  3 * * * * * * * * * * * 3\n"+
		 "  4 * * * * * * * * * * * 4\n"+
		 "  5 * * * * * * * * * * * 5\n"+
		 "  6 * * * * * * * * * * * 6\n"+
		 "  7 * * * * * * * * * * * 7\n"+
		 "  8 * * * * * * * * * * * 8\n"+
		 "  9 * * * * * * * * * * * 9\n"+
		 " 10 * * * * * * * * * * * 10\n"+
		 " 11 * * * * * * * * * * * 11\n"+
		 "  * A B C D E F G H I J K *\n";
		//System.out.println(a.toString());
		//System.out.println(str);
		assertEquals(a.toString(),str);
		
	}
	
	
	
	@Test
	public void getPeice_Test(){
		
		Board a = new Board(8,8);
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				if(a.getPeice(i, j).equals(null))
					fail();
			}
		}
	}
	
	@Test 
	public void putPeice_Test(){
		Board a = new Board(8,8);
		int x =1, y =1;
		String validSpace = "*";
		Peice p = new Peice("B","Black");
		a.put_peice(p, validSpace, x, y);
		assertEquals(a.getPeice(x, y),p);
		a.put_peice(p, validSpace, 4, y);
		assertEquals(a.getPeice(4, y),p);
	}
	

}
