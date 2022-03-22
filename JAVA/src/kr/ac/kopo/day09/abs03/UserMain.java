package kr.ac.kopo.day09.abs03;

/*
 * 프린터를 선택하세요(1.LG 2.SAMSUNG) => 1
 * LG프린터를 출력합니다
 * 
 * 프린터를 선택하세요(1.LG 2.SAMSUNG) => 2
 * SAMSUNG 프린터에서 출력됩니다
 */

public class UserMain {

	public static void main(String[] args) {
		
		Menu menu = new Menu();
		// process에서 어떤 매카니즘으로 결과값을 받는지 알 필요 없다.
		menu.process();
	}

}
