package kr.ac.kopo.day02.homework;

import java.util.Random;
import java.util.Scanner;

public class HomeworkMain10 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int num1 = r.nextInt(30) + 1;
		int num2 = r.nextInt(30) + 1;
		int num3 = r.nextInt(30) + 1;
		
		System.out.println(num1 + " : " + num2 + " : " + num3);
		
		int max = num1, min = num2;
		if(num1 < num2) {
			max = num2;
			min = num1;
		}
		
		/* 
		조건식을 이용할 경우 두 번 써야해서 더 복잡...
		int max = num1 > num2 ? num1 : num2;
		int min = num1 > num2 ? num2 : num1;
		*/

		if(num3 > max) {
			System.out.printf("%3d%3d%3d\n", num3, max, min);
		} else if(num3 > min) {
			System.out.printf("%3d%3d%3d\n", max, num3, min);
		} else {
			System.out.printf("%3d%3d%3d\n", max, min, num3);
		}
		
//		Scanner sc = new Scanner(System.in);
//		int one, two, three;
//		
//		System.out.print("첫번째 정수 : ");
//		int first = sc.nextInt();
//		
//		System.out.print("두번째 정수 : ");
//		int second = sc.nextInt();
//		
//		System.out.print("세번째 정수 : ");
//		int third = sc.nextInt();
//		
//		if(first >= second) {
//			if(first >= third) {
//				if(second >= third) {
//					one = first;
//					two = second;
//					three = third;
//				} else {
//					one = first;
//					two = second;
//					three = third;
//				}
//			} else {
//				one = third;
//				two = first;
//				three = second;
//			}			
//		} else {
//			 if(second >= third) {
//				 if(first >= third) {
//						one = second;
//						two = first;
//						three= third;	
//					} else {
//						one = second;
//						two = third;
//						three= first;
//					}
//				} else {
//					one = third;
//					two = second;
//					three= first;
//				}
//		}
//		
//		System.out.println(one + " " + two + " " + three);
//		
//				
		
	}

}
