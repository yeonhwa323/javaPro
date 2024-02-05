package days08;

import java.util.Arrays;

/**
 * @author 조연화
 * @date 2024. 1. 10. 오전 10:35:28
 * @subject [swap 함수 오류처리하는 방법]
 * @content	
 */
public class Ex02_02 {

	public static void main(String[] args) {
		// 배열 초기화
		int [] m = {10, 20};
		
		System.out.println( Arrays. toString(m) );	
		// X swap(x,y);		// Call By Value
		swap(m);	// Call By Reference
		System.out.println( Arrays. toString(m) );	

	} // main
	
	private static void swap(int[] m) {
		int temp = m[0];
		m[0] = m[1];
		m[1] = temp;
		
	} // swap
	

}// class
