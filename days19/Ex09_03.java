package days19;

import java.io.FileReader;
import java.util.Arrays;

public class Ex09_03 {

	public static void main(String[] args) {
		// days18.Ex01.java 자바파일 안에 있는
		// 알파벳을 대문자, 소문자 숫자가 몇 개인지
		// 배열에 저장 후 ### 막대그래프 그리기.
		// A(65)~Z(90), a(97)~z(122), 0(48)~9(57)

		// A ~ Z 26문자
		//int [] countsUpperCase = new int['Z'-'A' + 1];
		//int [] countsLowerCase = new int['Z'-'A' + 1];
		//int [] counts숫자 = new int[10];


		int [][] counts = new int[2]['Z'-'A' + 1];
		// 0행 대문자 갯수 저장 00 'A' 01 'B' 025 'Z'
		// 1행 소문자 갯수 저장 10 'a' 11 'b' 125 'z'


		String fileName = "\\src\\days18\\Ex01.java";
		String key = "user.dir";
		String userDir = System.getProperty(key);
		String path = String.format("%s%s", userDir, fileName);
		
		try (FileReader fr = new FileReader(path);) {

			int code ;
			char one ; // 문자로 변환할 값
			// read() : EndOfFile(EOF) -1 반환
			while ( (code = fr.read()) != -1 ) {
				one = (char)code;
				// System.out.println(one);	
				if( Character.isUpperCase(one) ) {
					counts[0][one - 'A']++;
				} else if (Character.isLowerCase(one)) {
					counts[1][one - 'a']++;
				}
			}// while

			System.out.println( Arrays.toString(counts) );

			for (int i = 0; i < counts.length; i++) { // 행
				System.out.println( i==0?"[대문자 출력]":"[소문자 출력]" );
				for (int j = 0; j < counts[i].length; j++) {
					System.out.printf("'%c': %s(%d)\n"
							,i==0?'A'+j:'a'+j 
									, "#".repeat( counts[i][j] ), counts[i][j]);
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}// try


	}// main

}// class
