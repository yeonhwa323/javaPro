package days05;

/**
 * @author 조연화
 * @date 2024. 1. 5. 오전 11:26:39
 * @subject 
 * @content
 */
public class Ex02_03 {

	public static void main(String[] args) {
		
		// 함수(메서드)		return 문
		// 제어문			break 문
		
		int kor = 98;
		
		switch (kor / 10) { 
		// jdk 14버전부터 case 10, 9; 처럼 나열 가능해짐.
		case 10 :
		case 9 :
			System.out.println("수");
			break;
		case 8 :
			System.out.println("우");
			break;
		case 7 :
			System.out.println("미");
			break;
		case 6 :
			System.out.println("양");
			break;
			
		default:
			System.out.println("가");
			break;
			// case 5,4,3,2,1;
	
		}// switch

	} //main

} //class
