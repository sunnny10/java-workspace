package kr.ac.kopo.day01;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		
		//자바가 제공해주고 있는 패키지
		// 키보드에서 5가지 자료형 입력받을 수 있다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력 : ");
		//첫번째 문자를 대입해줘
		char ch = sc.nextLine().charAt(0);
		System.out.println("ch : " + ch);
		
		System.out.print("문자열을 입력 : ");
		//하나의 문자를 구분하는 것이 엔터나 스페이스나 탭.... -> next()
		String str = sc.nextLine();
		System.out.println("str : " + str);
		//문장으로 입력받기 위해서는 nextline 사용
		
		
		//문자 입력받는 코드 next 어쩌구..는 없다.
		System.out.print("정수를 하나 입력하세요 : ");
		int a = sc.nextInt() /* 키보드로 입력받은 정수 */;
		System.out.println("a : " + a);
		
	}

}
