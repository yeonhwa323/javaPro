package days11;

import java.util.Arrays;
import java.util.Random;

/**
 * @author 조연화
 * @date 2024. 1. 15. 오전 11:24:27
 * @subject 
 * @content	
 */
public class Ex04 {

	public static void main(String[] args) {

		int [] m = new int[10];
		for (int i = 0; i < m.length; i++) {
			m[i] = i+1;
		}
		System.out.println( "m[]:"+Arrays.toString(m));

		// 배열 섞기...
		// 랜덤 자릿값 2개, 랜덤 여러번 돌리는 코딩하기
		shuffle(m);

		System.out.println("temp[]: "+ Arrays.toString(m));

	}//main

	private static void shuffle(int[] m) {
		int idx1=0, idx2; // 1~9
		
		// [2]
		// idx1 == idx2
		for (int i = 0; i < 10; i++) {
			idx2 = (int) (Math.random()*9)+1;

			int temp = m[idx1];
			m[idx1] = m[idx2];
			m[idx2] = temp;
		}


		/* [1]
		// idx1 == idx2
		for (int i = 0; i < m.length; i++) {
		idx1 = (int) (Math.random()*m.length);	
		idx2 = (int) (Math.random()*m.length);

		int temp = m[idx1];
		m[idx1] = m[idx2];
		m[idx2] = temp;
		}
		 */
	}

}//class
