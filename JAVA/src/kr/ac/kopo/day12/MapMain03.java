package kr.ac.kopo.day12;

public class MapMain03 {

	public static void main(String[] args) {
		//객체는 equals로 비교
		
		Member m = new Member("홍길동", "010-1111-2222");
		Member m2 = new Member("홍길동", "010-1111-2222");
		
		//안에 들어있는 내용이 궁금하지 주소값이 중요한게 아님, object에 있는 equals 메소드(주소값 같냐) : 객체가 다 다르면 비교하기 귀찮으니까 일단 주소값으로 비교하고 알아서 재정의해라
		if(m.equals(m2)) {
			System.out.println("m == m2");
		} else {
			System.out.println("m != m2");
		}
		
//		String s01 = new String("hello");
//		String s02 = new String("hello");
//		
//		if(s01 == s02) {
//			System.out.println("s01 == s02");
//		} else {
//			System.out.println("s01 != s02");
//		}
	}

}
