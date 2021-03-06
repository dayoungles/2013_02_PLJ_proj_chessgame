import junit.framework.TestCase;


public class BoardTest extends TestCase {
	private static final String WHITE = "white";
	private static final String BLACK = "black";
	
	Board myBoard = new Board();
	
	public void testaddPawn() throws Exception {
		myBoard.addPawn(new Pawn(BLACK));
		myBoard.addPawn(new Pawn(WHITE));
		
		assertEquals(2, myBoard.getNumOfPawn());
		assertEquals(true, myBoard.hasPawn(new Pawn(BLACK)));
	}
	

}
