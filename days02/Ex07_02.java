package days02;

import java.util.Calendar;

/**
 * @author yeonhwa
 * @date 2024. 1. 2. - 오후 3:04:22
 * @subject  
 * @content 
 */
public class Ex07_02 {

	public static void main(String[] args) {
		int i = 10;
		// \t 탭키 => 자동줄맞춤
		System.out.printf("%d\t%o\t%x\t%X\n", i, i, i, i );
		System.out.printf("%1$d\t%1$o\t%1$x\t%1$X\n", i);
		System.out.printf("%1$d\t%1$#o\t%1$#x\t%1$#X\n", i);
		
		// 날짜 클래스
		Calendar c = Calendar.getInstance();
		System.out.printf("%1$tY - %1$tm - %1$te \n", c);
		
		// 출력서식 사용할 때 형식(문법)
		// %[argument_index$][flags][width][.precision]conversion / ex:[%04d] -> oracle 도움말 참조
		boolean gender = true;
		System.out.printf("%b \n", gender );
		
		int tot = 277;
		double avg = 92.333333333333333;
		
		// [width]해당
		System.out.printf("총점 : [%10d] \n", tot );
		System.out.printf("총점 : [%-10d] \n", tot );
		
		System.out.printf("평균 : [%10.2f] \n", avg );
		
		int money = 123456;
		System.out.printf("머니 : %,d \n", money ); // ,(콤마) 입력하면 자동 1000 자리마다 구분해줌
		
		int no = 15;
		// 0015
		System.out.printf("No : [%04d] \n", no );
		
	} // main

} // class
