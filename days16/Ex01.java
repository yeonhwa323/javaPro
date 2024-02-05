package days16;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		String n = "keNik";   // KENIK
		String m= "kKnie";    // KKNIE
		
		// 1. n, m 대문자로 변환
	    n =  n.toUpperCase();
	    m =  m.toUpperCase();	     
		// 2. n, m 문자열 오름차순정렬
	    char [] nArr =  n.toCharArray();
	    Arrays.sort(nArr); // "EIKKN"
	    // System.out.println( Arrays.toString(nArr) );
	    char [] mArr =  m.toCharArray();
	    Arrays.sort(mArr); // "EIKKN"
	    // System.out.println( Arrays.toString(mArr) );
	    
		// 3. n  m  같냐   true/false
	    n = String.valueOf(nArr);
	    m = String.valueOf(mArr);
	    System.out.println( n.equals(m) );
		
		
		/*
		// n -> char[]
		// k -> K
		// e -> E
		char [] nArr = n.toCharArray();
		for (int i = 0; i < nArr.length; i++) {
			if( Character.isLowerCase(nArr[i]))
			  nArr[i] = (char)( nArr[i] + 32 );
		}
		
		
		// A~Z
		for (int i = 'A'; i <= 'Z'; i++) {
			// n      021
			// m      020
			//        false
		}
		*/

	} // main
}// class
