package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import game.HexBoard;
import game.Human;
import game.Peice;

public class HumanTest {

	@Test
	public void place_peice() {
		HexBoard a = new HexBoard(8,8);
		Human p1 = new Human("Frank", a,"black");
		p1.place_peice(2, 2);
		
		//Makes sure that the peice is their
		assertEquals(a.getPeice(2, 2).getCharacter(),"B");
		
		//Makes sure you can't put a peice in the same place
		assertEquals(a.put_peice(new Peice("B","Black"),"*", 2, 2),false);
	}

}
