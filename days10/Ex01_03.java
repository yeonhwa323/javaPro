package days10;
/**
 * @author 조연화
 * @date 2024. 1. 12. 오전 10:10:40
 * @subject [day09 복습문제 2번 풀이]
 * @content	
 */
public class Ex01_03 {

	public static void main(String[] args) { // 달력
		// 10 진수 정수 => 16진수 출력
		int n = 125; // 0x7D
		
		int share,reminder;
		
		String strHex = "";
		
		// 0123456789ABCDEF
		//	0	1	2	3	4	5
		char [] ch = {'0', '1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
		
		// 내용 채우기.............
		
		
				
		while (n != 0) { 
			share = n/16;
			reminder = n % 16;		
			// System.out.println(reminder);
			strHex = ch[reminder] + strHex;
			
			n = share;
		}//while
		
		System.out.println(strHex);
		
		
	}//main
}// class

