package days08;

/**
 * @author 조연화
 * @date 2024. 1. 10. 오후 12:42:51
 * @subject 
 * @content	1/11 다시할내용
 */
public class Ex04_04 {

	public static void main(String[] args) {
		// [문제]
		// [거듭제곱] == 누승 == 멱 == pow
		// 밑수(2)를 지수(3)만큼 반복해서 곱하는 것
		// 2^3 = 2*2*2 = 8
		//2^-3 = 1/(2^3) = 1/8 = 0.125
		
		//int result = pow(2,3);
		 int result = pow(2,-3);		
		System.out.println(result);
		//recursivePow();
	}// main

	// 일반함수 밑수:x 지수:y
	private static int pow(int x, int y) {
		int result = pow(x, y);
		if(x>=1&&x<=9&&y>=0&&y<=9) System.out.printf("%d^%d", x , y);			
		return result;
	}// pow
	
	// 재귀함수
	private static void recursivePow(int x, int y) {
		if (y < 0) {
			System.out.printf("1/(%d^%d)",x,y);		
		} else {
			System.out.printf("%d^%d", x , y);
		}
		
	}//recursivePow

}// class
