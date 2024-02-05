package days05;

import java.util.Iterator;

/**
 * @author 조연화
 * @date 2024. 1. 5. 오후 4:26:13
 * @subject if, switch, for, while, do~while
 * @content	break
 * 
 * 			[foreach문 == 확장for문]
 */
public class Ex08 {
	public static void main(String[] args) {
		
		int [] m = new int[10];
		
		// m 배열의 각 요소에 0~100 사이의
		// 임의의 정수를 채워넣자.
		 //0 <= (int) ( Math.random() * 101 ) < 101
		for (int i = 0; i < m.length; i++) {
			m[i] = (int) ( Math.random() * 101 );
			System.out.printf("[%d]\n", m[i]);
		}//for
		
		/*
		for (자료형 변수명 : 배열 또는 컬렉션(반복자)) {
			
		}
		*/
		int sum = 0;
		for (int n : m) {
			System.out.println( n );
			sum += n;
		} // sum
		
		
		// m 배열을 출력하는 코딩.
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d]=%d\n", i, m[i]);
		}//for
		
	}// main

}// class
