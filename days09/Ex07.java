package days09;
/**
 * @author 조연화
 * @date 2024. 1. 11. 오후 12:09:33
 * @subject 
 * @content	
 */
public class Ex07 {

	public static void main(String[] args) {

		// [주민등록번호]
		// 住民登錄番號 / Resident registration number, RRN
		// 1. 생년원일 출력
		// 2. 성별 출력
		// 3. 내국인/외국인 판별
		// 4. 출신지역
		// 5. 나이(퇴직일계산)
		// 6. 검증(올바른 주민등록번호인지)

		String rrn = "990123-2200001";

		// 주민등록번호 -> 생년월일
		// "1999년 1월 23일"
		String birthday = getBirth(rrn);
		System.out.println(birthday);

		/*
		String printRRN = rrn.substring(8);

		switch (rrnArr[1].charAt(0)) {
		case 9:
			System.out.println("18"+"%d년 %d월 %d일 남성내국인",year,month,day);
			break;
		case 0:
			System.out.println("18"+"%d년 %d월 %d일 여성내국인",year,month,day);
			break;	
		case 1:
			System.out.println("19"+"%d년 %d월 %d일 남성내국인",year,month,day);
			break;
		case 2:
			System.out.println("19"+"%d년 %d월 %d일 여성내국인",year,month,day);
			break;
		case 3:
			System.out.println("20"+"%d년 %d월 %d일 남성내국인",year,month,day);
			break;
		case 4:
			System.out.println("20"+"%d년 %d월 %d일 여성내국인",year,month,day);
			break;
		case 5:
			System.out.println("19"+"%d년 %d월 %d일 남성외국인",year,month,day);
			break;
		case 6:
			System.out.println("19"+"%d년 %d월 %d일 여성내국인",year,month,day);
			break;
		case 7:
			System.out.println("20"+"%d년 %d월 %d일 남성외국인",year,month,day);
			break;
		case 8:
			System.out.println("20"+"%d년 %d월 %d일 여성내국인",year,month,day);
			break;
		default:
			break;
		}
		 */
	}// main
	
	// 주민등록번호로 부터 성별 얻어오는 기능
	// 매개변수 : 주민등록번호
	// 리턴값(리턴자료형) : 남/'여'  1/2  G(정수)
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
