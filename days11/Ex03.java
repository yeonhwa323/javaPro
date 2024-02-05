package days11;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author 조연화
 * @date 2024. 1. 15. 오전 10:31:39
 * @subject 
 * @content	
 */
public class Ex03 {

	public static void main(String[] args) {
		// 순차 검색( Sequence Search )
		 int [] m =  {3,5,2,4,1};
		 int foundIndex =  indexOf( m, 4 );// 4 의 위치파악하기 위해 저장 ( 찾고자하는 배열, 찾고자하는 index )
		 // System.out.println( foundIndex ); // 4의 위치파악 완료
		 
		 int [] temp = new int [m.length +5];
		 // Arrays.copyOfRange(null, foundIndex, foundIndex);
		 //System.arraycopy(m, 1, temp,2, 3);
		 /* // [3, 5, 2, 0, 4, 1, 0, 0, 0, 0] 내가 미룰려고 한 코딩
		 System.arraycopy(m, 0, temp, 0, 3);
		 System.arraycopy(m, 3, temp, 4, 2);		 
		 */
		 
		 System.arraycopy(m,0,temp, 0, m.length );
			System.out.println(  Arrays.toString(temp));
			// [3, 5, 2, 4, 1, 0, 0, 0, 0, 0]
			// [3, 5, 2, 0, 4, 1, 0, 0, 0, 0]
			/*
			for (int i = foundIndex; i < m.length; i++) {
				temp[i+1] = temp[i];
			}
			*/
			for (int i = m.length-1; i >= foundIndex; i--) {
				temp[i+1] = temp[i];
			}
			temp[foundIndex] = 100;
			System.out.println(  Arrays.toString(temp));
			
			// 100 삭제
			for (int i = 4; i < m.length+1; i++) {
				temp[i-1] = temp[i];
			}
			// temp[foundIndex] = 100;
			temp[5] = 0;
			System.out.println(  Arrays.toString(temp));

	}//main

	// 순차 검색( Sequence Search )
	private static int indexOf(int[] m, int n) {
		
		for (int i = 0; i < m.length; i++) {
			if( m[i] == n ) return i;
		} // 찾는 숫자가 맞는지 물어보는 if문
			
			
		return -1 ; //찾는 정수가 없다는 의미
	}

}//class
