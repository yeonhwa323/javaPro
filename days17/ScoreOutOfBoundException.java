package days17;

// 사용자 정의한 예외 클래스
// 예외 클래스
//	ㄴ checked 예외
//	ㄴ [unchecked 예외]
public class ScoreOutOfBoundException extends RuntimeException{ // [unchecked 예외]
	
	// 예외 코드 번호 : 필드 로 선언
	private final int ERROR_CODE ;
	
	public int getERROR_CODE() {
		return ERROR_CODE;
	}

	public ScoreOutOfBoundException(String message ) {
		//super(message);
		//this.ERROR_CODE = 1000;
		this(1000, message);
	}	
	
	public ScoreOutOfBoundException(int error_code, String message ) {
		super(message);
		this.ERROR_CODE = error_code;
	}
	
}
