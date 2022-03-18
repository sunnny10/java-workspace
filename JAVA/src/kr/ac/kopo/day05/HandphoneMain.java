package kr.ac.kopo.day05;

// 추상화시켜서 클래스로 설계시킨다.

//참조클래스
//여기서는 public 붙이면 안된다. 클래스는 따로 파일로 만들어주는 게 좋다!!!
class Handphone {

	String name;		// 실사용자명
	String phoneNumber; // 핸드폰번호
	String company;		// 제조사

}

public class HandphoneMain {
	

	public static void main(String[] args) {
		
		Handphone hp = new Handphone();
		hp.name = "홍길동";
		hp.phoneNumber = "010-1111-2222";
		hp.company = "삼성";
		
		Handphone hp2 = new Handphone();
		hp2.name = "강길동";
		hp2.phoneNumber = "010-3333-4444";
		hp2.company = "애플";
		
		Handphone hp3 = new Handphone();
		hp3.name = "윤길동";
		hp3.phoneNumber = "010-5555-6666";
		hp3.company = "화웨이";
		
		//Handphone 객체를 3개 만들고 있는 객체를 만들 수 있지 않을까...
		Handphone[] hpArr = {hp, hp2, hp3};
		
		for(Handphone phone : hpArr) {
			System.out.println("사용자 : " + phone.name + ", 전화번호 : " + phone.phoneNumber + ", 제조사 : " + phone.company); 
		}
	}

}









