package days06;

/**
 * @author 조연화
 * @date 2024. 1. 8. 오후 4:17:50
 * @subject [이중 for 문]
 * @content	
 */
public class Ex07_04 {

	public static void main(String[] args) {


		// [구구단 세로 출력] - 내가 푼 식
		for( int i = 1; i <= 9; i++) {
			// System.out.printf("[%d단]", d);
			for (int d = 2; d <= 9; d++) {
				System.out.printf("%d*%d=%02d ", d, i, d*i);
			}// for i

			System.out.println();
		}// for d


	}//main

}//class

