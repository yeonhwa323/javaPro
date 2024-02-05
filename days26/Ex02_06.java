package days26;

import java.io.File;

/**
 * @author 조연화
 * @오후 2:28:11 2024. 2. 5.
 * @subject	
 * @content	
 */
public class Ex02_06 {

	public static void main(String[] args) {
		// days26
		// 	ㄴ [temp] 폴더 삭제
		// 		ㄴ a.txt
		// 		ㄴ b.txt
		// 		ㄴ subTemp
		//		      ㄴ c.text
		//		      ㄴ d.text


		String pathname = ".\\src\\days26\\temp";
		File p = new File(pathname);

		if ( p.exists() ) {
			// delete() 메서드는 하위 디렉토리가 없어야 삭제 가능하다.
			// System.out.println( p.delete() ); // true, false
			directoryDelete(p);
		} // if

		System.out.println( "end" );


	}// main
	//						".\\src\\days26\\temp";
	private static void directoryDelete( File f ) { // 시험문제
		// f 삭제되지 않았을 경우 while 반복
		while (  !f.delete() ) {  // true, false

			File[] list =   f.listFiles();

			for (int i = 0; i < list.length; i++) {   
				if (list[i].delete()) {
					System.out.printf("%s  삭제 완료!!!\n", list[i] );
				} else {
					directoryDelete( list[i] );
				} // if
			} //

		} // while
	}

}// class
