package kr.ac.kopo.day06;

import java.util.Scanner;

// 같은 클래스에 있는 멤버변수는 매개변수로 받아오지 않아도 모든 메소드가 접근할 수 있다.
public class Gugudan {
	/*
	 * 메소드 어떻게 만들 건지 주석으로 적어라.......
	 */
	
	int getDan() {
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		return dan;
	}
	
	/**
	 * 파라미터로 날라온 정수의 해당 구구단을 출력
	 * @param dan 출력단
	 * param 앞에 붙은 것은 param에 대한 정보를 알려주겠다는 것
	 */
 	
	void print(int dan) {
		System.out.println("*** " + dan + "단 ***");
		for(int i=1; i<=9; i++) {
			// println은 인자가 하나라 + 로 연결함
			System.out.println(dan + " * " + i + " = " + (dan *i));
		}
	}
	
	/*
	 * 2단 - 9사이의 구구단 출력
	 */
	void print() {
		
		print(2,9);
//		for(int dan = 2; dan <= 9; dan++) {
//			print(dan);
//		}
	}
	
	/**
	 * 파라미터로 날라온 시작단~종료단 사이의 구구단 출력
	 * @param start 시작단
	 * @param end	종료단
	 */
	
	//메소드 오버로딩은 리턴타입이 다른 경우에는 성립되지 않는다.
	void print(int start, int end) {
		
		for(int dan = start; dan <= end; dan++) {
			print(dan);
		}
	}
}

/*
public class Gugudan {

	void print(int dan) {
		System.out.println("*** " + dan + "단 ***");
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
	}
	
	void print() {
		
//		print(2);
//		print(3);
//		print(4);
//		print(5);
		
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("*** " + dan + "단 ***");
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
			}
		}
	}
}
*/