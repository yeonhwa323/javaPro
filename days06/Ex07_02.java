package days06;

/**
 * @author 조연화
 * @date 2024. 1. 8. 오후 4:17:50
 * @subject [이중 for 문]
 * @content	
 */
public class Ex07_02 {

	public static void main(String[] args) {
		// while 문 사용해서 코딩.
		int d = 2;
		int i = 1;

		while (d <= 9) {
			System.out.printf("%d단\n", d);
			i = 1;
			while (i <= 9 ) {
				System.out.printf("%d * %d = %d\n",d, i, d*i);
				i++;
			}// while i
			d++;
		}//while d
		
		
		/*
		for( int d = 2; d <= 9; d++) {
			System.out.printf("%d단\n", d);
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", d, i, d*i);
			}// for i
		}// for d
		 */

	}//main
}//class

