package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 조연화
 * @date 2024. 1. 4.오전 11:45:32
 * @subject		이름, 국, 영, 수 한 번에 입력 받아서 처리
 * @content		총, 평
 * 				BufferedReader 사용한 예제 ( 내일 복습 문제)
 * 
 * 				배열 사용
 */
public class Ex03 {

	public static void main(String[] args) throws IOException {
		
		String name;
		byte kor, eng, mat;
		short tot; // 0~300
		double avg;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.printf("> 이름,국어,영어,수학 입력 ? ");
		String data = br.readLine(); // "홍길동,89,78,56"
		
		// 콤마를 구분자로 data문자열을 잘라내기[String.split()] => "홍길동" "89" "78" "56"
		// String String.format(String format, Object....args)
		// boolean String.equals(비교할 문자열) - 두 문자열 비교
		// String [] String.split( 구분자 )
		String regex = ",";
		String [] datas = data.split(regex);
		
		name = datas[0].trim(); // "홍길동"
		kor = Byte.parseByte(datas[1].trim()); // "89"
		eng = Byte.parseByte(datas[2].trim()); // "78"
		mat = Byte.parseByte(datas[3].trim()); // "56"
		
		
		
		/*
		System.out.print("1. 이름 입력 ? ");
		name = br.readLine();

		System.out.print("2. 국어 입력 ? ");
		kor = Byte.parseByte(br.readLine());

		System.out.print("3. 영어 입력 ? ");
		eng = Byte.parseByte(br.readLine());

		System.out.print("4. 수학 입력 ? ");
		mat = Byte.parseByte(br.readLine());
		*/

		// 총점, 평균 계산 코딩 추가.
		// Type mismatch: cannot convert from int to short
		// 형변환 설명 X
		
		
		// 강제형변환 1번째 경우
		tot = (short) (kor + eng + mat); // + 덧셈연산자 -> 그냥 암기 // int 보다 작은 자료형은 연산할 때 CPU가 int로 처리해서 연산
		//		강제		최우선 연산자	
		avg = (double) tot / 3D; // .00 -> double 또는 // 3.0, 3., 3d 사용가능

		// 홍길동님은 국: 89 영: 78 수: 56 총점: 평균:소수점둘째자리까지 이다.
		// 74.33333333
		System.out.printf(
				"%s님은 국:%d 영:%d 수:%d 총점:%d 평균:%.2f 이다."
				, name, kor, eng, mat, tot, avg);
		


	}

}
