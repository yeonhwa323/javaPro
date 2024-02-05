package days08;

import java.util.Arrays;
import java.util.Random;

/**
 * @author 조연화
 * @date 2024. 1. 10. 오후 4:18:00
 * @subject 
 * @content	
 */
public class Ex06_02 {

	public static void main(String[] args) {
		String rrn = "900204-2211111";
		// String split()
		// "900204" + "2*******"
		// Strin -> char []
		char [] rrnArr = new char[ rrn.length() ];
		System.out.println(Arrays.toString(rrnArr));
		// String Arrays.toString(배열)
		Arrays.fill(rrnArr, '*');

		for (int i = 0; i < 8; i++) {         
			//if(i >=8) {
			//   rrnArr[i]= '*';
			//}else {
			rrnArr[i]= rrn.charAt(i);
			//}          
		}      
		System.out.println( Arrays.toString(rrnArr) );
		// char[] -> String 
		String printRRN = String.valueOf(rrnArr);
		System.out.println( printRRN );



		// 주민등록번호를 출력
		// 900204-2*******

		/*
		String regex = "-";
		String [] rrnArr = rrn.split(regex);

		String printRrn = String.join("-", rrnArr);

		System.out.println(printRrn);
		 */


	}// main

}// class
