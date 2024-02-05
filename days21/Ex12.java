package days21;

import java.io.StreamCorruptedException;
import java.util.Arrays;

/**
 * @author 조연화
 * @date 2024. 1. 29. 오후 2:25:22
 * @subject 
 * @content 
 */
public class Ex12 {

	public static void main(String[] args) {
		/*
		 1. ArrayList 컬렉션 클래스
		 	1) Collection
		 		   ㄴ List 인터페이스를 구현한 컬렉션 클래스이다.
		 	2) List 인터페이스의 특징 : 순서유지O, 중복허용O
		 	3) Array(배열) + List(목록)
		 	   배열의 단점이 보완됨
				 ㄴ 배열크기고정-자동증가불가/중간데이터삽입시뒤로밀고삽입 개발자가 직접해야됨
			   요소(Element)
		 */
		
		String [] names = new String[3];
		names[0] = "주강민";
		names[1] = "정하영";
		names[2] = "임경재";
		System.out.println( names.length );
		for (int i = 0; i < names.length; i++) {
			if ( names[i].equals("정하영")) {
				System.out.println( names[i] ); // 정하영
			}
		}

		Arrays.fill(names, null);
		System.out.println( Arrays.toString( names ));
		
		
	}// main

}// class
