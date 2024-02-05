package days07;

import java.util.stream.IntStream;

/**
 * @author 조연화
 * @date 2024. 1. 9. 오후 5:14:13
 * @subject 
 * @content	
 */
public class Ex10_03 {

	public static void main(String[] args) {
	
		System.out.printf("%c %.2f %s %b\n"
				, 'a', 3.14, "홍길동", true);
		
		// [가변 인자]
		int result = 0;		
		result = sum(1,2);
		System.out.println(result);
		
		result = sum(1,2,3,4,5);
		System.out.println(result);
		
		int [] m = {5,6,7,8,9};
		result = sum( m );
		System.out.println(result);

	}// main

	public static int sum(int... args ) {
		// 람다식
		return  IntStream.of(args).sum();
	}
	
} // class
