package kr.ac.kopo.day09.abs03;

public class SamsungPrinter extends Printer {

	// super보다 this가 먼저다!!!!!!
	@Override
	public void print() {
		System.out.println("삼성프린터에서 프린트중...");
	}
	
	/*
	public void samPrint() {
		System.out.println("삼성프린터에서 출력합니다");
	}
	*/
	
	
}
