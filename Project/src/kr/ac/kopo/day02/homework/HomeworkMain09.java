package kr.ac.kopo.day02.homework;

import java.util.Scanner;

public class HomeworkMain09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		
		while(cnt != 4) {
			System.out.print("보유하고 있는 책권수 : ");
			int book = sc.nextInt();
			
			if(book > 1) {
				System.out.println(book + " books");
			} else if(book == 1) {
				System.out.println(book + " book");
			} else if(book == 0) {
				System.out.println("보유하고 있는 책 없음");
			} else if(book < 0){
				System.out.println("잘못입력했습니다");
			}
			System.out.println();
			
			cnt++;
		}
	}

}
