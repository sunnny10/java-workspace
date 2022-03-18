package kr.ac.kopo.day06;

import java.util.Scanner;

public class methodMain04 {

	public static void main(String[] args) {
		//구구단의 인스턴스 객체 생성
		Gugudan gu = new Gugudan();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("2 - 9사이의 단을 입력 : ");
		int dan = gu.getDan();
		
		gu.print(dan);
		
		gu.print();
		
		System.out.print("시작단 입력 : ");
		int startDan = gu.getDan();
		
		System.out.print("종료단 입력 : "); 
		int endDan = gu.getDan();
		
		gu.print(startDan, endDan);
	}

}
