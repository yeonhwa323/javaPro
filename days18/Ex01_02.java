package days18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author 조연화
 * @date 2024. 1. 24. 오전 9:35:37
 * @subject 	한 문자X 
 * @content  	한 라인씩 출력(처리)하기
 * 				버퍼(임시기억공간) 기능 O 
 * 		[A][B][C][][\r][\n][A][B][C][][\r][\n]
 * 		readLine()
 * 		BufferedReader 클래스 ( 보조스트림 == 보조클래스 )
 * ctrl + F -> 글자 바꾸기 단축키
 * ctrl + Z -> 글자 다시 돌아오게하는 단축키
 * 		
 * 		라인번호
 */
public class Ex01_02 {

	public static void main(String[] args) {
		FileReader fr= null;
		BufferedReader br	= null;
		
		String fileName = "C:\\Setup.log";
		
		String line = null;
		int lineNumber = 0;
		
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr); //보조
			/*
			while((one = fr.read()) != -1) {
				System.out.printf("%c", (char)one );
			}
			*/
			while((line = br.readLine()) != null) {
				System.out.printf("%d:%s\n", ++lineNumber ,line );
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}// main

}// class
