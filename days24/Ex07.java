package days24;

/**
 * @author 조연화
 * @date 2024. 2. 1. 오후 4:05:30
 * @subject 
 * @content 
 */
public class Ex07 {

	public static void main(String[] args) {
		/*
		 * [enumeration 열거자/ iterator 반복자]
		 * 
		 * [ 열거형(enums) ]
		 * 1. jdk 1.5 추가
		 * 2. 서로 관련된 상수를 편리하게 사용하기 위한 것.
		 * 	예) 남자, 여자 - 성별	
		 * 
		 * 	예) 1조 - 구본혁(8명)
		 * 	남자/여자 체크해서 코딩~~
		 * 	int gender = 1; // 0 
		 * 	boolean gender = true;	// false
		 * 	char gender = 'm';	// 'f'
		 * 		:
		 * 		
		 * 	표준화 -> 유지,보수 생산성 향상
		 * 			가독성 향상
		 * 3. 열거형 선언 형식
		 * 	접근지정자 enum [열]거형이름{ // 대문자로 시작한다.
		 * 		상수명,	// 대문자사용
		 * 		상수명,
		 * 		public static final [열]거형이름 상수명,
		 * 		  :	
		 * }
		 * 4. 열거형 사용하는 방법 : [열]거형이름.상수명
		 * 5. 열거형->클래스로 컴파일되어지고
		 * 		   -> 부모클래스 extends java.lang.Enum 클래스
		 * 6. Enum 클래스
		 * 	1) ordinal() : 열거형 상수가 정의된 순서를 반환
		 * 	2) name()	 : 열거형 상수명 문자열로 반환
		 *  3) valueOf() : name()와 일치하는 "열거형 상수"반환
		 *  
		 * */
 
		System.out.println( Gender.MAN ); // 남자
		System.out.println( Gender.MAN.ordinal() ); // 0
		System.out.println( Gender.MAN.name() ); // MAN
		System.out.println( Gender.valueOf("MAN") ); // MAN
		System.out.println( Gender.valueOf("MAN").ordinal() ); // 0
		System.out.println( Gender.valueOf("MAN").name() ); // MAN
		
		System.out.println( Gender.WOMAN ); // WOMAN
		System.out.println( Gender.WOMAN.ordinal() ); // 1
		System.out.println( Gender.WOMAN.name() ); // 1
		
		Gender[] arr = Gender.values();
		for (Gender g : arr) {
			System.out.println( g +"/"+g.ordinal() + "/" + g.name());
		}
		
		
	}// main

}// class
