package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain05 {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 50, 70, 30};
		//int[] copy = arr; -> 참조변수 복사 : shallow copy(얕은복사)
		
		//참조변수가 가지고 있는 값을 복사하는 것 : deep copy(깊은복사)
		int[] copy = new int[arr.length];
		System.arraycopy(arr, 0, copy, 0, arr.length);	//import 해야되는 거 아님?? 안한다... 왜냐면... java.lang 패키지 안에 있기 때무네.. 이 패키지는 프로그램을 실행할 때 jvm이 java.lang 패키지에 있는 모든 클래스는 알아서 import 해줌
		//java.lang 패키지는 import 안해도 된다.
		
//		for(int i=0; i<arr.length; i++) {
//			copy[i] = arr[i];
//		}
		
		System.out.println("arr : " + arr);
		System.out.println("copy : " + copy); // 주소 다름, 얕은복사는 주소 같다.
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copy : " + Arrays.toString(copy));
		
		copy[2] = 100;
		
		// 카피가 가리키는 값을 수정했을 뿐인데, 둘다 수정됨????
		// 배열의 공간은 한 개가 만들어지고, 그 하나의 공간을 arr, copy 둘다 가르치고 있는 것.
		// 복사할 때 배열의 값을 복사한게 아니라 배열의 주소값을 복사한 것. 하나의 공간을 두 개의 참조 변수가 가리키는 것.
		// ----> Shallow copy : int copy = arr
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copy : " + Arrays.toString(copy));
	}

}
