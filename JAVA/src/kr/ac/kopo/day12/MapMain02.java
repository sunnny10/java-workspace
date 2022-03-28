package kr.ac.kopo.day12;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
	alt+shift+s 누룬 후 c 선택 => 기본생성자
	 				   o 선택 => 매개변수 생성자
	 				   r 선택 => getter/setter 메소드
	 				   v 선택 => override/implement 메소드
	 				   s 선택 => toString() 메소드
 *
 *
 */

class Member {
	private String name;
	private String phone;
	
	public Member(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", phone=" + phone + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}

	//해시코드 : 물리적인 주소를 논리적인 주소로 변환한것. 물리적인 것을 직접적으로 접근할 수 없으니까 jvm이 접근. jvm이 실제 메모리 주소에 접근을 할 수 있고, 참조변수는 해싱된 물리적 주소, 해시코드를 갖고 있는것
	// jvm이 물리적인 주소를 다 가지고 있는 것.
	//해시코드는 hash와 관련된 곳에서만 사용
	// 상위클래스에서 private으로 변수 선언할 때는 get으로 사용하면 된다.
	// @
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}
	
	/*
					//묵시적형변환(object형)
	@Override		// obj가 가리키고 있는 주소는 반드시 member 객체를 가리키고 있다.
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		//((Member)obj).name
					//명시적형변환
		Member m = (Member)obj;	// 같은 member, 즉 자신의 클래스 내부에서 쓰고 있기 떄문에 get 안써도 됨.
		if(this.name != null && !this.name.equals(m.name)) {
			return false;
		}
		if(this.phone != null && !this.phone.equals(m.phone)) {
			return false;			
		}
		return true;
	}
	*/
}

class Car {

	private String name;
	private String carNumber;
	
	public Car(String name, String carNumber) {
		this.name = name;
		this.carNumber = carNumber;
	}
}



public class MapMain02 {

	public static void main(String[] args) {
		
		Map<Member, Car> map = new HashMap<>();
		
		map.put(new Member("홍길동", "010-1111-2222"), 
				new Car("소나타", "33가3333"));
		
		map.put(new Member("윤길동", "010-3333-4444"), 
				new Car("K5", "45나1234"));
		
		// 홍길동 고객의 차량정보 변경
		//교체하고 싶엇음 근데 교체가 안된다?????
		map.put(new Member("홍길동", "010-1111-2222"), 
				new Car("카니발", "82다8282"));
		
		System.out.println("총 개수 : " + map.size());
		System.out.println(new Member("홍길동", "010-1111-2222").hashCode());
		System.out.println(new Member("홍길동", "010-1111-2222").hashCode());
		//문자열은 해시코드가 같다
		
		Set<Entry<Member, Car>> entrys = map.entrySet();
		for(Entry<Member, Car> data : entrys) {
			Member member = data.getKey();
			Car car = data.getValue();

			
			System.out.println(member);
		}
	
	}
	// hash 시리즈는 어떤 객체와 어떤 객체가 같다는 의미는 equals의 결과가 true이면서 해시코드(메모리의 주소값, 논리적인 형태)가 같아야 한다.
	// 그래서 equals분만 아니라 hashcode도 재정의해야함
	// hashset과 hashmap이 hash를 사용한다

}





















