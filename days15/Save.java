package days15;

// 저축 관련된 필드, 메서드 구현된 클래스

public class Save {
	
	// 필드
	// 인스턴스 변수
	private String name; // 예금주
	private int money;   // 예금액
	
	// 클래스 변수
	// 공유 변수
	// static 변수
	private static double rate = 0.04; // 예금이자율
	
	// 생성자
	public Save() {}
	public Save(String name, int money, double rate) {
		this.name = name;
		this.money = money;
		this.rate = rate;
	}

	// getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public static double getRate() {
		return rate;
	}
	public static void setRate(double rate) {
		Save.rate = rate;
	}
	// 스태택 메서드안에서는 this를 사용할 수 없음 (객체 형성이 안됐기 때문에)
	
	// 메서드
	public void dispSave() {
		System.out.printf("> 예금주:%s, 예금액:%d, 이자율:%.2f\n"
				, this.name, this.money, this.rate);
	}
	
}
