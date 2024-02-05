package days14;
/**
 * @author 조연화
 * @date 2024. 1. 18. 오전 10:27:10
 * @subject Tv 클래스 선언 -> 객체 생성 후 사용.
 * @content	
 */
public class Ex02 {

	public static void main(String[] args) {
		// 지역변수
		
		// 지역변수, 참조변수, 배열명
		//int [] m ; //->배열을선언하는코딩(int [] m) = 배열생성하는코딩(new int[3])
		
		// [ 자바의 자료형 ]
		
		// 지역변수, 참조변수, 객체명
		// 객체 tv1 선언
		Tv tv1 = null;
		// 객체를 생성하는 코딩, 인스턴스화
		tv1 = new Tv(); //new 자료형(); // -> 객체생성형식/생성자라는 함수호출/객체생성코딩->인스턴스화하는코딩

		// 필드가 초기화X
		/*
		System.out.println( tv1.color );	//null
		System.out.println( tv1.channel);	// 0
		System.out.println( tv1.power );	// false
		*/
		// 객체명.필드명
		// 배열명[index]
		tv1.power();
		System.out.println( "Tv : " + (tv1.power ? "ON": "OFF") );
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelUp();
		System.out.println("현재채널: " + (tv1.power ? "ON": "OFF"));
		
		tv1.power();
		System.out.println( "Tv : " + (tv1.power ? "ON": "OFF") );
		System.out.println("end");
		
	}

}
