package days23;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author 조연화
 * @date 2024. 1. 31. 오전 11:39:42
 * @subject 
 * @content 
 */
public class Ex05 {

	public static void main(String[] args) {
		/*
		 * Set : HashSet, LinkedHashSet
		 * 		 [TreeSet] 컬렉션 클래스
		 * 1. 중복허용 X, 순서유지 X
		 * 2. 이진 검색 트리라는 자료 구조로
		 * 	  데이터를 저장하는 컬렉션 클래스.
		 * 3. 이진 검색 트리 - 검색, 정렬, 범위 검색하는 데 성능이 높다. 부분검색할때 사용하면 빠르게처리가능
		 *  - 종류 : 트리노드(루트노드(가장상위노드), 부모노드,자식노드....등)
		 * 4. 링크드리스트 처럼 노드(Node)가 서로 연결된 구조
		 * 5. 최상위 노드 : 루트(root)노드
		 * 6. 노드들 간의 관계 : 부모노드, 자식노드, 형제노드 관계
		 * 7. 트리노드
		 *  class TreeNode{
		 *  	Object element;
		 *  
		 *  	TreeNode left; // 왼쪽 자식 노드 참조
		 *  	TreeNode right; // 오른쪽 자식 노드 참조
		 *  }
		 *  
		 * */
		
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(7);
		ts.add(4);
		ts.add(9);
		ts.add(1);
		
		ts.add(5);
		ts.add(6);

		// [1, 4, 5, 6, 7, 9]
		System.out.println( ts );
		
		// 정렬된 순서에서 첫 번째, 마지막 값
		System.out.println( ts.first() ); // 1	
		System.out.println( ts.last() ); // 9
		
		// 범위 검색 - 정렬된 값을 가져옴
		SortedSet<Integer> ss = ts.subSet(4, 7);
		System.out.println( ss );  // [4, 5, 6]
		
		// 지정된 1보다 큰 값(작은 값)을 가진 가장 가까운 값 반환
		System.out.println( ts.higher(1) ); // 4 
		System.out.println( ts.lower(4) ); // 1 
		
		// 지정된 값(3)과 같은 객체를 반환
		// 트리구조에 3 값이 없으면 작은 값을 가진 객체 중에 
		// 가장 가까운 값을 반환
		System.out.println( ts.floor(3)); // 1
		System.out.println( ts.ceiling(3)); // 4
		
		
		
	}// main

}// class
