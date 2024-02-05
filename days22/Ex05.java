package days22;

/**
 * @author 조연화
 * @date 2024. 1. 30. 오전 11:31:51
 * @subject 
 * @content 
 */
public class Ex05 {

	public static void main(String[] args) {
		// [LinkedList 컬렉션 클래스]
		//	사슬(고리) 연결된 + List
		//		0x100	0x200   0x300
		// [ [참조변수]]-[ 	 ]-[  노드  ]-[ 노드 ]-[ 노드 ]-[ ]
		//		주소
		
		// 단방향		 링크드 리스트	+ 환형
		// 더블(양방향) 링크드 리스트	+ 환형
		// [ [참조변수]]-[ 	 ]         [  노드  ]-[ 노드 ]-[ 노드 ]-[ ]
		
		// 1) 배열
		//	  (1) 장점 = 읽기 성능이 가장 빠르다.(삽입/수정/삭제 제외)
		//	  (2) 단점 = 배열크기X, 삽입/삭제 등 무지 속도 느리다.
		
		// 2) LikedList
		//		(1) 특징 - 비연속적. 삽입/삭제 성능 매우 빠르다.
		
		Node node1 = new Node();
		node1.value = 10;
		
		Node node2 = new Node();
		node2.value = 20;
		
		Node node3 = new Node();
		node3.value = 30;
		
		Node node4 = new Node();
		node4.value = 40;
		
		Node node5 = new Node();
		node5.value = 50;
		
		node1.next = node2;
		node2.next = node3;
		node2.next = null;
		node3.next = node4;
		node4.next = node5;
		node5.next = null;
		
		// 모든 노드들의 value 출력.
		Node node = node1;
		while (node != null) {
			System.out.println(node.value);
			node = node.next;
			
		}//while
		
		
		
	}// main

}// class

class Node{
	
	int value; // 값
	
	// 뒤의 노드를 참조할 수 있는 참조변수
	Node next = null;
	Node prev = null;
	
	
}







