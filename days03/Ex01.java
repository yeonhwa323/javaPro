package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 조연화
 * @2024. 1. 3. 오전 10:02:36
 * @subject
 * @content
 */

public class Ex01 { 

	public static void main(String[] args) throws IOException {
		
		String name;
		byte kor, eng, mat;
		short tot; // 0~300
		double avg;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//
		System.out.print("1. 이름 입력 ? ");
		name = br.readLine();

		System.out.print("2. 국어 입력 ? ");
		kor = Byte.parseByte(br.readLine());

		System.out.print("3. 영어 입력 ? ");
		eng = Byte.parseByte(br.readLine());

		System.out.print("4. 수학 입력 ? ");
		mat = Byte.parseByte(br.readLine());

		// 총점, 평균 계산 코딩 추가.
		// Type mismatch: cannot convert from int to short
		// 형변환 설명 X
		
		// 강제형변환 1번째 경우
		tot = (short) (kor + eng + mat); // + 덧셈연산자 -> 그냥 암기 // int 보다 작은 자료형은 연산할 때 CPU가 int로 처리해서 연산
		//		강제		최우선 연산자	
		avg = (double) tot / 3D; // .00 -> double 또는 // 3.0, 3., 3d 사용가능

		// 홍길동님은 국: 89 영: 78 수: 56
		// 74.33333333
		System.out.printf(
				"%s님은 국:%d 영:%d 수:%d 총점:%d 평균:%.2f 이다."
				, name, kor, eng, mat, tot, avg);


	} // main

} // class
