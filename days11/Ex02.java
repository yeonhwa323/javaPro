package days11;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 조연화
 * @date 2024. 1. 15. 오전 10:20:33
 * @subject [복습문제 2번풀이]
 * @content	
 */
public class Ex02 {

	public static void main(String[] args) {
		int [] m = new int[3];
		
		//m = AppendArray(m);
		
		dispArray(m);

	}// main

	private static void AppendArray(int[] m) throws IOException {
		Scanner scanner = new Scanner(System.in); 
		int index = 0;
		char con = 'y';
		do {
			if (index == m.length) {
				
			}
			
			System.out.printf("> m[%d] 입력 ? ", index);
			m[index++] = scanner.nextInt();
			
			System.out.printf("> 입력 계속 ? ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con)=='Y');
		
		
		
	}

	private static void dispArray(int[] m) {
		
		
		System.out.println(Arrays.toString(m));
		
	}

}// class
