package days01;


/**
 * @author yeonhwa
 * @date 2023. 12. 29. - 오후 4:05:10
 * @subject  
 * @content  이름, 나이를 저장할 변수를 선언하고
 * 					출력하는 코딩.
 */
public class Ex04 {
	
	public static void main(String[] args) {
		// 1. 이름을 저장할 변수 선언
		String name = "윤형준";
		// 2. 나이를 저장할 변수 선언		"28"	, 	28 // 정수: int 사용
		int age = 26;
		
		// 복사 : Ctrl + Alt + 방향키
		// 3. 이름/나이 출력
		// 3-2. 출력형식 : 이름은 "윤형준"이고, 나이는 26살이다.
		// String literal is not properly closed by a double-quote
		System.out.println("이름은 \"" + name 
				+ "\"이고, 나이는 " + age + "살이다.");
		//System.out.println(age);
		
		
	}// main

}// class
