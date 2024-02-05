package days14;

/**
 * @author 조연화
 * @date 2024. 1. 18. 오후 2:01:19
 * @subject 
 * @content	Point.java 참고
 */
public class Ex06 {

	public static void main(String[] args) {
		// [ 객체(클래스) 배열 ]
		// 배열
		
		// 클래스(객체) 배열
		// 클래스(Point)를 자료형으로 선언된 배열을 "클래스 배열"이라고 한다.
		Point [] points = new Point[3];
		
		for (int i = 0; i < points.length; i++) {
										// NullPointerException
			points[i] = new Point();	// 꼭 주의
			points[i].dispXY();
			// System.out.println(points[i]);
		} // for
		
		
		

	}// main

}// class
