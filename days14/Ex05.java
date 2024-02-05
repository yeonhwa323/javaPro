package days14;

/**
 * @author 조연화
 * @date 2024. 1. 18. 오후 12:05:08
 * @subject 
 * @content	
 */
public class Ex05 {

	public static void main(String[] args) {
		// 1) 객체(클래스) 복사 copy - 인스턴스 같은 것을 복사
		// 2) 객체(클래스) 복제 clone

		Tv tv1 = new Tv();
		tv1.color = "red";
		changeColor(tv1);
		System.out.println( tv1.color );
		// Tv tv2 = new Tv();
		Tv tv2 = tv1;  // 객체 복사(copy)

		int x = 100;
		plusX(x);
		System.out.println( x );

		int [] m = {100};
		plusM(m);
		System.out.println( m[0] );

	} // main
	//                        객체 복사      Tv tv1= tv1
	private static void changeColor(Tv tv1) {
		tv1.color = "blue";
	}

	private static void plusM(int[] m) {
		m[0]++;
	}

	private static void plusX(int x) {

		x++;

	}

} // class