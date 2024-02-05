package days11;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

/**
 * @author 조연화
 * @date 2024. 1. 15. 오후 2:02:54
 * @subject 배열에서 가장 큰 값(max) 이 있는 인덱스값을 배열에 저장 후 출력
 * @content	
 */
public class Ex07 {

	public static void main(String[] args) {
		
		int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 73, 37 };
		
		// max 가장 큰 값을 찾아서 그 위치(index) 를 배열에 담아서 출력
		// int [] maxIndexArray = {1, 7, 15};
		
		int [] maxIndexArray ;
		
		// 1) max
		/*
		int max = m[0];
		for (int i = 0; i < m.length; i++) {
			if( max < m[i] ) max = m[i];
		}
		*/
		int max = IntStream.of(m).max().getAsInt();
		System.out.println(max);
		// 2) max 갯수 -> maxIndexArray 배열의 크기
		
		/* max 값이 몇개인지 counting 하기위한 코딩.[1]
		int maxCount = 0;
		for (int i = 0; i < m.length; i++) {
			if( max == m[i] ) maxCount++;
		}
		*/
		// max 값이 몇개인지 counting 하기위한 코딩. [2]
		int maxCount = (int)IntStream.of(m).filter( i -> i==max).count();
		
		System.out.println( maxCount ); // 92 -> 3개
		
		// 3) max의 index를 maxIndexArray 배열에 저장
		 maxIndexArray = new int [3];
		 
		for (int i = 0, idx = 0; i < m.length; i++) {
			if( max == m[i] ) maxIndexArray[idx++] = i;
		}
		
		// 4) 배열 출력.
		System.out.println(Arrays.toString(maxIndexArray));
		
		
		
		
	}//main

}//class
