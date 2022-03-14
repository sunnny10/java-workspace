package kr.ac.kopo.day02;

public class OperationMain01 {

	public static void main(String[] args) {
		
		int a = 1, b = 0, c = -1;
		
		//boolean bool = (++a > 1) || (++b > 1);
								// 앞에서 이미 참이면 뒤에꺼 안본다. 그래서 b 처리는 아예 안함. 그래서 0인거
		//boolean bool = --a > 1 && ++b > 1 || ++c > 0;
		// &&가 우선순위가 더 높다. 앞에 봣는데 앞에꺼가 이미 거짓이면 && 뒤에는 안본다. ||는 앞에가 거짓이여도 뒤에는 봐야함.
		
		boolean bool = ((a++) > 0) || (b-- >= 0 && c++ <= 0);
		// 후위증가는 세미콜론 이후 증가
		
		//A+B+C*D  AB+CD*+
		System.out.println("bool : " + bool);
		System.out.println("a : " + a + ", b : " + b + ", c : " + c);
	}

}
