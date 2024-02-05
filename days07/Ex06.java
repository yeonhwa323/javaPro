package days07;

/**
 * @author 조연화
 * @date 2024. 1. 9. 오후 2:21:16
 * @subject 
 * @content	
 */
public class Ex06 {

	public static void main(String[] args) {
		// 1/2+2/3+3/4+4/5+5/6+6/7+7/8+8/9+9/10
		// 분자 1 2 3 ... 9
		// 분모 2 3 4 ... 10
		double sum = 0;
		for (int i = 2; i <= 10; i++) {
			System.out.printf("%d/%d+",i-1,i);
			sum += (i-1)/(double)i;
		}
		System.out.printf("=%f\n", sum);
		
		
		
		
		// 내가 푼거
		/*
		int sum=0;
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d/%d+",i,i+1);
			sum+=i;
		}//for	
		System.out.printf("=%d", sum);
		*/
		
	}// main

}// class
