package days19;

import java.util.Arrays;

/**
 * @author 조연화
 * @date 2024. 1. 25. 오전 11:33:15
 * @subject 
 * @content 
 */
public class Ex02 {

	public static void main(String[] args) {
		String my_str = "abc1234"; // "abc1Addfggg4556b"	
		int n = 3; // 6;
		
		String [] answer = solution(my_str, n);

		//  ["abc1Ad", "dfggg4", "556b"]
		System.out.println( Arrays.toString(answer));
		
	} // main

	    public static String[] solution(String my_str, int n) {
	        String[] answer = {};
	        int arraylength = (int) Math.ceil( (double)my_str.length()/n );
	        answer = new String[arraylength];	        
	        
	        StringBuilder sb = new StringBuilder(my_str);
	        /*
	        answer[0] = sb.substring(0, 6);		sb.delete(0, 6);
	        answer[1] = sb.substring(0, 6);		sb.delete(0, 6);
	        answer[2] = sb.substring(0);		
	         */
	        for (int i = 0; i < answer.length-1; i++) {
	        	 answer[i] = sb.substring(0, n);		sb.delete(0, n);
			}
	        answer[answer.length-1] = sb.substring(0);
	        return answer;
	    }
	
}// class

/*
public static String[] solution(String my_str, int n) {
    int answerLength = (int) Math.ceil( (double)my_str.length() / n ); 
    
     String[] answer = new String[answerLength];
     
     /*
     String a = my_str.substring(0, 6);
     System.out.println( a );
     
     a = my_str.substring(6, 12);
     System.out.println( a );
     
     a = my_str.substring(12, 18);
     System.out.println( a );
     */
/*
     int beginIndex = 0, endIndex;
     String str = null;
     int my_strLength = my_str.length();
     int index = 0;
     while (index != answerLength) {
        endIndex = beginIndex + n;
        if( endIndex > my_strLength)  endIndex = my_strLength;
        str = my_str.substring(beginIndex, endIndex);
        beginIndex = endIndex;
        answer[index++] = str;
   } // while
     
     return answer;
 }
*/