package kr.ac.kopo.day13;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOMain02 {

	// scanner는 1.5버전에 나온 거라서 이전까지는 일케 씀
	public static void main(String[] args) {
		//실제 키보드 입력
		InputStream is = System.in;
		//키보드로 친거는 바이트 형태로 받아옴. 
		// 1바이트 읽어온거를 c에 바로 저장하지 말고 문자 스트림의 reader가 받아서 2개씩 조합해서 문자스트림의 형태로 바꿔준다
		// 필터스트림
		// 나한테는 문자스트림 형태로 나온다.
		InputStreamReader isr = new InputStreamReader(is);
		System.out.println("키보드 입력을 하세요, ctrl+z(인터럽트 의미) 입력시 종료됩니다");
		
		while(true) {	
			try {
				int c = isr.read();
				if(c == -1) break;
				System.out.print((char)c);
				// 키보드가 내부적으로 버퍼를 쓰고 있기 떄무넹 엔터까지 일어와서 얘를 다 쓴다..
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
