package kr.ac.kopo.day09.abs01;

import java.util.Scanner;
//프린터 기능을 수행하는 기능 클래스. 
// 실제 눈에 보이는 삼성, 엘지 같은 클래스는 따로 있고... 저 클래스를 사용해서 실제 동작하는 플로우(로직 구현 : 비즈니스 로직)를 클래스로 모아서 만든다. 저거를 사용해서 동작하는 그런거 -> 컨트롤 클래스, 비즈니스 클래스, 기능 클래스
public class Menu {
	
	//이 클래스에서 스캐너를 많이 쓸 경우
	private Scanner sc = new Scanner(System.in);
	//this.sc = 어쩌구 일케 써도 됨.
	
	public String select() {
		System.out.print("프린터를 선택하세요(1.LG 2.SAMSUNG) => ");
		String type = sc.nextLine();
		return type;
	}
	
	public void print(String type) {
		switch(type) {
		case "1" : 
			LGPrinter lg = new LGPrinter();
			lg.lgprint();
			break;
		case "2" :
			SamsungPrinter sam = new SamsungPrinter();
			sam.samPrint();
			break;
		}
	}
	
	public void process() {
		
		String type = select();
		print(type);
	}
	//동일한 기능의 메소드명을 썼으면 좋겟다. -> 상속

	
}
