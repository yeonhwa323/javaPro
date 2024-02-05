package days22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 조연화
 * @date 2024. 1. 30. 오전 10:46:24
 * @subject 
 * @content 
 */
public class Ex03 {

	public static void main(String[] args) {
		// [1] ArrayList -> String[] 변환
		
		ArrayList list = new ArrayList();
		list.add("유진");
		list.add("원대안");
		list.add("윤형준");
		System.out.println( list );
		
		// Object [] -> String [] 강제 형변환
		String [] names = (String[]) list.toArray(new String[list.size()]);
		System.out.println( Arrays.toString(names));
		
		// [2] String[] -> ArrayList 변환
		List l = Arrays.asList(names);
		System.out.println( l );
		
		ArrayList list2 = new ArrayList(l); // Collection <- List 매개변수
		System.out.println( list2 );
			
		
	}// main

}// class
