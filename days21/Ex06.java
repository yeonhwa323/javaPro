package days21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author 조연화
 * @date 2024. 1. 29. 오전 11:41:40
 * @subject 
 * @content 
 */
public class Ex06 {

	public static void main(String[] args) {
		// 서로 변환 가능~
		
		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.now();
		LocalDateTime dt = LocalDateTime.now();
		
		// dt -> d, t
		LocalDate d2 = dt.toLocalDate(); // 날짜 정보만 가져오는 메서드
		LocalTime t2 = dt.toLocalTime(); // 시간 정보만  "    "
		
		LocalDateTime dt2 = d.atTime(t);
		
		LocalDateTime dt3 = t.atDate(d);

	}// main

}// class
