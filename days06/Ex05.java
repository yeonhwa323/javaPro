package days06;

import java.util.Scanner;

/**
 * @author 조연화
 * @date 2024. 1. 8. 오후 3:39:05
 * @subject 
 * @content	
 */
public class Ex05 {

	public static void main(String[] args) {
		// 5. 두 정수(x, y)를 입력받아서 두 정수 사이의 짝수의 합을 출력하는 코딩을 하세요.

		int x, y, sum = 0;
		Scanner scanner = new Scanner(System.in); 
		x = scanner.nextInt();
		y = scanner.nextInt();

		int min = Math.min(x, y);
		int max = Math.max(x, y);

		/*[1]
		for (int i = min; i <= max; i++) {
			if ( i % 2 == 0) {
				System.out.printf("%d+", i);
			}//if
		}//for
		 */

		//[2]
		if( min % 2 != 0 ) min++;		
		for (int i = min; i <= max; i+=2) {
			sum += i;
			System.out.printf("%d+", i);
		}//for
		System.out.printf("=%d\n", sum);


	} // main

} // class
