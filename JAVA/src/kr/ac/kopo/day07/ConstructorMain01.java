package kr.ac.kopo.day07;

/*
 * 생성자 특징
 * 1. 클래스명과 동일
 * 2. 반환형이 없다.
 * 3. 디폴트 생성자 지원 : 클래스 내에 생성자가 존재하지 않는 경우 JVM이 자동으로 생성
 * 4. 오버로딩 지원
 * 5. 멤버변수 초기화
 */
class Car {
	
	// 앞에 리턴타입이 있으면 메소드로 인식한다.
	Car(){
		System.out.println("Car() 생성자 호출...");
	}
	
	Car(int i){
		System.out.println("Car(int) 생성자 호출..."); 
	}
	
	Car(int i, String s){
		System.out.println("Car(int, String) 생성자 호출..."); 
	}
	
}

public class ConstructorMain01 {

	public static void main(String[] args) {
	
		Car c = new Car();	// new에서 인스턴스 객체를 생성하는 순간 생성자를 호출한다. () 일케 해도 오류가 안나는 이유는 JVM이 디폴트 생성자를 만들어주기 때문(현재 개발자가 생성자 정의를 안 했을 경우)
		Car c2 = new Car(10);
	}

}
