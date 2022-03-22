package kr.ac.kopo.day09.abs03;

public class HPPinter extends Printer {

	// 똑같이 print() 쓰기 시러... 재정의 안하면 올바르게 결과 안나옴 원래는 재정의 권고였음. abstract 클래스 상속하면 이제 강제가 된다. -> 표준
	public void hpPrint() {
		System.out.println("HP프린터에서 출력중...");
	}

	// printer 상속한 애들은 모두 print 함수로 호출한다.
	@Override
	public void print() {
		System.out.println("HP프린터에서 출력합니다...");
	}
}
