package days24;

/**
 * @author 조연화
 * @date 2024. 2. 1. 오후 2:33:47
 * @subject 
 * @content 
 */
public class Ex06_03 {

	public static void main(String[] args) {
		// [ 제네릭의 제한 ]
		
		
	}// main

}// class

class Box2<T>{
	// Cannot make a static reference to the non-static type T
	// [제너릭의 첫 번째 제한]
	// 제너릭 클래스에는 클래스변수(정적필드,static) 선언 X
	// static T item2;

	// [제너릭의 두 번째 제한]
	// 클래스 메서드 선언 + 매개변수 T타입 사용 X
	// Cannot make a static reference to the non-static type T
	/*
	static int compare(T a, T b) {
		return 0;
	}
	*/
	
	// T 타입의 배열은 선언할 수 있다.
	T [] itemArr;
		
	
}	
	

