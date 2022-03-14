package kr.ac.kopo.day02.homework;

import java.util.Scanner;

public class HomeworkMain11 {

	public static void main(String[] args) {
		
		int num1 = (int)(Math.random() * 30) + 1;
		int num2 = (int)(Math.random() * 30) + 1;
		int num3 = (int)(Math.random() * 30) + 1;
		int num4 = (int)(Math.random() * 30) + 1;
		
		System.out.println(num1 + " : " + num2 + " : " + num3 + " : " + num4);
		
		int max01 = num1 > num2 ? num1 : num2;
		int max02 = num3 > num4 ? num3 : num4;
		int max = max01 > max02 ? max01 : max02;
		System.out.println("가장 큰수 : " + max);
		
		/*
		int max = num1 > num2 ? num1 : num2;
		if(max < num3) {
			max = num3;
		}
		if(max < num4) {
			max = num4;
		}
		
		System.out.println("가장 큰수 : " + max);
		*/ 
		
		/* Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 4개 입력 : ");
		int first = sc.nextInt();
		
		int second = sc.nextInt();
		
		int third = sc.nextInt();
		
		int four = sc. nextInt();
		*/
		
		
	}

}
