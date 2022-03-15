package kr.ac.kopo.day05.homework;

import java.util.Scanner;

// ~보다 큰 수 입력받기
public class HomeworkMain02 {

	public static void main(String[] args) {
		int[] nums = new int[5];
		Scanner sc = new Scanner(System.in);
		
		// 앞보다 커야한다 => 이미 오름차순으로 넣어지고 있다. 
		
		String msg = "";	
		for(int i=0; i<nums.length;) {
			System.out.print(i+1 + "번째 정수 입력 : ");
			nums[i] = sc.nextInt();
			if(i>0 && nums[i] < nums[i-1]) {
				System.out.println(msg + "보다 큰수여야합니다");
			} else {
				//문자열로 이어붙인다.
				msg += nums[i++] + " ";
			}
		}	
		
		System.out.println("< PRINT >");
		for(int num : nums) {
			System.out.print(num + "\t");
		}
		System.out.println();
		
		System.out.println("< REVERSE >");
		for(int i=nums.length-1; i>=0; i--) {
			//num[i] = 25 ==> 52
			int n10 = nums[i] / 10;
			int n1 = nums[i] % 10;
			System.out.print(n1*10 + n10 + "\t"); 
		}
		
		
		/*
		//이렇게도 쓸 수 있다. 가장 가까운 게 아니라 가장 먼 곳으로 이동할 수도 있다.
		//loopI:for(int i=0; i<nums.length; i++) {
		for(int i=0; i<nums.length; i++) {
			System.out.print(i+1 + "번째 정수 입력 : ");
			nums[i] = sc.nextInt();
			if(i>0 && nums[i] < nums[i-1]) {
				for(int j=0; j<i; j++) {
					System.out.print(nums[j] + " ");
				}
				System.out.println("보다 큰수여야합니다"); 
				i--;
			}
		}	
			
			// nums[i] > nums[0] ~ nums[i-1]
			/* for(int j=0; j<i; j++) {
				if(nums[i] < nums[j]) {
					System.out.println("Error!!!");
					//continue loopI;
				}
				-> 굳이 이렇게 쓸 필요 없다. 
				}
				*/
			
			
		
	}

}
