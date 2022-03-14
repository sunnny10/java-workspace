package kr.ac.kopo.day02.homework;

import java.util.Scanner;

public class HomeworkMain07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char result;
		
		System.out.print("입력(알파벳) : ");
		char c = sc.nextLine().charAt(0);
		
		if(c >= 'A' && c <= 'Z') {
			result = (char) (c + 32);
		} else {
			result = (char) (c - 32);
			
		}
		
		System.out.println("변경된 값 : " + result);
	}

}
