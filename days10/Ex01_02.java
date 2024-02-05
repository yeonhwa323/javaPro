package days10;
/**
 * @author 조연화
 * @date 2024. 1. 12. 오전 10:10:40
 * @subject [day09 복습문제 2번 풀이]
 * @content	
 */
public class Ex01_02 {

	public static void main(String[] args) { // 달력
		// 10 진수 정수 => 16진수 출력
		int n = 125; // 0x7D
		
		int share,reminder;
		
		String strHex = "";
				
		// 0123456789ABCDEF
		while (n != 0) { 
			share = n/16;
			reminder = n % 16;		
			// System.out.println(reminder);
			switch (reminder) {
			case 10: reminder = 'A'; break;
			case 11: reminder = 'B'; break;
			case 12: reminder = 'C'; break;
			case 13: reminder = 'D'; break;
			case 14: reminder = 'E'; break;
			case 15: reminder = 'F'; break;
			default: reminder = reminder + '0'; break;		//'0' = 48 문자로 변환하기위해서 더해줘야함.
			}
			strHex += "["+(char)reminder+"]";
			n = share;
		}//while
		
		System.out.println(strHex);
		
		/*
		String reversestrHex = "";
		for (int i = 0; i < strHex.length(); i++) {
			reversestrHex += strHex.charAt(strHex.length()-1-i);
		}
		*/
	}//main
	
}// class
