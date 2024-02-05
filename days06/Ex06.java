package days06;

import java.util.Scanner;

/**
 * @author 조연화
 * @date 2024. 1. 8. 오후 4:01:08
 * @subject 
 * @content	
 */
public class Ex06 {

	public static void main(String[] args) {
		//6. 본인의 영어이름을 입력받아서 
		//char [] 로 변환후 
		//foreach문을 사용해서 출력하는 코딩을 하세요.
		
		String name;
		Scanner scanner = new Scanner(System.in); 
		// name = scanner.next();
		name = scanner.nextLine(); // cho yeon hwa
		System.out.printf("name : %s\n", name);
		int arrayLength =  name.length();
		
		char [] nameCharArray = new char[arrayLength];
		for (int i = 0; i < nameCharArray.length; i++) {
			nameCharArray[i] = name.charAt(i);
		} // 
		
		//nameCharArray 출력
		for (char c : nameCharArray) {
			System.out.printf("'%c'\n", c);
		}
		
	}// main

}// class
