package days26;

import java.io.File;

public class Ex02_05 {

	public static void main(String[] args) {
		String pathname = ".\\src\\days26";
		// days26 폴더 안에  upload 폴더 생성.
		File upload = new File(pathname, "upload");
		
		// System.out.println( upload.exists() ); // false 존재X
		if ( !upload.exists()) {
			System.out.println( upload.mkdir() );// mk == make
			
			// createTempFile("work", ".tmp") 
			//		임시파일
			// C:\\windows\\TEMP	파일 생성
		} else {
			// 폴더가 존재하면 삭제 해보자.
			System.out.println( upload.delete() );
			// deleteOnExit() : 응용 프로그램이 종료될 때 
			// 					파일을 삭제 ( 임시 파일 삭제 ) 
			
		}// if
		
		
		
	}// main
	
}// class
