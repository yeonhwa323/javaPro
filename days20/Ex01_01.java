package days20;

import java.util.Date;

public class Ex01_01 {

	public static void main(String[] args) {
		// ??일 ??시간 ??분 ??초 ???밀리초 남앗다
				// [시험1] 
				// 수료일(D-Day) 까지 남은 시간 출력 메서드
		/*
				private static void d_day() {
					Date endDay = new Date(2024-1900, 6-1, 14, 18,0,0); 
					Date today = new Date();
					long diff =  endDay.getTime() - today.getTime(); 
					long 몫 = diff / (1000*60*60*24);
					System.out.print( 몫 +"d ");
					diff %= (1000*60*60*24); 

					몫 = diff /  (1000*60*60);
					System.out.print( 몫 +"h:");
					diff %= (1000*60*60); 

					몫 = diff /  (1000*60);
					System.out.print( 몫 +"m:");
					diff %= (1000*60); 

					몫 = diff /  (1000);
					System.out.print( 몫 +"s.");
					diff %= (1000); 

					System.out.println( diff +"ms");

					try {
						System.out.println("\n\n\n\n");
						Thread.sleep(10);
						d_day();

					} catch (InterruptedException e) { 
						e.printStackTrace();
					}
				}

*/

	}

}
