package days06;

/**
 * @author 조연화
 * @date 2024. 1. 8. 오후 2:43:34
 * @subject 
 * @content	
 */
public class Ex04 {

	public static void main(String[] args) {
		/*
			4. 알파벳(대,소문자) 코드 및 문자를 출력하는  코딩을 하세요.
			   ( 조건 : 한 라인에 10개씩 출력 )
			   
			   [실행결과]
				 A(065)B(066)C(067)D(068)E(069)F(070)G(071)H(072)I(073)J(074)
				 K(075)L(076)M(077)N(078)O(079)P(080)Q(081)R(082)S(083)T(084)
				 U(085)V(086)W(087)X(088)Y(089)Z(090)a(097)b(098)c(099)d(100)
				 e(101)f(102)g(103)h(104)i(105)j(106)k(107)l(108)m(109)n(110)
				 o(111)p(112)q(113)r(114)s(115)t(116)u(117)v(118)w(119)x(120)
				 y(121)z(122)
		*/
		// 대문자 출력 for문
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.printf("%c(%03d)", (char)i, i);
			if(i % 10 == 4) System.out.println();
		}		
		// 소문자 출력 for문
		for (int i = 'a'; i <= 'z'; i++) {
			System.out.printf("%c(%03d)", (char)i, i);
			if(i % 10 == 0) System.out.println();
		}
		
	} // main

} // class
