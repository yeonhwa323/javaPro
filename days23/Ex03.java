package days23;

import java.util.Iterator;
import java.util.LinkedHashSet;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author 조연화
 * @date 2024. 1. 31. 오전 11:06:43
 * @subject [복습 4번문제]
 * @content 
 */
public class Ex03 {

	public static void main(String[] args) {
		
		LinkedHashSet<Person> lhs = new LinkedHashSet<Person>();
		lhs.add(new Person("admin", "관리자", 45));
		lhs.add(new Person("yeon", "조연화", 30));
		// [빌더패턴] @
		// 가독성, 생성자의 파라미터 순서 상관 없다.
		lhs.add(new Person().builder().id("hong").age(20).name("홍길동").build());
		
		lhs.add(new Person("admin", "서영학", 40)); // X 삽입불가
		
		// 출력
		Iterator<Person> ir = lhs.iterator();
		while (ir.hasNext()) {
			Person p = ir.next();
			System.out.println( p );
		}
		
	}// main

}// class

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
class Person{
	private String id;
	private String name;
	private int age;
	
	@Override
	public int hashCode() {
		return this.id.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			return this.id.equals(p.id);
		}
		return false;
	}

}




