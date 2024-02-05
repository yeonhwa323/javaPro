package days10;
/**
 * @author 조연화
 * @date 2024. 1. 12. 오전 10:10:40
 * @subject [day09 복습문제 2번 풀이]
 * @content	
 */
public class Ex01_02_02 {

	public static void main(String[] args) { // 달력
		// 10 진수 정수 => 16진수 출력
		int n = 125; // 0x7D
		
		int share,reminder;
		
		// String strHex = "";
		StringBuilder sb = new StringBuilder();
		
		String hex = "0123456789ABCDEF";		
		while (n != 0) { 
			share = n/16;
			reminder = n % 16;		
			// System.out.println(reminder);
			sb.append(hex.charAt(reminder));
			// sb.insert(0, hex);
			
			n = share;
		}//while
			
		 System.out.println( sb.reverse() );
			
		
	}//main
}// class
