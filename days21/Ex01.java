package days21;

/**
 * @author 조연화
 * @date 2024. 1. 29. 오전 10:03:03
 * @subject 
 * @content 
 */
public class Ex01 {

	public static void main(String[] args)  {
		/*
		 * 1. Date(jdk 1.0)
		 * 	  Calendar(jdk 1.1)
		 * 
		 * 2. jdk1.8 이후~ 새로 추가된 날짜와 시간 클래스
		 *    java.time : 날짜, 시간을 다루는 핵심 클래스 제공
		 *     	  ㄴ	j.t.chrono : 표준(ISO)이 아닌 달력 시스템을 위한 클래스 제공 (j.t = java.time)
		 *     	  ㄴ	j.t.format : 형식화(파싱) 클래스 제공
		 *     	  ㄴ	j.t.temporal(시간의) : 날짜, 시간의 필드(field)와 단위(unit) 클래스 제공
		 *     	  ㄴ	j.t.zone : 시간대(time-zone) 클래스 제공
		 *     
		 * 3. java.time : 날짜, 시간을 다루는 핵심 클래스 제공 => 1)~3)을 많이 사용함
		 *  1) 날짜 : LocalDate 클래스
		 *  2) 시간 : LocalTime 클래스
		 *  3) 날짜 + 시간 : LocalDateTime 클래스
		 *  4) 날짜+시간+시간대 : ZonedDateTime 클래스
		 *  
		 *  	-> Temporal, TemporalAdjuster 인터페이스를 구현한 클래스
		 *  
		 * 4. Period   클래스 = 날짜와 날짜 사이의 간격 다루는 클래스
		 * 	  Duration 클래스 = 시간과 시간 사이의 간격   "  "
		 * 	    -> TemporalAmout 인터페이스를 구현
		 * 		 
		 * 5. j.t핵심클래스들은 new 객체 생성 X
		 * 		: now()
		 * 		: of()  => Ex02.java
		 * 		
		 * 6. 날짜+시간의 [단위]를 정의해 놓은 인터페이스 : Temporal[Unit]
		 *    위의 인터페이스를 구현한 클래스 	      	 : Chrono[Unit] 클래스
		 *   
		 * 7. 날짜+시간의 [필드(field)]를 정의해 놓은 인터페이스 : Temporal[field]
		 *    위의 인터페이스를 구현한 클래스 					: Chrono[Field] 클래스
		 *    
		 * 8. 특정 필드(년,월,일,시간,분,초,요일 등등) 가져올 때 사용하는 인터페이스
		 * 		: getXXX() - getYear()
		 * 		  get(field)
		 * 
		 * 9. 특정 필드 수정
		 * 		: with()
		 * 		  plus()
		 * 		  minus()
		 * 		  roll() / add()
		 * */
		
		

	}// main

}// class
