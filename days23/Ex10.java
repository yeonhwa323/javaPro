package days23;

import java.io.FileWriter;
import java.util.Properties;

/**
 * @author 조연화
 * @date 2024. 1. 31. 오후 4:20:39
 * @subject [시험]
 * 
 * @content 
 */
public class Ex10 {

	public static void main(String[] args) {
		// [Properties 컬렉션 클래스] 자주사용 -> 복습문제
		// 1) == Hashtable 컬렉션 클래스
		// 2) Map = entry (key+value)
		// 3) key, value 모두 자료형	String, String 이다. ***가장 중요
		//  X  Hashtable<String, String> ht
		// 4) 환경 설정값들을 읽기/쓰기 **중요
		// 5) put(), get() X
		//		setProperty(), getProperty()
		// 6) 파일로 저장할 파일명은 .properties 확장자를 사용한다.
		// 7) store() 오버로딩. - 파일로 저장
		//	  storeToXXL
		// 8) 
		
		// 예) DBMS(오라클) + Java 연동 CRUD -> (DB 연결 설정 정보)
		String className = "oracle.jdbc.driver.OracleDriver";            
		String url = "jdbc:oracle:thin:@localhost:1521:xe";                  
		String user = "scott";  // 사용자 계정                                                                 
		String password = "tiger";   
		
		Properties dbConfig = new Properties();
		// dbConfig.put(key, value);	사용 가능
		dbConfig.setProperty("className", className);
		dbConfig.setProperty("url", url);
		dbConfig.setProperty("user", user);
		dbConfig.setProperty("password", password);
		
		// String value = (String) dbConfig.get("className");
		String value = dbConfig.getProperty("className");
		// oracle.jdbc.driver.OracleDriver
		// System.out.println( value );
		
		// Properties dbConfig 객체 안에 DB연결정보가 저장.
		// -> 파일로 저장
		
		//  상대경로
		//	.		현재 디렉토리		\javaPro
		//	..		상위 디렉토리		
		String path = ".\\src\\days23\\jdbc.properties";
		
		try(FileWriter fw = new FileWriter(path)) {
			
			dbConfig.store(fw, "db connection config..");
			System.out.println("SAVE END");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}// main

}// class
