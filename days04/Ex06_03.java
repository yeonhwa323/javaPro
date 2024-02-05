package days04;

/**
 * @author 조연화
 * @date 2024. 1. 4.오후 4:23:27
 * @subject	
 * @content	
 */
public class Ex06_03 {

	public static void main(String[] args) {
		// 1~10 합 구하기
		int sum = 0;
		int i = 1;
		for (  ;  ; ) {
			if ( i > 10 ) break;
			sum += i;
			// System.out.printf("%d+", ++i);
			System.out.printf("%d+", i++);
			// i++;
			// ++i;
		}
		// Unreachable code
		System.out.printf("=%d\n", sum);
	} // main

} // class
