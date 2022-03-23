package kr.ac.kopo.day10;

import java.util.Random;

/*final*/ class Super {
	private /* final */ double PI = 3.14;	//상수변수는 대문자

	Super() {
		PI = 3.141592;
	}
	
	/* final */ void call() {
		System.out.println("SUPER::call()");
	}
}

class Sub extends Super {
	void call() { 
		System.out.println("SUB::call()");
	}
}

class MyRandom extends Random {

	// nextInt(10) => 1 ~ 10
	@Override
	public int nextInt(int bound) {
		return super.nextInt(bound) + 1;
	}
	
	public int nextInt(int start, int end) {
		//부모의 nextInt 호출
		return super.nextInt(end-start) + start;
	}
	
}

/* 오류난다. 왜냐면 string 클래스는 final이라서
class MyString extends String{
	
}
*/


public class FinalMain {

	public static void main(String[] args) {
		/*
		Random r = new MyRandom();
//		int random = r.nextInt(90) + 10;
		int random = r.nextInt(10) + 1;
		*/
		
		MyRandom r = new MyRandom();
		int random = r.nextInt(2); // 원래는 0부터2..
		System.out.println(random);
	}

}
