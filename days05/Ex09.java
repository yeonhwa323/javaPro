package days05;

/**
 * @author 조연화
 * @date 2024. 1. 5. 오후 4:39:11
 * @subject if, switch, for, while, do~while
 * @content	break, foreach
 * 			[ continue 문 ]
 */
public class Ex09 {

	public static void main(String[] args) {

		// 1~10=55 출력하는 코딩
		/*
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
			System.out.printf("%d+", i);
		}
		System.out.printf("=%d\n", sum);
		 */

		//[홀수의 합 출력]
		// 1+3+5+7+9=25
		/*
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			if(i%2!=0) {
			sum += i;
			System.out.printf("%d+", i);
			}
		}

		System.out.printf("=%d\n", sum);
		 */

		//[2]
		/*
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if ( i%2==0 ) continue;
			sum += i;
			System.out.printf("%d+", i);
		} // for
		System.out.printf("=%d\n", sum);
		*/
		
		//[3]
		int sum = 0;
		for (int i = 1; i <= 10; i+=2) {
			sum += i;
			System.out.printf("%d+", i);
		} // for
		System.out.printf("=%d\n", sum);

	} // main

} // class
