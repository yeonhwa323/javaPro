package days09;

import java.sql.Date;
import java.util.Calendar;

/**
 * @author 조연화
 * @date 2024. 1. 11. 오후 12:09:33
 * @subject 
 * @content	
 */
public class Ex07_02 {

	public static void main(String[] args) {

		// [주민등록번호]
		// 住民登錄番號 / Resident registration number, RRN
		// *** 1. 생년원일 출력
		// 2. 성별 출력
		// 3. 내국인/외국인 판별
		// 4. 출신지역
		// *** 5. 나이(퇴직일계산)
		// 6. 검증(올바른 주민등록번호인지)

		String rrn = "990123-2200001";
		// birthMMDD = "0123"
		// thisMMDD = "0111"

		// 주민등록번호 -> 나이
		/*
		 * 			  2022.12.31 23.1.1  23.12.31	24.1.1
		 * 
		 * 1) 한국식 나이		1		2		2			3
		 * 		ㄴ	한국식나이 = 연나이 + 1
		 * 2) 연 나이			0		1		1			2
		 * 		ㄴ	연나이 = 올해년도(2024)-출생년도(1999)
		 * 				 = 25
		 * 3) 만 나이			0		0		1			1
		 * 		
		 *
		 * */

		int yearAge= getYearAge(rrn);
		int koreaAge= getKoreaAge(rrn);
		int americanAge = getAmericanAge(rrn);
		System.out.printf("%s - 연나이:%d살, 한국식나이:%d살, 만나이:%d살\n",
				rrn, yearAge, koreaAge, americanAge);
		

	}// main

	//한국식 나이를 반환하는 함수 = 연나이 + 1
	private static int getKoreaAge(String rrn) {
		return getYearAge(rrn) + 1;
	}
	// 연 나이 = 올해년도 - 출생년도
	private static int getYearAge(String rrn) {
		int birthYear ; // 출생 년도
		int thisYear;   // 올해 년도

		/* [1] Date 날짜,시간 클래스
		Date d = new Date();
		thisYear = d.getYear() + 1900;
		 */

		// [2] Calender 날짜, 시간 클래스
		Calendar c = Calendar.getInstance();
		thisYear = c.get(Calendar.YEAR);

		// System.out.println(thisYear);

		// 출생년도 99
		birthYear = Integer.parseInt(rrn.substring(0,2));
		int gender = getGender(rrn);
		switch ( gender ) {
			case 9: case 0:
				birthYear += 1800;
				break;
			case 1: case 2:case 5: case 6:
				birthYear += 1900;
				break;
			case 3: case 4:case 7: case 8:
				birthYear += 2000;
				break;
		} // switch

		return thisYear - birthYear;
	}
	// 만 나이
	private static int getAmericanAge(String rrn) {
		// 출생일 : 2023.10.09
		// 오늘일 : 2024.01.11
		// 만나이 : 0
		//		= 올해년도(2024) - 출생년도(2023) => 생일이 지났을때
		//		= 1 -1 생일이 지나지않으면 1살을 뺀다.
		//		= 0
		int americanAge = getYearAge(rrn);
		
		/*
		Calendar c = Calendar.getInstance();
		int thisMM = c.get(Calendar.MONTH) + 1;
		int thisDD = c.get(Calendar.DATE);
		int birthMM = Integer.parseInt(rrn.substring(2,4));
		int birthDD = Integer.parseInt(rrn.substring(4,6));  
		if (!(thisMM >= birthMM && thisDD >= birthDD)) {
			americanAge--;
		}
		*/
		

		
		return americanAge;
	}

	private static int getGender(String rrn) {
		// char rrn.charAt(7);			'1' - 48	int
		// String rrn.substring(7,8);	"1" Integer.parseInt()
		// int							 1
		return rrn.charAt(7) - 48;	//	1
	}

	private static String getBirth(String rrn) {
		// "990123-2200001"
		int year = Integer.parseInt(rrn.substring(0,2)); // "99"
		int month = Integer.parseInt(rrn.substring(2,4)); // "01"
		int day = Integer.parseInt(rrn.substring(4,6)); // "23"

		// year = 1999, 1899
		int gender = getGender(rrn);

		// 9,0	1800
		// 1,2,5,6	1900
		// 3,4,7,8	2000
		switch ( gender ) {
		case 9: case 0:
			year += 1800;
			break;
		case 1: case 2:case 5: case 6:
			year += 1900;
			break;
		case 3: case 4:case 7: case 8:
			year += 2000;
			break;
		}

		String birthday = String.format("%d년 %d월 %d일",year,month,day);

		return birthday;
	}

}// class
