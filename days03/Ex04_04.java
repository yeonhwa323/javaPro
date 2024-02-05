package days03;

/**
 * @author 조연화
 * @date 2024. 1. 3. 오후 1:33:20
 * @subject [논리 연산자]
 * @content	boolean 참/거짓
 */
public class Ex04_04 {

	public static void main(String[] args) {
		/*
		 * 1. 일반 논리 연산자
		 * 	1) && 일반 논리 AND 연산자(논리곱)
		 * 		항(또는 피연산자) && 항
		 * 		피연산자 && 피연산자
		 * 		true  && true		true
		 *  	true  && false		false
		 *   	false && true		false
		 *    	false && false		false
		 *    
		 *    	두 피연산자가 참 일 때만 참이 된다.
		 *    	true 	1
		 *    	false 0
		 */
		System.out.println( 3 >= 5); 	// false
		System.out.println( 10 >= 5); 	// true
		//					false && true
		System.out.println( 3 >= 5 && 10 >= 5); 	// false
		//					true && true
		System.out.println( 3 <= 5 && 10 >= 5); 	// true
		//					true && false
		System.out.println( 3 <= 5 && 10 < 5); 	// false
		
		/*
		 * 	2) || 일반 논리 OR 연산자(논리합)
		 * 		항 || 항
		 * 		true  || true		true
		 * 		true  || false		true
		 * 		false || true		true
		 * 		false || false		false
		 * 
		 * 		둘 다 거짓인 경우에만 거짓이다.
		 * 
		 * 	3) !  부정(NOT)연산자 -> 일반 논리연산자에만 존재
		 * 
		 * 2. 비트 논리 연산자 
		 * 	1) & 비트 논리 AND 연산자
		 * 	2) | 비트 논리 OR 연산자
		 * 	3) ^ XOR 연산자 				-> 비트 논리 연산자에만 존재
		 * 	4) ~ 틸드 연산자 (비트부정연산자) 	-> 비트 논리 연산자에만 존재
		 * */
		
		System.out.println(3>4  || 4>1); // true
		System.out.println(3<=4 || 4>1); // true
		System.out.println(3<=4 || 4<1); // true
		
		System.out.println(3>=4 || 4<1); // false
		
		// ! 부정(not)연산자
		// ! 참 => 거짓
		// ! 거짓 => 참
		
		System.out.println( true );
		System.out.println( !true ); // false
		
		System.out.println( false );
		System.out.println( !false ); // true
		
		System.out.println( 3>=4 ); //false
		//The operator ! is undefined for the argument type(s) int( int 앞 부정연산자(!) 사용불가)
		
		// 우선순위 >= 를 먼저 하기 위해서는 최우선연산자(괄호)를 사용하면 된다.
		System.out.println( !(3 >= 4) ); // true		
		
		// 다르다 연산자 == !=
		// syso( 3 = ! 2 )
		
		
	} // main

} // class
