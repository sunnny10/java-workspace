package kr.ac.kopo.day06;

import java.util.Arrays;

public class ArrayMain07 {

	public static void main(String[] args) {
		
		// 2차원 배열을 열심히 본 이유는 참조 자료형 배열 때문이다.
		int[][] ar = new int[3][];
		for(int i=0; i< ar.length; i++) {
			ar[i] = new int[4];
		}
		// -> int[][] ar = new int[3][4]; -> 이게 더 편함 / 위에 꺼는 전부 다 다르게 설정할 때 사용 -> ar[i] = new int[(int)(Math.random()*3)+2)]
		
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				ar[i][j] = i*10 + (j+1);
			}
			System.out.println();
		}
		
		//1 (다 같은 의미)
		for(int[] arr : ar) {
			System.out.println(Arrays.toString(arr));
		}
		//2
		for(int[] arr : ar) {
			for(int num : arr) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		//3
		for(int i=0; i<ar.length; i++){
			for(int num : ar[i]) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
		
		//ar 배열의 원소의 타입이 int[]
//		for(int[] arr : ar) {
//			 System.out.println(arr);
//			
//		}
		/*
		 	ar -> □ (null)
		 		  □ (null)
		 		  □ (null)
		 */
	}

}
