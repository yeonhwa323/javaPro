package days16;
/**
 * @author 조연화
 * @date 2024. 1. 22. 오전 10:41:12
 * @subject 
 * @content 
 */
public class Ex02 {

	public static void main(String[] args) {
		// [ 클래스들 간의 관계 ]
		// 1. has-a 관계
		//	   가지다
		//		A 클래스가 B라는 클래스 가지는 관계
		//		  객체		객체		포함
		//	예)	  자동차		엔진
		//		  Car		Engine
		
		// 2. is-a 관계( 상속 관계 )
		Engine engine = new Engine();
		
		/*
		Car myCar = new Car();
		// DI(의존성 주입) 하는 방법 중 하나 : setter
		myCar.setEngine(engine);
		*/
		
		// DI(의존성 주입) 하는 방법 중 하나 : 생성자
		Car myCar = new Car(engine);
		
		
		// 20년 ~ 운행
		engine = new Engine();
		myCar.setEngine(engine);
		
		/*
		myCar.speedUp(100);
		// 속도 출력
		int currentSpeed = myCar.getEngine().speed;
		// NullPointerException
		System.out.println("현재속도 : " + currentSpeed );
		*/
		
		myCar.speedDown(10);
		int currentSpeed = myCar.getEngine().speed;
		System.out.println("현재속도 : " + currentSpeed );
		
	
	}//main

}//class
