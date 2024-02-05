package days23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Iterator;

/**
 * @author 조연화
 * @date 2024. 1. 31. 오전 10:04:23
 * @subject [복습 2번문제]
 * @content [로또 번호를 내림차순으로 정렬] - 해보기
 */
public class Ex01 {

	public static void main(String[] args)  {

		int n = 5; // 게임횟수
		// Syntax error, insert "Dimensions" to complete ReferenceType(int->Integer로 변경)
		LinkedHashSet<Integer> lotto = null; // 뒤 Integer생략가능
		ArrayList<LinkedHashSet<Integer>> lottos = new ArrayList<>(n);

		// 입력 - 문제점 파악/해결
		int ln = 0;
		for (int i = 0; i < n; i++) {
			lotto = new LinkedHashSet<>(6);			
			while (lotto.size()< 6 ) {
				ln = (int)(Math.random()*45+1);
				lotto.add(ln);
			}// while
			lottos.add(lotto);
		}// for

		// 출력
		int cnt = 1;
		Iterator<LinkedHashSet<Integer>> ir = lottos.iterator();
		// Arrays.sort(null);
		// Collections.sort(List<T> list);
		LinkedList<Integer> list = null;
		while (ir.hasNext()) {			
			lotto = ir.next();	// LinkedHashSet(자료형)
			
			list = new LinkedList<Integer>(lotto);
			Collections.sort(list);
					
			System.out.printf("%d게임 : ", cnt++);
			Iterator<Integer> ir2 = list.iterator();
			while (ir2.hasNext()) {
				ln = ir2.next();	// Integer -> int 오토언박싱
				System.out.printf("[%02d]", ln);
			}
			System.out.println();
		}//while
		
	}// main

}// class



