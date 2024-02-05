package days03;

/**
 * @author 조연화
 * @date 2024. 1. 3. 오후 4:22:05
 * @subject	산술연산자	>> <<
 * @content ㄴ 쉬프트(shift) 연산자
 * 			   물건을 이동시키다.
 * 					옮기다.
 * 					바꾸다.
 */
public class Ex06_03 {

	public static void main(String[] args) {
		//				0000 1010
		System.out.println( 10 );
		System.out.println( 10 >> 2 ); // 2 (2칸 이동하고 빈칸은 첫번째자리 숫자로 채운다)
		System.out.println( 10 >>> 2 ); // 2 
		System.out.println( 10 << 2 ); // 40 (2칸 이동하고 빈칸은 0으로 채운다)

	}

}
