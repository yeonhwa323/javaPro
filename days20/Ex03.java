package days20;

import java.util.Calendar;

/**
 * @author 조연화
 * @date 2024. 1. 26. 오전 10:50:35
 * @subject [ Calendar 클래스 ]
 * @content 
 */
public class Ex03 {

	public static void main(String[] args) {
		// jdk 1.1 Calendar 추상 클래스 - 날짜, 시간
		// Calendar c = new Calendar(); X
		Calendar c = Calendar.getInstance();
		//				ㄴ GregorianCalendar();
		// System.out.println( c.toString() );
		
		// 2024년도의 몇 일째 ?
		System.out.println( c.get( Calendar.DAY_OF_YEAR) ); // 26
		// 해당 주의 몇 일째
		System.out.println( c.get( Calendar.DAY_OF_WEEK) ); // 6
		// 년 중의 몇 주
		System.out.println( c.get( Calendar.WEEK_OF_YEAR) ); // 4
		// 달 중의 몇 주
		System.out.println( c.get( Calendar.WEEK_OF_MONTH) ); // 4
		
		// 년
		System.out.println( c.get(1) ); // 2024
		System.out.println( c.get(Calendar.YEAR) ); // 2024
		// 월
		System.out.println( c.get(2) +1 ); // 0+1 -> 제대로된 월 출력
		System.out.println( c.get(Calendar.MONTH) +1 ); // 1
		// 일
		System.out.println( c.get(5) ); // 26
		System.out.println( c.get(Calendar.DATE) ); // 26
		System.out.println( c.get(Calendar.DAY_OF_MONTH)); // 26
		// 시간
		System.out.println( c.get(10) ); // 11
		System.out.println( c.get(Calendar.HOUR) ); // 12시간 기준(0-11)
		System.out.println( c.get(11) );
		System.out.println( c.get(Calendar.HOUR_OF_DAY) ); // 24시간 기준
		// 분
		System.out.println( c.get(12));
		System.out.println( c.get(Calendar.MINUTE) ); // 19
		// 초
		System.out.println( c.get(13));
		System.out.println( c.get(Calendar.SECOND) );
		// 밀리초
		System.out.println( c.get(14));
		System.out.println( c.get(Calendar.MILLISECOND) );
		// 요일
		// Date		0(일) 1(월).....6(토)
		// Calendar 1(일) 2(월).....7(토)
		System.out.println( c.get(7));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
	
		// 자정부터 정오 직전까지의 시간을 나타내는 AM_PM 필드의 값
		System.out.println( c.get( Calendar.AM ));		// 1 
		// 시간이 정오 이전인지 이후인지를 나타내는 get,set 필드의 값
		System.out.println( c.get( Calendar.AM_PM ));	// 0 -> 오전 0 오후 1
		
		
		
		
	}// main

}// class
