package days17;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author 조연화
 * @date 2024. 1. 23. 오후 4:17:23
 * @subject [ 개발자가 고의로 예외 발생시키기 ]
 * @content  1. throw 문을 사용해서 예외를 발생시킬 수 있다.
 * 		실습)
 * 			국어점수를 입력받아서 반환하는 getScore() 메서드 선언
 * 			 ㄴ 정수 입력이 잘못된 경우에는 강제로 예외를 발생시키겠다.
 * 				!( 0 <= score <= 100 )
 */
public class Ex14_02 {

	public static void main(String[] args)  {

		// [ 컴파일러 ]
		// unckecked 예외 - RuntimeException 상속
		// checked 예외 - Exception 상속

		int kor = 0;
		try {
			kor = getScore();
			System.out.println( kor );
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("end");

	}// main

	private static int getScore() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int score;
		System.out.print("> 점수 입력 ? ");
		String input = scanner.next();
		String regex = "100|[1-9]?\\d";
		if ( input.matches(regex) ) {
			score = Integer.parseInt(input);
			return score;
		} else {
			// 강제로 예외 발생시키겠다.
			throw new IOException("점수 범위(0~100) 벗어났다.");
		}
	}

}// class

/* [ 예외 처리방법 ]
 * try~catch : 예외 알아서 처리하는 방법
 * throws ~  : 호출한 곳(main 함수)에 예외처리방법 떠 넘기는 방법
 * */


