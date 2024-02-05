package days22;

import java.util.Stack;

/**
 * @author 조연화
 * @date 2024. 1. 30. 오후 12:15:57
 * @subject 
 * @content 
 */
public class Ex06 {

	public static void main(String[] args) {
		// [스택(Stack) 구조와 큐(Queue) 구조]
		// [스택(Stack) 구조]
		
		// LIFO		구조 - 추가:push()/삭제후 꺼낼때:  pop()		, empty(), search()
		//							 삭제없이 꺼낼때: peek()
		
		// Stack -> Vector -> List
		Stack s = new Stack();
		
		s.push("권맑음");
		s.push("이동찬");
		s.push("김영진");
		
		// s.iterator() 사용X
		/*
		System.out.println( s.pop() ); // LIFO
		System.out.println( s.pop() );
		System.out.println( s.pop() );
		*/
		/*
		while ( s.empty() ) { // s.isEmpty() Vector
			System.out.println(s.pop());
		}
		*/
		
		// s.indexOf("홍길동");
		System.out.println( s.search("홍길동")); // -1
		
				
	}// main

}// class
