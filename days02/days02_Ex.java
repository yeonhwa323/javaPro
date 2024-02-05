package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class days02_Ex {

	public static void main(String[] args) throws IOException {
		
		byte age;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.printf("> 나이 입력 ? ");
		
		age = Byte.parseByte(br.readLine());
		
		System.out.printf("> 나이 : %d \n", age );
	
	} // main
		
} // class