package kr.ac.kopo.day02;

public class SwitchMain02 {

	public static void main(String[] args) {
		// 문자열는 동등비교 연산자가 안먹힌다.
		// 문자열과 문자열 비교시 동등비교 연산자 안먹힘.
		
		String str = new String("Hello");
		
		/* System.out.println(a == "Hello");
		System.out.println(a.equals("Hello"));*/
		
		// 문자열 비교는 switch가 잘 됨. 내부에서는 equals가 이루어지고 있음.
		// equals 메소드는 자바 최상위 클래스에 속해있는 것이기 때문에 모든 자료형에서 사용 가능.
		// 자바는 해시코드를 가지고 있다. 해시코드로 비교.
		switch(str) {
		case "Hello" :
				System.out.println("TRUE");
				break;
		default :
			System.out.println("FALSE");
		
		}
	}

}
