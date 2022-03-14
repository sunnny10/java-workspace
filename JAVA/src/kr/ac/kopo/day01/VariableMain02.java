package kr.ac.kopo.day01;


public class VariableMain02 {

	public static void main(String[] args) {
		
		//"Hello" 문자열을 저장하기 위한 변수 str 선언
		String str = new String("Hello");
		//str은 참조변수, hello가 저장된 주소값(jvm에 위에 올라가기 때문에 실제주소가 아니라 가상주소)을 가지고 있음. 위에 객체는 heap에 생성됨. new는 메모리에 할당한다는 뜻.
		//String만 new를 안 쓸 수 있다. 그러나 공간은 new처럼 만드는 것.
		//str의 값(주소값)이 가지고 있는 값을 알 수 있다.

	}

}
