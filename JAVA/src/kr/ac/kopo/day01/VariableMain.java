package kr.ac.kopo.day01;

public class VariableMain {
	
	char b; //클래스에 정의된 변수 (필드)멤버변수, 자동초기화O

	/*
	 	기본자료형
	 	논리형 : boolean
	 	문자형 : char
	 	정수형 : byte, short, int(기본), long
	 	실수형 : float, double(기본)
	 	
	 	
	 	변수 선언
	 	자료형 변수명;
	 	
	 	변수 대입
	 	변수명 = 값;
	 	
	 	변수 초기화(선언과 동시에 값 대입)
 	 	자료형 변수명 = 값;
	 	
	 	같은 자료형의 변수 여러개 선언
	 	자료형 변수명1, 변수명2, 변수명3 ...;
	 */
	
	
	public static void main(String[] args) {
			
		// 대문자 A를 저장하기 위한 변수 a 선언
		//문자를 저장할 수 있는 공간을 만들고 그 공간의 이름을 a라고 지어라
		//heap은 공간은 잡히지만 변수명이 존재하지 않는다.
		// 위치가 더 중요하다. 공간이 만들어지는 시작 주솟값이 중요하다.
		char a;	//a라는 공간이 만들어진다. stack 메모리에....
		//변수는 초기화되어야 사용할 수 있다.
		a = 'A';
		//메소드 안에서 선언된 변수 : 지역변수, 초기화 자동설정X
		
		// 정수 123를 저장하기 위한 변수 c선언
		int c= 123;
		
		// 실수 3개를 저장하기 위한 변수 d1, d2, d3 선언;
		// 중간에 초기화하면 뒤에는 다 초기화해주는 게 좋다.
		double d1, d2 = 12.34, d3 =0;
		
		char e; int f;
		
		System.out.println(a);
		System.out.println(c);
		
		
		
	}

}
