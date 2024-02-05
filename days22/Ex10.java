package days22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 * @author 조연화
 * @date 2024. 1. 30. 오후 2:27:58
 * @subject [시험]
 * @content 
 */
public class Ex10 {

	public static void main(String[] args) {
		// 로또 게임 횟수를 입력받아서
		// 로또 번호를 출력하는 코딩..
		// days09.Ex02.java		1차원 배열 선언 예
		// days12.Ex06.java		2차원 배열 선언 예
		
		/*
   		게임 횟수 입력 ? 3
		        int [][] lotto = new int[3][6]; 배열 사용 X
		        ArrayList
		1게임 : [17][9][4][15][16][38]   HashSet lotto 
		2게임 : [17][9][4][15][16][38]   HashSet lotto 
		3게임 : [17][9][4][15][16][38]   HashSet lotto
		*/
		
		/*
		HashSet  lotto = new HashSet();
	      lotto.add(10);
	      lotto.add(10);
	      lotto.add(10);
	      lotto.add(10);
	      lotto.add(15);
	      lotto.add(45);
	      lotto.add(45);
	      lotto.add(20);
	      lotto.add(8);
	      lotto.add(45);
	      lotto.add(32);

	      System.out.println(lotto);
		*/
		
		
		int gameNumber = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 게임 횟수 입력 ?");
		gameNumber = scanner.nextInt();
		
		ArrayList lottos = new ArrayList();
		HashSet lotto = null;
		
		for (int i = 0; i < gameNumber; i++) {
			lotto = new HashSet();
			fillLotto(lotto);
			lottos.add(lotto);
		}
		
		System.out.println( "===================");
		dispLottos(lottos);
		
	}// main

	private static void dispLottos(ArrayList lottos) {
		Iterator ir = lottos.iterator();
		int cnt = 1;
		while (ir.hasNext()) {
			HashSet lotto = (HashSet) ir.next();
			Iterator ir2 = lotto.iterator();
			System.out.printf("%d 게임 : ", cnt++);
			while (ir2.hasNext()) {
				int n = (int) ir2.next();
				System.out.printf("[%d]", n);
			}
			System.out.println();
		}
 		
	}

	private static void fillLotto(HashSet lotto) {
		
		Random rnd = new Random();
		while (lotto.size() < 6) {
			int n  = rnd.nextInt(45)+1;
			System.out.println( n );
			lotto.add(n);
			
		} 
		
			  
	}

	
}// class