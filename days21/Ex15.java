package days21;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author 조연화
 * @date 2024. 1. 29. 오후 4:53:22
 * @subject [ArrayList -> String 변환]
 * @content [ https://minaminaworld.tistory.com/165 ] 참고
 */
public class Ex15 {


	public static void main(String[] args) {
		String my_str =  "abc1Addfggg4556b"	;
		int n =  6;

		String [] answer = solution(my_str, n);

		//  ["abc1Ad", "dfggg4", "556b"]
		System.out.println( Arrays.toString(answer));

	} // main

	public static String[] solution(String my_str, int n) {
		String[] answer = {};

		ArrayList list = new ArrayList();		     
		StringBuilder sb = new StringBuilder(my_str);

		try {
			while(true) {
				list.add( sb.substring(0, n) );		sb.delete(0, n);
			}
		} catch (Exception e) {
			list.add( sb.substring(0) );
		}

		 //System.out.println( list );

		// [문제점] ArrayList -> String [] 변환
		//		   String [] -> ArrayList 변환
		// list.forEach( name -> System.out.println( name ) );
		 
		// [JAVA 8 Stream 사용한 예제]
		// answer = (String[]) list.stream().toArray(String[]::new);

		answer = (String[]) list.toArray(new String[0]);
		
		return answer;
	}

}// class

/*
	public static String[] solution(String my_str, int n) {
	    int answerLength = (int) Math.ceil( (double)my_str.length() / n ); 

	     String[] answer = new String[answerLength];

	     /*
	     String a = my_str.substring(0, 6);
	     System.out.println( a );

	     a = my_str.substring(6, 12);
	     System.out.println( a );

	     a = my_str.substring(12, 18);
	     System.out.println( a );
 */
/*
	     int beginIndex = 0, endIndex;
	     String str = null;
	     int my_strLength = my_str.length();
	     int index = 0;
	     while (index != answerLength) {
	        endIndex = beginIndex + n;
	        if( endIndex > my_strLength)  endIndex = my_strLength;
	        str = my_str.substring(beginIndex, endIndex);
	        beginIndex = endIndex;
	        answer[index++] = str;
	   } // while

	     return answer;
	 }
 */