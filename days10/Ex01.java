package days10;
/**
 * @author 조연화
 * @date 2024. 1. 12. 오전 10:10:40
 * @subject [day09 복습문제 2번 풀이]
 * @content	
 */
public class Ex01 {

	public static void main(String[] args) { // 달력

		int n = 10;

		int share,reminder;

		String strResult = "";

		while (n != 0) { 
			share = n/8;
			reminder = n % 8;
			// System.out.println(reminder);
			strResult += reminder;
			n = share;
		}//while

		System.out.println(strResult); // "12"
		// "1396"
		// i=0     3(strResult.length()-1)
		// i=1     2
		// i=2     1
		// i=3     0
		String reverseStrResult = "";
		for (int i = 0; i < strResult.length(); i++) {
			reverseStrResult += strResult.charAt(strResult.length()-1-i);
		}

		System.out.println(reverseStrResult);
		// Integer.toOctalString(n);

	}//main
	
}// class

/*시험문제
 * 1. 만나이											Ex07_02
 * 2. 주민등록번호 - 검증, 생년월일						Ex07 / Ex07_03
 * 3. 10진수 정수를 2진수로 출력=> 8,16진수로도 출력하기			
 * */
