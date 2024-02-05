package days19;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * @author 조연화
 * @date 2024. 1. 25. 오전 10:29:10
 * @subject 
 * @content 
 */
public class Ex01_02 {

	public static void main(String[] args) {
		// 조연화, 한재호, 류영은, 이동영
		int [] m = {3,5,4,2,1};	// Integer [] 변경해야 Collections.reverseOrder() 사용가능
		System.out.println( Arrays.toString(m));
		// Bubble Sort, Selection Sort
		/*
		Arrays.sort(m); // 오름차순 정렬(자동)
		
		// 내림차순 정렬
		int [] temp = new int[m.length];
		for (int i = 0; i < temp.length; i++) {
			temp[ m.length-1-i ] = m[i];
		}
		*/
		
		// The method sort(int[]) in the type Arrays is not applicable for the arguments
		// 왜?		T[] -> 기본형 사용 불가하기 때문
		// Arrays.sort(m, Collections.reverseOrder());
		
		// int[] => Integer [] 변환
		// 		 <=		IntStream -> Stream<Integer> => Integer []
		//			  			  <-				 <=	
		// boxing, unboxing
		Integer[] temp = Arrays.stream(m).boxed().toArray(Integer[]::new);
		Arrays.sort(temp, Collections.reverseOrder());
		
		// Integer [] => int [] 변환
		//	Stream<Integer>	IntStream
		Stream.of(temp).mapToInt(Integer::intValue); //->마저써야됨
		System.out.println( Arrays.toString(m));
		
	}

}
