package days12;

/**
 * @author 조연화
 * @date 2024. 1. 16. 오후 12:20:41
 * @subject [수업 종료 후 풀어보기] - 1차원배열로 바꿔보기 
 * @content	
 */
public class Ex04_03 {

	public static void main(String[] args) {
		
		
		// 3행 4열 2차원배열
		int [][] n = {
				{1,2,3,4},
				{5,6,7,8},
				{9, 10, 11, 12}
		};
		
		// 2행 6열 2차원배열
		int [][] m = new int[2][6];
		
		// n -> m
		
		
	} // main


	private static void dispN(int[][] n) {
		for (int i = 0; i < n.length; i++) { // 행갯수
			for (int j = 0; j < n[i].length; j++) { // 열(별)갯수
				System.out.printf("m[%d][%d]=%d ", i, j, n[i][j]);
			}
			System.out.println();
		}
	}

	private static void dispM(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d]=%d", i, m[i]);
		}
		System.out.println();
	}

} // class
