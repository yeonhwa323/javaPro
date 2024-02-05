package days06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 조연화
 * @date 2024. 1. 8. 오후 4:01:08
 * @subject 
 * @content	
 */
public class Ex06_02 {

	public static void main(String[] args) {
		
		String name;
		Scanner scanner = new Scanner(System.in); 
		name = scanner.nextLine(); // cho yeon hwa
		System.out.printf("name : %s\n", name);
		
		// String.toCharArray()
		// String -> char [] 변환하는 함수(메서드)
		char [] nameCharArray = name.toCharArray();
		
		// 배열 안의 값을 확인하는 용도로 Arrays.toString() 메서드를 사용.
		// [c, h, o,  , y, e, o, n,  , h, w, a]
		System.out.println( Arrays.toString( nameCharArray ));
		
		// 2) char -> String 변환하는 방법 : String.valueOf() 메서드
		name = String.valueOf(nameCharArray);
		System.out.printf("name: %s\n", name);
		
	}// main

}// class
