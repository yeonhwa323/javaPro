package days24;

/**
 * @author 조연화
 * @date 2024. 2. 1. 오후 4:33:35
 * @subject 
 * @content 
 */
public class Ex09 {

	//					0		1     2	    3
	//enum Direction { EAST, SOUTH, WEST, NORTH }
	// 					100	  200   300    400
	//enum Direction { EAST, SOUTH, WEST, NORTH }

	// enum Direction { EAST=100, SOUTH=200, WEST=300, NORTH=400 }

	// The constructor Ex09.Direction(int) is undefined
	enum Direction {
		EAST(100, "▶"), SOUTH(200, "▼"), WEST(300, "◀"), NORTH(400,"▲") ;

		// ㄱ.ㄴ.ㅁ. 한자키 -> 특수기호사용

		private final int value;
		private final String symbol;


		private Direction(int value, String symbol) {
			this.value = value;
			this.symbol = symbol;
		}

		/*
		Direction(int value){      // final 로 값이 고정되서 setter 함수 필요X
			this.value = value;
		}
		 */

		public int getValue() {
			return value;
		}

		public String getSymbol() {
			return symbol;
		}


	}

	public static void main(String[] args) {
		Direction [] dirArr = Direction.values();
		for (Direction dir : dirArr) {
			System.out.println(
					 dir.name() +"/"
			       + dir.ordinal() +"/"
				   + dir.getSymbol() + " / "
			       + dir.getValue());
		}


		/*[열거형 구조 이해]
		 * 1. 열거형 enum Direction { EAST, SOUTH, WEST, NORTH }
		 * 2. 컴파일러가  클래스 변환
		 *    class Direction extends Enum{
		 *       static final Direction EAST = new Direction("EAST");
		 *       static final Direction SOUTH = new Direction("SOUTH");
		 *       static final Direction WEST = new Direction("WEST");
		 *       static final Direction NORTH = new Direction("NORTH");
		 *       
		 *       private String name;
		 *       public int name(){
		 *         return this.name;
		 *       }
		 *       private int ordinal
		 *       public int ordinal(){
		 *         return this.ordinal;
		 *       }
		 *       private Dirction(String name){
		 *          this.name = name;
		 *       }
		 *    }
		 */

	}// main

}// class
