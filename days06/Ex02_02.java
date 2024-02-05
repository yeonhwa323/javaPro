package days06;

import java.util.Arrays;
import java.util.Random;

/**
 * @author 조연화
 * @date 2024. 1. 8. 오후 12:02:22
 * @subject 
 * @content	
 */
public class Ex02_02 {

	public static void main(String[] args) {
		// 2. [암기]
		// 정수를 10개 저장할 배열 m 을 선언하고 
		// 5<= n && n <= 15 범위의 임의의 정수로 채워넣은 후 
		// 배열의 각 요소를 출력하는 코딩을 하세요.
		
		// [람다식과 스트림] 설명
		/*
		// (int) ( Math.random( ) * 11) +5; == new Random().ints(5, 16) 
		// 5<= int <16
		int [] m = new Random().ints(5, 16).limit(10).toArray();
		// [6, 12, 6, 15, 14, 13, 7, 11, 5]
		System.out.println( Arrays.toString(m) );
		*/
		
		int max = new Random().ints(5, 16).limit(10).max().getAsInt();
		System.out.println( max );
		
	}// main

}// class
