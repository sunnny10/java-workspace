package kr.ac.kopo.day06;

class 고양이 {
	void 잠을잔다() {
		System.out.println("고양이가 잠을 잡니다.");
	}
	
	void 냐용거린다() {
		System.out.println("고양이가 냐용합니다.");
	}

}

class Method {
	// 메소드 오버로딩(overloading)
	// 같은 클래스내에서 메소드명이 같으면서 매개변수의 개수나 타입이 서로 다른 것.
	
	// c는 메소드 이름으로 구분하지만 자바는 메소드 오버로딩 지원
	void call() {
		System.out.println("call() 메소드 호출...");
	}
	
	// 같은 이름 중복해서 선언하면 오류난다.....
	// 그런데..... 자바는 메소드 이름 + 매개변수의 개수나 타입으로 메소드를 구분한다.
	// 메소드 이름이 같아도 매개변수 개수나 타입이 다르면 다른 메소드로 인식한다.
//	void call(int i) {
//		System.out.println("call(int) 메소드 호출...");
//	}
	
	void call(double d) {
		System.out.println("call(double) 메소드 호출...");
	}
	
	void call(boolean b) {
		System.out.println("call(boolean) 메소드 호출...");
	}
	
	void call(String str, int n) {
		System.out.println("call(String, int) 메소드 호출...");
	}
}

public class MethodMain02 {

	public static void main(String[] args) {
		
		//메소드 클래스의 인스턴스 객체를 만들자
		Method m = new Method();
		m.call();
		m.call(10);	// 에러 안난다. 10을 감싸앉을 수 있는 매개변수 타입이 있기 때문.
		m.call(10.3);
		m.call(true);
		m.call("hello", 5);
		
		//println도 오버로딩. 인자는 1개만 있다.
		
		//고양이를 가리킬 수 있는 참조변수
		고양이 나비 = new 고양이();
		
		// 객체가 갖고 있는 행동을 만들었기 때문에 객체가 행동을 하도록 명령을 내린 것.
		나비.냐용거린다();
	}

}
