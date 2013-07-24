package chess;
import java.util.ArrayList;

import pieces.*;

/**
 * 체스판 만드는 클래스.
 */
public class Board {
	
	private int NumOfPawn = 0;
	private ArrayList<Pawn> pawnRow= new ArrayList<Pawn>();
	ArrayList<ArrayList<Pawn>> createRow = new ArrayList<ArrayList<Pawn>>();
	
	Board(){
		initialize();
	}
	/**
	 * 폰을 추가하고 폰의 개수도 하나씩 올려줌.
	 * @param  -> 문제 2-8 : Pawn 클래스를 인자로 받고 있기 때문에 다른 객체가 추가될 리 없다
	 */
	public void addPawn(Pawn pawn){  
		pawnRow.add(pawn);
		NumOfPawn++;
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
	public boolean hasPawn(Pawn testPawn){
		return pawnRow.contains(testPawn);
	}
	public void initialize(){
		ArrayList<Pawn> newRow1 = new ArrayList<Pawn>();
		for (int i = 0; i <8 ; i++){
			newRow1.add(new Pawn(Pawn.NOTHING, Pawn.NO_SYMBOL));
		}
		createRow.add(newRow1);
		
		ArrayList<Pawn> newRow2 = new ArrayList<Pawn>();
		newRow2.add(new Pawn(Pawn.WHITE,Pawn.UNDER_P));
		newRow2.add(new Pawn(Pawn.WHITE,Pawn.UNDER_P));
		newRow2.add(new Pawn(Pawn.WHITE,Pawn.UNDER_P));
		newRow2.add(new Pawn(Pawn.WHITE,Pawn.UNDER_P));
		newRow2.add(new Pawn(Pawn.WHITE,Pawn.UNDER_P));
		newRow2.add(new Pawn(Pawn.WHITE,Pawn.UNDER_P));
		newRow2.add(new Pawn(Pawn.WHITE,Pawn.UNDER_P));
		newRow2.add(new Pawn(Pawn.WHITE,Pawn.UNDER_P));
		createRow.add(newRow2);
		
		ArrayList<Pawn> newRow3 = new ArrayList<Pawn>();
		createRow.add(newRow3);
		ArrayList<Pawn> newRow4 = new ArrayList<Pawn>();
		createRow.add(newRow4);
		ArrayList<Pawn> newRow5 = new ArrayList<Pawn>();
		createRow.add(newRow5);
		ArrayList<Pawn> newRow6 = new ArrayList<Pawn>();
		createRow.add(newRow6);
		
		ArrayList<Pawn> newRow7 = new ArrayList<Pawn>();
		newRow7.add(new Pawn(Pawn.BLACK, Pawn.UPPER_P));
		newRow7.add(new Pawn(Pawn.BLACK, Pawn.UPPER_P));
		newRow7.add(new Pawn(Pawn.BLACK, Pawn.UPPER_P));
		newRow7.add(new Pawn(Pawn.BLACK, Pawn.UPPER_P));
		newRow7.add(new Pawn(Pawn.BLACK, Pawn.UPPER_P));
		newRow7.add(new Pawn(Pawn.BLACK, Pawn.UPPER_P));
		newRow7.add(new Pawn(Pawn.BLACK, Pawn.UPPER_P));
		newRow7.add(new Pawn(Pawn.BLACK, Pawn.UPPER_P));
		createRow.add(newRow7);
		
		ArrayList<Pawn> newRow8 = new ArrayList<Pawn>();
		createRow.add(newRow8);
	}
	public String getRowString(int index) {
		StringBuilder buffer = new StringBuilder();
		//for (int j = 0; j <8 ; j ++){
			for( int i = 0; i < 8 ; i++)
				buffer.append(createRow.get(index).get(i).getSymbol());
		//}
		
		
		return buffer.toString();
	}
	
}
