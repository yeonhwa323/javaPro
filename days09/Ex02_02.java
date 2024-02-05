package days09;

import java.util.Random;

/**
 * @author 조연화
 * @date 2024. 1. 11. 오전 10:26:34
 * @subject day08.Ex05_04.java 복사 붙여넣기
 * @content	
 */
public class Ex02_02 {


	public static void main(String[] args) {
		
		// 로또 게임 횟수 입력 (n) : 3
		int n = 3;

			int [] lotto = new int[n*6]; //18
			for (int i = 0; i < n; i++) {
				fillLotto(lotto, i); // 한 게임을 채워넣는 함수
				
			}
			dispLotto(lotto);

		}// main
		// 0 ~ 5
		// 6 ~ 11
		// 12 ~ 17

		private static void dispLotto(int[] lotto) {
			for (int i = 0; i < lotto.length; i++) {
				System.out.printf("lotto[%d]=[%d] ",i,lotto[i]);
				if ( i%6==5 ) System.out.println();
			}	
			System.out.println();
		}

		private static void fillLotto(int[] lotto, int i) { // int i => 몇번째 게임인지 알려주는 인자
															// i = 0, 1, 2
			Random rnd = new Random();
			int lottoNumber = rnd.nextInt(45)+1;
			lotto[6*i] = lottoNumber;
			System.out.printf("[%d]",lottoNumber);

			int index = 6*i+1;
			//while (index<=) {
			while (index<=6*i+5) {
				lottoNumber = rnd.nextInt(45)+1;
				System.out.printf("[%d]",lottoNumber);

				if(!isDuplicateLotto(lotto,lottoNumber,index,i)) 
					lotto[index++] = lottoNumber;
				//index++;
			} // while
			System.out.println();
		}

		// 중복이 되면 true
		// 중복이 되지 않으면 false
		// Duplicate local variable i => 중복되기 때문에 int n으로 선언
		private static boolean isDuplicateLotto(int[] lotto, int lottoNumber, int index, int n) {
			for (int i = 6*n; i < index ; i++) {
				if( lottoNumber == lotto[i]) {
					return true;				
				}
			}
			return false;
		}

}
