package days18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author 조연화
 * @date 2024. 1. 24. 오전 9:35:37
 * @subject 
 * @content 
 */
public class Ex01 {

	public static void main(String[] args) {
		// 10. FileReader를 사용해서 파일을 읽어서 출력하는 코딩을 하세요.
		// [FileReader]/FileWriter 클래스 사용
		FileReader reader = null;
		
		String fileName = "C:\\Setup.log";
		int one = -1;
		// try-catch 구문 진행과정 이해하기!!
		try {
			reader = new FileReader(fileName);
			// reader.read() -> EOF 파일의 끝을 만나면 -1
			while((one = reader.read()) != -1) {
				System.out.printf("%c", (char)one );
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}// main

}// class
