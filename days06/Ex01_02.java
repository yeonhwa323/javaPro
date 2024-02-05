package days06;

/**
 * @author 조연화
 * @date 2024. 1. 8. 오전 10:20:34
 * @subject 
 * @content
 */
public class Ex01_02 {

	public static void main(String[] args) {
		// 문자, 숫자, 알파벳(대,소), 특수문자 구분
		char one = '8';
		// '0' <= one && '9' >= one
		one = '한';
		System.out.println(Character.isDigit( one ));
		if (Character.isDigit( one )) {
			System.out.println("숫자O");
		}else {
			System.out.println("숫자X");
		}
		
		/*
		one = 'A';
		
		System.out.println(Character.isAlphabetic(one));
		
		if (Character.isAlphabetic(one)) {
			System.out.println("알파벳 O");			
		} else {
			System.out.println("알파벳 X");
		}
		*/
		
		
	} // main

} // class
