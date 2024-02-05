package days22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author 조연화
 * @date 2024. 1. 30. 오전 10:26:06
 * @subject [복습 5번 풀이]
 * @content 
 */
public class Ex02_02 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Person2("이동영", 25));
		list.add(new Person2("류영은", 20));
		list.add(new Person2("홍길동", 30));
		list.add(new Person2("박길동", 28));
		list.add(new Person2("조연화", 27));
		list.add(new Person2("한재호", 21));
		
		System.out.println( list );
		
		// 오름차순정렬
		list.sort(null);
		
		// 나이순 오름차순 정렬
		//list.sort((o1, o2) -> { });
		
		
		// 반복자 출력
	    Iterator ir = list.iterator();
	    while (ir.hasNext()) {
			Person2 p = (Person2) ir.next();
			System.out.println( p );
		}

	} // main

} // class

@Data
@AllArgsConstructor
class Person2 implements Comparable{
	private String name;
	private int age;
	
	@Override
	public int compareTo(Object o) {
		Person2 p = (Person2)o;
		return this.age - p.age; // 0 양수 음수  int
	}
}






