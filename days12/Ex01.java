package days12;
/**
 * @author 조연화
 * @date 2024. 1. 16. 오전 9:48:55
 * @subject 
 * @content	
 */
public class Ex01 {

	public static void main(String[] args) {
		
		// main() 의 매개변수 String [] args ?
		for (int i = 0; i < args.length; i++) {
			System.out.printf("[%d] - %s\n", i, args[i]);
		}
		
		System.out.println("end");
		
		
		
		
	}// main

}// class


/*
1. 선택정렬 selectionSort2()  함수만 구현하세요.

2. 30명의 학생의 이름,국,영,수,총,평,등수 처리하는 코딩을 하세요.

3. 순차검색 sequentialSearch() 함수 구현해서 
배열 안의 임의의 정수를 찾아서 인덱스를 모두 출력
하는 코딩을 하세요 ...
(조건)
int [] m = new int[50];
1~30 까지의 임의의 수를 채워넣고

 * */
