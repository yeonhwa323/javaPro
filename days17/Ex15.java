package days17;

import java.io.IOException;

/**
 * @author 조연화
 * @date 2024. 1. 23. 오후 4:29:09
 * @subject 
 * @content 
 */
public class Ex15 {

	public static void main(String[] args) {
		
		// 컴파일러가 예외처리를 확인 O, X
		
		// 컴파일 오류 O
		// "unchecked 예외" Exception 자손예외클래스
		// throw new IOException("강제 IO 예외 발생");
		// throw new Exception("강제 예외 발생");
		
		// 컴파일 오류 X
		// 컴파일러가 예외 발생을 확인하지 않는다. 이유 ? RuntimeException 자손인 경우~~
		// "unchecked 예외"
		throw new RuntimeException("강제 예외 발생");
		
		
		
	}

}
