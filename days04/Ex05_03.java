package days04;

import java.util.Scanner;

/**
 * @author 조연화
 * @date 2024. 1. 4.오후 2:21:47
 * @subject	정수(n)를 입력받아서
 * @content	입력받은 수가 짝수(even number)이면 짝수, 홀수(odd number)이면 홀수로 출력
 * 			if(짝수) {
 * 			} else { // 짝수가 아닐경우
 * 			}
 */
public class Ex05_03 {

	public static void main(String[] args) {
		int n;
		try(Scanner scanner = new Scanner(System.in);) {
			System.out.print("> 정수 입력 ? ");
			n = scanner.nextInt();
			
			if( n % 2 == 0) {
				System.out.println("짝수(even number)");	
			} else { // 홀수인 경우
				System.out.println("홀수(odd number)");	
			} // if
		} catch (Exception e) {
		} // try
		

	} // main

} // class
