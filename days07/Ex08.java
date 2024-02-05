package days07;

/**
 * @author 조연화
 * @date 2024. 1. 9. 오후 3:31:11
 * @subject 
 * @content	
 */
public class Ex08 {

	public static void main(String[] args) {
		// 계차 수열
		// 항의 갯수가 20개 까지의 합
		// 1+2+4+7+11+16+22+29+....+???=???
		//  1 2 3 4  5  6 계차(defference)
		
		int term = 1;
		int sum = 0;
		int defference = 0;

		for (int i = 1; i <= 20; i++) {
			term += defference;
			System.out.printf("%d+",term); 
			defference++;				   
			sum += term;					
		}//for i
		System.out.printf("=%d\n",sum);		
		 


		/*
		int firstTerm = 1;
		int secondTerm = 2;
		int nextTerm = secondTerm - firstTerm;

		while (condition) {

		}
		System.out.printf("%d+%d",firstTerm, secondTerm);
		 */


	}//main

}// class
