package days11;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author 조연화
 * @date 2024. 1. 15. 오전 10:31:39
 * @subject 
 * @content	
 */
public class Ex03_02 {

	public static void main(String[] args) {

		int [] m =  {3,5,2,4,1};
		int foundIndex =  indexOf( m, 4 );

		int [] temp = new int [m.length +5];
		/*
		 for (int i = 0; i < m.length; i++) {
			if (i < foundIndex ) temp[i] = m[i]; 				
			if else (i >= foundIndex ) temp[i+1] = m[i];
		 	}
		 temp[foundIndex] = 100;
		 */
		System.arraycopy(m, 0, temp, 0, foundIndex);
		System.arraycopy(m, foundIndex, temp, foundIndex+1, m.length - foundIndex);
		temp[foundIndex] = 100;

		System.out.println(Arrays.toString(temp));
		// [3, 5, 2, 0, 4, 1, 0, 0, 0, 0]

	}//main

	// 순차 검색( Sequence Search )
		private static int indexOf(int[] m, int n) {
			
			for (int i = 0; i < m.length; i++) {
				if( m[i] == n ) return i;
			} // 찾는 숫자가 맞는지 물어보는 if문
		
			return -1 ; //찾는 정수가 없다는 의미 		
	}

}//class
