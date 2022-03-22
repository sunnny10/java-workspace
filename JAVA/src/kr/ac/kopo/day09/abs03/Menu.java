package kr.ac.kopo.day09.abs03;

import java.util.Scanner;
//프린터 기능을 수행하는 기능 클래스. 
// 실제 눈에 보이는 삼성, 엘지 같은 클래스는 따로 있고... 저 클래스를 사용해서 실제 동작하는 플로우(로직 구현 : 비즈니스 로직)를 클래스로 모아서 만든다. 저거를 사용해서 동작하는 그런거 -> 컨트롤 클래스, 비즈니스 클래스, 기능 클래스
public class Menu {
	
	//이 클래스에서 스캐너를 많이 쓸 경우
	private Scanner sc = new Scanner(System.in);
	//this.sc = 어쩌구 일케 써도 됨.
	
	private String select() {
		System.out.print("프린터를 선택하세요(1.LG 2.SAMSUNG 3.HP) => ");
		String type = sc.nextLine();
		return type;
	}
	
	// 인터페이스도 추상클래스를 갖고 있다.
	
	// 어떤 모델이 들어오던 print() 메소드만 출력하면 된다 => 변화에 둔감해진다.
	// 상속 관계에서 자식이 인스턴스 객체의 주소값을 부모의 참조변수가 가르킬 수 있다. 형변환이 발생.
	private void print(String type) {
		Printer p = null;
		switch(type) {
		case "1" : 
			// 목적은 print 메소드 호출이 목적. 근데 이 메소드는 부모클래스도 갖고 있따.
			// 내가 어떤 자식의 인스턴스 객체를 가리키고 있느냐에 따라 재정의된 메소드가 다르게 출력된다. 메소드는 메소드 영역, 코드 영역에 생성되고, 그 주소값을 알려주는 것. 
			p = new LGPrinter();
			break;
		case "2" :
			p = new SamsungPrinter();
			break;
		case "3" :
			p = new HPPinter();
//			hp.hpPrint();
			break;
		}
		if(p != null) {
			p.print();			
		}
	}
	
	/*
	public void print(String type) {
		switch(type) {
		case "1" : 
			// 목적은 print 메소드 호출이 목적. 근데 이 메소드는 부모클래스도 갖고 있따.
			LGPrinter lg = new LGPrinter();
			lg.print();
			break;
		case "2" :
			SamsungPrinter sam = new SamsungPrinter();
			sam.print();
			break;
		case "3" :
			HPPinter hp = new HPPinter();
			hp.print();
//			hp.hpPrint();
			break;
		}
	}
	*/
	
	public void process() {
		
		String type = select();
		print(type);
	}
	//동일한 기능의 메소드명을 썼으면 좋겟다. -> 상속

	
}
