package pieces;
/**
 * 폰 만드는 클래스.
 */
public class Pawn {
	public static final String WHITE = "white";
	public static final String BLACK = "black";
	public static final String NOTHING = "blank";
	public static final String UPPER_P = "P";
	public static final String UNDER_P = "p";
	public static final String NO_SYMBOL = ".";
	String color;
	String symbol;
	
	public Pawn(){
		color = "white";
	}
	
	public Pawn(String color, String symbol){
		this.color = color;
		this.symbol = symbol;
	}
	
	public String getSymbol() {
		return symbol;
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

}
