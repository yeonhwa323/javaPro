package days07;

/**
 * @author 조연화
 * @date 2024. 1. 9. 오후 12:36:42
 * @subject 
 * @content	
 */
public class Ex05 {

	public static void main(String[] args) {
		// [순서도] flow chart
		//   ㄴ 워크플로 혹은 프로세스를 보여주는 다이어그램의 한 종류
		//[1] 1 ~ 10 합 코딩
		// 짝수는 SUM-
		// 홀수는 SUM+
		int sum =0;
		//스위칭 변수
		boolean sw = false;

		for (int i = 1; i <= 10; i++) {

			// [4]
			/*
			System.out.printf(sw?"%d+":"%d-",i);
			sum+= sw? -i: i;

			 */

			// *** [3] 스위칭 변수를 사용하는 방법.(기억)
			/*
			if (sw) { // 짝수
				System.out.printf("%d+", i);
				sum -= i;
				// sw = !sw;
			} else { // 홀수
				System.out.printf("%d-", i);
				sum += i;
				// sw = !sw; // false -> true
			}// if
			// sw != sw;
			 */








			// [2]
			/*
					System.out.printf(i%2==0?"%d+":"%d-",i);
					sum+= i%2==0? -i: i;
					}//for*/


			//[1]
			/*
			if (i % 2 == 0) { // 짝수
				System.out.printf("%d+", i);
				sum -= i;
			} else { // 홀수
				System.out.printf("%d-", i);
				sum += i;
			} // if
			 */
		} // for
		System.out.printf("=%d\n", sum);

	} // main

} // class
