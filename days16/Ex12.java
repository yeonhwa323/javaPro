package days16;

/**
 * @author 조연화
 * @date 2024. 1. 22. 오후 5:16:10
 * @subject 
 * @content 
 */
public class Ex12 {

	public static void main(String[] args) {
		// [클래스 간의 형변환]
		/*
		//	반드시 상속 관계가 있어야 된다.
		// Regular emp = new Temp(); X => 형변환 불가
		
		// 자동으로 업캐스팅(up casting)
		Regular emp = new SalesMan();
		
		// 강제로 다운캐스팅
		// cast 연산자 사용
		SalesMan sm = (SalesMan)emp;
		*/
		
		Regular emp = new Regular();
		// ClassCastException -> 업캐스팅한 객체만 다운캐스팅이 가능하다.
		//SalesMan sm = (SalesMan)emp;
		//sm.getName();
		
	}

}
