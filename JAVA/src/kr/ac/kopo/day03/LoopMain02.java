package kr.ac.kopo.day03;
/*
	while(expr){
		statement;
	}
	
	for(init; expr; incre) {
		statement;
	}
	
	init;
	do {
		statement;
		incre/decre;
	} while(expr); //밑에 있을 경우 아래 블록과 헷갈릴 수 있기 때문에 ; 붙인다. 조건식 횟수가 하나 덜 돈다.
	
	do-while은 언제 쓸까??? 무조건 한 번은 실행해야 한다??? -> 대부분 에러체크할 때 쓴다. 메뉴화면짤 때도 쓴다.
*/

public class LoopMain02 {

	public static void main(String[] args) {
		int cnt = 1;
		do {
			System.out.println("Hello");
			cnt++;
		} while(cnt <= 5);
		
		System.out.println("=================================");
		cnt = 1;
		//true는 무한루프
		while(true) {
			System.out.println("Hello");
			++cnt;
						
			if(cnt > 5) {
				break;
				//break는 가장 가까운 반복문이나 switch 문을 빠져나올 때 쓴다.
			}
		}

	}

}
