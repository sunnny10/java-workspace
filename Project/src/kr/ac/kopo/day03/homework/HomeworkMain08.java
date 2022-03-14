package kr.ac.kopo.day03.homework;

// 8
/*
			i | '_' | '*'     \\\ i | '*' 시작열
 	*****	1 |	 0	|  5		  1    1 -> i열 
	-****
	--***					   \\\i열 보다 작으면 -, i 열 이후면 *
	---**	i-1	      6-i   
	----*	-------------            
	---**	9-i		  i-4	
	--***
	-****
	*****
 */
public class HomeworkMain08 {

	public static void main(String[] args) {
		
			System.out.println("교수님 풀이 #1");
			for(int i=1; i <= 9; i++) {
				if(i <= 5) {
					for(int j=1; j<=i-1; j++) {
						System.out.print('-');
					} 
					for(int j=1; j<=6-i; j++) {
						System.out.print('*');
					}
				} else {
					for(int j=1; j<=9-i; j++) {
						System.out.print('-');
					}
					for(int j=1; j<= i-4; j++) {
						System.out.print('*');
					}
				}
				System.out.println();
			}
			
			System.out.println();
			
			System.out.println("교수님 풀이 #2");
			
			int space = 0, star = 5;
			for(int i=1; i<=9; i++) {
				for(int j=1; j<=space; j++) {
					System.out.print('-'); 
				}
				for(int j=1; j<=star; j++) {
					System.out.print('*'); 
				}
				
				System.out.println();
				if(i<5) {
					space++;
					star--;
				} else {
					space--;
					star++;
				}
			}
			
			System.out.println();
			
			// 반복문 3개, 조건문 3개
			for(int i=1; i<=9; i++) {
				if(i<=5) {
					for(int j=1; j<=5; j++) {
						if(j<i) {
							System.out.print("-");
						} else {
							System.out.print("*");
						}
					}
				} else {
					for(int j=5; j>=1; j--) {
						if(i-4 >= j) {
							System.out.print("*");
						} else {
							System.out.print("-");
						}
					}
				}
				System.out.println();
			}
			
			System.out.println();
			
			//반복문 5개 조건문 1개
			for(int i=1; i<=9; i++) {
				if(i<=5) {
					int j;
					for(j=1; j<i; j++) {
						System.out.print("-");
					}
					for(int k=j; k<=5; k++) {
						System.out.print("*"); 
					}
				} else {
					int j;
					for(j=5; j>i-4; j--) {
						System.out.print("-");
					}
					for(int k=5-j; k<5; k++) {
						System.out.print("*");
					}
				}
				System.out.println();
			}
			
			System.out.println();
			
			// 반복문 2개 조건문 2개

			
			// 반복문 3개 조건문 1개
	}

}
