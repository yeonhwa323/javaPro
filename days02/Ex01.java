package days02;

import java.util.jar.Attributes.Name;

public class Ex01 {

	public static void main(String[] args) {
		//		6. 본인 이름과 키를 저장하는 변수를 선언하고
		//		   아래와 같이 출력하는 코딩을 하세요.
		//		   [출력형식]   
		//		     "이름 : "홍길동", 키 : 185.22cm" 
		// 식별자(identifier) - 변수명, 클래스명, 메서드 명 등등
		// 식별자를 부여하는 방법(검색)
		
		// 홍길동 cannot be resolved to a variable
		/* 
		 n 변수(variable)
		 'n' 한 문자
		 "n" 문자열 = 'n' + '\0'
		 */
		
		//자료형 변수명[args=초기값];
		
		// 변수 초기화
		String name = "조연화";
		//Type mismatch: cannot convert from double to String
		double height = 162.22;
		
		//s cannot be resolved to a variable = 변수를 확인할 수 없어서 발생
		// 키 값에 s 를 쓰면 오류가 안나는데 왜 f 를 쓰면 오류가 나나???
		// -> String height를 double height로 바꿔야 오류가 안난다.
		System.out.printf("이름 : \"%s\", 키 : %fcm"
				, name, height);
		
		
	} // main
	
} // class
	