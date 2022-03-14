package kr.ac.kopo.day03.exam;

public class WorkMain01 {

	public static void main(String[] args) {
		
		System.out.println("--------------- 1번 문제 -----------------");

		// #1
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("--------------- 2번 문제 -----------------");
		
		// #2
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("--------------- 3번 문제 -----------------");
		
		// #3
		for(int i=0; i<5; i++) {
			for(int j=i+1; j<=5+i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("--------------- 4번 문제 -----------------");
		
		// #4
		for(int i=5; i>=1; i--) {
			for(int j=i; j<5+i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("--------------- 5번 문제 -----------------");
		
		// #5		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("--------------- 6번 문제 -----------------");
		
		// #6		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("--------------- 7번 문제 -----------------");
		
		// #7
		// for3 || for2 + if1
		for(int i=0; i<5; i++) {
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------- 7번 if문 쓰기 -----------------");
		
		for(int i=0; i<5; i++) {
			for(int j=5; j>0; j--) {
				if(j > 5-i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("--------------- 8번 문제 -----------------");
		
		// #8
		for(int i=0; i<5; i++) {
			for(int j=4; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------- 8번 if문 쓰기 -----------------");
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j < 4-i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("--------------- 9번 문제 -----------------");
		
		/*
		  	i | *
		  	-----
		  	1|1 -> i
		  	2|2
		  	3|3
		  	4|4
		  	5|5
		  	---
		  	6|4 -> 10-i
		  	7|3
		  	8|2
		  	9|1
		  	
		 */
		
		// #9 
		// for3 + if1 || for2 + if1
		for(int i=1; i<=9; i++) {			
			if(i <= 5) {
				//for(int j=5; j>5-i; j--) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
			} else {
				for(int k=1; k<=10-i; k++) {
					System.out.print("*");
				}
			}		
			System.out.println();
		}
		
		System.out.println("--------------- 9번 for2 + if1 -----------------");
	
		for(int i=1; i<=9; i++) {			
			for(int j=9; j>9-i; j--) {
				if(i>5) {
					
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("--------------- 10번 문제 -----------------");
		
		// #10 
		for(int i=1; i<=9; i++) {			
			if(i <= 5) {
				for(int j=0; j<=5-i; j++) {
					System.out.print("*");
				}
			} else {
				for(int k=5; k<=i; k++) {
					System.out.print("*");
				}
			}		
			System.out.println();
		}
		
		System.out.println();
		System.out.println("--------------- 11번 문제 -----------------");
		
		// #11 
		// for5 + if1 || for3 + if3 || for3 + if1 || for2 + if2
		for(int i=1; i<=9; i++) {			
			if(i <= 5) {
				for(int j=1; j<6; j++) {
					if(j < i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			} 
			else {
				for(int k=5; k > 0; k--) {
					if(k < i-3) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}		
			System.out.println();
		}
		
		
		
	}

}
