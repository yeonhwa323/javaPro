package days18;

/**
 * @author 조연화
 * @date 2024. 1. 24. 오전 10:51:31
 * @subject  Object. 메서드
 * @content 
 */
public class Ex02_02 { // class -> 클래스선언할때 예약어일뿐

	public static void main(String[] args) {
		
		// 현실에서는 주민등록번호가 동일하면 같은 사람이다.
		Person p1 = new Person("234", "김길동");
		Person p2 = new Person("111", "홍길동");
		
		// [ Thread method ] - 수업 X 
		// Object.notify(), Object.notifyAll()
		// Object.wait() X 3
		
		// The method clone() from the type Object [is not visible] => 접근지정자문제
		//[5. Object.clone() ] -> 오버라이딩 시키기
		
		try {
			//Person p1Clone = (Person) p1.clone();
			Person p1Clone = p1.clone(); // 다운캐스팅 할 필요가 없다.
			System.out.println( p1Clone );
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		/*
		//[4. Object.toString() ]
		// "객체의 풀네임 @hashCode()의 16진수값"
		System.out.println( p1.toString() ); // days18.Person@73a28541
		System.out.println( p2);
		System.out.println(Integer.toHexString(1940030785)); // 73a28541
		*/
		
		/*[3. Object.hashCode() ]
		System.out.println( p1.hashCode() ); // 1940030785(객체의 고유코드값)
		System.out.println( p2.hashCode() ); // 1869997857
		*/
		
		//p1.getClass(); // 이객체의 클래스를 가져오겠다
		
		/* [2. Object.getClass() ]
		// 제너릭 <>
		// Class<? extends Person> cls = p1.getClass();
		Class cls = p1.getClass();
		String fullName = cls.getName();
		System.out.println( fullName );	// days18.Person(패키지명.클래스명=풀네임)
		String packageName = cls.getPackageName();
		System.out.println( packageName );
		String className = cls.getSimpleName() ;
		System.out.println( className );
		*/
		
		// [1. Object.equals() ]
		
	}// main

}// class

class Person implements Cloneable{ // F3 [Cloneable 확인]
	
	String rrn;
	String name;
	
	public Person(String rrn, String name) {
		super(); // 부모생성자 호출하겠다
		this.rrn = rrn;
		this.name = name;
	}

	// 정보를 출력하는 메서드 dispPerson() 더이상 X
	// 왜? toString() 메서드를 오버라이딩해서
	// 그 객체의 정보를 출력하는 용도...
	@Override
	public String toString() {
		//return "Person [rrn=" + rrn + ", name=" + name + "]";
		return String.format("> RRN:%s, Name:%s", rrn, name);
	}

	// Person pclone = p1.clone();
	// 얕은 복제 ***
	// 깊은 복제
	/*
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Person pclone = null;
		// Type mismatch: cannot convert from Object to Person // 다운캐스팅 시켜주면 해결
		pclone = (Person) super.clone(); 
		return pclone();
	}
	*/
	
	// JDK1.5 공변반환타입 추가
	// Object 클래스의 clone() 메서드를 오버라이딩했기 때문에
	// 리턴타입은 Object 라야 되지만 재정의하는 자식클래스의
	// 타입으로 변경이 가능하도록 문법에 추가...
	@Override
	protected Person clone() throws CloneNotSupportedException {
		Person pclone = null;
		// Type mismatch: cannot convert from Object to Person // 다운캐스팅 시켜주면 해결
		pclone = (Person) super.clone(); 
		return pclone;
	}
	/*
	protected Person clone() {
		Person pclone = null;
		// Type mismatch: cannot convert from Object to Person // 다운캐스팅 시켜주면 해결
		try{
			pclone = (Person) super.clone(); 
		} catch(CloneNotSupportedException e){
		}
		return pclone();
	}
	 */
	
	
}//person

//<에러 파악하기> *** 중요
// 에러메시지 의미 파악
// 에러메시지 부분 정확하게 파악
// 에러메시지 그대로 복사 구글링!!

// [java.lang 패키지 설명블로그]
// https://blog.naver.com/minhuck_02/223160555651 



