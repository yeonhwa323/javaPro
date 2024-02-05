package days05;

import java.util.Scanner;

/**
 * @author 조연화
 * @date 2024. 1. 5. 오전 11:32:28
 * @subject 컴퓨터 - 사용자 (USER)
 * @content	[가위(1), 바위(2), 보(3) 게임]
 * 			 컴퓨터는 게임을 할 때마다 임의의 수(1~3) 발생
 * 			 사용자는 1~3 입력.
 */
public class Ex03 {

	public static void main(String[] args) {

		int com, user;
		String [] rps = {"", "가위", "바위", "보" };

		try(Scanner scanner = new Scanner(System.in)) {

			com = (int) (Math.random() * 3) + 1 ;

			System.out.print("> user 가위(1), 바위(2), 보(3) 선택 ? ");
			// 입력값에 대한 유효성 검사 필요...
			user = scanner.nextInt();
			
			/*
			System.out.printf("컴퓨터 : %s, 사용자 : %d\n"
					, com==1?"가위": com==2?"바위": "보"
						, user);
			*/
			System.out.printf("컴퓨터 : %s, 사용자 : %s\n"
					, rps[com], rps[user] );
			
			// 승자/패자
			switch (user - com) {
			case -2: case 1:
				System.out.println("사용자 승리");
				break;
			case -1: case 2:
				System.out.println("컴퓨터 승리");
				break; 
			default:
				System.out.println("무승부");
				break;
			} 
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	

	} // main

} // class


			/*// 내가한 코딩
			if ( com == 1 ) {System.out.printf("가위");}
			else if ( com == 2 ){System.out.printf("바위");}
			else if (com == 3){System.out.printf("보");}

			if ( user == 1 ) {
				System.out.printf("가위");
			}
			else if ( user == 2 )
			{System.out.printf("바위");}
			else if (user == 3)
			{System.out.printf("보");}
			*/
			