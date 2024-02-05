package days04;

/**
 * @author 조연화
 * @date 2024. 1. 4.오후 4:02:11
 * @subject	for문 사용해서 1~N(10) 까지의 합 출력.
 * @content	
 */

public class Ex06_02 {
	// [3]
	public static void main(String[] args) {
		// 1+2+3+4+5+6+7+8+9+10+
		int sum = 0;
		for (int i = 1; i <= 10; i++) {  
			System.out.printf( "%d+", i); 
			sum += i; //sum = sum + i;
		} // for
		System.out.printf("\b=%d\n", sum); 
	} // main

	// [2]
	/*
	public static void main(String[] args) {
		// 1+2+3+4+5+6+7+8+9+10+=55
		int sum = 0;
		for (int i = 1; i <= 10; i++) {  
			System.out.printf( i==10 ?"%d":"%d+", i); 
			sum += i; //sum = sum + i;
		} // for
		System.out.printf("=%d\n", sum);


	} // main
	 */

	/*// [1]
	public static void main(String[] args) {
		// 1+2+3+4+5+6+7+8+9+10+=55
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i == 10) {
				System.out.printf("%d", i);
			} else {
				System.out.printf("%d+", i);
			} // if
			sum += i; //sum = sum + i;
		} // for
		System.out.printf("=%d\n", sum);


	} // main
	 */

} // class


