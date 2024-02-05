package days22;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 조연화
 * @date 2024. 1. 30. 오후 12:26:59
 * @subject 
 * @content 
 */
public class Ex07 {

	public static void main(String[] args) {
		// [큐(Queue) 구조]
		// 디큐(Deque) 구조 == 더블 큐 구조
		
		// offer() - 넣을때		poll(), peak() - 가져올때
		// FIFO 구조
		// 			LinkedList -> List, Deque -> Queue -> Collection
		Queue q = new LinkedList();
		q.offer("권맑음");
		q.offer("이동찬");
		q.offer("김영진");
		
		// Deque 추가
		// q.offerFirst(q);
		// q.offerLast(q);
		// q.pollFirst();
		// q.pollLast();
				
		// FIFO 구조
		while ( !q.isEmpty() ) {
			System.out.println( q.poll() );
		}
		
		
		

	}// main

}// class
