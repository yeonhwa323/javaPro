package days21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @author 조연화
 * @date 2024. 1. 29. 오전 11:09:43
 * @subject 
 * @content 
 */
public class Ex04 {

	public static void main(String[] args) {
		// String -> 불변한 자료형
		/*
		String a = "xyz";
		String b =  a.replace('y', '와');
		System.out.println(a); // "xyz"
		System.out.println(b);
		*/
		
		// j.t 핵심클래스도 불변
		/*
		LocalDate ld = LocalDate.now();
		System.out.println(ld);  // "2024-01-29"
		
		// 날짜, 시간 수정 - with(), plus(), minus(), roll(), add()
		ld = ld.withYear(2020);
		ld.with(ChronoField.YEAR, 2000);
		
		ld = ld.withMonth(5);
		ld = ld.with(ChronoField.MONTH_OF_YEAR, 10);
		
		ld = ld.withDayOfMonth(15);
		ld = ld.with(ChronoField.DAY_OF_MONTH, 20);
		System.out.println( ld );   // "2020-10-20"
		*/
		
		/*
		LocalDateTime dt = LocalDateTime.now();
		// 2024-01-29T11:18:13.617099
		System.out.println( dt );
		
		dt = dt.plusMonths(1);     // +1 달
		System.out.println( dt );
		
		dt = dt.minusMonths(3);	   // -3 달
		System.out.println( dt );
		// dt.plus()
		// dt.minus()
		*/
		
		// LocalDate 이용해서 개강일 이후 100일 계산가능
		
		LocalTime t = LocalTime.now();
		// 11:22:49.769555300
		System.out.println( t );
		// 끝부분을 잘라내다(절삭하다) = truncated
		//t = t.truncatedTo(ChronoUnit.HOURS);  // 시간 보다 작은 단위는 0으로 처리.
		t = t.truncatedTo(ChronoUnit.MINUTES);  // 분 보다 작은 단위는 0으로 처리.
		System.out.println( t );  // "11:00" / "11:25"
		
		LocalDateTime dt = LocalDateTime.now();
		dt = dt.truncatedTo(ChronoUnit.DAYS); // 시간,분,초,나노초 절삭 
		System.out.println( t ); 		// "11:26"
	}// main

}// class
