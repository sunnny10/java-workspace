package kr.ac.kopo.day12;

/*
 	Wrapper Class : 기본자료형을 멤버변수로 가지는 클래스 
 	기본자료형 		Wrapper Class
 	boolean			Boolean
 	char			Character
 	byte			Byte
 	short			Short
 	int				Integer
 	long			Long
 	float			Float
 	double			Double
 	
 	이런 형태, java.lang에 있어서 따로 패키지 import 안해도 된다.
 	class Boolean {
 		private boolean value;
 */
public class WrapperMain {
	//제네릭에서는 레퍼런스 타입밖에 안됨... 정수나 머 그런거 쓸때는 Wrapper 클래스 쓰라는 얘기
	public static void main(String[] args) {

		int i = 100;
		//원래는 이런식으로 만들어서 사용해야함
		Integer i2 = new Integer(100);
		Integer i5 = Integer.valueOf(100);	// 위에 꺼 말고 이거 써라..
		//객체(참조자료형)		 //숫자 => 원래 i3는 레퍼런스를 가리켜야함
		Integer i3 = 100;	// auto boxing : 객체, 상자를 하나 만들어서 넘겨준다. 100을 내부적으로 레퍼런스 객체형으로 포장 
		int i4 = new Integer(100); //어떻게 인스턴스 객체값을 i4가 가질 수 있냐....  : auto unboxing : 실제 가져야할 값은 여기에 있는 멤버변수 가져와야 하는데 그런거 안 써도 wrapper 클래스가 알아서 객체에 들어있는 것 중에 상수값만 뽑아서 넣어줌
	
		System.out.println(Integer.parseInt("123") + 100);	// 리턴타입은 int
		System.out.println(Integer.valueOf("123") + 100);	//리턴타입은 wrapper 클래스의 인티져
		
	}

}


















