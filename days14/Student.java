package days14;

/**
 * @author 조연화
 * @date 2024. 1. 18. 오전 11:29:49
 * @subject 접근지정자 - package로 설정
 * @content	
 */
public class Student {
	
	public Student() {
		
	}

	// 인스턴스 변수
	// field
	// Alt + Shift + S -> Super클래서(디폴트생성자생성) / using field
	public String name;
	public Student(String name, int kor, int eng, int mat, int tot, double avg, int rank, int wrank) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = tot;
		this.avg = avg;
		this.rank = rank;
		this.wrank = wrank;
	}

	public int kor, eng, mat, tot;
	public double avg;
	public int rank, wrank;
	
	
	// Alt + shift + A -> delete 영역내용 삭제
	// method
	public void dispInfo() {
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d등\t%d등\n"				
				, name
				, kor
				, eng
				, mat
				, tot
				, avg
				, rank 
				, wrank);
	}
	
}
