package kr.ac.kopo.day09;

public class CastMain02 {

	public static void main(String[] args) {
		//new parent 공간을 가르키는 것이 아니다. 부모의 참조변수 값이 들어와야 함.
		//Child01 c = (Child01)new Parent();
		
		Parent p = new Child01();
		Child01 c2 = (Child01)p;
		
		c2.sleep();
		c2.study();
//		c2.print();
				
	}

}
