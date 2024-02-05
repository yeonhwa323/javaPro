package days09;

import com.util.MyCalendar;

/**
 * @author 조연화
 * @date 2024. 1. 11. 오전 11:13:53
 * @subject 
 * @content	
 */
public class Ex04 {

	public static void main(String[] args) {
		// 4. 2010~2030 까지의 윤년체크하는 함수를 만들어서 
		//  윤년/평년 출력하는 코딩하세요. 
		
		// MyCalendar.isLeapYear(year)
		String result = "평년";
		for (int i = 2010; i <= 2030; i++) {
			result = "평년";
			if(MyCalendar.isLeapYear(i)) result="윤년";
			System.out.printf("%d년 %s\n",i,result);
		}//
		
	}//main

}// class
