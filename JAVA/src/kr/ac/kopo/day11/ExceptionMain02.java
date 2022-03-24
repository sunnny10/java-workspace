package kr.ac.kopo.day11;

import java.util.Random;

public class ExceptionMain02 {

	public static void main(String[] args) {
		
		System.out.println("main start...");
		try {
			Random r = new Random();
			int num = r.nextInt(3);	// 0, 1, 2
			System.out.println("num : " + num);
			System.out.println(10 / num);	
		} catch (ArithmeticException ae) {
			//ae에 예외내용 저장 / 예외에 대한 설명
			System.out.println("예외발생 : " + ae.getMessage());
			ae.printStackTrace(); // 에러가 난 곳을 따라가면서 찍어주는 것, 어느 줄에서 에러가 났는지 알 수 있다
		} 
		//jvm이 예외를 채가서 처리하면 프로그램 종료됨 -> 그래서 밑에 꺼 실행안됨
		//if문 생성해서 제어할 수 있는데, 그럼에도 불구하고 인지하지 못한 순간 예외가 발생할 수 있을 거 같다....
		//예외처리 : 그 문장이 예외가 발생할 가능성이 있을 거 같다... 근데 인지하지 못할 경우의 보호장치 겸 안전장치 강제성 생성
		
		//얘는 finally 안써도 출력됨. 왜 finally 써야하냐
		System.out.println("main end...");
		
		
		
	}

}
