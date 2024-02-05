package days25;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2024. 2. 2. - 오전 11:26:32
 * @subject
 * @content
 */
public class Ex04_03 {

	public static void main(String[] args) {		
		String parent = ".\\src\\days25";
		String child  = null;
		String content = "";
		char con = 'y';
		try (Scanner scanner = new Scanner(System.in);){
			System.out.print("1. 저장할 파일명 입력 ? ");
			child = scanner.next();			
			File saveFile = new File(parent, child);

			try ( FileWriter fw = new FileWriter(saveFile, true);) {
				do {
					System.out.print("2. 저장할 문자열(Data) 입력 ? ");
					content = scanner.next();
					fw.append(content);
					fw.flush();  // ***
					System.out.print("계속 ? ");
					con = (char)System.in.read();
					System.in.skip(System.in.available());
				} while ( Character.toUpperCase(con) == 'Y' );
			} catch (Exception e) {
				e.printStackTrace();
			}


			System.out.println(" end ");
		} catch (Exception e) {
			e.printStackTrace();
		}

	} // main

} // class






