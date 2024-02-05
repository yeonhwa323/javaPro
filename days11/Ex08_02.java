package days11;
/**
 * @author 조연화
 * @date 2024. 1. 15. 오후 2:50:19
 * @subject [복습 예상문제 2번]
 * @content	
 */
public class Ex08_02 {

	public static void main(String[] args) {
		// 순차 검색 함수 선언 ( sequence search )
		int n = 71;
		int [] m = { 3, 92, 3, 40, 71, 91, 61, 92, 76, 71, 59, 54, 64, 48, 66, 92, 25, 20, 71, 37 };
		
		int beginIndex = 0, foundIndex ;
		// 이해하고 암기하기 찾는 값을 끝까지 반복해서 찾아내기
		while ((foundIndex = indexOf( m,  n,  beginIndex)) != -1) {
			System.out.println(foundIndex);
			beginIndex = foundIndex + 1;
		}

		
	}// main
	
	public static int indexOf(int [] m, int n, int beginIndex) {
		for (int i = beginIndex; i < m.length; i++) {
			if(m[i] == n) { 
				return i;
		}
			return -1;
	}
		return beginIndex; 
	}
	
	public static int indexOf(int [] m, int n) {
		for (int i = 0; i < m.length; i++) {
			if(m[i] == n) { 
				return i;
		}
		return -1;
	}
		return n;
	}			
}// class
