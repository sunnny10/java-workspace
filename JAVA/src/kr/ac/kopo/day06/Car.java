package kr.ac.kopo.day06;

/*
 * 자동차라는 클래스를 만들고 싶다. -> 정의/설계
 * 클래스 설계는 어렵다...
 * 내 자동차의 브랜드명은...
 * 제조사는...
 * 내가 어떻게 추상화시킬거냐에 따라 멤버변수, 속성, 기능들은 달라질 수 있다.
 */

// 참조클래스
// car
// 눈에 보이는 사물을 추상화시킨 설계도
// 눈에 보이려면 메모리에 할당되어야... 인스턴스 객체가 만들어져야 한다.
public class Car {
	
	//도큐먼트 주석 : 어디 내보내는 용... 어떤 행위를 하는 메소드인지 등 남들도 알아야 하니까... 근데 멤버변수같은 거는 은닉성 때문에 안 알려준다. 멤버변수는 외부에서 접근하지 않는 게 맞기 때문에 메소드로 접근(제어)하게 한다.
	/**브랜드명 */
	String name; 		// 브랜드명
	/** 제조사 */
	String company;		// 제조사
	
	
}
