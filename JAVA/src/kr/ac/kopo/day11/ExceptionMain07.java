package kr.ac.kopo.day11;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionMain07 {

	public static void main(String[] args) {
		try {
			c();
			d();
			e();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		try {
			b();			
		} catch(FileNotFoundException | ArrayIndexOutOfBoundsException e) {	//일케 하면 불편하니까 exception으로 제어
			System.out.println("!!");
			e.printStackTrace();
		}
		a();
	}
	
	public static void f() throws Exception {
		
	}
	// 원래는 모든 메소드마다 try-catch 써야함
	public static void c() throws Exception {
		f();
	}
	
	public static void d() throws Exception {
		
	}
	
	public static void e() throws Exception {
		
	}
	
	//간접 예외처리 -> checked exception
	// 개발자가 메소드르 실행하다가 예외가 발생할거같으넫 이 메소드를 쓰는 사용자들이 그걸 알까 싶을 떄  throws  써서 예외처리하라고 시키는 거.
	
	//throws로 떠넘기는 메소드나 생성자를 호출하는 것이 checked exception
	//나머지 예외를 처리하지 않으면 프로그램 종료된다.
	public static void b() throws FileNotFoundException, ArrayIndexOutOfBoundsException {
		//내가 try-catch하기 귀찮으니까 호출한 애한테 떠넘겨야지 
		int[] arr= new int[3];
		System.out.println(arr[4]);
		FileReader fr = new FileReader("a.txt");
	}
	
	public static void a() {
		try {
			String str = null;
			System.out.println(str.length());
		} catch(Exception e) {
//			System.out.println("예외발생 : " + e.getMessage());
			e.printStackTrace();
		}
	}

}
