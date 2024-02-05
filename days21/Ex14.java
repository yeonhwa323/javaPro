package days21;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import days14.Student;

/**
 * @author 조연화
 * @date 2024. 1. 29. 오후 3:52:44
 * @subject 
 * @content 
 */
public class Ex14 {

	public static void main(String[] args) throws IOException {
		// 배열 => ArrayList 활용하기!
		// 한 반에 30명 학생 - 이,국,영,수,총,평,등 성적처리
		// 1차원배열
		// 2차원배열
		// 3차원배열
		// Student 클래스 배열 처리 + ArrayList 컬렉션 클래스
		// [days14.Ex08.java]

		String name;
		int kor, eng, mat, tot;
		double avg;
		int rank;

		// ArrayList 컬렉션 클래스 선언
		ArrayList list = new ArrayList();

		Scanner scanner = new Scanner(System.in); 

		char con = 'y';

		do {
			System.out.printf("> %d번 이름, 국어, 영어, 수학 입력 ? "
					, list.size() +1);		// list.size() -> 현재값: 0
			name = scanner.next();	// 이름
			kor = scanner.nextInt();// 국
			eng = scanner.nextInt();// 영
			mat = scanner.nextInt();// 수
			tot = kor + eng + mat;
			avg = (double)tot/3;
			rank = 1;

			Student s = new Student(); // 생성자 새로생성

			s.name = name;
			s.kor = kor;
			s.eng = eng;
			s.mat = mat;
			s.tot = tot;
			s.avg = avg;
			s.rank = rank;
			
			list.add(s);

			// 입력 계속 ? y
			System.out.print("> 학생 입력 계속 ?");
			con = (char)System.in.read();
			System.in.skip(System.in.available());

		} while (Character.toUpperCase(con)=='Y');

		procRank(list);
		dispStudent(list);

	}// main


	private static void procRank(ArrayList list) {
		
		Iterator ir = list.iterator();
		
		while (ir.hasNext()) {
			Student s = (Student) ir.next();
			// s.tot, s.rank
			s.rank = 1;
			
			for (int i = 0; i < list.size(); i++) {
				int targetTot = ((Student)list.get(i)).tot;
				if( s.tot < targetTot) {
					s.rank++;
				}
			}
		}// while	
	}


	private static void dispStudent(ArrayList list) {
		Iterator ir = list.iterator();
		while (ir.hasNext()) {
			Student s = (Student) ir.next();
			s.dispInfo();
		}
		
	}


}//class
