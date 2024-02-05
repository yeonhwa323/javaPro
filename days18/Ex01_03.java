package days18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author 조연화
 * @date 2024. 1. 24. 오전 9:35:37
 * @subject  try ~ resource 문 (자동으로 닫는 구문)
 * @content  	
 * 	
 */
public class Ex01_03 {

	public static void main(String[] args) {

		String fileName = "C:\\Setup.log";

		String line = null;
		int lineNumber = 0;

		try (FileReader fr = new FileReader(fileName);
				BufferedReader br = new BufferedReader(fr);){

			while((line = br.readLine()) != null) {
				System.out.printf("%d:%s\n", ++lineNumber ,line );
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// try ~ resource 문에 의해서
			// 자동으로 close() 시킨다.
		}

	}// main

}// class
