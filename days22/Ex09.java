package days22;

import java.util.HashSet;

public class Ex09 {

	public static void main(String[] args) {
		// Collection
		// 	ㄴ List - ArrayList,Vector,LinkedList,Stack,Queue(LinkedList)
		//  ㄴ Set - 순서유지X, 중복허용X
		//			 HashSet 컬렉션 클래스
		//			 만약) Set + [순서 유지O] -> LinkedHashSet 컬렉션 클래스를 사용한다. 
		// 						[중복 허용X]
		//HashSet hs = new HashSet(16, 0.75);
		HashSet hs = new HashSet();
		// hs.add();	hs.addAll();
		hs.add(9);
		hs.add(1);
		hs.add(15);
		hs.add(10);
		System.out.println( hs ); // [1, 9, 10, 15] 1) 순서유지X
		
		hs.add(1);		// 2) 중복허용X
		System.out.println( hs ); // [1, 9, 10, 15] 
		
		
	}// main

}// class
