package days21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author 조연화
 * @date 2024. 1. 29. 오후 2:01:28
 * @subject 
 * @content 
 */
public class Ex10 {

	public static void main(String[] args) {
		// DateTimeFormatter 형식화 클래스
		
		// [2]
		String source = "2023년 08월 10일 (목)";
		
		String pattern = "yyyy년 MM월 dd일 (E)";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		LocalDate d = LocalDate.parse(source, formatter);
		
		System.out.println( d );  // 2023-08-10
		
		
		/* [1]
		// 날짜문자열 -> 파싱 -> 핵심클래스 변환
		//		    <- 포맷	<-
		LocalDateTime dt = LocalDateTime.now();
		// 2024-01-29T14:03:16.411068800
		System.out.println( dt );
		
		// 내가 원하는 패턴 출력
		String pattern = "yyyy/MM/dd E hh:mm:ss.SSS";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		
		String output = dtf.format(dt);
		// 2024/01/29 월 02:05:12.453
		System.out.println( output );
		*/
						
	}// m

}// c
