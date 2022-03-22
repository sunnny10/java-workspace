package kr.ac.kopo.day09;

/*	상속 (documentation에서 해석가능) -> 두 개씩 두개씩 움직인다. 전체를 보려면 도큐먼트를 보자
	-> extends : 클래스가 클래스 간 상속, 인터페이스가 인터페이스 상속 / 같은 종류끼리 확장 가능
	
 	java.lang.Object
 		kr.ac.kopo.day09.A
 			kr.ac.kopo.day09.B
 				kr.ac.kopo.day09.C
 */
class A extends Object {	// 쓰지않는 이유는 b도 object 상속받고 있음. 그래서 단일상속만 지원하기 때문에 object는 생략되어서 쓰인다(상속받고 있따).
	A() {
		System.out.println("A() 호출....");
	}
}

class B extends A {
	B() {
		//	super(); -> 숨어있음
		System.out.println("B() 호출...");
	}
}

class C extends B {
	C() {
		System.out.println("C() 호출...");
	}
}

public class ExtendsMain02 {

	public static void main(String[] args) {
		//new A();
		//new B();
		new C();
	}

}
