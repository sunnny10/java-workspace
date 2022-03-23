package kr.ac.kopo.day10.inter;

public interface TV {
	
	// 상수
	int MIN_VOLUME_SIZE = 0;
	/* public static final */ int MAX_VOLUME_SIZE = 50;
	
	//문서화 주석(접근자가 Public일 경우에만 작성)이 중요하다
	/**
	 * 전원을 켜는 기능
	 */
	/* public abstract */ void powerOn();
	void powerOff();
	void channelUp();
	void channelDown();
	void volumeUp();
	void volumeDown();
	void mute();
	
}
