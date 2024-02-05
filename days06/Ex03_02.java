package days06;

import java.util.Scanner;

/**
 * @author 조연화
 * @date 2024. 1. 8. 오후 12:40:59
 * @subject 
 * @content	
 */
public class Ex03_02 {

	public static void main(String[] args) {
		
		char one ;
		// Syntax error on token "continue", invalid VariableDeclaratorId
		// 예약어를 식별자로 사용할 수 없기 때문에
		char con = 'y';
		
		// 2:00~
		
		Scanner scanner = new Scanner(System.in); 		
		//반복작업 수행 -> do~while 사용
		do {
			System.out.printf("> 한문자 입력 ? ");
			one = scanner.next().charAt(0); //"a"
			System.out.printf("one='%c'\n", one);
			
			System.out.print("\n\n 계속할거냐? ");
			con = scanner.next().charAt(0); // 'y' 'n'
		} while (con=='y' || con=='Y');
		
		System.out.println("end");
		
		
		
		
		
	}//main

}//class
