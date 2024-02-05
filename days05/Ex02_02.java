package days05;

import java.util.Scanner;

/**
 * @author 조연화
 * @date 2024. 1. 5. 오전 11:11:12
 * @subject 
 * @content
 */
public class Ex02_02 {
	public static void main(String[] args) {

		int kor;
		char grade = '가';

		try(Scanner scanner = new Scanner(System.in)) {
			System.out.print("> 국어 점수 입력 ? ");
			kor = scanner.nextInt(); 

			int result = ( kor >= 0 && kor <= 100) ? 1 : 0;

					switch (result) {
					case 1: 
						switch (kor / 10) { 
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
						default:
							System.out.println("가");
							break;

						}// switch
						break;

					case 0:
						System.out.println("0~100 입력잘못");
						break;
					default:
						break;
					}
			


		} catch (Exception e) {
			System.out.println("국어 점수(0~100). 입력잘못(숫자X)!!!");
		} // try

	}//main

}//class
