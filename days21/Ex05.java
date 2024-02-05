package days21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author 조연화
 * @date 2024. 1. 29. 오전 11:27:38
 * @subject 
 * @content 
 */
public class Ex05 {

	public static void main(String[] args) {
		// 날짜, 시간의 비교 isAfter(), isBefore(), isEqual()
		// 홍길동의 생일 : 1999.1.20
		// 올해 홍길동의 생일이 지났는지? 지나지 않았는지? 오늘인지. 체크
		LocalDate today = LocalDate.now();
		LocalDate birth = LocalDate.of(1999, 1, 20);
		System.out.println( today ); // 2024-01-29
		
		birth = birth.withYear( today.getYear() );
		System.out.println( birth ); // 1999-01-20 -> 2024-01-20
		
		System.out.println( today.isAfter(birth) ); // > 크니 (생일 지났니)
		System.out.println( today.isBefore(birth) ); // < 작니
		System.out.println( today.isEqual(birth) ); // == 같니
		
		// 0, 양수, 음수
		System.out.println( today.compareTo(birth) ); // 9(양수) 오늘날짜-생일일자
		
		
	}// main

}// class

/* [M]
LocalDateTime ld = LocalDateTime.now();
System.out.println( ld );
ld = ld.truncatedTo(ChronoUnit.DAYS);
System.out.println( ld );

birth = 
*/