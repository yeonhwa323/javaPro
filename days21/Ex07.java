package days21;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

/**
 * @author 조연화
 * @date 2024. 1. 29. 오전 11:46:48
 * @subject 
 * @content 
 */
public class Ex07 {

	public static void main(String[] args) {
		String source = "2009년 12월 30일"; // 변환 불가
		//String source = "2009.12.30";		 // 변환 불가능
		//String source = "2009/12/30";		 // 변환 불가능
		
		//String source = "2009-12-30";		 // 변환 가능
		// 날짜형식의 String -> LocalDate 타입 변환
		// 1) SDF.parse() 변환작업
		
		/*
		//LocalDate d = LocalDate.parse(source);
		String pattern = "yyyy년 MM월 dd일";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		LocalDate d = LocalDate.parse(source, dtf);
		System.out.println( d );
		*/
		
		// 이번 달의 마지막 날짜 몇 일까지 ?
		// Date, Calendar
		/*
		// [ LocalDate ]
		LocalDate d = LocalDate.now();
		System.out.println( d );  // 2024-01-29
		d = d.withDayOfMonth(1);
		System.out.println(d); // 2024-01-01
		d = d.plusMonths(1);
		System.out.println( d ); // 2024-02-01
		d = d.minusDays(1);
		System.out.println( d ); // 2024-01-31
		System.out.println( d.getDayOfMonth() );  // 31
		*/
		
		// [2] 
		/*
		LocalDate d = LocalDate.now();
		d = d.plusMonths(1);
		System.out.println( d.lengthOfMonth() );  // 31
		*/
		
		// [3]
		/*
		LocalDate d = LocalDate.now();
		LocalDate lastDay = d.with( TemporalAdjusters.lastDayOfMonth() );
		System.out.println( lastDay );
		// Temporal + Adjuster
		// 시간상의		조정자
		*/
		
		// [ TemporalAdjuster ]
		// 날짜, 시간을 수정할 때 with(), plus(), minus()
		// 다음 달 첫 째주 화요일날 만나요....
		// 다음 달 마지막 주 토요일날 모임....
		// 자주 사용되는 날짜 계산들을 대신해 주는 메서드를
		// 미리 정의해 놓은 클래스 : TemporalAdjusters 클래스
		// 
		
		
	}// main

}// class







