package kr.ac.kopo.day02.homework;

import java.util.Scanner;

public class HomeworkMain08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("물건값을 입력 : ");
		int price = sc.nextInt();
		System.out.print("지불한 돈의 액수 : ");
		int cost = sc.nextInt();
		
		int count = cost - price;
		
		int thousand = 0;
		int five_h= 0;
		int one_h = 0;
		int five = 0;
		int ten = 0;
		
		while(count >= 0) {
			if(count >= 1000) {
				thousand = count / 1000;
				count -= thousand*1000;
			} else if (count >= 1000) {
				five_h = count/500;
				count -= five_h*500;
			} else if (count >= 100) {
				one_h = count/100;
				count -= one_h*100;
			} else if (count >= 50) {
				five = count/50;
				count -= five*50;
			} else if(count >= 10 ) {
				ten = count/10;
				count -= ten*10;
			} else {
				break;
			}
	
		}
		
		System.out.println("거스름돈 : " + count + "원");
		System.out.println("1000 원 : " + thousand + "개");
		System.out.println("500 원 : " + five_h + "개");
		System.out.println("100 원 : " + one_h + "개");
		System.out.println("50 원 : " + five + "개");
		System.out.println("10 원 : " + ten + "개");

		
		
	}

}
