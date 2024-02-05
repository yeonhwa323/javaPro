package days24;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 조연화
 * @date 2024. 2. 1. 오후 3:22:05
 * @subject [와일드 카드]
 * @content 
 */
public class Ex06_06 {

	public static void main(String[] args) {
		
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		FruitBox<Apple> appleBox = new FruitBox<>();
		FruitBox<Grape> grapeBox = new FruitBox<>();
		
		
		// 일반메서드 호출
		Juice juice = Juicer.makeJuice(fruitBox);
		juice = Juicer.makeJuice(appleBox);
		//juice = Juicer.makeJuice(grapeBox);
		
		// makeJuice() 를 제네릭 메서드로 선언(수정) -> 호출하는 방법 다르다.
		juice = Juicer.<Grape>makeJuice(grapeBox);
		juice = Juicer.makeJuice(grapeBox); // <Grape> 생략 가능하다.
		
		// 이해
		// ArrayList<Fruit> list = new ArrayList<Fruit>(Collections<? extends Fruit>)
		

	}// main

}// class

class Fruit extends Object{
	public String tostString() {
		return "Fruit";
	}
		
}
class Apple extends Fruit{
	public String tostString() {
		return "Apple";
	}
}
class Grape extends Fruit{
	public String tostString() {
		return "Grape";
	}
}

class Toy{
	public String tostString() {
		return "Toy";
	}
}

// 			T 모든 타입
class Box05<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {this.list.add(item);}
	int size() { return this.list.size(); }
	T get(int i)  { return this.list.get(i); }
	public String toString() { return this.list.toString();}  
}

class FruitBox<T extends Fruit> extends Box05<T>{
	
}

// [주스 클래스]		제네릭클래스 X
class Juice{
	
}

// [주스 만드는 기기]
// 과일(사과, 포도) 재료 -> 주스(Juice) 생산
class Juicer{
	/*
	static Juice makeJuice(FruitBox<? extends Fruit> box) {
		return new Juice();
	}
	*/
	// 위의 일반 static 메서드를 제네릭 메서드 메서드로 변경
	// [제네릭 메서드]
	//		ㄴ 메서드의 선언부에 제네릭 타입이 선언된 메서드를 
	//		   제네릭 메서드 라고 한다.
	// 		ㄴ 선언 형식
	//		접근지정자 static <T> 리턴 자료형 제네릭메서드명( 매개변수 ){}
	static <T extends Fruit> Juice makeJuice(FruitBox<T> box) {
		return new Juice();
	}
	
		
	/*
	static Juice makeJuice(FruitBox<Fruit> box) {
		return new Juice();
	}
	
	
	static Juice makeJuice(FruitBox<Apple> box) {
		return new Juice();
	}
	
	static Juice makeJuice(FruitBox<Grape> box) {
		return new Juice();
	}
	
	// 메서드 오버로딩 조건 확인
	// 이유 ? 제네릭 타입의 매개변수는 오버로딩이 성립되지 않는다.
	// 그래서 해결책으로 고안된 것이 		와일드 카드(기호 ? ) 사용한다.
	 * 					? 모든 타입 == Object 같은 의미
	 * 
	 * 				   <?> == <? extends Object> 모든 타입, 타입 제한 없음,
	 * 				   <? extends T>	T타입과 그 자손들만 가능 
	 * 				   <? super T>		T타입과 그 조상들만 가능 
	*/
	
}
