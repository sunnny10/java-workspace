package kr.ac.kopo.day05;

public class ArrayMain06 {

	public static void main(String[] args) {
		
		// 배열은 변수를 모아둔 집합.
		// 2차원 배열 : 1차원 배열이 같은 타입의 변수를 모아둔 집합이라면, 2차원 배열은 1차원 배열들을 모아둔 집합.
		// 1차원 배열을 3개 저장하는 1차원 배열을 만들고 싶다. 각 배열의 크기는 integer를 4개씩 갖고 있는 것.
		
		// 2차원 배열이 만들어진 목적 : 1차원 배열이 넓게 퍼져있을 경우 속도가 느려지니까 건너뛰기 하면서 찾으려고 2차원 배열로 만든 것.
		// 자바는 2차원 배열은 배열이 각각 분리되어 있는 것.
		
		//int[][] arr = new int[3][4]; -> 실제로 heap 영역에 new로 만들어진 게 4개이다.
		//			== 같은 의미
		int[] ar01 = new int[4];
		int[] ar02 = new int[4];
		int[] ar03 = new int[4];
		int[][] arr = {ar01, ar02, ar03};
		
		System.out.println("arr : " + arr + ", arr.length : " + arr.length);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
		/* int[] ar = arr[1]; // 1차원 배열
		   ar[2] <=> arr[1][2];
		 */
		
		
		for(int i=0; i < arr[0].length; i++) {
			arr[0][i] = (i+1) * 10;
		}
		
		for(int i=0; i< arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t"); 
			}
			System.out.println();
		}
		
		
		
		/*
			int[] a = new int[4];
			int[] b = new int[4];
			int[] c = new int[4];
			이 a,b,c를 배열로 만들고 싶은 것.
			int[][] arr = {a,b,c}; <- 초기화
		 
		 	2차원 배열 -> 1차원 배열의 주소값을 갖고 있는 배열
		 	
		 	arr의 length : 3 -> arr이 가리키고 있는 배열의 길이 
		 */
	
	}

}
