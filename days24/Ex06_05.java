package days24;

import java.util.ArrayList;

/**
 * @author 조연화
 * @date 2024. 2. 1. 오후 3:09:47
 * @subject [제한된 제네릭 클래스]
 * @content Box<T> Type 모든 자료형 
 * 
 *  		   <T> 먹을 수 있는 과일타입으로 제한
 *  
 *  		   class Box04<T extends Fruit & eatable> 이해
 */
public class Ex06_05 {

	public static void main(String[] args) {
		/*
		Box04<Toy> toyBox = new Box04();
		toyBox.add(new Toy());
		toyBox.add(new Toy());
		toyBox.add(new Toy());
		*/
		/*
		Box04<Apple> aBox = new Box04<>();
		Box04<Grape> gBox = new Box04<>();
		// Box04<빵> 빵Box = new Box04<>(); -> 불가
		*/		
	}// main

}// class
/*
interface eatable{
	//
}

class Fruit extends Object implements eatable{
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

class 빵 implements eatable{
	
}

// 먹을 수 있는 과일만 T 타입으로 + 제네릭 클래스 선언
//class Box04<T>{
//class Box04<T extends Fruit>{
class Box04<T extends Fruit & eatable>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {this.list.add(item);}
	int size() { return this.list.size(); }
	T get(int i)  { return this.list.get(i); }
	public String toString() { return this.list.toString();}  
}
*/

