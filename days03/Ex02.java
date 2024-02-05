package days03;

/**
 * @author 조연화
 * @2024. 1. 3. 오전 11:19:37
 * @subject
 * @content
 */
public class Ex02 {

	public static void main(String[] args) {
		
		// [0] or [1] 0/1 -> 2값은 넣을 수 없음.
		
		// i, j 중 하나만 long 형으로 변환해야 값이 오류가 안남.
		int i = Integer.MAX_VALUE; // 100;
		int j = 100;
		
		long k = (long) i + j; // 산술 오버플로워(overflow) 발생 -> 에러잡기 힘듦. 작을땐 언더플로워발생
		
		System.out.printf("%d + %d = %d\n", i, j, k);

	} // main

} // class
