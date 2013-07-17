package chess;
import java.util.ArrayList;

import pieces.Pawn;

/**
 * @author kimminhyeok
 * 체스판 만드는 클래스.
 */
public class Board {
	private int NumOfPawn = 0;
	private ArrayList<Pawn> PawnList= new ArrayList<Pawn>();
	
	/**
	 * 폰을 추가하고 폰의 개수도 하나씩 올려줌.
	 * @param addPawn -> 문제 2-8 : Pawn 클래스를 인자로 받고 있기 때문에 다른 객체가 추가될 리 없다
	 */
	public void addPawn(Pawn addPawn){  
		PawnList.add(addPawn);
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
		return PawnList.contains(testPawn);
	}
}
