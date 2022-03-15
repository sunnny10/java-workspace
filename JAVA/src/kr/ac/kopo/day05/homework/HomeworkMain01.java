package kr.ac.kopo.day05.homework;

import java.util.Arrays;
import java.util.Scanner;

// 짝홀 판단
public class HomeworkMain01 {
	
	public static void main(String[] args) {
		int[] nums = new int[10];
		int[] sum = new int[2];	// [0]:짝수총합 ~ [1]:홀수총합
		Scanner sc = new Scanner(System.in);
		
		//continue는 안 쓰는 게 좋다. 분기하면서 문제가 생길 수 있기 때문
		int loc = 0;
		while(loc < nums.length) {
			System.out.println(loc + 1 + "번째 정수 입력 : ");
			int num = sc.nextInt();
			if(nums[loc] < 0)
				continue;
			sum[nums[loc] % 2] = nums[loc++]; 
		}
		
		//이 코드 while로도 쓸 수 있다. 근데 이 코드가 더 좋다.
		/*
		//for(int i=0; i<nums.length; i++) {
		for(int i=0; i<nums.length;) {
				System.out.print(i+1 + "번째 정수 입력 : ");
				nums[i] = sc.nextInt();	
				//if(nums[i] < 0)
					//i--;
				if(nums[i] >= 0)
					sum[nums[i] % 2] += nums[i];
					i++;
		}
		*/
		
		/*
		for(int i=0; i<nums.length; i++) {
			do {
				System.out.print(i+1 + "번째 정수 입력 : ");
				// 입력을 받으면서 총합에 넣을 수 있다.
				nums[i] = sc.nextInt();				
			} while(nums[i] < 0);
			sum[nums[i] % 2] += nums[i];
		}
		*/
		
		String[] title = {"짝수", "홀수"};
		for(int mod = 0; mod <= 1; mod++) {
			System.out.println("<" + title[mod] + ">");
			for(int i=0; i<nums.length; i++) {
				if(nums[i] % 2 == mod) {
					System.out.print(nums[i] + " ");
				}
			}
			System.out.println(title[mod] + "총합 : " + sum[mod]);
		}

	}

}
