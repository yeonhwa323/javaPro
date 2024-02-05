package days16;

/**
 * @author 조연화
 * @date 2024. 1. 22. 오후 12:18:58
 * @subject 
 * @content 
 */
public class Ex06 {

	public static void main(String[] args) {
		// 단일 상속(	Single Inheritance   )
		// 다중 상속(	Multiple Inheritance ) -> X
		// 자바는 다중 상속을 지원하지 않습니다.	왜?
		
	}// main

}// class

/*
class Tv { int power; }
class VCR{ int power; }

// Tv + VCR
class TVCR extends Tv, VCR {
	int power; // Tv 물려받은
	int power; // VCR 물려받은
}

class TVCR extends Tv {
	// has-a 관계(포함)
	VCR vcr = new VCR();
	
}

  -	인터페이스를 사용해서 다중 상속을 구현할 수 있다.
*/

