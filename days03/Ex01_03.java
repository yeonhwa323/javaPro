package days03;

import java.util.Scanner;

/*
 * @author 조연화
 * @2024. 1. 3. 오후 12:08:27
 * @subject 
 * @content
 */

public class Ex01_03 { 

	public static void main(String[] args) {
		
		// ctrl + shift + o 자동으로 import 구문 처리
		// shift + alt 내려쓰기 / ctrl + tap 들여쓰기

		String name;
		byte kor, eng, mat;
		short tot; // 0~300
		double avg;

		Scanner scanner = new Scanner(System.in);
		
		// Scanner 구분자를 콤마(,) 사용하고 싶을 경우 (검색) 홍길동,90,78,38
		// nextXXXX() 메서드 사용 
		System.out.print("> 이름_국어_영어_수학 입력 ? "); // _ '공백'의미
		name = scanner.next(); // scanner.nextLine();
		kor = scanner.nextByte();
		eng = scanner.nextByte();;
		mat = scanner.nextByte();;

		
		// 강제형변환 1번째 경우
		tot = (short) (kor + eng + mat); // + 덧셈연산자 -> 그냥 암기 // int 보다 작은 자료형은 연산할 때 CPU가 int로 처리해서 연산
		//		강제		최우선 연산자	
		avg = (double) tot / 3D; // .00 -> double // 3.0, 3., 3d 사용가능

		// 홍길동님은 국: 89 영: 78 수: 56
		// 74.33333333
		System.out.printf(
				"%s님은 국:%d 영:%d 수:%d 총점:%d 평균:%.2f 이다."
				, name, kor, eng, mat, tot, avg);


	} // main

} // class
