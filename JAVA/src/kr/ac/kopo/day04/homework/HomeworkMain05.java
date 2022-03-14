package kr.ac.kopo.day04.homework;

/*
	*-------*
	**-----**
	***---***
	****-****
	*********
	****-****
	***---***
	**-----**
	*-------* 
 */

/*
 	* 개수 | 1열 ~ a열 | 베타열 ~ 9열
 	* 1   | 1 		 | 9    	
 	* 2   | 2		 | 8
 	* k   | 1 ~ k열	 | (10-star)열 ~ 9열
 	
 	------|---------|---------|---------|---
 		  1        star    10-star      9
 */

// 이런 문제는 가운데 기준 데칼코마니로, 특정문자가 i까지 생성되고, 행 길이-i 서부터 시작된다는 규칙을 파악하면 쉽게 풀 수 있다. 양쪽 기준 같은 위치에서 위치
public class HomeworkMain05 {

	public static void main(String[] args) {
		int star = 1;
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j<=star || j>=10-star) {
					System.out.print('*');
				} else {
					System.out.print('-'); 
				}
			}
			
			System.out.println();
			if(i < 5)
				star++;
			else
				star--;
		}
		
		System.out.println();
		
		int line = (int)(Math.random() * 10) +3;	// 3 ~ 13
		if(line % 2 == 0) 
			line--;
		
		// 3 ~ 40 라인수 받아서, 아니면 랜덤으로
		/*
		 	 4  1  4
		 	****-****
		 	***---***
		 	**-----**
		 	*-------*
		 	---------
		 	*-------*
		 	**-----**
		 	***---***
		 	****-****
		 */
		
		int star2 = line/2;
		for(int i=1; i<=line; i++) {
			for(int j=1; j<=line; j++) {
				if(j<=star2 || j>line-star2) {
					System.out.print('*');
				} else {
					System.out.print('-');
				}
			}
			System.out.println();
			if(i<line/2+1) {
				star2--;
			} else {
				star2++;
			}
		}
		
		System.out.println();
		
		/*
		 	*********
		 	-*******-
		 	--*****--
		 	---***---
		 	----*----
		 	---***---
		 	--*****--
		 	-*******-
		 	*********
		 */
		
		int star3 = 0;
		for(int i=1; i<=line; i++) {
			for(int j=1; j<=line; j++) {
				if(j<=star3 || j>line-star3) {
					System.out.print('-');
				} else {
					System.out.print('*');
				}
			}
			System.out.println();
			if(i<line/2+1) {
				star3++;
			} else {
				star3--;
			}
		}
	}
	


}
