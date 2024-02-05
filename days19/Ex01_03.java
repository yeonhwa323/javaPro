package days19;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author 조연화
 * @date 2024. 1. 25. 오전 11:08:12
 * @subject 익명클래스, 람다식 -> 암기해오기!!!
 * @content 
 */
public class Ex01_03 {

	public static void main(String[] args) {
		String [] names = {"조연화", "한재호", "류영은", "이동영"};
		
		// [조연화, 한재호, 류영은, 이동영]
		System.out.println(Arrays.toString( names ));
		
		//Arrays.sort(names); 						//오름차순
		//Arrays.sort(names, Collections.reverseOrder());
		
		/*						익명 클래스
		Arrays.sort(names, new Comparator<String>() { // 내림차순

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		*/
		// 위 주석 코딩하고 100% 동일한 코딩. => 람다식으로 표현식
		Arrays.sort(names,(o1, o2)-> o2.compareTo(o1));
		
				
		System.out.println(Arrays.toString( names ));
		
	}

}
