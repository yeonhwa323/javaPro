package days21;

import static java.time.temporal.TemporalAdjusters.*;
import static java.time.DayOfWeek.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

//com.test 패키지 => 하위 클래스만 인식함 / test의 test.Simple 패키지는 인식X

/**
 * @author 조연화
 * @date 2024. 1. 29. 오후 12:22:22
 * @subject 
 * @content 
 */
public class Ex08 {

	public static void main(String[] args) {// TODO Auto-generated method stub
		// [TemporalAdjusters 클래스]
		// - 날짜, 시간 변경 :  withXXX(), with(), plusXXX(), plus(), minusXXX(), minus()
		// - 자주 사용되는 날짜, 시간 변경하는 메서드들을 
		//   미리 구현을 해 놓은 클래스
		// 예) 다음 년도의 첫 날
		//     다음 달의 첫 날
		//     올 해의 첫 날
		//     이번 달의 첫 날
		//     올 해의 마지막 날
		//     *** 이번 달의 마지막 날짜:lastDayOfMonth() 
		//     다음 ?요일
		//     지난 ?요일
		//     이번 달 n 번째 ? 요일

		LocalDate d = LocalDate.now();
		System.out.println( d );
		// 다음 달의 첫 날
		System.out.println( d.with( firstDayOfNextMonth() ));
		// 이번 달의 첫 날  
		System.out.println( d.with( firstDayOfMonth()  ) );
		// 이번 달의 첫 번째 월요일
		System.out.println( d.with( firstInMonth(MONDAY)  ) );

		// 지난 주 월요일
		System.out.println( d.with( previous(MONDAY)  ) );
		System.out.println( d.with( previousOrSame(MONDAY)    ) ); 

		// 다음 주 금요일 휴강....
		System.out.println( d.with( next(FRIDAY) ) ); 
		// 이 번 달의 4번째 화요일
		System.out.println( d.with( dayOfWeekInMonth(4, TUESDAY) ) );

		// TemporalAdjuster 직접 구현하기.
		// 3일 뒤에 만나자(약속)
		// d = d.plusDays(3);
		d = d.with(new DayAfter3일());
		System.out.println( d ); // 1.29 + 3

		// 지난 주 월요일
		System.out.println( d.with( previous(MONDAY) ));
		System.out.println( d.with( previousOrSame(MONDAY)));

		// 다음 주 금요일 휴강..
		System.out.println( d.with(next(FRIDAY)));
		// 이번 달의 4번째 화요일
		System.out.println( d.with(dayOfWeekInMonth(4, TUESDAY)));

		// TemporalAdjuster 직접 구현하기
		// 3일 뒤에 만나자(약속)
		// d = d.plusDays(3);
		d = d.with(new DayAfter3일());
		System.out.println( d );  // 1.29 +3


	}// main



}// class

class DayAfter3일 implements TemporalAdjuster{

	@Override
	public Temporal adjustInto(Temporal temporal) {

		return temporal.plus(3, ChronoUnit.DAYS);
	}

}
