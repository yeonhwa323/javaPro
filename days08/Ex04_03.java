package days08;

/**
 * @author 조연화
 * @date 2024. 1. 10. 오후 12:20:49
 * @subject [재귀함수 예제]
 * @content	
 */
public class Ex04_03 {

	public static void main(String[] args) {
		// 재귀 함수 예제)
		// 팩토리얼( factiorial ) == 계승
		// 정의) 1에서 양의 정수의 곱
		// n!= n * (n-1) * ( n-2 ) * ... * 1
		// 예) 5! = 5*4*3*2*1
		// 0 ! == 1 (약속)
		int n = 5;
		//int result = factorial(n);
		int result = recursivefactorial(n);
		System.out.println("="+result);
		
		// Math.
		
	}// main
	
	// 재귀함수
	private static int recursivefactorial(int n) {
		
		/*
		if ( n == 0 ) return 1; 
		else return n * recursivefactorial( n-1 ); */
		
		/*
		if ( n == 1 ) return n; 
		else if (n == 0) return n+1;
		else return n * recursivefactorial( n-1 ); */
		
		if ( n==1 || n==0 ) return 1; 
		else return n * recursivefactorial( n-1 );
		
		
	}// 0처리해야 무한루프문제 해결됨.
	
	// 일반함수
	private static int factorial(int n) {
		// n!= n * (n-1) * (n-2) * ... * 1
		int result = 1;
		for (int i = n; i >= 1; i--) {
			System.out.printf("%d*", i);
			result *= i;
		}
		return result;
	}

		
}// class
