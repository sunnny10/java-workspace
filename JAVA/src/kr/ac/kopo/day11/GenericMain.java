package kr.ac.kopo.day11;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class A {
	// 묵시적 형변환에 의해 object 상속하는 모든 객체 받을 수 있따.
	private Object data;
	
	A(Object data){
		this.data = data;
	}
	
	Object getData() {
		//return 타입이 오브젝트형
		return data;
	}
	
	void setData(Object data) {
		this.data = data;
	}
	
}

//TYPE
class B<T> {
	private T data;
	
	B(T data) {
		this.data = data;
	}
	
	T getData() {
		return data;
	}
	
	void setData(T data) {
		this.data = data;
	}
}

public class GenericMain {

	public static void main(String[] args) {
		//object는 온갖 자료형 다 받을 수 있어서 ... 원래 객체대로 쓰려면 형변환써야하는데 귀찮고 힘듦. 타입이 안맞으면 클남
		
		//컬렉션이 제네릭을 쓴다. 같은 타입의 데이터의 집합으로 만들고 싶을 때 제네릭을 쓴다.
		
		//object가 알아서 제네릭<>에 써잇는 상태(타입)로 바뀌는 것. 내가 가지고 있는 데이터의 집합의 타입을 object가 아닌 그 타입으로 바꿔주는 것
		//string 형의 배열을 만들고 싶다
		B<String> b = new B<String>(new String("hello"));
		System.out.println("길이 : " + b.getData().length());
		//string을 저장한 애를 만들겠따. 다른 타입 작성하면 오류남.
		B<String> b3 = new B<String>("byebye");
		b3.setData("aa");
		
		B<Random> b2 = new B<Random>(new Random());
		System.out.println("추출된 정수 : " + b2.getData().nextInt(10) + 1);
		
		A a = new A(new String("hello"));	// object 형으로 리턴받음
		String data = (String)a.getData();	// length 쓰려면 string 형으로 명시적 형변환해줘야햄.
		System.out.println("길이 : " + data.length());
		
		A a2 = new A(new Random());
		//object는 모든 타입이 가능하므로 형변환이 다 잘되고있는지 파악하기 어렵다
		int random = ((Random)a2.getData()).nextInt(10) + 1;
		System.out.println("추출된 정수 : " + random);
		

	}

}
