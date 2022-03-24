package kr.ac.kopo.day11;

import java.util.Random;

public class ExceptionMain04 {

	public static void main(String[] args) {
		
		System.out.println("main start...");
		try {
			Random r = new Random();
			int num = r.nextInt(3);	// 0, 1, 2
			System.out.println("num : " + num);
			System.out.println(10 / num);	
			
			String str = "hello";
			System.out.println("str : " + str);
			System.out.println(str.charAt(10));
			// 둘 중에 하나 발생에 대한 것을 ae가 갖겠다.
		} catch (ArithmeticException | StringIndexOutOfBoundsException ae) {
			//ae에 예외내용 저장 / 예외에 대한 설명
			System.out.println("ArithmeticException : " + ae.getMessage());
//			ae.printStackTrace(); // 에러가 난 곳을 따라가면서 찍어주는 것, 어느 줄에서 에러가 났는지 알 수 있다
		}
		System.out.println("main end...");
		
		
		
	}

}
