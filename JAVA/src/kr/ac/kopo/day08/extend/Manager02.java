package kr.ac.kopo.day08.extend;

//	관리자(Manager02)는 사원(Employee)의 한 형태다 조건 부합 => 상속관계 부합
public class Manager02 extends Employee{
	
		Employee[] empList;	// 관리사원목록
		
		Manager02() {}
		
		Manager02(String name, int salary, String grade, Employee[] empList){
			//super();
			// naem, salary, grade는 부모 클래스가 갖고 잇는 것.
			this.name = name;
			this.salary = salary;
			this.grade = grade;
			this.empList = empList;
		}
		
		// 어노테이션 : 코드주석이면서 오류체크까지 해줌, 컴파일이 아닌 실행시점에 뭔가를 하고 싶은 거... 컴파일 시점에 오류까지 체크
		@Override
		void info() {
			// info() 호출시 this(자신의 메소드)가 기본이다. 부모꺼를 호출하려면 super.info()로 해야한다. 여기 없는 경우 부모에 접근
			super.info();
			
			System.out.println("------------------------------------------------------");
			System.out.println("\t관리사원 목록");
			System.out.println("------------------------------------------------------");
			for(Employee e : empList) {
				e.info();
			}
			System.out.println("------------------------------------------------------");
		}


}
