package days12;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Test {

	public static void main(String[] args) throws IOException {
		/* 
		*1차원 배열 -> 2차원 배열 변경해서 코딩 수정.
		* @content	복습(시험문제 1) 꼭 이해하고 암기!!
		* */
		
		String name;
		int kor, eng, mat, tot;
		double avg;
		int rank;
		
		final int STUDENT_COUNT = 30;
		
		String [] names = new String [STUDENT_COUNT];
		
		int [][] infos = new int[STUDENT_COUNT][5];
		
		double [] avgs = new double[STUDENT_COUNT];
		
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		char con = 'y';
		
		do {
			System.out.printf("> 이름,국어,영어,수학 입력 ?");
			
			name = getName();
			kor = getScore();
			eng = getScore();
			mat = getScore();
			tot = kor + eng + mat ;
			avg = (double) tot/3;
			rank = 1;
			
			names[count] = name;
			
			infos[count][0] = kor;
			infos[count][1] = eng;
			infos[count][2] = mat;
			infos[count][3] = tot;
			infos[count][4] = rank;
			
			avgs[count] = avg;
			
			count++;
			
			System.out.printf("> 학생 계속 입력할거야 ? ");
			con = (char) System.in.read();
			System.in.skip(System.in.available());
			
		} while (Character.toUpperCase(con)=='Y');
		
		
		
		
		
		
		
		
	}//main

	private static int getScore() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static String getName() {
		// TODO Auto-generated method stub
		return null;
	}

}//class
