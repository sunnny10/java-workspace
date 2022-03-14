package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain02 {

	public static void main(String[] args) {
		
		//배열의 초기화
		//String[] strArr = {"데이터분석", "자바", "교육"};
		
		//선언부
		// 참조변수를 값으로 가지는 배열
		String[] strArr = new String[5];
		int loc = 0;
		
		strArr[loc++] = "폴리텍";
		strArr[loc++] = "데이터분석";
		strArr[loc++] = "자바";
		strArr[loc++] = "교육";
		
		System.out.println("문자열의 총 개수 : " + strArr.length + "개");
		
		/*
		 * 배열의 전체 원소를 출력 방식
		 * 1. index를 이용한 출력  (원소접근: 0 ~ length-1);
		 * 2. jdk 1.5버전의 for문을 이용한 출력 -> for each문
		 * 3. Arrays.toString() 메소드를 이용한 출력(전체 배열의 요소를 출력)
		 */
		
		System.out.println(" < index를 이용한 출력 >");
		for(int i=0; i<strArr.length; i++) {
			System.out.println("첫번째 문자열 : " + strArr[i]);
		}
		
		System.out.println("< 1.5버전의 for문 이용 출력 >");
		//strArr에 있는 모든 원소를 맨 처음부터 s로 액세스하자.
		for( String s : strArr) {
			//처음 한번 돌 때 : String s = strArr[0]
			//두번째 돌 때 : String s = strArr[1]
			//세번째 돌 때 : String s = strArr[2]
			// 			....
			// String s= strArr[strArr.length]
			System.out.println(s);
		}
		
		System.out.println("< Arrays.toString() 메소드 이용 출력 >");
		//strArr가 가지고 있는 모든 요소들을 하나의 문자열로 만들어주는 것.
		// 출력하기 위한 목적 ***출력방식***
		String result = Arrays.toString(strArr);	// "[원소, 원소, 원소, ...]"
		System.out.println(result);
		
		//변수 선언시 메모리가 공간 잡히는데 
		// 참조변수의 경우 주소값만큼 잡힌다 : 주소값은 4바이트
		// 형변환의 경우 변수크기 자체는 그대로 있고, temporary라는 곳에서 임시로 생성돼서 계산되었다가 사라지는 것. 원래 값은 변화 없다.
		/*int i;
		int[] arr;
		주소값 다 4바이트
		*/
		
	}


}
