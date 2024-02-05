package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author yeonhwa
 * @date 2024. 1. 2. - 오후 12:30:52
 * @subject  
 * @content 키보드(표준입력장치)로 부터 이름을 입력받아서
 * 					출력.
 */
public class Ex06 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// new = 연산자
		
		System.out.print("> 이름 입력 ?");
		String name = "조연화";
		
		// Unhandled exception type IOException
		name = br.readLine(); // 키보드로 입력할 경우 값이 나온다.
		
		System.out.printf("> 이름 : %s\n", name);

	} // main

} // class
