package kr.ac.kopo.day08;

// 변수의 이름이 중요한 것이 아니라 어떤 클래스에 들어있는지가 중요하다.
public class Employee {
	String name;
	int salary;
	String grade;
	// employee 객체의 개수를 세기 위한 것이기 때문에 하나만 만들어도 됨.
	// 서로 관련이 있는 애들은 추상화시켜 클래스에 넣어야 되니까... 객체지향때문에 static...
	static int employeeCnt;	// 총사원수
	
	Employee() {
		// 클래스 변수는 자신의 클래스에서 접근하더라도 클래스 이름까지 써주는게 좋다(가독성).
		Employee.employeeCnt++;
	}
	
	Employee(String name, int salary, String grade) {
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		employeeCnt++;
	}
	
	void info() {
		System.out.println("사원명 : " + name + ", 연봉 : " + salary + "만원, 직급 : " + grade);
	}
	
	static void employeeCntInfo() {
		//out은 변수, 변수.메서드니까 non-static, 객체로 접근한다.
		System.out.println("총 사원수 : " + employeeCnt + "명");
	}
}
