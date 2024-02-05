package days26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author 조연화
 * @오후 2:02:35 2024. 2. 5.
 * @subject	
 * @content	
 */
public class Ex02_04 {

	public static void main(String[] args) {
		String pathname = ".\\src\\days25";
		String keyword = "source";
		
		File parent = new File(pathname);
		File [] list = parent.listFiles( (dir, name)-> name.endsWith(".java"));
		
		File child = null;
		int lineNumber = 1;
		String line = null;
		for (int i = 0; i < list.length; i++) {
			child = list[i];
			lineNumber = 1;
			String fileName = child.getName();
			System.out.printf( "------ %s ------\n", fileName );
			
			try ( FileReader reader = new FileReader(child);
					BufferedReader br = new BufferedReader(reader)){
				while ((line = br.readLine()) != null) {
					if (line.contains(keyword)) {
						line.replaceAll(keyword, "["+keyword+"]");
						System.out.printf("%d: %s\n", lineNumber, line);
					}
				
				lineNumber++;
				}// 
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
	}// main

}// class
