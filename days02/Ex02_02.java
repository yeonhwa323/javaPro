package days02;


/**
 * @author yeonhwa
 * @date 2024. 1. 2. - 오전 10:12:31
 * @subject  
 * @content 
 */
public class Ex02_02 {

	public static void main(String[] args) {

		// String   문자열 자료형				%s
		// double  숫자(실수) 대표적인 자료형		%f
		// int 	   숫자(정수) 대표적인 자료형		%d
		// char	   문자 자료형					%c

		// 지역변수(local variable)
		String name = "홍길동";	// main() 메서드 안에서 사용 가능.

		// {} 지역 (범위, 영역) 연산자
		{
			// 자료형 변수명 = 'A'; 
			//The value of the local variable grade is not used
			char grade = 'A';

			System.out.printf(" 1. 이름 : %s\"\n", name );
			// System.out.println(); 한줄 띄어쓰기
			System.out.printf(" 1. 등급 : '%c\'\n", grade );
		} //

		//System.out.println(); 또는 띄어쓰기하고자 하는 곳에 '\n'
		System.out.printf(" 2. 이름 : %s\"\n", name );
		// grade cannot be resolved to a variable
		// System.out.printf(" 2. 등급 : '%c\'", grade );


	} // main

} // class
