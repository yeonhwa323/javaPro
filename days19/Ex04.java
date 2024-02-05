package days19;

import java.util.StringTokenizer;

/**
 * @author 조연화
 * @date 2024. 1. 25. 오후 12:16:27
 * @subject 
 * @content 
 */
public class Ex04 {

	public static void main(String[] args) {
		// StringTokenizer 클래스
		// String.split() 와 기능 비슷[문자열 잘라내겠다]
		String s = "구본혁, 권맑음, 김영진, 김진성";
		StringTokenizer st = new StringTokenizer(s, ",");  //정규표현식사용X
		
		System.out.println( st.countTokens() );
		/*
		System.out.println( st.hasMoreTokens()); 	// boolean true/false
		System.out.println( st.nextToken() );
		System.out.println( st.hasMoreTokens()); 	// boolean true/false
		System.out.println( st.nextToken() );
		System.out.println( st.hasMoreTokens()); 	// boolean true/false
		System.out.println( st.nextToken() );
		*/
		
		while (st.hasMoreTokens() ) {
			String name = st.nextToken();
			System.out.println( name.stripLeading() );
		}
		
	}// main

}// class
