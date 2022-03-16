package kr.ac.kopo.day06.homework;

import java.util.Scanner;

/*
	String [] names[3];
	String[] prices[3]; 이렇게 해도 되는데, class 따로 만드는게 데이터를 추가할 때 편하고 객체지향스럽게 만들 수 있다.
 */

//실행 클래스
public class HomeworkMain01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("아이스크림 몇개 구입할꺼야? => ");
		int count = sc.nextInt();
		
		Icecream[] icecream = new Icecream[count];
		
		System.out.println();
		
		for(int i=0; i<count; i++) {
			icecream[i] = new Icecream();
			System.out.printf("*** %d번째 아이스크림 구매정보 ***\n", i+1);
			System.out.print("아이스크림명 : ");
			icecream[i].name = sc.next();
			sc.nextLine();
			System.out.print("아이스크림가격 : ");
			icecream[i].price = sc.nextInt();
			sum += icecream[i].price;
			System.out.println();
			
		}
		
		System.out.println("< 총 " + count + "개의 아이스크림 구매정보 출력 >");
		System.out.printf("번호\t아이스크림명\t가격\n");
		for(int i=0; i<count; i++) {
			System.out.println(i+1 + "\t" +  icecream[i].name + "\t\t" + icecream[i].price);
		}
		
		System.out.println();
		System.out.println("총 판매액 : " + sum + "원");
		
	}

}
