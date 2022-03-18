package kr.ac.kopo.day06.homework;

import java.util.Scanner;

public class Icecream2 {
	String name;	// 아이스크림 이름
	int price;	// 아이스크림 가격
	
	int getIcecreamInfo (Icecream2[] icecream, int count) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("*** %d번째 아이스크림 구매정보 ***\n", count+1);
		System.out.print("아이스크림명 : ");
		icecream[count].name = sc.nextLine();
		
		System.out.print("아이스크림 가격 : ");
		icecream[count].price = Integer.parseInt(sc.nextLine());
		
		System.out.println();
		
		return icecream[count].price;
	}
	
	void printIcecreamInfo(Icecream2[] icecream, int i) {
		System.out.println("< " + icecream.length + "개 아이스크림 구매정보 출력 >");
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		
		System.out.println(i+1 + "\t" +  icecream[i].name + "\t\t" + icecream[i].price);
		
	}
	
	//int total() {
		
	//}
	
	
}
