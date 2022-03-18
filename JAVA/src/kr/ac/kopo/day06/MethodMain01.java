package kr.ac.kopo.day06;

// 지금 이것은 절자지향의 메소드 방식

/*
 	**********
 	Hello
 	**********
 	Hi
 	**********
 	Bye
 	**********
 	
 	반환형 메소드명([파라미터]) {
 		문장;
 		문장;
 	}
 */
public class MethodMain01 {
						 // char ch = '*', int cnt = '10'
	static int printStar(char ch, int cnt) {
		
		//배열 인덱스 개념 때문에 i를 0부터 시작하는 게 맞다.
		for(int i=0; i<cnt; i++) {
			System.out.print(ch);
			return cnt;
		}
		System.out.println();
		
		//main(10); -> 이렇게 되면 메인이 피호출자, printstar가 호출자가 됨.
		return ch+cnt;	// 나를 호출했던 호출자 메소드로 돌아가자
		//(return) 키워드가 생략되어있다.
		// return은 오직 한 개만 가능하다.
		
	}
	
	static void aaa() {
		boolean bool = true;
		System.out.println('A');
		System.out.println('B');
		
		if(bool) {
			return;
		}
		
		System.out.println('C');
		System.out.println('D');
	}
	
	public static void main(String[] args) {
		
		//aaa()
		
		// 참고) "" 는 string
				 //파라미터(매개변수) : 피호출자로 넘겨주는 값????????
  		int code = printStar('A', 10); // 선언된 함수가 있는 곳으로 커서가 옮겨간다.
		// 변수로 안 받으면 소멸됨. =은 1대1 대응
  		
  		
  		// 메인메소드가 호출해야 메소드 사용가능. printStar는 메인 메소드에 종속적이다.
		// 메인이 호출자 메소드, 메소드가 피호출자 메소드, 근데 이 개념은 상대적인것... 메소드에서 다른 메소드 호출할 경우는 달라짐.
		System.out.println("Hello");	// 얘도 메소드
		printStar('B', 20);
		System.out.println("Hi");
		printStar('C', 5);
		System.out.println("Bye");
		printStar('D', 8);
		// 메인메소드에 선언된 변수와 메소드에 선언된 변수는 완전히 별개의 것. 서로 어떤 변수가 있는지 모른다
		// 메소드와 메소드는 서로 독립적이다.
		
		// 때로는 호출자와 피호출자가 서로 대화하고 싶을 때도 있다... 자신의 변수값을 전달하는 경우가 있을 것. 왜냐면 서로 독립적이니까
		// 그래도 대화해서 전달할 수 있다.
		// 그 통로가 바로 정의부에 있는 '반환형과 파라미터'!!
		
		/* 파라미터 : 호출자 메소드가 피호출자 메소드에게 자신의 변수의 값을 전달할 때 사용
		 * 반환형은 그 반대의 목적으로 사용됨.
		 */
	
	}
}








