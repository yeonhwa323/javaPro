package days06;

/**
 * @author 조연화
 * @date 2024. 1. 8. 오후 5:28:40
 * @subject [트리, 마름모, 모래시계 모양 연습하기]
 * @content	
 */
public class Ex09 {

	public static void main(String[] args) {
			
			// ****
			// ****
			// ****
			// ****
			
			/* [1]
			System.out.println("****");
			System.out.println("****");
			System.out.println("****");
			System.out.println("****");
			*/
			
			// [2]
			/*
			for (int i = 1; i <= 4; i++) {
				System.out.println("****");
			} //
			*/ 
			
			// [3]
			//System.out.println("****");
			// System.out.print("*") x 4 + 개행;
			for (int i = 1; i <= 4; i++) {
				// ****
				for (int j = 1; j <= 4; j++) {
					System.out.print("*") ;
				}
				System.out.println();
			} //

		} // main

	} // class



	/*


	*
	**
	***
	****

	****
	****
	**
	*

	___*
	__**
	_***
	****

	****
	_***
	__**
	___*

	 이등변삼각형
	__*
	_***
	*****

	*
	_*
	__*
	___*
	____*

	____*
	___*
	__*
	_*
	*

	*___*
	_*_*
	__*
	_*_*
	*___*

	마름모
	__*
	_***
	*****
	_***
	__*

	모래시계
	 * */
