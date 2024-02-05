package days08;

import java.util.Random;
import java.util.Spliterator;

/**
 * @author 조연화
 * @date 2024. 1. 10. 오후 3:53:51
 * @subject 
 * @content	
 */
public class Ex06 {

	public static void main(String[] args) {
		// 신용카드 번호
		String card = "4578-2356-4537-8945";
		
		// String [] String.split(regex);
		//"4578"	"2356"	"4537"	"8945"
		String regex = "-";
		String [] cardArr = card.split(regex);
		/*
		for (String c : cardArr) {
			System.out.println(c);
		}
		*/
		/*
		for (int i = 0; i < cardArr.length; i++) {
			System.out.printf("cardArr[%d]=%s\n", i, cardArr[i]);
		}
		*/
		
		Random rnd = new Random();
		int index = rnd.nextInt(4); // 0 <= int < 4
		
		cardArr[index] = "****";
		/*
		String printCard = String.format("%s-%s-%s-%s",
							cardArr[0], cardArr[1],cardArr[2],cardArr[3]);
		*/
		
		// String.join() - 결합시킬때 사용 많이함
		String printCard = String.join("-", cardArr);
		
		System.out.println(printCard);
		
		// 카드결제 영수증
		/*
		4578-****-4537-8945
		4578-2356-****-8945
		****-2356-4537-8945
		4578-2356-4537-****
		*/
		
		
	} // main

}// class
