package days07;

/**
 * @author 조연화
 * @date 2024. 1. 9. 오전 9:44:21
 * @subject 
 * @content	
 */
public class Ex01 {

	public static void main(String[] args) {
		// 구구단을 세로 출력.
		// 2~5단 k=1
		// 6~9단 k=2
		
		//[문제]
		// [2][3][4]
		// [5][6][7]
		// [8][9]
		
		for (int i = 1; i <= 9; i++) {
			for (int j =2; j <= 4; j++) { // 단
				System.out.printf("%d*%d=%02d ",j,i,j*i);
			}
			System.out.println();
		}// for
			System.out.println();
		for (int i = 1; i <= 9; i++) {
			for (int j =5; j <= 7; j++) { // 단
				System.out.printf("%d*%d=%02d ",j,i,j*i);
			}
			System.out.println();
		}// for
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			for (int j =8; j <= 9; j++) { // 단
				System.out.printf("%d*%d=%02d ",j,i,j*i);
			}
			System.out.println();
		}// for
		
	}// main

}// class
