package days05;

/**
 * @author 조연화
 * @date 2024. 1. 5. 오후 2:42:48
 * @subject if, switch, for, break
 * @content	[ while 조건반복문 ]
 */
public class Ex07 {

	public static void main(String[] args) {
		/*
		if (condition) {
			// 명령코딩;
		}
		while (condition) { // 조건이 참일 동안 반복적으로 수행 -> 조건반복문
			// 명령코딩;
		}
		 */

		//while 문 예제
		// 예) 1~10 = 55
		//[5]
		int i = 10, sum = 0;
		while ( true ) { // 무한루프
			if(i < 1) break;
			sum += i;
			System.out.printf("%d+", i);
			i--;
		} // while
		// Unreachable code
		System.out.printf("=%d\n", sum);
		
		//[4]
		/*
		int i = 10, sum = 0;
		while (i >= 1 ) { // 1 <= 10 참
			sum += i;
			System.out.printf("%d+", i);
			i--;
		} // while
		System.out.printf("=%d\n", sum);
		*/

		//[3]
		/*
		int i = 0, sum = 0;
		//while ( i++ <= 10 ) {
		while ( ++i <= 10 ) {
			System.out.printf("%d+", i); 
			sum += i;   

		} // while
		System.out.printf("=%d\n", sum);
		 */

		//[2]
		/*
		int i = 0, sum = 0;
		while ( i < 10 ) {  //0 1 2 3 4 5 6 7 8 9
			i++;  
			System.out.printf("%d+", i); // 1+2+3+4+5+6+7+8+9+10+=
			sum += i;  

		} // while
		System.out.printf("=%d\n", sum);
		 */


		//[1]
		/*
		int i = 1, sum = 0;
		while (i <= 10 ) { // 1 <= 10 참
			sum += i;
			System.out.printf("%d+", i);
			i++;
		} // while
		System.out.printf("=%d\n", sum);
		 */

	} // main

} // class
