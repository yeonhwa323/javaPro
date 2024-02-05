package days25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author kenik
 * @date 2024. 2. 2. - 오후 12:07:29
 * @subject
 * @content
 */
public class Ex05_02 {

	public static void main(String[] args) {
		// 버퍼 기능 있는 보조스트림을 사용해서 파일 복사
		
		String sourceFile = ".\\src\\days25\\Ex01.java";
		String copyFile = ".\\src\\days25\\Ex01_Copy.java";
		
		//> 복사 처리 시간 : 93366200(ns)
		//> 복사 처리 시간 :  1383000(ns)
		fileCopyTextStream(sourceFile, copyFile);

	} // main

	private static void fileCopyTextStream(String sourceFile, String copyFile) {
		long start = System.nanoTime();
		
		final int BUFFER_SIZE = 1024;
		
		try (FileReader fr = new FileReader(sourceFile);
			 FileWriter fw = new FileWriter(copyFile);
			BufferedReader br = new BufferedReader(fr, BUFFER_SIZE);	
			BufferedWriter bw = new BufferedWriter(fw, BUFFER_SIZE);	
			){
			/* 
			int code;
			while( ( code = fr.read() ) != -1 ) {
				System.out.printf("%c", (char)code);
				// fw.append(code);  char, CharSequence X
				fw.write(code);
				// fw.flush();
			} // while 
			fw.flush();
			*/
			
			/* 한 라인 단위 처리...
			String line = null;
			while( (line=br.readLine()) != null) {
				bw.write(line);
			}
			*/
			// 1035 
			// 1024
			
			//   11
			char [] cbuf = new char[BUFFER_SIZE];
			int readCharNumber ;
			while (   ( readCharNumber = br.read(cbuf) ) !=  -1  ) {
				bw.write(cbuf, 0, readCharNumber);
			} // 
			
			System.out.println("파일 복사 완료!!!");
			
			long end = System.nanoTime();
			System.out.printf("> 복사 처리 시간 : %d(ns)\n", (end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

} // class
