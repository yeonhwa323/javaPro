package days08;

import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

/**
 * @author 조연화
 * @date 2024. 1. 10. 오전 11:46:39
 * @subject 재귀함수( recursive function )
 * @content	재귀 =	순환, 되풀이되는, 재귀하는
 * 					함수 안에서 자기 자신을 다시 호출하는 함수를
 * 					"재귀함수"라고 한다.
 */
public class Ex04 {

	public static void main(String[] args) {
		disp();
	}// main

	private static void disp() {
	System.out.println("> disp() 호출됨...");
	disp(); // 함수 호출
	}

}// class
