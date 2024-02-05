package days10;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author 조연화
 * @date 2024. 1. 12. 오후 4:16:55
 * @subject 
 * @content	
 */
public class Ex04_02 {

	public static void main(String[] args) {
		// (테스트) 배열의 가득 차면 배열 크기를 늘려서 추가.
		int [] m = new int[3];
		int index = 0;

		m[index++] = 1;
		m[index++] = 2;
		m[index++] = 3;
		
		// Index == 3 	ArrayIndexOutOfBoundsException
		if ( m.length == index ) { // 배열 크기가 다 찼음을 의미
			int [] temp = new int [m.length + 3];
			
			for (int i = 0; i < m.length; i++) {
				temp[i] = m[i]; // m 배열값을 temp배열로 가져옴
			}
			m = temp;	// temp 주소값을 m 주소값에 할당함.
			
		}//if
		m[index++] = 4;
		System.out.println( Arrays.toString( m ));
		
		
	}// main

}// class
