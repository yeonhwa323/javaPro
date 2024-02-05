package days04;

import java.util.Scanner;

/**
 * @author 조연화
 * @date 2024. 1. 4.오후 5:23:02
 * @subject	
 * @content	
 */
public class Ex07_02 {

	public static void main(String[] args) {
		int kor;
		char grade = '가';

		try(Scanner scanner = new Scanner(System.in)) {
			System.out.print("> 국어 점수 입력 ? ");
			kor = scanner.nextInt(); 

			// switch문 사용해서 풀기
			// 90, 91, 92, ~ 99/ 10으로 나누면 값 9
			// 80, 81, 82, ~ 89/ 10으로 나누면 값 8

			// Cannot switch on a value of type boolean. Only convertible int values, strings or enum variables are permitted
			switch (kor / 10) { // case 100 다루는 것도 가능
			case 10 :
				System.out.println("수");
				break;
			case 9 :
				System.out.println("수");
				break;
			case 8 :
				System.out.println("우");
				break;
			case 7 :
				System.out.println("미");
				break;
			case 6 :
				System.out.println("양");
				break;
			case 5 :
				System.out.println("가");
				break;
			case 4 :
				System.out.println("가");
				break;
			case 3 :
				System.out.println("가");
				break;
			case 2 :
				System.out.println("가");
				break;
			case 1 :
				System.out.println("가");
				break;	
			case 0 :
				System.out.println("가");
				break;

			default:
				System.out.println("입력 잘못!!!");
				break;
			}// switch


		} catch (Exception e) {
			System.out.println("국어 점수(0~100). 입력잘못(숫자X)!!!");
		} // try

	} // main

} // class
