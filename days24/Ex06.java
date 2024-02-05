package days24;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 조연화
 * @date 2024. 2. 1. 오후 1:58:43
 * @subject 
 * @content 
 */
public class Ex06 {

	public static void main(String[] args) {
		/*
		 * [제너릭(Generics)]
		 * 1. jdk1.5 - 제너릭 ***가장큰변화
		 * 	  jdk1.8 - 람다식
		 * 2. 제너릭 ?
		 * 	 [다양한 타입]의 객체를 다루는 메서드, 컬렉션 클래스에서
		 * 	 [컴파일 시]에 타입을 체크해 주는 기능.
		 * 3. 왜 ? 객체의 타입을 컴파일 시에 체크하는 이유
		 * 	1) 객체의 타입 안전성을 노인다.
		 * 	2) 형 변환의 번거로움이 줄어든다->코드가 간결해진다.
		 *  (1+2) (제너릭의 장점)이자 사용하는 이유
		 * */
		
		/*
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(3.14);
		list.add('A');
		list.add("홍길동");
		list.add(true);
		list.add(new MemberVO());
		*/
		// ArrayList 컬렉션 클래스 안에 있는 자료형 형변환 일일이 선언해야함.
		/*
		int i = (int) list.get(0);
		double d = (double) list.get(1);
		char c = (char) list.get(2);
		String s = (String) list.get(3);
		MemberVO vo = (MemberVO) list.get(4);
		*/
		
		// 제너릭 + 클래스 = [제너릭 클래스]
		ArrayList<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("박길동");
		list.add("김길동");
		
		// [첫 번째 장점] - 타입 안전성 (다른 타입입력불가)
		// 컴파일러가 타입을 체크 오류 : list.add(100); 
		
		// [두 번째 장점] - 형변환 필요 없다.(코드 간결성)
		String name = list.get(0);
		name = list.get(1);
		name = list.get(2);
		
		Iterator<String> ir = list.iterator();
		while (ir.hasNext()) {
			name =  ir.next();// 형변환 필요X			
		}
		
		
	}// main

}// class
