package days18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author 조연화
 * @date 2024. 1. 24. 오후 3:18:34
 * @subject [시험문제]
 * @content 
 */
public class Ex05 {

	public static void main(String[] args) {
		// String dir = "E:\\Class\\Workspace\\JavaClass\\javaPro\\src\\days18";
		String key = "user.dir";
		String userDir =  System.getProperty(key);
		// System.out.println( userDir );
		String readpath = userDir.concat("\\src\\days18\\SS20.txt");
		String writepath = userDir.concat("\\src\\days18\\SS20.html");
		// System.out.println(readpath);

		String [] names = new String[15];
		String name = null;
		int index = 0;

		try (FileReader fr = new FileReader(readpath);
				BufferedReader br = new BufferedReader(fr);  
				FileWriter fw = new FileWriter(writepath); ){
			while ( (name = br.readLine()) != null ) {
				names[index++] = name;
			}// while

			String namesJoin = "<ol><li>" + String.join("</li><li>", names) + "</li></ol>" ;
			System.out.println( namesJoin );

			fw.write(namesJoin);

		} catch (Exception e) {
			e.printStackTrace();
		}//try

		System.out.println("end");



	}// main

}// class
