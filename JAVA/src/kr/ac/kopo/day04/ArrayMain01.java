package kr.ac.kopo.day04;

public class ArrayMain01 {

	public static void main(String[] args) {
		//arr은 스택에 잡히는 지역 변수
		//지역 변수는 자동 초기화 안됨. new를 썼을 때만 자동 초기화(int는 다 0)된다.
		int[] arr; 
		
		// 정수 5개를 가지는 배열 생성
		arr = new int[5];

		
		System.out.println("arr : " + arr);
		//arr : [I@75a1cd57 -> @표시 붙은 것은 다 주소다.
		
		//위랑 주소값 다르다.
		arr = new int[10]; // arr[0] ~ arr[4]
		System.out.println("arr : " + arr);
		System.out.println("배열의 원소 총 개수 : " + arr.length + "개");
		System.out.println("첫번째 원소 : " + arr[0]);
		System.out.println("두번째 원소 : " + arr[1]);
		System.out.println("세번째 원소 : " + arr[2]);
		System.out.println("네번째 원소 : " + arr[3]);
		System.out.println("다섯번째 원소 : " + arr[4]);

		System.out.println("---------------------------------");
		
		//i : index 약자
		//for문은 지정/고정된 값이 있을 때 사용, 배열 초기화 때문에 0으로 초기화하는 것이 일반적, 배열의 개수 때문에 >,< 이거 써야함..\
		// for(int i=0; i<5; i++) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + "번째 원소 : " + arr[i]);
		}
		
		System.out.println("---------------------------------");	
		// 각원소값에 10, 20, 30, 40, 50 대입
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (i+1) * 10;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + "번째 원소 : " + arr[i]);
		}
				
				
	}

}




