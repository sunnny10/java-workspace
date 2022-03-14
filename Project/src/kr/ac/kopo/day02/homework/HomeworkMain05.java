package kr.ac.kopo.day02.homework;

import java.util.Scanner;

public class HomeworkMain05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("달러를 입력하세요 ? ");
		int dollar = sc.nextInt();
		
		double won = dollar * 1092.50;
		
		System.out.printf("원화 : %.2f 원", won );
		
		
	}

}
