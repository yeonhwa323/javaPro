package days04;

import java.util.Scanner;

/**
 * @author 조연화
 * @date 2024. 1. 4.오후 3:09:45
 * @subject	조건문 if, if~else 활용
 * @content	국어 점수를 입력받아서
 * 			등급(수, 우, 미, 양, 가) 출력
 * 
 * 			90	이상 100	미만 : 수
 *			kor >= 90 && kor <= 100
 * 			80	이상 90	미만 : 우	
 * 			kor >= 80 && kor <= 90
 * 			70	이상 80	미만 : 미
 * 			kor >= 70 && kor <= 80
 * 			60	이상 70	미만 : 양
 * 			kor >= 60 && kor <= 70
 * 			0	이상 60	미만 : 가
 * 			kor>=0 && kor < 60
 */
public class Ex05_05 {

	public static void main(String[] args) {
		
		int kor;
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.print("> 국어 점수 입력 ?");
			kor = scanner.nextInt();
			if (kor >= 90 && kor <= 100) {
				System.out.println("수");
			}
			if (kor >= 80 && kor < 90) {
				System.out.println("우");
			}
			if (kor >= 70 && kor < 80) {
				System.out.println("미");
			}
			if (kor >= 60 && kor < 70) {
				System.out.println("양");
			}
			if (kor>=0 && kor < 60) {
				System.out.println("가");
			}
		} catch (Exception e) {
		} // try
		
		
		
		/*
		byte kor;
		String grade;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 국어 점수 입력 ?");
		kor = scanner.nextByte();
		System.out.printf("%d\n", kor );
		if() {
			kor >= 90 && kor <= 100
		}
		*/

	}

}
