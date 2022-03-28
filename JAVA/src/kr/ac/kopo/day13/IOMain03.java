package kr.ac.kopo.day13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 	file 입력장치	 file 출력장치
 	입력용		 출력용
 	Koala.jpg -> Koala2.jpg 복사
 */
public class IOMain03 {
	//도스모드로 실행하라는 의미
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("iotest/Koala.jpg");
			// 1바이트 읽어서 1바이트 저장
			fos = new FileOutputStream("iotest/Koala2.jpg");
			//외부장치에 있는 내용을 읽어서 램에 가져와서 램에서 다시 가져와서 파일에 저장함. 외부장치에 있는 파일이 외부장치에 저장될 수 없다.
			
			long start = System.currentTimeMillis();
			
			//c+z는 키보드 입력 중지
			while(true) {
				int c = fis.read();
				if(c == -1) break;
				fos.write(c);	
			}
			
			fos.flush();
			
			// 내 램이 코알라 쓸 수 있도록 연결중.. 동시에 못쑴. 그래서 남들이 쓸 수 있도록 연결하고 있는 연결통로를 없애야함
			// 소프트웨어가 종료되면 자연스럽게 연결 해제
			//while(true);	// 0바이트 나옴? -> read, write할 경우 나만 쓸 수 있도록 잠금됨. 내가 쓰고 있는 와중에 남들이 못 걸리도록 lock걸림
		
			//외부장치랑 연결되는 애들, 클래스애들에서 연결을 해지하는 메소드는 다 close 메소드
			// 얘네들은 다 closeable이라는 인터페이스 상속받기 떄무네...
			// 연결해제코드는 반드시 finally에 있어야함. 연결을 해제해줘야 하니까
			
			long end = System.currentTimeMillis();
			
			System.out.println("소요시간 : " + (end-start)/1000. + "초");
			//바이트 단위로 움직이는 것 -> 속도가 느림... 그래서 하나하나 램에 저장하는 게 아니라 모아서 한 번에 보내줌. -> io도 버퍼를 사용한다. 사용자가 필요할 때마다 파일에서 가져오는 게 아니라 버퍼에 담아서 가져오자
			
		} catch (Exception fnfe) {	// 묵시적 형변환
			fnfe.printStackTrace();
		} finally {
			// try문에서 만든거는 finally가 모룬다 -> 에러난다.
			// try이거 각각 만들어줘야 함
			try {
				fis.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("파일복사가 완료되었습니다");
	}

}
