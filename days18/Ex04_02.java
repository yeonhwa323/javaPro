package days18;

import java.util.Arrays;

/**
 * @author 조연화
 * @date 2024. 1. 24. 오후 2:05:47
 * @subject 
 * @content 
 */
public class Ex04_02 {

	public static void main(String[] args) {
		// String todo = "TODO Auto-generated method stub";
		
						
		// System.out.println( todo.codePointAt(0) ); 'T' -> 84
		// boolean todo.equals("");				true / false
		// int todo.compareTo("");				0 양수 음수
		// int todo.compareToIgnoreCase("");	0 양수 음수
		/*
		System.out.println("ABC".compareToIgnoreCase("AbC"));	// 0
		System.out.println("ABC".compareTo("AcC"));	// -33
		System.out.println("CBC".compareTo("AcC"));	// 2
		*/
		
		// todo.endsWith(suffix);	// 접미사
		// todo.startsWith(prefix);	// 접두사
		/*
		String url = "http://www.naver.com";
		System.out.println( url.startsWith("http://") );
		System.out.println( url.endsWith(".com") );
		*/
		
		// [문제] - 문자열 안 메서드 다루기
		/*
		String directory = "C:\\spring\\src";
		String fileName = "Sample.java";
		
		// String path = directory +"\\"+ fileName;
		// String path = directory + fileName;
		
		// char 마지막한문자 = directory.charAt( directory.length() -1);
		// if ( 마지막한문자 == '\')
		
		String path = directory 
				+ (directory.endsWith("\\")?"":"\\") 
				+ fileName;
		
		// C:\spring\src\Sample.java
		System.out.println( path );
		*/
		
		// boolean todo.equals(todo);
		// boolean todo.equalsIgnoreCase(todo);
		
		// byte [] todoByteArray = todo.getBytes();
		// System.out.println( Arrays.toString(todoByteArray));
		
		//todo.indexOf(0);		// 앞에서 부터 찾아서 찾은 인덱스 값을 반환
		//todo.lastIndexOf(0);	// 뒤에서 부터 	"		"
		// System.out.println( todo.indexOf("Auto") );		// 5
		// System.out.println( todo.lastIndexOf("Auto") );	// 5
		
		// todo.matches(regex)
	
		// ------------------------------
		// System.out.println( "-".repeat(30) );
		
		String todo = "TODO Auto-generated all method Alert stub";
		
		// String.valueOf() 각 자료형의 값을 문자열(String) 변환하는 메서드
		// 3.14 + ""
		// true + ""
		// 100	+ ""
		/*
		char [] m = {'a','2','x'};
		String s = String.valueOf(m);
		System.out.println( s );  // "a2x"
		*/
		
		// char [] -> String
		char [] m = {'a','2','x'};
		String s = new String(m);
		
		// String.format("");
		/*
		System.out.println("<ul></li>" 
		+ String.join("</li><li>", "권맑음", "구본혁", "한재호")
		+ "</li></ul>");
		*/
		
		// todo auto-generated all method alert stub
		System.out.println( todo.toLowerCase() );
		// TODO AUTO-GENERATED ALL METHOD ALERT STUB
		System.out.println( todo.toUpperCase() );
		
		//System.out.println( todo.toString() );
		
		// String-> byte[]	getBytes()
		// String-> char[]	toCharArray()
		// char [] todoCharArray = todo.toCharArray();
		
		/* 리턴자료형 차이
		System.out.println( todo.substring(2,7) ); // DO Au			String 		
		System.out.println( todo.subSequence(2,7) ); // DO Au	  CharSequence  
		*/
		
		// todo.substring(0)
		// todo.substring(0, 2)
		
		//todo.subSequence(beginIndex, endIndex);
		// 1) 기능
		// 2) substring() 차이점 ?
		
		
		// todo.strip();			// trim() 앞 뒤 공백 제거
		// todo.stripLeading();		// leading 이끄는 	앞 공백제거
		// todo.stripTrailing();	// trailing			뒤 공백제거
		/*
		System.out.println( "[" +"   홍길동  ".trim() + "]");
		System.out.println( "[" +"   홍길동  ".strip() + "]");
		System.out.println( "[" +"   홍길동  ".stripLeading() + "]");
		System.out.println( "[" +"   홍길동  ".stripTrailing() + "]");
		*/
		
		/*
		String regex = " ";
		//String [] todoArr = todo.split(regex);
		String [] todoArr = todo.split(regex, 3);		// limit 값 => 3
		System.out.println( Arrays.toString( todoArr ));
		*/
		
		/*
		System.out.println(todo.replace('e', '*'));
		System.out.println(todo.replace("method", "방법"));
		//									regex 정규표현식
		System.out.println(todo.replaceAll("[Aa]\\.*", "*"));
		
		System.out.println(todo.replaceFirst(regex, "바꿀문자열"));
		*/
		
		
		
	}// main

}// class
