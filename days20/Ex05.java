package days20;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author 조연화
 * @date 2024. 1. 26. 오후 12:19:36
 * @subject days19.Ex11_03.java Date 클래스 사용해서 달력출력
 * @content 					=> Calendar 클래스로 변경
 */
public class Ex05 {

	  public static void main(String[] args) {
	      int year = 2024;
	      int month = 1;

	      // int lastDay   = getLastDay(year,  month);
	      int dayOfWeek = getDayOfWeek(year, month, 1);

	      Calendar start = new GregorianCalendar(year, month-1, 1);
	      start.add(Calendar.DATE, -dayOfWeek);

	      //System.out.println( Ex04.getFormatDate(start, "yyyy-MM-dd") );

	      Calendar today = Calendar.getInstance();
	      
	      for (int i = 0; i < 42; i++) {
	         // System.out.println( Ex04.getFormatDate(start, "yyyy-MM-dd") );
	          
	         if ( start.get(Calendar.MONTH)+1  == month) {
	            if( today.equals(start)) {
	               System.out.print("*");     // 시간,분,초,밀리세컨드 인식안되기때문에 안찍힘
	            }
	            System.out.printf("[%02d]\t", start.get(Calendar.DATE));
	         } else {
	            System.out.printf("%02d\t", start.get(Calendar.DATE));
	         }
	          
	         start.add(Calendar.DATE, 1);
	         if( i %  7 == 6 ) System.out.println();
	      }   
	       

	   } // main

	   private static int getLastDay(int year, int month) {
	      Calendar c = new GregorianCalendar(year, month-1, 1); 
	      return c.getActualMaximum(Calendar.DATE);
	   }

	   private static int getDayOfWeek(int year, int month, int date) {      
	      Calendar c = new GregorianCalendar(year, month-1, date);
	      return c.get(Calendar.DAY_OF_WEEK) - 1; // 0(일)~6(토)
	   }

	} // class






