package days05;

/**
 * @author 조연화
 * @date 2024. 1. 5. 오후 12:35:51
 * @subject 
 * @content
 */
public class Ex05 {

	public static void main(String[] args) {
		String todo = "Auto-generated method stub";
		// 1. 문자열 길이       todo.length()
		// char String.charAt(index)
		
		/*
	      for (int i = 0; i < todo.length() ; i++) {
	         char one = todo.charAt(i);
	         System.out.printf("%d - '%c'\n", i, one);
	      } // for
		 */

		
		int strLength = todo.length();
		char one;
		char [] todoArray = new char[strLength];

		for (int i = 0 ; i <  strLength ; i++){
			todoArray[i] = one = todo.charAt(i);
		
			
			

			System.out.printf("%d - '%c'\n", i, one);
		} // for

		// char [] todoArray = todo.toCharArray();


	} // main

} // class

