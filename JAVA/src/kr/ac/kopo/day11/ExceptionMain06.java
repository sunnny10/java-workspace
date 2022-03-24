package kr.ac.kopo.day11;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionMain06 {

	public static void main(String[] args) {
		
		//런타임 시점의 에러 -> 코드를 작성했을 때는 모르지만 코드를 실행해봐야 할 수 있는 에러. 해봐야 안다 -> java.lang 패키지에 있다
		System.out.println("main start...");
	
		// 안전성을 위해서 반드시 예외처리하는 것이 좋다. 외부환경이랑 연결되는, 엑세스하기 위한 클래스들은 예외가 발생할 가능성이 높다. 무조건 예외처리해서 안전하게 만들자 -> 외부장치니까 각자 다른 패키지에 있다
		// 컴파일 시점에 반드시 예외처리를 하라고 알려주는 것 -> 컴파일 시점의 예외처리 : "checked Exception"
		for(int i=0; i<5; i++) {
			try {
				System.out.println("loop...");
					if(i == 3) {
						FileReader fr = new FileReader("a.txt");
					}
					
			} catch(Exception fnfe) {
				fnfe.printStackTrace();
				// break, return...등으로 for문을 빠져나가도 finally 문장이 수행된다.
				// break;
				return;
			// 자원들을 종료하거나.. 관리하는 목적으로 finally를 쓴다.	
			} finally {
				System.out.println("end loop...");
			}
		}
		System.out.println("main end...");
	}
	
}
