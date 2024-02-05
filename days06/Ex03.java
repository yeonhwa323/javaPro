package days06;

import java.util.Scanner;

/**
 * @author 조연화
 * @date 2024. 1. 8. 오후 12:40:59
 * @subject 
 * @content	
 */
public class Ex03 {

	public static void main(String[] args) {
		// 3. 아래 실행결과와 같이 문자를 입력받아서  출력하는 코딩을 2번 하세요.
		//
		//	    [실행결과]
		//		> 한 문자 입력 ? a 엔터
		//		one='a' 
		//		> 한 문자 입력 ? b 엔터
		//		one='b'
		
		// Scanner 또는 BufferedReader 사용
		char one ;
		Scanner scanner = new Scanner(System.in); 
		
		System.out.printf("> 한문자 입력 ? ");
		one = scanner.next().charAt(0); //"a"
		System.out.printf("one='%c'\n", one);
		
		System.out.printf("> 한문자 입력 ? ");
		one = scanner.next().charAt(0); //"b"
		System.out.printf("one='%c'\n", one);
		
	}//main

}//class
