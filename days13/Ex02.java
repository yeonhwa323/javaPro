package days13;

public class Ex02 { // p.114~230 읽어보기

	public static void main(String[] args) {

		int [][] m = new int[5][5];

		// 마방진
		//magicSquare(m);

		//fillM04(m);
		//fillM03(m);
		//fillM02(m);
		//fillM01(m);

		dispM(m);

		magicSquare2(m);


	}// main
	
	public static void 일시정지출력(int [][] m) {
		dispM(m);
		// 1초 후에 기다리기 
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
	}
	
	/*
	[01][02][03][04][10]
	[05][06][07][08][26]
	[09][10][11][12][42]
	[13][14][15][16][58]
	[28][32][36][40][136]
	*/
	private static void magicSquare2(int[][] m) {
		int n = 1;
		int row = 0;
		int col = 0;
		
		for (int i = 0; i < m.length-1; i++) {
			for (int j = 0; j < m.length-1; j++) {
				
			}
		}
		



	}//magic2

	private static void magicSquare(int[][] m) {
		// 1) 첫 번째 행의 가운데 열    1 
		// 2) 출력한 값이 5의 배수 O    행만 증가
		//                         X
		//          열증가, 행감소
		//              ㄴ행 벗어나는 경우 -가장 큰 행의 값으로 설정. 
		//              ㄴ열 벗어나는 경우 -가장 작은 열의 값으로 설정.

		int n = 1;
		int row = 0, col = 2;

		while( n <= 25) {
			m[row][col] = n;

			dispM(m);

			// 1초 후에 기다리기
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println();

			if (n % 5 == 0) {
				row++;
			} else {
				col++; row--;
				// 행 X, 열 X
				if( col == 5 ) col = 0;
				else if( row == -1) row = 4;
			}      
			n++;
		} // while

	} // magicSquare

	// [대각선]
//	[01][02][04][07][11]
//	[03][05][08][12][16]
//	[06][09][13][17][20]
//	[10][14][18][21][23]
//	[15][19][22][24][25]
	
	// [골뱅이]
	/*
	  [01][02][03][04][05]
	  [16][17][18][19][06] 
	  [15][24][15][20][07]
	  [14][23][22][21][08]
	  [13][12][11][10][09]
	*/

	private static void fillM04(int[][] m) {
		// 지그재그 - 정보처리기사
		/* 지그재그 
		0 [01][02][03][04][05]
		1 [10][09][08][07][06] 
		2 [11][12][13][14][15]
		3 [20][19][18][17][16]
		4 [21][22][23][24][25]
		*/
		// [2]
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				//if(i%2 == 0) m[i][j] = 5*i + j + 1;
				//else m[i][j] = (i+1) *5 - j;
				m[i][i%2==0 ? j : 4-j] = 5*i + j + 1 ;
			}
		}
		/* [1]
		for (int i = 0; i < m.length; i++) { // 행갯수
			for (int j = 0; j < m[i].length; j++) { // 열갯수
				//if( i%2 == 0)  m[i][j] = 5 * i + j + 1;
				//else  m[i][j] = (i+1) * 5 - j;
				m[i][j] = i%2 == 0 ? 5 * i + j + 1 : (i+1) * 5 - j;
			} // for j			
		} // for i
		*/

		/*
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if(i%3==1) m[i][j] = i*5 + 5-j ;
				else m[i][j] = i*5 + j +1;
			}
		}
		 */
	}

	private static void fillM03(int[][] m) {
		for (int i = 0; i < m.length; i++) { // 행갯수
			for (int j = 0; j < m[i].length; j++) { // 열갯수
				m[i][j] = 5-i + 5*j;
			} // for j			
		} // for i
		
		/*
		[05][10][15][20][25]
		[04][09][14][19][24]
		[03][08][13][18][23]
		[02][07][12][17][22]
		[01][06][11][16][21]
		
		00 -> 40
		01 -> 30
		02 -> 20
		03 -> 10
		04 -> 00
		
		10 -> 41
		11 -> 31
		12 -> 21
		13 -> 11
		14 -> 01
		
		20 -> 42
		21 -> 32
		22 -> 22
		23 -> 12
		24 -> 02
		
		
		
		*/
		// i=0 j=01234
		// i=1 j=01234
		// i=2 j=01234
		// i=3 j=01234
		// i=4 j=01234
		
		
		// [1]
		/*
		for (int i = 0; i < m.length; i++) { // 행갯수
			for (int j = 0; j < m[i].length; j++) { // 열갯수
				m[4-j][i] = 5*i+j+1; 
			} // for j			
		} // for i
		*/
		
		
	}


	private static void fillM02(int[][] m) {
		/*
		[25][24][23][22][21]
		[20][19][18][17][16]
		[15][14][13][12][11]
		[10][09][08][07][06]
		[05][04][03][02][01] 
		 */
		// p114~230 


		
		
		// [1]
		/*
		for (int i = 0, value =25; i < m.length; i++) { // 행갯수
			for (int j = 0; j < m[i].length; j++, value--) { // 열갯수
				m[i][j] = value ; // 1,2,3,4,~ 25
			}//for j

		}// for i
		// [2]
		for (int i = 0; i < m.length; i++) { // 행갯수
			for (int j = 0; j < m[i].length; j++) { // 열갯수
				m[i][j] = 25 - (5*i+j) ; // 1,2,3,4,~ 25
			}//for j

		}// for i

		 */
	}//fillM02

	// 00 1
	// 01 2
	// *** 2차원 -> 1차원
	// 1차원 -> 2차원

	private static void fillM01(int[][] m) {
		for (int i = 0; i < m.length; i++) { // 행갯수
			for (int j = 0; j < m[i].length; j++) { // 열갯수
				m[4-i][4-j] = 5 * i + j + 1 ; // 1,2,3,4,~ 25
			}//for j

		}// for i

	}// dispM

	// [1]
		/*
		private static void fillM01(int[][] m) {
			for (int i = 0, value = 1; i < m.length; i++) { // 행갯수
				for (int j = 0; j < m[i].length; j++, value++) { // 열갯수
					 m[i][j] = value;
				} // for j			
			} // for i

		} // dispM
		 */


	private static void dispM(int[][] m) {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(); 
		
		for (int i = 0; i < m.length; i++) { // 행갯수
			for (int j = 0; j < m[i].length; j++) { // 열갯수
				System.out.printf("[%02d]", m[i][j]);
			}//for j
			System.out.println();
		}// for i

	}// dispM

}// class
