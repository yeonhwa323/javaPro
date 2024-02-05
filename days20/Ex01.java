package days20;

import java.util.Date;

/**
 * @author 조연화
 * @date 2024. 1. 26. 오전 10:06:48
 * @subject [복습문제 4]
 * @content 
 */
public class Ex01 {

	public static void main(String[] args) {
		/*
		4. 개강일(2023.12.29. 9:00:00)로 부터 오늘까지 지난 일수 계산을 하세요.. 
		 */
		// [2]
		Date o = new Date(2023-1900, 12-1, 29, 0, 0, 0);
		// 1970.1.1	00:00:00.000
		// 1703775600000 ms
		System.out.println( o.getTime() ); // 개강일 ms 값

		Date t = new Date();
		// 1706231623002 ms
		System.out.println( t.getTime() );	// 현재 ms 값

		long diff = t.getTime() - o.getTime() ;
		// 		지난간 일수 X, 밀리초

		

		// ??일 ??시간 ??분 ??초 ???밀리초 지났다. [ 내가 푼거 ]
		// IllegalFormatConversionException
		/*
		System.out.printf("%d일 %d시간 %d분 %d초 %d밀리초 지났다."
				,diff/(1000*60*60*24) + "d"
				,diff/(1000*60*60) + "h"
				,diff/(1000*60) + "m"
				,diff/1000 + "s"
				,diff + "ms");
		 */

		/*
		System.out.println( diff + "ms");
		System.out.println( diff/1000 + "s");
		System.out.println( diff/(1000*60) + "m");
		System.out.println( diff/(1000*60*60) + "h");
		System.out.println( diff/(1000*60*60*24) + "d");
		 */

		// [1]
		/*
		// 총날짜수 메서드
		// 738855
		System.out.println( days10.Ex02.getTotalDays(2023, 12, 29) );
		// 738886
		System.out.println( days10.Ex02.getTotalDays(2024, 1, 26) );

		// 31
		System.out.println(738886 - 738855);
		 */
	}// main


}	// class