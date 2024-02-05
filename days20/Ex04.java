package days20;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author 조연화
 * @date 2024. 1. 26. 오전 11:31:40
 * @subject [시험문제]
 * @content 
 */
public class Ex04 {

	public static void main(String[] args) {
		// 1. 수료일이 무슨 요일 ?
		// Date o = new Date(2023-1900, 6-1, 14, 18, 0, 0);
		Calendar c = Calendar.getInstance();
		// c.get(Field)
		// 새로운 날짜로 설정 : set(field, value)
		c.set(Calendar.YEAR, 2024);
		c.set(Calendar.MONTH, 6-1);
		c.set(Calendar.DATE, 14);
		c.set(Calendar.HOUR_OF_DAY, 18);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);

		/*
		// [시험문제] 형식화 클래스 Date, Calendar
		// "2015. 5. 1 오전 9:11:12" 형식으로 출력
		// SimpleDateFormat - 간단한 날짜를 내가 원하는 방식으로 출력
		String pattern = "yyyy. MM. dd E a hh:mm:ss.SSS";
		// java.lang.IllegalArgumentException: Illegal pattern character 'A' -> 오류 검색
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		// Calendar -> Date 변환
		// Date -> Calendar 변환
		Date d = c.getTime();
		String strDf = sdf.format(d);
		System.out.println( strDf );
		 */
		
		String pattern = "yyyy. MM. dd E a hh:mm:ss.SSS";
		System.out.println( getFormatDate(c, pattern));
		
	}// main
	
	public static String getFormatDate(Object o, String pattern) {
		
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		if (o instanceof Date) {
			Date d = (Date)o;
			return sdf.format(d);
			
		} else if (o instanceof Calendar) {
			Calendar c = (Calendar)o;
			Date d = c.getTime();
			return sdf.format(d);
		}
		
		return null;
	}

	/*
	public static String getFormatDate(Date d, String pattern) {
	}
	public static String getFormatDate(Calendar c, String pattern) {
	}
	 */


}// class
