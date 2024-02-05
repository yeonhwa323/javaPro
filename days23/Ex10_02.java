package days23;

import java.io.FileReader;
import java.util.Properties;

/**
 * @author 조연화
 * @date 2024. 1. 31. 오후 4:43:49
 * @subject [시험] Ex10+Ex10_02 한번에 코딩해야하는 문제 출제
 * @content 
 */
public class Ex10_02 {

	public static void main(String[] args) {
		String className ;            
		String url ;                  
		String user ;  // 사용자 계정                                                                 
		String password ;  
		
		String path = ".\\src\\days23\\jdbc.properties";
		
		Properties p = new Properties();
		
		try(FileReader fr = new FileReader(path)){
			p.load(fr);
			className = p.getProperty("className");
			url = p.getProperty("url");
			user = p.getProperty("user");
			password = p.getProperty("password");
			
			System.out.println( className );
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}// main

}// class
