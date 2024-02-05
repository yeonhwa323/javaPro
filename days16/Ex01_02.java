package days16;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex01_02 {

	public static void main(String[] args) {
		String n = "keNik";   
		String m= "kKnie";
		// 적어두고 이런코딩도 있구나 의미 알아두기!

		n = n.toUpperCase().chars().sorted()
				 .collect(StringBuilder::new
						 , StringBuilder::appendCodePoint
						 , StringBuilder::append)
				 .toString();
			
			m = Stream.of(m.toUpperCase().split(""))
			        .sorted()
			        .collect(Collectors.joining());
			
			System.out.println( n.equals(m));

		} // main

	} // class
