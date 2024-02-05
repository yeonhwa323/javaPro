package days06;

import java.util.Scanner;

/**
 * @author 조연화
 * @date 2024. 1. 8. 오전 9:02:01
 * @subject 
 * @content
 */
public class Ex01_05 {

	public static void main(String[] args) {
		// 1. 세 정수 a, b, c 를 입력받아서 가장 큰수, 가장 작은수를 찾아서 출력하세요. 

		int a, b, c;

		try (Scanner scanner = new Scanner(System.in)){
			
			System.out.printf("> 정수 a_b_c 를 입력하세요 ?");
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();
			
			// [3]
			// Math 클래스 : 산술적 기능이 구현된 클래스
			// 0.0 <= double Math.random() <= 1.0
			
			// max = Max.max(a,b);
			// min = Math.min(a,b);
			
			int max = Math.max(a, b);
			max = Math.max(max, c);
			// max = Math.max( max, d);
			// max = Math.max( max, e);
			
			int min = Math.min( Math.max(a, b), c);
			
			// double Math.pow(3, 2); // 제곱값 구하기
			
		} catch (Exception e) {
			// TODO: handle exception
		
		} // try
		




	}//main

}//class








