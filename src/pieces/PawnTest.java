package pieces;
import junit.framework.TestCase;

public class PawnTest extends TestCase {
	private static final String WHITE = "white";
	private static final String BLACK = "black";

	public void testCreate() throws Exception {
		Pawn myPawn = new Pawn();
		String pawnColor = myPawn.color;
		assertEquals(WHITE, pawnColor);

		Pawn mySecondPawn = new Pawn(BLACK, "P");
		String mySecondpawnColor = mySecondPawn.color;
		assertEquals(BLACK, mySecondpawnColor);
	}
	
	public void testCreate2() throws Exception {
		Pawn myPawn = new Pawn();
	}
}
