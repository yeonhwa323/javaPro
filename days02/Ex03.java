package days02;

/**
 * @author yeonhwa
 * @date 2024. 1. 2. - 오전 10:49:09
 * @subject  
 * @content 
 */
public class Ex03 {

	public static void main(String[] args) {
		// Alt + Shift + Y = 문자열 떨어뜨리기
		String name = "조연화";			// %s
		int age = 20;					// %d
		final double PI = 3.141592;		// %f
		char grade = 'A';				// %c
		
		System.out.printf("이름:%s, 나이:%d, PI:%f, 등급:%c\n"
				, name, age, PI, grade );
	
		
		/*
		 * [식별자 명명 규칙] - 테스트실시!!
		 * 1. 자바는 대소문자 구분한다.
		 * 		String name;
		 * 		syso ( Name ); X
		 * 2. 키워드(예약어,미리의미부여된 예약어)를 사용하면 안된다. - 예약어 찾아보기
		 * 		int char; X
		 * 
		 * 퀵 서치로 내용 빠르게 찾을수 있음 ctrl+shift+alt+L
		 * 
		 * 3. $ _ 특수문자 사용가능하다.
		 * 		int $age, _age;
		 * 
		 * 4. 숫자로 시작할 수 없다.
		 * int 1kor; X
		 * int kor1; O
		 */
		
		int kor1;
		// int 1kor; X(사용 불가)
		
		int $age, a$ge;
		int _height, h_eight;
		
		// String first name;
		// String first_name;
		// String firstName; 권장
		
		// int #age; x(사용 불가)

	} // main

} // class
