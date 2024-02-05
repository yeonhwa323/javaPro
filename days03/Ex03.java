package days03;

import java.util.Scanner; // ctrl+shift+ o - 자동 import 처리

/**
 * @author 조연화
 * @2024. 1. 3. 오전 11:44:27
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {

		String input = "1 fish 2 fish red fish blue fish";
		// \\s*fish\\s* 구분자
		// \s == space == 공백의미
		// * == 반복횟수  0~여러개
		Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*"); 
		//.useDelimiter("\\s*fish\\s*"); -> 정규표현식
		System.out.println(s.nextInt()); // 1
		System.out.println(s.next());
		System.out.println(s.nextInt()); 
		System.out.println(s.next());
		
		System.out.println(s.next());
		System.out.println(s.next());
		System.out.println(s.next());
		System.out.println(s.next());
		s.close();
	} // main

} // class
