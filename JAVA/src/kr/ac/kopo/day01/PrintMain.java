package kr.ac.kopo.day01;

// 한줄 단위의 주석처리
/*
 주석문에 들어있는 코드는 컴파일시 변환되지 않음 / .java를 .class로 변환될 때 변환안됨.
 여러줄 주석
 한줄
 두줄
 ...
 여러줄의 주석처리
 
 다중주석은 중첩처리 안됨.
 */

/*
 	상수종류
 	1. 정수형 상수
 	2. 실수형 상수
 	3. 문자형 상수('A', 'b') : 대문자('A'), 소문자('a'), 숫자문자('4'), 특수문자('!'), 공백문자(스페이스, 엔터, 탭...)=> 어떻게 표현하지?? (스페이스 : ' ', 엔터 : '\n', 탭 : '\(익스케이프 시퀀스)t') 
 				한글('가', '방');
 	4. 문자열 상수("abc")
 	5. 논리형 상수(true, false)
 */

/*
	출력메소드
	1. println() : 개행문자 포함
	2. print() : 개행문자 포함X
	3. printf() : JDK1.5 추가, 개행문자 포함X (f : formatting), 출력문자형태, f포맷팅이 더 확장된 형태를 가지고 있다.
		출력문자
		 %d	: 정수
		 %f	: 실수
		 %c : 문자
		 %s : 문자열
		 %b : 논리값
 */


public class PrintMain {
	
	public static void main(String[] args) {
		//println 함수는 5가지 상수를 출력하는 것이 목적
		System.out.println(10);
		System.out.println(12.34);
		System.out.println('A');
		System.out.println("Hello");
		System.out.println(true);	// 문자나 문자열 아니다!!!
		//ln이란 line 즉, 엔터키를 가지고 있다. 개행문자(줄바꿈코드)를 가지고 있다. 
		System.out.println("23살");
		System.out.print(23);
		System.out.println("살");
		System.out.println(23 + "살"); // 여러개의 다양한 상수를 출력하고 싶을 때 + 사용
		//왜 가능한가??? 원래는 정수 + 정수 = 정수... 실수 + 실 = 실 ... 정 + 실 = 실..
		// 자바에서는 문자열 + 문자열 = 문자열 가능
		// 문자열 + 정수 => 문자열로 인식한다. 한쪽이 문자열이면 무조건 문자열로 연산 //사칙연산 중 유일하게 문자열만 더하기 연산이 가능하다.
		// "AB" + 4 + 12 => AB412 : 컴퓨터는 왼쪽에서 2개씩 계산. 전체로 보지 않음. ****2개씩 본다****
		// 4 + 12 + "AB" => 16AB
		// 'A' + 'B' (문자 + 문자) => "AB"??(아님)
		System.out.println(10 + "+" + 20 + "=" + 10 + 20);
		System.out.println(10 + "+" + 20 + "=" + (10 + 20));
		
		System.out.printf("%d살\n", 23);	
		//System.out.println();
		System.out.printf("%d + %d = %d\n", 10, 20, 10+20);
		//자리수 매핑하고 싶을 때(오른쪽 맞추기)
		System.out.printf("[%7d]\n", 1200);
		System.out.printf("[%7d]\n", 950);
		System.out.printf("[%7d]\n", 15800);
		
		//자리수 매핑하고 싶을 때(왼쪽 맞추기)
		System.out.printf("[%-7d]\n", 1200);
		System.out.printf("[%-7d]\n", 950);
		System.out.printf("[%-7d]\n", 15800);
		System.out.printf("[%04d]\n", 35);
		//%f(실수)는 별다른 말이 없으면 소수점 7자리까지 나옴(무조건) : 절산시에 사용됨.
		//.1 일케하면 반올림됨
		System.out.printf("[%.1f]\n", 12.3456);
		System.out.printf("%b\n", true);	
		
	}
}

















