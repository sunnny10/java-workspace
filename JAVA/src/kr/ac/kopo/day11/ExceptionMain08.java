package kr.ac.kopo.day11;

import java.util.Scanner;

class MismatchEvenException extends Exception {

	public MismatchEvenException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MismatchEvenException(String message) {
		super(message);
	}
	
}

public class ExceptionMain08 {

	// jvm도 예외처리기 있기 때문에 예외처리 떠넘긴 거
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("짝수를 입력 : ");
			int num = sc.nextInt();
			
			if(num < 0 || num % 2 == 1) {
				// 예외가 발생하도록 만들고 싶을 때 throw를 쓴댜. 만든 객체가 exception... 
				// 정확히 어떤 예외인지 이해하기 편하도록 나만의 예외처리기를 만들고 싶으면 exception 상속받기
				throw new MismatchEvenException(num + "은 짝수가 아닙니다.");
			}
		}catch(Exception e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("짝수를 입력 :");
		int num = sc.nextInt();
		
		if(num < 0 || num % 2 == 1) {
			System.out.println("잘못입력했습니다");
		} else {
			System.out.println("짝수 : " + num);
		}
		*/
	}

}
