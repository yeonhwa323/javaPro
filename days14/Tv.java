package days14;

public class Tv {
	
	// 멤버변수(필드 field)(==클래스의 모든구성요소)
	public String color = null;
	public boolean power = false;
	public int channel = 0;
	
	
	// 멤버함수(메서드 method)
	public void power() {
		power = !power; //(켰다끌수있게 설정)
	}
	// △
	public void channelUp() {
		channel++;
	}
	// ▽
	public void channelDown() {
		channel--;
	}

}//class
