package days02;

/**
 * @author yeonhwa
 * @date 2024. 1. 2. - 오전 10:08:01
 * @subject  
 * @content 
 */
public class Ex02 {

	public static void main(String[] args) {
		// 지역변수(local variable)는 반드시 초기화(값을 처음 할당)해야 사용할 수 있다.
		// The value of the local variable name is not used [경고메시지 복사]
		String name; // 0 경고
		
		name = "홍길동";
		
		// [에러] The local variable name may not have been initialized
		System.out.println( name );

	}

}
