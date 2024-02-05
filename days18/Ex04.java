package days18;

/**
 * @author 조연화
 * @date 2024. 1. 24. 오후 12:16:17
 * @subject [ 문자열 다루는 클래스 ]
 * @content 1. String *** 변경 불가능한 클래스
 * 			2. StringBuffer
 * 			3. StringBuilder
 * 			4. StringTokenizer
 */
public class Ex04 {

	public static void main(String[] args) {

		String name = "홍길동";		//-> 문자열값이 아닌 주소값을 가진다.
		name += "님";
		name += "안녕";				//-> 진짜 비효율적인 코딩

		// name = "이창익";			//-> 새로운 주소값 참조 부여

		// [S]tring 타입(자료형) - 클래스, 참조타입
		//String name = new String("홍길동");
		//name = new String("이창익");
		
		// [String Method 이해, 암기]
		// 1. char CharAt(int index) - ***함수는 기능,매개변수,리턴값 알아둬야함
		// 2. int length()
		/*
		int len = name.length();
		for (int i = 0; i < len ; i++) {
			System.out.printf("name[%d]=%c\n", i, name.charAt(i));
		}
		*/
		// 3. substring()	[90][01][12]-1700001
		// name 문자열 속에서 "안녕"이라는 문자열이 있는지 여부 확인 후
		// 에	안녕을 "Hi" 문자열로 변경하자.
		// name = "이창익님 안녕!!!";
		boolean isExist = name.contains("안녕");
		if (isExist) {
			System.out.println("안녕은 문자열 속에 있다.");
		} else {
			System.out.println("안녕은 문자열 속에 없다.");
		}
		
		int foundIndex = -1;
		if ((foundIndex = name.indexOf("안녕") ) == -1) {
			System.out.println("안녕은 문자열 속에 없다.");
		} else {
			System.out.printf("안녕은 %d 위치에 있다.", foundIndex );
			
			String s = name.substring(0, foundIndex);
			//			"이창익님_";
			System.out.println( 
					s.concat("Hi") // "이창익님_Hi"
					.concat(
							name.substring(foundIndex+ "안녕".length())
							)
					);
		
			// Strng.replace();
			System.out.println( name.replaceAll("안녕", "Hi") );
		}
		
	}// main

}// class







