package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain04 {

	public static void main(String[] args) {
		
		//int[] arr = {10, 20, 30, 40, 50};
		int[] arr = new int[] {10, 20, 30, 40, 50};
		// 위에 둘은 같지 않다. 차이가 있다.
		
		// arr = {5, 4, 3}; : 컴파일시 에러발생. {} 이거는 배열의 선언부와 같이 사용되어야 한다.
		arr = new int[] {5, 4, 3}; // 기존에 있던 배열에 다른 값을 넣을 때.
		
		System.out.println("arr : " + Arrays.toString(arr));
	}

}
