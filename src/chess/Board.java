package chess;
import java.util.ArrayList;

import pieces.*;

/**
 * 체스판 만드는 클래스.
 */
public class Board {
	static final String NEWLINE = System.getProperty("line.separator");
	private int NumOfPawn = 0;
	//ArrayList<Pawn> pawnRow= new ArrayList<Pawn>();
	//private Row row = new Row();
	ArrayList<Row> rows = new ArrayList<Row>();
	
	Board(){
		initialize();
	}

	
	/**
	 * 폰의 개수를 반환하는 메소
	 * @return
	 */
	public int getNumOfPawn(){
		return NumOfPawn;
	}
	
	/**
	 * 인자로 받은 폰이 폰리스트에 들어가 있는지 확인하는 메소드.
	 * @param testPawn
	 * @return
	 */
//	public boolean hasPawn(Pawn testPawn){
//		return pawnRow.contains(testPawn);
//	}
	public void initialize(){
		
		
		for (int i = 0; i <8 ; i ++){
			Row newRow = new Row();
			if (i == 1){
				newRow.initWhite();
			} else if (i ==6){
				newRow.initBlack();
			} else {
				newRow.initEmpty();
			}
			rows.add(newRow);
		}
	}
	public String getRowString(int index) {
		Row row = rows.get(index);
		StringBuilder buffer = new StringBuilder();
//			for( int i = 0; i < 8 ; i++)
//				buffer.append(rows.get(index).getSymbol());
		buffer.append(row.printLine());
		return buffer.toString();
	}
	public void printChessBoard(){
		StringBuilder buffer = new StringBuilder();//for문 못 만들어서 계속 헤맴.
			for( int i = 0; i < 8 ; i++){
				buffer.append(getRowString(i)+NEWLINE);
			}
		System.out.println(buffer.toString());
	}

}