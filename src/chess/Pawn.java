package chess;
/**
 * @author kimminhyeok
 * 폰 만드는 클래스.
 */
public class Pawn {
	private static final String WHITE = "white";
	private static final String BLACK = "black";
	
	String color;
	String symbol;
	
	Pawn(){
		color = "white";
	}
	
	Pawn(String color, String symbol){
		this.color = color;
		this.symbol= symbol;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pawn other = (Pawn) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}

	public String getSymbol() {
		return symbol;
	}

}
