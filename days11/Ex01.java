package days11;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author 조연화
 * @date 2024. 1. 15. 오전 10:00:56
 * @subject 
 * @content	
 */
public class Ex01 {

	public static void main(String[] args) {
		int year, month;
		try( Scanner scanner = new Scanner(System.in) ) {
			System.out.printf("> 년도와 월을 입력하세요 ?");
			year = scanner.nextInt();
			month = scanner.nextInt();
			
			printCalendar ( year, month );
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// main

	private static void printCalendar(int year, int month) {
		getLastDay(month, month);
		getDayOfWeek(year, month, 1);
		
	}
	private static int getLastDay(int year,int month) {
		// Date, Calendar 클래스 - 날짜, 시간
		LocalDate d = LocalDate.of(year, month, 1);
		// System.out.println(d.toString()); 2020-05-01
		LocalDate ld = d.withDayOfMonth(d.lengthOfMonth());
		// System.out.println(d.toString());
		int lastDay = ld.getDayOfMonth();
		System.out.println(ld.getDayOfMonth());
		System.out.println(lastDay);
		return lastDay;
		
	}

	private static int getDayOfWeek(int year,int month, int day) {
		LocalDate d = LocalDate.of(year, month, 1);
		DayOfWeek w = d.getDayOfWeek();
		System.out.println(w); // FRIDAY
		return w.getValue();
		
	}
	
	// 총날짜수를 반환하는 함수	
	private static int getTotalDays(int year,int month, int day) {
		LocalDate startDate = LocalDate.parse("2020-05-01");
		//내용 추가하기~
		
		return day;		
	}
}// class
