package chess;
import java.util.ArrayList;

import pieces.Pawn;

public class Row {
	static final String NEWLINE = System.getProperty("line.separator");
	ArrayList<Pawn> pawnRow = new ArrayList<Pawn>();
	
	public void initEmpty() {
		for (int i = 0; i <8 ; i++){
			pawnRow.add(new Pawn(Pawn.NOTHING, Pawn.NO_SYMBOL));
		}
	}
	public void initWhite(){
		for (int i = 0; i <8 ; i++){
			pawnRow.add(new Pawn(Pawn.WHITE, Pawn.UNDER_P));
		}
	}
	public void initBlack(){
		for (int i = 0; i <8 ; i++){
			pawnRow.add(new Pawn(Pawn.BLACK, Pawn.UPPER_P));
		}
	}
	public String printLine(){
		StringBuilder buffer = new StringBuilder();//for문 못 만들어서 계속 헤맴.
		
		for( int i = 0; i < 8 ; i++){
			buffer.append(pawnRow.get(i).getSymbol());
		}
		//buffer.append(NEWLINE);
		return buffer.toString();
		//System.out.println(buffer.toString());
	}
	
	//git error test
}