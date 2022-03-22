package kr.ac.kopo.day09.abs03;

public class LGPrinter extends Printer {
	
	public LGPrinter() {
		
	}
	
	public LGPrinter(String model) {
		super(model);
	}

	@Override
	public void print() {
		//super.print() -> 부모꺼 호출
		System.out.println("LG프린터에서 출력중...");
	}
	
	/*  주석처리해도 부모클래스에 print() 있다.
	public void lgPrint() {
		System.out.println("LG프린터에서 출력합니다");
	}
	그런데 lg만의 고유한 프린터 기술이 있을 수 있지... -> 오버라이딩할 수 있다.
	*/
	
	
}
