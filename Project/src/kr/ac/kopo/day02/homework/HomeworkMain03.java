package kr.ac.kopo.day02.homework;

import java.util.Scanner;

public class HomeworkMain03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("반지름을 입력하세요 : ");
		int r = sc.nextInt();
		double pi = 3.141592;
		
		
		System.out.println("원의 면적은 " + r*r*pi + " 입니다.");
	}

}
