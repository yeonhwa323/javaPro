package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yeonhwa
 * @date 2024. 1. 2. - 오후 2:01:49
 * @subject  
 * @content 키보드로부터 나이를 입력받아서
 * 					 입력받은 나이를 출력....
 */
public class Ex06_02 {

	public static void main(String[] args) throws IOException {
		
		/* [ 본인 코딩 블럭 주석 처리.]
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// new = 연산자

		System.out.print("> 나이 입력 ?");
		// Type mismatch: cannot convert from String to byte
		byte age;

		// Unhandled exception type IOException
		age = br.readLine(); // 키보드로 입력할 경우 값이 나온다.

		System.out.printf("> 나이 : %d\n", age);
		 */
		
		// 1. 나이를 저장할 변수 선언	-128~127
		// String age; 
		byte age;
		// 2. br 객체 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("> 나이 입력 ?");
		// Type mismatch: cannot convert from String to byte
		// String => byte
		/*
		String strAge = br.readLine(); // "23"
		age = Byte.parseByte( strAge );
		*/
		
		age = Byte.parseByte(br.readLine());
		// 문자열 "23" -> 숫자(정수) byte  형 변환
		// String %s
		// char
		
		System.out.printf("> 나이 : %d \n", age);
		
		
	} // main

} // class
