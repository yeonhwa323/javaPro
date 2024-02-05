package days03;

/**
 * @author 조연화
 * @date 2024. 1. 3. 오후 3:36:25
 * @subject [단항연산자]	~ ! (cast)
 * @content				+ -
 * 						++ --	증감연산자
 */
public class Ex06 {

	public static void main(String[] args) {
		// [문제] 어떤 기억 공간의 값(n)을 1증가 시키는 코딩을 하세요.
		// n = n+5;
		// n += 5;
		
		// Ex06_02.java 증감연산자, 복합대입연산자 종류
		
		// [문제] 어떤 기억 공간의 값(n)을 1증가 시키는 코딩을 하세요.
		//						n=n+1 	n+=1
		int n = 10;
		System.out.printf("n = %d\n", n);		

		// n = 11;
		// n = n + 1;	복합대입연산자 +=	-=
		// n += 1;
		// n++;
		
		n = n-1;
		n -= 1;
		n--;

		//	this.textbox.text = this.textbox.text + "안녕";
		//	this.textbox.text += "안녕";


		System.out.printf("n = %d\n", n);		
		/*
		System.out.println(-3);		// 단항연산자(음수)
		System.out.println(5-3);	// 이항연산자(뺄셈)

		System.out.println(+3);		// 단항연산자(양수)
		System.out.println(5+3);	// 이항연산자(덧셈)
		 */


	}

}
