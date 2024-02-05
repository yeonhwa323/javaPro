package days17;
// Ctrl + Shift + O [import 형성]
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @author 조연화
 * @date 2024. 1. 23. 오전 10:46:04
 * @subject 
 * @content 
 */
public class Ex04 {

	public static void main(String[] args) {
		// [ up casting ]
		// Employee emp = new Temp();

		List list = new ArrayList();
		
		test(list);
		test(new ArrayList()); // new SalesMan();
		test(new Vector());		// new Regular();
		
	}// main
	//						Employee emp
	public static void test(List list) { // 매개변수 다형성
		
	}
	
}// class
