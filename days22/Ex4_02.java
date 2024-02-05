package days22;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

/**
 * @author 조연화
 * @date 2024. 1. 30. 오전 11:04:08
 * @subject [Vector]
 * @content 
 */
public class Ex4_02 {

	public static void main(String[] args) {
		// Vector 컬렉션 클래스
		//	  ㄴ List 인터페이스
		//	  ㄴ 순서유지O, 중복허용O
		//	  ㄴ ArrayList 동일
		//			차이점 : 멀티 스레드 안전( 동기화 처리O )
		
		// StringBuffer		멀티 스레드 안전( 동기화 처리O )
		// StringBuilder	멀티 스레드 안전X( 동기화 처리X )
		
		//Vector v = new Vector(10, 0);
		Vector v = new Vector();
		v.addElement("강명건");
		v.add("박우현");
		v.add("김영진");
		v.add("홍길동");
		
		// ArrayList 동일, 멀티스레드 안전(동기화 처리O)
		
		// Iterator 	iterator()
		// [ListIterator listIterator() 설명...]
		//		ㄴ Iterator에 양방향으로 조회 기능이 추가된 반복자
		ListIterator ir = v.listIterator();
		while (ir.hasNext()) { // -> 읽는 방향
			String name = (String) ir.next();
			System.out.println( name );
		}
		
		System.out.println( "-".repeat(40) );
		
		while (ir.hasPrevious()) { // <- 읽는 방향
			String name = (String) ir.previous();
			System.out.println( name );
		}
	}// main

}// class

