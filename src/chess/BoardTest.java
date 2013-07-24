package chess;
import pieces.Pawn;
import junit.framework.TestCase;


public class BoardTest extends TestCase {
	//private static final String WHITE = "white";
	//private static final String BLACK = "black";
	
	private Board myBoard;
	
	public void setUp(){
		myBoard = new Board();
	}
	
	public void testaddPawn() throws Exception {
		assertEquals(0, myBoard.getNumOfPawn());
		myBoard.addPawn(new Pawn(Pawn.BLACK, Pawn.UPPER_P));
		myBoard.addPawn(new Pawn(Pawn.WHITE, Pawn.UPPER_P));
		
		//myBoard.addPawn(new Integer("7"));  -> 에러 발생 확인
		 
		assertEquals(2, myBoard.getNumOfPawn());
		assertEquals(true, myBoard.hasPawn(new Pawn(Pawn.BLACK, Pawn.UPPER_P)));
	}
	public void testCreate() throws Exception {
		assertEquals("pppppppp", myBoard.getRowString(1));
		assertEquals("PPPPPPPP", myBoard.getRowString(6));
	}

	

}
