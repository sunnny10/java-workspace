package kr.ac.kopo.day06.homework;

import java.util.Scanner;

import kr.ac.kopo.day05.homework.Icecream;

public class HomeworkMain01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("아이스크림 몇개 구입하시겠습니까? => ");
		int count = sc.nextInt();
		
		Icecream2[] iceArr = new Icecream2[count];
			 
		for(int i=0; i<count; i++) {
			iceArr[i] = new Icecream2();
			sum += iceArr[i].getIcecreamInfo(iceArr, i);
			
		}
		
		System.out.println();
		
		for(int i=0; i<count; i++) {
			iceArr[i].printIcecreamInfo(iceArr, i);
		}
		
		System.out.println();
		System.out.println("총 판매액 : " + sum + "원");
		
	}

}
