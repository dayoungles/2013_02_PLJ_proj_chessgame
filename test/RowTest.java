import chess.Row;
import junit.framework.TestCase;
//git error test

public class RowTest extends TestCase {
	static final String EMPTY_ROW = "........";
	static final String WHITE_PAWN_ROW = "pppppppp";
	static final String BLACK_PAWN_ROW = "PPPPPPPP";
	private Row row;
	
	public void setUp(){
		row = new Row();
		
	}
	public void testInitialize() throws Exception {
		row.initEmpty();
		assertEquals(EMPTY_ROW, row.printLine());
		row = new Row();
		row.initBlack();
		assertEquals(BLACK_PAWN_ROW, row.printLine());//요렇게 하면 왜 안될까?
	}
	public void testInitBlack() throws Exception {
		row.initBlack();
		assertEquals(BLACK_PAWN_ROW, row.printLine());
	}
	public void testInitWhite() throws Exception {
		row.initWhite();
		assertEquals(WHITE_PAWN_ROW, row.printLine());
	}
}
