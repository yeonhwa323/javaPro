package days20;

import java.text.ChoiceFormat;

import javax.security.auth.callback.ChoiceCallback;

/**
 * @author 조연화
 * @date 2024. 1. 26. 오후 3:48:53
 * @subject 
 * @content 
 */
public class Ex08 {

	public static void main(String[] args) {
		// [ ChoiceFormat 형식화클래스 ]
		// 1. 특정 범위에 속하는 값을 문자열로 변환해 준다.
		// 2. 불연속적인 범위의 값을 처리하는 데
		//		if문, switch문을 대신해서 사용할 수 있다.
		// 			-> 복잡한 처리를 간단한 코딩으로 처리할 수 있다.
		// 예) 국어점수 -> 수우미양가 출력
		//		if문, switch문
		
		// [2]
		String newPattern = "0#가|60#양|70#미|80#우|90#수";
		ChoiceFormat cf = new ChoiceFormat(newPattern);
		
		/* [1]
		// 특정 범위
		double [] limits = {0, 60, 70, 80, 90};
		// 문자열
		String [] formats = {"가", "양", "미", "우", "수"};
		ChoiceFormat cf = new ChoiceFormat(limits, formats);
		*/
		
		int [] kors = {100, 78, 98, 65};
		for (int i = 0; i < kors.length; i++) {
			System.out.printf("%d -> %s 등급\n"
					, kors[i], cf.format(kors[i]));
		}
		
		
	}// main

}// class
