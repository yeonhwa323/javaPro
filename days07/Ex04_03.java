package days07;

import java.util.Scanner;

/**
 * @author 조연화
 * @date 2024. 1. 9. 오후 12:10:30
 * @subject 
 * @content	
 */
public class Ex04_03 {

	public static void main(String[] args) {
		String email;
		Scanner scanner = new Scanner(System.in);
		System.out.print("이메일 입력 ? ");
		email = scanner.next();
		/* 이메일체크하는 정규표현식
		// 1개이상의 문자	@naver.com
		// a			@sist.co.kr
		// 1			@yahoo.kr
		*/
		String regex = "^[0-9a-zA-Z]([-_\\.]?[0-9a-zA-Z])*"
				+ "@[0-9a-zA-Z]([-_\\.]?[0-9a-zA-Z])*\\.[a-zA-Z]{2,3}$\r\n";
		// 7-z@aadfg.
		// z_x@1.
		// A.9adff@Zsg.
				
			
		if(email.matches(regex)) {
			System.out.println("이메일 사용 가능");
		} else {
			System.out.println("이메일 사용 불가능");
		}
		
		// **** 회원가입 -> 정규표현식 검색해서 카톡보내기!!! *****
		// 비밀번호 - 8~15자리
		//			%$#@ 특수문자 반드시 1개 이상
		//			0-9 숫자 반드시 1개 이상
		//			알파벳 대소문자 반드시 1개 이상
		
	}// main

}//class
