package kr.ac.kopo.day10.inter;

public class UserMain {

	public static void main(String[] args) {
		
		//인터페이스는 is-a 패턴, kind-of 패턴을 만족하지 않을 수 있다. 꼭 만족할 필요없음.
		// 묵시적 형변환 : 키포인트 -> 자식의 오버라이딩
//		TV tv = new SamsungTV(); 얘만의 메소드가 실행됨
		TV tv = new LGTV();
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.channelUp();
		tv.channelDown();
		tv.powerOff();
	
		
	
	}
	

}
