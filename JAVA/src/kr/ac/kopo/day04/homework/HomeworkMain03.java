package kr.ac.kopo.day04.homework;

/*
 	*
 	**
 	***
 	****
 	*****
 	****
 	***
 	**
 	*
 */

/*
 	i | *
   -------
 	1 | 1
 	2 | 2
 	3 | 3
 	4 | 4
 	5 | 5
 	6 | 4
 	7 | 3
 	8 | 2
 	9 | 1
 */

public class HomeworkMain03 {

	public static void main(String[] args) {
		
		//별 증가 -> 감소 부분을 변수로 만들어서 설정. 공식말고 별의 개수가 얼마인지...
		int star = 1;
		
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=star; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			if(i < 5) 
				star++;
			else 
				star--;
		}
	}

}
