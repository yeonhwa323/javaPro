package days02;

/**
 * @author yeonhwa
 * @date 2024. 1. 2. - 오전 10:27:24
 * @subject  두 기억공간의 값을 바꾸기 (암기)
 * @content 
 */
public class Ex02_03 {

	public static void main(String[] args) {
		/*
		int x = 10 ;	// 1 2 3 .. 자연수 0 등 정수 저장
		int y = 20;
		*/
		
		// 콤마(,) 연산자를 통해 나타낼수 있다.
		int x = 10, y = 20 ; // 나열할거기 때문에 int x, int y X -> 자료형 int 반복안해도됨
		
		System.out.printf("교환 전 > x=%d, y=%d\n", x, y);
		
		// [작업]
		// 프로그램 상에서 두 기억공간의 값을
		// 교환하려면 반드시 동일한 자료형의
		// 임시기억공간이 필요하다.
		{
		int temp = x;
		x = y;
		y = temp;
		}
		
		System.out.printf("교환 후 > x=%d, y=%d\n", x, y);

		
		
	} // main

} // class

/*
 y = x;
 x = y;
int a = 100;
int b = 100;
int c = 100;
*/
/*
// int a = 100, b = 100, c = 100;
int a, b, c;
//				<- 처리방향
a = b = c =100; // 100으로 초기화 하겠다
*/
