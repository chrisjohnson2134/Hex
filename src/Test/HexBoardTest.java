package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import game.HexBoard;

public class HexBoardTest {

	@Test
	public void eightXeight_HexBoard_Test() {
		HexBoard a = new HexBoard(8, 8);
		System.out.println(a.toString());
		
		String str =
				" * A B C D E F G H *\n"+
				"  1 * * * * * * * * 1\n"+
				"   2 * * * * * * * * 2\n"+
				"    3 * * * * * * * * 3\n"+
				"     4 * * * * * * * * 4\n"+
				"      5 * * * * * * * * 5\n"+
				"       6 * * * * * * * * 6\n"+
				"        7 * * * * * * * * 7\n"+
				"         8 * * * * * * * * 8\n"+
				"          * A B C D E F G H *\n";
		
		assertEquals(a.toString(),str);
	}
	
	

}
