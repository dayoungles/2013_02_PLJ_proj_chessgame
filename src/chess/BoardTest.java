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
	
	public void testCreate() throws Exception {
		assertEquals("........", myBoard.getRowString(0));
		assertEquals("pppppppp", myBoard.getRowString(1));
		assertEquals("PPPPPPPP", myBoard.getRowString(6));
		myBoard.printChessBoard();
	}
	
//git error test
	

}
