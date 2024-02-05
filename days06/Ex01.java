package days06;

import java.util.Scanner;

/**
 * @author 조연화
 * @date 2024. 1. 8. 오전 9:02:01
 * @subject 
 * @content
 */
public class Ex01 {

	public static void main(String[] args) {
		// 1. 세 정수 a, b, c 를 입력받아서 가장 큰수, 가장 작은수를 찾아서 출력하세요. 

		int a, b, c;

		try (Scanner scanner = new Scanner(System.in)){
			System.out.printf("> 정수 a_b_c 를 입력하세요 ?");
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();
			
			int max = a>b ? a>c ?a:c : b >  c? b: c ; 
			int min = a < b ? a<c?c:a : b < c ? b : c;
			
			System.out.printf("가장 큰값: %d, 가장 작은값: %d", max, min);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		




	}//main

}//class








