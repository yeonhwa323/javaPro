package days17;

import days16.Employee;
import days16.Regular;
import days16.SalesMan;
import days16.Temp;

/**
 * @author 조연화
 * @date 2024. 1. 23. 오전 10:18:26
 * @subject [매개변수 다형성] - 여러가지 형태를 가질수 있는 성질
 * @content 
 */
public class Ex03 {

	public static void main(String[] args) {

		Regular emp1 = new Regular("주강민", "서울 양천구", "010-5555-5555", "2021.03.21", 4000000);

		//disGetPay( emp1 );

		SalesMan emp2 = new SalesMan("임경재", "경기도 성남시", "010-6666-6666", "2021.03.12"
				, 500000
				, 20, 70000);

		disGetPay( emp2 );

		Temp emp3 = new Temp("박정호", "서울 목동", "010-2315-4578", "2020.01.01",
				20, 250000);

		//disGetPay( emp3 );


		System.out.println( "테스트".replace('스', 'X') );
		System.out.println( "테스트".replace("테스", "XY") );

		// 					CharSequence <-	String 매개변수 다형성
		//String name;  // F3->String으로 이동

	}// main

	// [오버로딩(overloading)]
	// 사원의 급여를 출력하는 메서드
	/*
	private static void disGetPay(Regular emp) {
		System.out.printf("> 정규직 사원 급여 :%d원\n", emp.getPay() );
	}

	private static void disGetPay(SalesMan emp) {
		System.out.printf("> 영업직 사원 급여 :%d원\n", emp.getPay() );
	}

	private static void disGetPay(Temp emp) {
		System.out.printf("> 임시직 사원 급여 :%d원\n", emp.getPay() );
	}
	private static void disGetPay(TempTwo emp) {
		System.out.printf("> 임시직 사원 급여 :%d원\n", emp.getPay() );
	}
	 */

	// 							  매개변수 다형성
	//							  Regular/SalesMan/Temp 객체
	private static void disGetPay(Employee emp) {
		// instanceOf 연산자
		// (주의) 자식 클래스 먼저 체크한다. -> 정규직 먼저 체크할 경우 영업직 대신 정규직 사원급여 : ~으로 출력됨.
		String type = null;
		if ( emp instanceof SalesMan ) {
			type = "영업직";
			SalesMan sm = (SalesMan) emp;
			// :
			// :
		}else if (emp instanceof Regular) {
			type = "정규직";
			Regular rg = (Regular) emp;
			// :
			// :	
		}else if (emp instanceof Temp) {
			type = "임시직";
			Temp tm = (Temp) emp;  // 다운캐스팅
			// :
			// :
		}

		System.out.printf("> %s 사원 급여 :%d원\n", type, emp.getPay() );
	}


}// class

class TempTwo extends Temp{

}






