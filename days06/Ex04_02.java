package days06;

import java.io.IOException;

/**
 * @author 조연화
 * @date 2024. 1. 8. 오후 2:51:49
 * @subject 
 * @content	
 */
public class Ex04_02 {

	public static void main(String[] args) throws IOException {
		/*
		4. 알파벳(대,소문자) 코드 및 문자를 출력하는  코딩을 하세요.
		   ( 조건 : 한 라인에 10개씩 출력 )

		   [실행결과]
			 1 : A(065)B(066)C(067)D(068)E(069)F(070)G(071)H(072)I(073)J(074)
			 2 : K(075)L(076)M(077)N(078)O(079)P(080)Q(081)R(082)S(083)T(084)
			 3 : U(085)V(086)W(087)X(088)Y(089)Z(090)a(097)b(098)c(099)d(100)
			 4 : e(101)f(102)g(103)h(104)i(105)j(106)k(107)l(108)m(109)n(110)
			 5 : o(111)p(112)q(113)r(114)s(115)t(116)u(117)v(118)w(119)x(120)
			 6 : y(121)z(122)
		 */
		// 대,소문자 출력 for문
		// Z(090) 91~96 a(097)
		// 한 라인에 10개씩 출력(추가)
		//  각 라인별로 라인번호를 붙이자   1:
		
		for (int i = 'A', count = 1, lineNumber = 1; i <= 'z'; i++) {
				
			// if (i>'Z' && i <'a') continue;
			if (Character.isAlphabetic(i)) {
				if( count % 10 == 1) System.out.printf("%d: ", lineNumber++);
				System.out.printf("%c(%03d)", (char)i, i);
				/*
				if (Character.isUpperCase(i)) { // 대문자 // 대문자 %10 == 4 개행
					if(i % 10 == 4) System.out.println();
				} else { // 소문자 // 소문자 %10 == 0 개행
					if(i % 10 == 0) System.out.println();
				}
				*/
				if ( count % 10 == 0)System.out.println();
		
				count++;
				
			}// if
			
		}//for
		
		
	}//main

}//class
