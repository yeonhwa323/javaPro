package days15;

/**
 * @author 조연화
 * @date 2024. 1. 19. 오전 10:52:31
 * @subject 
 * @content 
 */
public class Ex02 {

public static void main(String[] args) {
		
		int [][] m = new int[5][5];
		
		for (int i = 0, n = 1; i < 5-1 ; i++) {
			for (int j = 0; j < 5-1; j++) {
				m[i][j] = n; 
				m[4][j] += n; 
				m[i][4] += n; 
				m[4][4] += n;
				n++;
			}
		}
		
	    for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.printf("[%02d]", m[i][j]);
			}
			System.out.println();
		}
	
	} // main

}// class
/*
[01][02][03][04][10]
[05][06][07][08][26]
[09][10][11][12][42]
[13][14][15][16][58]
[28][32][36][40][136]
*/
