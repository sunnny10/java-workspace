package kr.ac.kopo.day01;

public class VariableMain03 {

	public static void main(String[] args) {
		
		int a;
		byte b = 10;
		// = : 대입연산자
		//원래는 = 양쪽의 자료형이 서로 같아야 한다.
		
		/*
			타입이 다르면 형변환이 이루어지는데 타입을 생략할 수 있으면 묵시적 형변환
			명시적(강제적) 형변환
			묵시적 형변환
		 */
		a = /* (int) */b;	//int = (int)byte
		
		b = (byte)a;	//byte = (byte)int -> 큰 범위의 자료형을 작은 범위의 자료형을 변환할 때 명시적(강제적) 형변환
		
		// 연산할 때는 무조건 큰 수의 타입을 따라가야 한다.
		
		System.out.println(10 + 20);
		System.out.println(10 + 20.0);
		System.out.println(10 + (int)20.0);
		double d = 10 + 20.2;
		int e = (int)(10 + 20.2);
		
		final int NUM = 100;
	
		System.out.println("num : " + NUM);
		
//		double aaa = Math.PI*10;
		
		char ch = '!';
		ch = '\'';
		ch = '\n';
		ch = '\\';
		
		System.out.println(ch);
		
		String path = "D:\\Lecture\\java-workspace";
		System.out.println(path);
		
		String str = "\"ab\"";
		System.out.println(str);		
		

	}

}
