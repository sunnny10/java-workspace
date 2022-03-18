package kr.ac.kopo.day06;

//같은 패키지 내에서는 동명의 클래스가 존재할 수 없다.
class ExamMethod {
	int getSum(int a, int b) {
		return a + b;
	}
	
	int getTotal(int a, int b) {
		int s = 0;
		while(a <= b) {
			s += a++;
		}
		return s;
	}
}

public class MethodMain03 {

	public static void main(String[] args) {
		ExamMethod exam = new ExamMethod();
		int sum = exam.getSum(10, 20);
		System.out.println("10 + 20 = " + sum);
		
		System.out.println("1 ~ 10 총합 : " + exam.getTotal(1, 10));
	}

}
