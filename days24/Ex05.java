package days24;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 조연화
 * @date 2024. 2. 1. 오후 12:29:18
 * @subject 
 * @content 
 */
public class Ex05 {

	public static void main(String[] args) {
		/*
		 * [익명(==무명, Anonymous) 클래스] -> 이벤트처리할때 많이 사용함
		 * 1. 이름이 없는 클래스	/ (일회용으로 사용할 클래스)
		 * 2. 선언 형식
		 * 	
		 * 	부모클래스타입 자료형 -> 객체 = new 부모클래스타입(); X
		 * 	
		 * 	new 부모클래스타입(매개변수...){
		 * 		@override 부모의 메서드를 재정의함수 구현
		 * 		@override 부모의 메서드를 재정의함수 구현
		 * 					:
		 * 	}
		 *  
		 * 	new 부모인터페이스타입(매개변수...){
		 * 		@override 부모의 메서드를 재정의함수 구현
		 * 					:
		 * 	}
		 * 3. 자식 클래스가 재사용하지 않을 때, 오로지 해당
		 * 		필드의 초기값으로만 사용할 경우에 익명 클래스를 사용한다.
		 * */
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		//Collections.sort(list, 정렬기준객체);

	}// main

}// class
