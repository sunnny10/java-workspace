package kr.ac.kopo.day06;

//프로그램 = 하나의 실행클래스 + 여러개의 참조클래스
// 실행클래스
public class CarMain {
	//아직까지는 객체지향 아님.
	// 객제지향스럽게 만든다 : 인터페이스까지는 배워야... 
	public static void main(String[] args) {
		
		String[] names = new String[2];
		String[] company = new String[2];
		
		names[0] = "소나타";
		company[0] = "현대";
		
		// new 클래스명()
		// heap 영역에 생성. 이름없음
		// 괄호가 생성자다.
		Car c = new Car();
		c.name = "소나타";
		c.company = "현대";
		// new 써서 문자열 생성해도 된다.                                                                     
		
		Car c2 = new Car();
		c2.name = "K9";
		c2.company = "기아";
		
		System.out.println("첫번째 자동차명 : " + c.name);
		System.out.println("두번째 자동차명 : " + c2.name);
		// c가 가리키고 있는 객체의 멤버변수에 접근 -> c.name 이런식
		// 참조변수 이름으로 접근한다.
		
	}

}
