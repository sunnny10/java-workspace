package kr.ac.kopo.day02;

import java.util.Scanner;

/*
	1 ~ 3 사이의 정수 입력 :
	1 입력시 "ONE" 출력
	2 입력시 "TWO" 출력
	3 입력시 "THREE" 출력
	그외 	"ERROR" 출력
 */


public class SwitchMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 - 3사이의 정수 입력 : ");
		int num = sc.nextInt();
		
		// 동등비교의 코드
		// 원래 스위치는 중간에 몇 장부터 시작하던간에 시작하면 무조건 마지막까지 읽어야한다.중간부터 커서가 끝날 때까지 읽어야 함.
		// 중간에 빠져나가고 싶으면 break 문 사용하면 된다.
		// break 문은 switch와 반복문에서만 의미있다.
		switch(num) {
		case 1 :
			System.out.println("ONE");
			break;
			//가까운 블록으로 이동. 분기한다는 뜻.
		case 2 : 
			System.out.println("TWO");
			break;
		case 3 : 
			System.out.println("THREE");
			break;
		// default는 case를 다 완료하고 사용 가능
		default :
			System.out.println("ERROR");
		}
		
		/*
		if(num == 1) {
			System.out.println("ONE");
		}
		if(num == 2) {
			System.out.println("TWO");
		}
		if(num == 3) {
			System.out.println("THREE");
		}
		else {
			System.out.println("ERROR");
		}
		*/
	}

}
