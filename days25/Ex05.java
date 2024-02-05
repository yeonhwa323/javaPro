package days25;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author kenik
 * @date 2024. 2. 2. - 오후 12:07:29
 * @subject
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		// [텍스트파일 복사]
		// 원본파일을 읽어서  FileReader
		// 복사파일에 쓰기    FileWriter
		String sourceFile = ".\\src\\days25\\Ex01.java";
		String copyFile = ".\\src\\days25\\Ex01_Copy.java";
		
		//> 복사 처리 시간 : 93366200(ns)
		fileCopyTextStream(sourceFile, copyFile);

	} // main

	private static void fileCopyTextStream(String sourceFile, String copyFile) {
		long start = System.nanoTime();
		
		try (FileReader fr = new FileReader(sourceFile);
			 FileWriter fw = new FileWriter(copyFile)){
			 
			int code;
			while( ( code = fr.read() ) != -1 ) {
				System.out.printf("%c", (char)code);
				// fw.append(code);  char, CharSequence X
				fw.write(code);
				// fw.flush();
			} // while 
			fw.flush();
			System.out.println("파일 복사 완료!!!");
			
			long end = System.nanoTime();
			System.out.printf("> 복사 처리 시간 : %d(ns)\n", (end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

} // class
