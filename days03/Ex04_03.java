package days03;

/**
 * @author 조연화
 * @2024. 1. 3. 오후 12:39:48
 * @subject	[비교 연산자] 크다, 작다, 같거나크다, 같거나 작다
 * @content 		   같다, 다르다
 * 			비교 연산자는 처리 결과는 true/false ( boolean )
 * 
 * 			[ instanceof 비교연산자 있다. ]
 * 				클래스 수업때 객체를 비교할 때 사용하는 연산자.
 */
public class Ex04_03 {

	public static void main(String[] args) {
		int i = 10, j = 3;
		System.out.println( i > j ); // true
		System.out.println( i < j ); // false
		System.out.println( i >= j ); // true
		System.out.println( i <= j ); // false
		
		// (주의할 점)
		System.out.println( i = j ); // 3 => 대입(할당)연산자
		System.out.println( i == j ); // 비교연산자(같다)
		System.out.println( i != j ); // 비교연산자(다르다) *순서중요 !=
		// System.out.println( i =! j ); // 비교연산자(다르다)
		// ! -> 논리 연산자 중에 부정(not) 연산자

	}

}
