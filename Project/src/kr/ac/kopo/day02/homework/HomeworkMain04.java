package kr.ac.kopo.day02.homework;

import java.util.Scanner;

public class HomeworkMain04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		System.out.print("나눌 수를 입력하세요 : ");
		int quot = sc.nextInt();
		
		System.out.println("몫 : " + (num/quot));
		System.out.println("나머지 : " + (num%quot));
		
		
	}

}
