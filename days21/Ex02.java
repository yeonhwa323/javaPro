package days21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author 조연화
 * @date 2024. 1. 29. 오전 10:23:15
 * @subject 
 * @content 
 */
public class Ex02 {

	public static void main(String[] args) {
		// [j.t 핵심클래스]
		// now() 메서드
		LocalDate ld = LocalDate.now();
		System.out.println(ld.toString()); // "2024-01-29" 

		LocalTime lt = LocalTime.now(); 
		System.out.println( lt ); // "10:26:43.805165900" - nanosecond

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);  // "2024-01-29T10:27:47.387764500"

		// of() 메서드 -> 날짜/시간 설정.
		ld = LocalDate.of(2023, 12, 29);
		System.out.println(ld);  // "2023-12-29"
		
		lt = LocalTime.of(14, 20, 11);
		System.out.println(lt);

		ldt = LocalDateTime.of(ld, lt);
		System.out.println( ldt ); // "2023-12-29T14:20:11"
		
	}// main

}// class
