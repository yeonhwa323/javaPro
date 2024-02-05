package days04;

import java.util.Scanner;

/**
 * @author 조연화
 * @date 2024. 1. 4.오후 2:21:47
 * @subject	정수(n)를 입력받아서
 * @content	입력받은 수가 짝수(even number)이면 짝수, 홀수(odd number)이면 홀수로 출력
 */
public class Ex05_04 {

	public static void main(String[] args) {
		int n;
		try(Scanner scanner = new Scanner(System.in);) {
			System.out.print("> 정수 입력 ? ");
			n = scanner.nextInt(); // 3
			String result = "홀수";
			
			 if( n % 2 == 0) {
			 result = "짝수";
			} // result = n % 2 == 0 ? "짝수" : "홀수"; //(와 if문은 같은 성능을 가짐)
			
			 System.out.println(result);
			 
		} catch (Exception e) {
		} //try
		

	} // main

} // class
