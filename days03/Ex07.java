package days03;

/**
 * @author 조연화
 * @date 2024. 1. 3. 오후 4:42:03
 * @subject 삼항(조건) 연산자
 * @content ?:
 */
public class Ex07 {

	public static void main(String[] args) {
		
		// 항1 ? 항2 : 항3
		//  ㄴ 항1이 참이면 	항2
		//  ㄴ 항1이 거짓이면 	항3
		int x = 10;
		// int y = ( x > 20 ? 100 : 200 );
		int y = ( x > 20 ? 100 : x > 5 ? 1 : 2 );
		System.out.printf("> x=%d, y=%d\n", x, y );
		
		
	} // main

} // class
