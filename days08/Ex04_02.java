package days08;

/**
 * @author 조연화
 * @date 2024. 1. 10. 오후 12:05:07
 * @subject 
 * @content	
 */
public class Ex04_02 {

	public static void main(String[] args) {
		// 1) 1~n 까지의 합을 반환하는 일반함수
		// 2) 1~n 까지의 합을 반환하는 재귀함수
		int n = 10;
		int result = sum(n);
		System.out.printf("1~%d=%d\n", n, result);
	}// main
	
	// 재귀함수 - 가능하면 사용하지 않는것이 좋음 
	// 재귀함수 : 트리구조 - 검색 할 때 사용.
	private static int recursiveSum (int n) {
		if ( n == 1 ) return n;
		else return n + recursiveSum( n-1 );
		
	}//recursiveSum
	/*
	 * [ 재귀함수 처리 과정 설명]
	 * 
	 * */

	// 일반함수
	private static int sum (int n) {
		int result = 0;
		for (int i = 1; i <= n; i++) {	
			result += i;
		}
		return result;
		
	}//sum

	
}// class
