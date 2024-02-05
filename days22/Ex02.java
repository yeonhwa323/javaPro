package days22;

import java.util.ArrayList;
import java.util.Comparator;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author 조연화
 * @date 2024. 1. 30. 오전 10:26:06
 * @subject [복습 5번 풀이]
 * @content 
 */
public class Ex02 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Person("이동영", 25));
		list.add(new Person("류영은", 20));
		list.add(new Person("홍길동", 30));
		list.add(new Person("박길동", 28));
		list.add(new Person("조연화", 27));
		list.add(new Person("한재호", 21));
		
		System.out.println( list );
		
		// 오름차순정렬

		
		// 나이순 오름차순 정렬
		//list.sort((o1, o2) -> { });
		
		
		// 반복자 출력
		
		
	}// main

}// class

@Data
@AllArgsConstructor
class Person{
	
	private String name;
	private int age;
	
}





