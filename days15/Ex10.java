package days15;

/**
 * @author 조연화
 * @date 2024. 1. 19. 오후 4:33:03
 * @subject 
 * @content 
 */
public class Ex10 {

	public static void main(String[] args) {

		Document doc1 = new Document();
		// "Noname1" 문서가 생성되었습니다.
		Document doc2 = new Document("Sample.txt");
		// "Sample.txt" 문서가 생성되었습니다.
		Document doc3 = new Document();
		// "Noname2" 문서가 생성되었습니다.
		Document doc4 = new Document();
		// "Noname3" 문서가 생성되었습니다.


		System.out.println("end");		
	}// main

}// class

// 보통 문서 객체
class Document{

	String fileName = "Noname";
	static int count = 1;
	
	{
		// 인스턴스 초기화 블럭
		count++;
	}

	public Document() {
		// Cannot refer to an instance field count while explicitly invoking a constructor
		// 명시적으로 생성자를 생성할 때까지 (참조할 수없다)
		this( String.format("%s%d.txt", "Noname", count));
	}
	public Document(String fileName) { //count값 적용안되는 string값이어서 count=2는 버려짐.
		this.fileName = fileName;
		System.out.printf("\"%s\" 문서가 생성되었습니다.\n", this.fileName);
	}

}


