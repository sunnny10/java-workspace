package kr.ac.kopo.day13;

import java.io.IOException;
import java.io.InputStream;

public class IOMain01 {

	public static void main(String[] args) {
		/*
		System.in -> 키보드 / System.out -> 모니터 : 입출력
		system.error -> 에러제어
		*/
		
		
		//외부장치를 통해서 바이트 단위로 읽어오겟다
		InputStream is = System.in;
		System.out.println("키보드 입력을 하세요, ctrl+z(인터럽트 의미) 입력시 종료됩니다");
		
		while(true) {
			//read : 바이트로 들어온 것을 저장해서 int형으로 리턴함
			try {
				int c = is.read();
				// 아무것도 입력받지 않은 상태에서 ctrl+z눌러야 의미있따
				if(c == -1) break;
				System.out.print((char)c);
			} catch (IOException e) {
				e.printStackTrace();
			}
			//유니코드 : 2byte, read는 바이트스트림이라 1byte만 읽어서 아스키코드로 출력하기 때문에 한글은 이상하게 찍힌다
			// 그래서 2바이트씩 읽을 수 있도록 필터클래스가 필요
			//ox34 : 1바이트형시
		}
		
		
		
	}

}












