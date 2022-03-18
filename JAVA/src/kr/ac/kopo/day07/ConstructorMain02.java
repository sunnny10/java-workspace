package kr.ac.kopo.day07;

public class ConstructorMain02 {

	public static void main(String[] args) {
		
		Member m = new Member();
		Member m2 = new Member("홍길동");

		
		/* 
			은닉성에 위배되는 코드
			Member m2 = new Member("");
			m2.name = "홍길동";
			
			직접 건드리지 않는다
			
		*/
		
					// new : 이 때 생성자 호출
		Member m3 = new Member("윤길동", 22);
		Member m4 = new Member("한길동", 30, "O");
		
		// null이 출력되는데 사용자 입장에서는 null이 뭔지 모르니까 알수 없음이나 이런게 더 이해가 잘 갈 것
		m.info();
		m2.info();
		m3.info();
		m4.info();
		
		// System.out.println("이름 : " + m.name);
		
	}

}
