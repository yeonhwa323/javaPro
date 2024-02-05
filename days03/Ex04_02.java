package days03;

/**
 * @author 조연화
 * @2024. 1. 3. 오후 12:28:26
 * @subject 연산자(operator)
 * @content 1. 산술 연산자
 */
public class Ex04_02 {

	public static void main(String[] args) {

		int i = 10, j = 3;
		System.out.println( i + j ); // + 덧셈 연산자
		System.out.println( i - j ); // - 
		System.out.println( i * j ); // * 
		System.out.println( i / j ); // 10/3 = 3( 몫 ) 
		System.out.println( (double) i / j ); // 
		// 나머지 연산자(%)
		System.out.println( i % j ); // 나머지(reminder)

		// (주의할 점)
		// by zero
		// ArithmeticException(산술적 예외)가 발생
		// System.out.println( 10 / 0 ); // 정수 -> ?
		
		// Infinity(무한대 값) 리터럴
		System.out.println( 10.0 / 0 ); // 실수
		
		// ArithmeticException(산술적 예외)가 발생
		// System.out.println( 10 % 0 );
		
		// NaN(Not a Number) 리터럴
		System.out.println( 10.0 % 0 );
		
		
	} // main

} // class
