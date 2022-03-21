package kr.ac.kopo.day07;

public class Member {
	// 생성자 호출 방법 : super, this
	
	String name;
	// String name = "알 수 없음"; 이거는 고정된 값
	int age;
	String bloodType;
	
	Member() {
		/* this. */ name = "알 수 없음";
		age = -1;
		bloodType = "알 수 없음";
		
		//this("알수없음", -1, "알수없음");
		//생성자가 실행이 되었는 때 그 내부에서 오버로딩된 생성자를 또 호출하고 싶을 때 그 때 this()를 쓴다.
		//this() 일케 하면 ... 그 때 각 생성자에 생성된 글자를 다 건드려야 하기 때문에 구ㅣ찮다?
		
		//this("알수없음");
	}
	
	//이 n이 먼지 몰라... 매개변수의 뭐를 초기화하는지 알수없다.
	Member(String name){
		/*
		this.name = name;
		//구분하 필요가 없으므로 this를 생략해도 되지만 써주는 게 좋다.
		this.age = -1;
		this.bloodType = "알 수 없음";
		*/
		// 중복코드 여러개 써야한다. "알 수 없음" 이거 고치려면 다 고쳐야함. 불편...
		this(name, -1, "알 수 없음");
		
		//this(name, -1);
	}
	
	Member(String name, int age){
		// 자바에서는 생성자를 호출할 때는 new를 썼을 때만 가능하다.
		// 자기 생성자 안에서 다른 생성자를 호출하고 싶을 때는 일반 메소드랑 다르게 this를 사용한다.
		// this() 는 생성자 맨 첫라인에서만 사용가능.
		// Member(name, age, "알 수 없음"); -> 일케 하면 생성자가 아니라 일반 메소드 호출로 인식한다
		//void Member(String name, int age, String bloodType_ 같은...
		
		/*
		name = n;
		age = a;
		bloodType = "알 수 없음";
		*/
		
		this(name, age, "알 수없음");	// 매개변수 3개짜리 호출.
		
		//this(name, age, "알수없음");
	}
	
	Member(String name, int age, String bloodType){
		// 우선순위, 가장 가까이 선언된 녀석이 우선순위가 제일 높기 때문에 this 안 붙이면 지역변수에 접근됨. 지역변수, 멤버변수 색도 다르다.
		// 메소드나 생성자 내에서 지역변수나 멤버변수를 구분해서 사용하고자 할 때.
		// 구분하지 않을 거라면 this를 생략해서 사용해도 된다. 알아서 jvm이 붙어있다고 생각함.
		
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	
	}

	
	void info() {
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 혈액형 : " + bloodType); 
	} 
}
