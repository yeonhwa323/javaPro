package days04;

import java.util.Scanner;

/**
 * @author 조연화
 * @date 2024. 1. 4.오전 9:03:39
 * @subject 문자열 비교
 * @content == (x)
 * 				이름입력받아서 비교 예제
 */
public class Ex01 {

	public static void main(String[] args) {
		// 숫자(정수,실수)	== 
		// 문자			==
		// 불린(boolean)	==
		
		//(암기) 문자열 같냐?	?? -> == 사용불가
		//(경고) The value of the local variable name is not used
		
		String name1 = "홍길동";
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 이름 입력 ?");
		//(에러) Duplicate local variable name ( 중복 오류)
		String name2 = scanner.next(); // nextXXX(); 그러나 한문자 입력하는 nextch();는 존재X
		
		// 문자열 비교 : == 연산자 사용 (불가)
		// System.out.println( name1 == name2 ); // false
		
		// 문자열 비교 : String.equals() 메서드 사용[암기]
		System.out.println( name1.equals(name2) );
		
		
		/*
		String msg1 = "kenik", msg2 = "KenIk";
		System.out.println(msg1.equals(msg2)); // false
		// 대소문자를 구분하지 않고 문자열 같냐?
		System.out.println(msg1.equalsIgnoreCase(msg2)); // true
		*/
		
		/*
		String name1 = "홍길동";
		String name2 = "홍길동";
		System.out.println( name1 == name2 ); // true
		*/
		
		
	} // main
} // class
