package days16;

import days14.Tv;

/**
 * @author 조연화
 * @date 2024. 1. 22. 오전 11:29:34
 * @subject 
 * @content 
 */
public class Ex04 {

	public static void main(String[] args) {
		
		// 기존 Tv
		// 자막 기능 O + 새로운 Tv 필요하다.
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 11;
		ctv.channelDown();
		System.out.println(ctv.channel);
		
		ctv.dispCaption("Hello World~");
		ctv.caption = true; // 자막 ON
		ctv.dispCaption("Hi~");
		
		
	}// main

}// class

class CaptionTv extends Tv{
	
	// 필드
	boolean caption; // 자막 기능 on(true)/ off(false)
	
	// 메서드
	void dispCaption(String text) {
		if (this.caption) {
			System.out.println(text);
		}// if
	}
}
