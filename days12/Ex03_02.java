package days12;
/**
 * @author 조연화
 * @date 2024. 1. 16. 오전 11:20:07
 * @subject 3반 23명 학생들의 이름,국어,영어,수학,총점,반등수,전교등수 처리 코딩.
 * @content	
 */
public class Ex03_02 {

	public static void main(String[] args) {
		
		final int STUDENT_COUNT = 23;
		final int CLASS_COUNT = 3;
		
		// String [] names = new String[CLASS_COUNT * STUDENT_COUNT];
		String [][] names = new String[CLASS_COUNT][STUDENT_COUNT];
		double [][] avgs = new double[CLASS_COUNT][STUDENT_COUNT];
		int [][][] infos = new int[CLASS_COUNT][STUDENT_COUNT][6]; // 전교등수까지 필요하기때문에 6
		
		int [] counts = new int[CLASS_COUNT]; 
		
		char con = 'y';
		
		

	} // main

} // class
