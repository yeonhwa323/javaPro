package days17;

/**
 * @author 조연화
 * @date 2024. 1. 23. 오후 12:30:26
 * @subject 
 * @content 
 */
public class Ex07 {

	public static void main(String[] args) {
		// [인터페이스 장점]
		// 1. 개발 시간을 단축시킬 수 있다.
		//		이유? 인터페이스만 작성	--> 개발진행
		//			 인터페이스를 구현한 클래스 선언 X
		// 2. 표준화가 가능하다.
		//		프로젝트 진행 - 인터페이스만 작성
		// 3. 서로 관계없는 클래스들에게 관계를 맺어 줄 수 있다.
		//		같은 Super 클래스(조상)가 아니어도
		//		아무 관계 없는 클래스들일지라도 같은 인터페이스만
		//		구현했다면 관계를 맺어 줄 수 있다.
		// 4. 독립적인 프로그래밍이 가능하다. (1번내용과 같은내용-> 클래스선언없이 개발진행가능)
		
		Idisp a1 = new A();
		Idisp b1 = new B();
		
		print(a1);
		print(b1);
		
		// 참고) 클래스(객체) 제작사(생산자)		-> 클래스 사용자
		//			Provider					User
		//			인터페이스만 선언				인 사용 가능
		//			구현된 클래스 X				개발 가능
	}// main

	static void print(Idisp i) {
	
	}

}// class

interface Idisp{
	void disp();
}

class A implements Idisp{

	@Override
	public void disp() {
	}
	
}
class B implements Idisp{

	@Override
	public void disp() {
	
	}
	
}



