package kr.ac.kopo.day08;

public class EmployeeMain {

	public static void main(String[] args) {
		
		//System.out.println("총사원수 : " + Employee.employeeCnt + "명");
		Employee.employeeCntInfo();
		
		// 실제 employee 클래스와 관련이 있다. 그런데 지금 바깥으로 나와있으니까... 좋은 방법이 아니다 => 관련이 있는 애들끼리 묶어줘야해
		//int totalEmployee = 0;
		
		// 이 값들을 표현하기 위한 사원 클래스 안에 어떤 멤버변수가 머가 있는지는 모른다. 좋은 코드
		//e.name ="" -> 이것은 좋은 코드가 아니다. .name 이렇게 접근은 일반적으로 자신의 클래스에서만 써주는게 좋은 코드이다.
		// 어떻게 클래스를 분리시킬 것인지...
		Employee e = new Employee("홍길동", 3300, "사원");		
		Employee e2 = new Employee("강길동", 3800, "대리");
		
		//doc에서도 멤버변수는 안보여준다.
		
		e.info();
		// 각 각 독립적
		e.employeeCntInfo();
		e2.info();
		e.employeeCntInfo();
	}

}
