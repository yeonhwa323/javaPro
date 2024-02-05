package days03;

/**
 * @author 조연화
 * @date 2024. 1. 3. 오후 3:50:30
 * @subject 
 * @content
 */
public class Ex06_02 {

	public static void main(String[] args) {
		// 증감연산자		++ --
		// 복합대입연산자	+= -=

		int x = 10;
		
		
		int y = x++; // x=11, y=10; // 후위형
		// int y = ++x;	// x=11, y=11; // 전위형
		// int y = ++x + x++; X
		
		System.out.printf("> x=%d, y=%d\n", x, y);
		
		int n = 100;
		// System.out.println( ++n == 100 );  101==100
		System.out.println( n++ == 100 );  // 100==100
		
		System.out.println( n ); // 101
		
	} // main

} // class
