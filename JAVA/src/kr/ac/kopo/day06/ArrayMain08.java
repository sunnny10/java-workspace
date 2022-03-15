package kr.ac.kopo.day06;

public class ArrayMain08 {

	public static void main(String[] args) {
		String[] strArr = new String[3];
		
		/* 참조 자료형 배열은 내부적으로는 2차원 배열의 특징을 가진다. */
		
//		for(String str : strArr) {
//			System.out.println(str);
//			//null 찍힌다.
//		}
		
		//strArr이 가리키는 것은 배열이다. 
		// 지금은 아래 2가지 형태는 서로 다르지만, 우선 힙에 생긴다는 것만 알고있자.
		strArr[0] = "hello";
		strArr[1] = new String("good");
	}
	
	// 2진수를 빠르게 압축하기 위해서 8진수나 16진수를 쓴다.
	// 개발자 입장에서 바이트가 필요..... 16진수가 딱 떨어지게 잘 나눠져서....남는 게 없음...한 바이트가 두개의 16진수 값을 갖도록 한다.....

}
