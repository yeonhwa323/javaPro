package days05;

/**
 * @author 조연화
 * @date 2024. 1. 5. 오후 2:26:13
 * @subject 
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		// 한 라인에 ASCII 10개씩 출력.
		// 1 : [0][][][]
		// 2 : [10][][]
		// 3 : [20][][]
		// 4 : [30][][]
		
		// 10개씩 개행하는 것도 연습해보기
		
			for (int i = 0, lineNumber = 1; i < 256; i++) {
			// if (i % 10 == 0) {System.out.printf("%d : " , i/10+1 );}
			if (i % 10 == 0) {System.out.printf("%d : ", lineNumber++);}
			System.out.printf("[%c]", (int) i, (char)i ); // [] ASCII 출력부분
			if ( i % 10 == 9) {
				System.out.println();
			}
		}// for
		
	} // main

} // class
