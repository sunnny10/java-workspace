package kr.ac.kopo.day04;

public class ArrayMain03 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		/*
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		*/
		
		/* 기본형 배열 기준 | 참조형은 다르다 */
		//이렇게 하면 죄다 0 나온다. 왜냐면... arr값을 고치는 게 목적인데, 이 코드는 num(arr 요소 값을 가지고 있는 복사본)에 대입하는 것.
		//원래 원소가 아니라 원소가 가지고 있는 값을 복사하는 것.
		//num을 수정하는 거지 배열을 수정하는 것이 아니다.
		// 배열값을 수정하거나 입력하는 데는 사용못함. 출력용에 사용.
		// 값을 고칠 때는 인덱스를 이용한다.
		/*
		int data = 1;
		for(int num : arr) {
			num = data++;
		}
		*/ 
		
		System.out.println("< PRINT >");
		for(int num : arr) {
			System.out.print(num + "\t"); 
		}
		System.out.println();
		
		/*
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		 */
	}

}
