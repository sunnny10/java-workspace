package kr.ac.kopo.day09;

public class CastMain01 {
	
	/*
	public static void print(Child01 c) {
		c.print();
	}
	
	public static void print(Child02 c) {
		c.print();
	}
	*/
	
	// 묵시적 형변환 -> 부모의 공간만 접근할 수 있고 자식의 공간은 접근할 수 없다.
	// 눈에 명확히 보이지는 않지만 묵시적 형변환이 이루어지고 있다.
	public static void print(Parent p) {

		p.print();
		
		// 일케 하면 오류남. 어떤 인자가 날아올지 모름.. child01이 올지 child02가 올지....
		/* Child01 c = (Child01)p;
		c.study();
		c.sleep();
		*/
		
		/*
		//p가 가리키고 있는 게 child01인지 아닌지... 확인...
		System.out.println("Child01 : " + (p instanceof Child01)); //왼쪽과 오른쪽이 서로 상속관계일 때만 사용가능
		System.out.println("Child02 : " + (p instanceof Child02)); //왼쪽과 오른쪽이 서로 상속관계일 때만 사용가능
		System.out.println("Parent : " + (p instanceof Parent)); //왼쪽과 오른쪽이 서로 상속관계일 때만 사용가능
		*/
		
		if(p instanceof Child01) {
			Child01 c = (Child01)p;
			c.study();
			c.sleep();
		} else if(p instanceof Child02) {
			Child02 c = (Child02)p;
			c.sing();
			c.play();
		}
	}
	
//	public static void print(Object obj) {
//		// 모든 클래스의 인스턴스 인자를 받을 수 있다.
//	}
	
	// print(new Random())
	
	public static Object returnFun() {
		return new java.util.Scanner(System.in);
	}
	
	public static void main(String[] args) {
		
		print(new Child01());
//		print(new Parent());
		/*
		Child01 c01 = new Child01();
		print(c01);

//		Child01 c01 = new Child01();
//		c01.print();
		
		Child02 c02 = new Child02();
		print(c02);
//		c02.print();
		
		Parent p = new Parent();
		print(p);
//		p.print();
		*/
	}

}
