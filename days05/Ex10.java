package days05;

import java.util.Scanner;

/**
 * @author 조연화
 * @date 2024. 1. 5. 오후 4:52:03
 * @subject 
 * @content	
 */
public class Ex10 {

	public static void main(String[] args) {

		// 1+2+3+4+5+6+7+8+9+10+...+N = 합
		/*
	 	int n;

		Scanner scanner = new Scanner(System.in);
		System.out.printf("> n 입력 ? ");
		n = scanner.nextInt();

		int sum = 0;
		for (int i = 1; i <= 10 ; i++) {
			System.out.printf("%d+", i);
			sum += i;
		}
		 System.out.printf("=%d\n", sum);
		 */

		// [문제] 두 정수 n, m 입력받아서
		// 		두 정수 사이의 합을 출력하는 코딩.
		/*
		int n, m ;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> n_m 입력 ? ");
		n = scanner.nextInt();
		m = scanner.nextInt();

		int sum = 0;
		// [3]
		int min = n > m ? m : n;
		int max = n > m ? m : n;


		for (int i = min; i <= max ; i++) {
			System.out.printf("%d+", i);
			sum += i;
		}
		 System.out.printf("=%d\n", sum);
		 */


		// [문제]
		// 두 정수 n, m을 입력받아서
		// 두 정수의 홀수의 합 출력

		int n, m ;
		Scanner scanner = new Scanner(System.in);
		System.out.printf("> n_m을 입력 ? ");
		n = scanner.nextInt();
		m = scanner.nextInt();

		int sum = 0;

		for ( n = 1 ; n %2 != 0 ; n+=2) {
			
			if ( n % 2 != 0 && m % 2 != 0) {
				System.out.printf(("%d"+ "%d"), n, m);
			} else { 
				System.out.printf("다시 입력하세요.");
			}
			
			System.out.printf("%d+", n);
			sum += n;
		}
		System.out.printf("=%d\n", n, m);




		//[2]
		/*
		if (n < m) {
			int temp = n;
			n = m ;
			for (int i = m; i <= n; i++) {
				sum += i;
				System.out.printf("%d+", i);
			} // for
			System.out.printf("=%d\n", sum);
		}
		 */



		/*[1]
	      if (n < m) {
	      for (int i = m; i <= n; i++) {
	         sum += i;
	         System.out.printf("%d+", i);
	      } // for
	      System.out.printf("=%d\n", sum);
	      }
		 */


	} // main

} // class

/*
String users;
switch (user) {
case 1:
   users = "가위";
   break;
case 2:
   users = "바위";
   break;
case 3:
   users = "보";
   break;
} // switch
 */

/* JDK 14~ <위의 식과 100%같은 식>
int com = 1;
String coms = switch (com) {
   case 1 -> "가위";
   case 2 -> "바위";
   case 3 -> "보";       
   default -> null;
}; // switch
System.out.println(coms);
 */



