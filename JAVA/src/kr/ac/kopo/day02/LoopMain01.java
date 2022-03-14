package kr.ac.kopo.day02;

/*
 * 반복문을 위한 기본요소 4가지
 * 1. 반복할문장(statement)
 * 2. 시작값(init)
 * 3. 증가/감소(incre/decre)
 * 4. 종료조건(expr)
 * 
 	// 조건이 거짓일 경우 블록스코프를 빠져나온다.
 	한바퀴 뛸차례다;
	while(조건 : !열바퀴 다 뛰었냐?) {
		운동장 한바퀴 뛴다;
		바퀴수 증가;
	}
	
	1.init;
	while(2.expr) {
		3.statement;
		4.incre/decre;
	}
	5.
	
	1 -> 2 조건 참 -> 3 -> 4
	  -> 2 조건 참 -> 3 -> 4
	  -> 2 조건 참 -> 3 -> 4
	  -> 2 조건 거짓 -> 5
	  
--------------------------------------------------------------------

	for(1.init; 2.expr; 3.incre/decre) {
		4.statement;
	}
	5.
	
	1 -> 2 조건 참 -> 4 -> 3
	  -> 2 조건 참 -> 4 -> 3
	  -> 2 조건 참 -> 4 -> 3
	  -> 2 조건 거짓 -> 5
	  : while와 돌아가는 순서는 같다.

 */
public class LoopMain01 {

	public static void main(String[] args) {

		System.out.println("--------- for 반복문 시작 ---------");
		
		// 자바에서는 같은 이름의 변수를 선언할 수 없다. 이 cnt 이거를 맨 밑에 붙이면 에러나는데 위에서는 안난다
		// 왜냐면...변수명이 구분자 역할을 하기 때문에 같은 변수를 선언하면 안된다.
		// 변수의 라이프사이클 때문이다. 블록스코프를 따르기 때문에 for문 안에 생성된 변수는 for문 안에서만 사용할 수 있고, for문이 종료되면 사라진다.
		for(int cnt = 1; cnt <= 5 ; cnt++ ) {
			System.out.println("Hello");
		}
		
		System.out.println("--------- for 반복문 종료 ---------");

		// true일 경우 무한루프.....
		// boolean bool = true;
		System.out.println("--------- while 반복문 시작 ---------");

		// 얘는 main 메소드의 블록 스코프 안에서만 사용한다. 
		int cnt = 1;
		// while 문 : 조건이 거짓이 될 때까지 수행하는 것
		while (cnt <= 5) {
			System.out.println("Hello");
			++cnt;
		}
		System.out.println("--------- while 반복문 종료 ---------");

	}

}
