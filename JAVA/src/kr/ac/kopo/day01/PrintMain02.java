package kr.ac.kopo.day01;

public class PrintMain02 {
	//MAIN이 없는 곳에서 실행하게 되면 맨 마지막으로 실행된 MAIN이 실행된다.
	
	/*
	 왜 그럴까???
	 원래 컴퓨터는 2진수. 사용자는 10진수를 통해 컴퓨터에게 명령을 해야한다. 키보드에 있는 버튼을 누를 때 대문자 A가 뭔지 컴퓨터는 모르니까 대문자 A와 매핑된 숫자가 날아간다 => 아스키코드
	 문자는 사람과 사람이 약속되어 있는 규칙. 컴퓨터에게 명령을 내릴 때는 문자가 아니라 아스키 코드가 날아간다.(매핑된 형태)
	 컴퓨터는 모든 문자를 숫자로 인식한다.
	 
	 ECU-KR : 한글 2byte
	 UTF-8 : 한글 3byte
	 
	 	ASCII CODE(0 ~ 256)	: 1byte
	 		대문자, 소문자, 숫자문자, 특수문자, 공백문자를 숫자로 일대일 매칭시킨 숫자표
	 		
	 	UNICODE(0 ~ 65500) : 2byte
	 		다국어 지원 숫자표(ASCII CODE + 한글, 한자, ....)
	 		자바의 문자인식
	 		
	 		'A' : 65  | 16진수 : 0x41 (2진수가 길어서 짧게 표현하려고 하는게 16진수)
	 		'a' : 97  |			0x61
	 		'0' : 48  |			0x30
	 		
	 	* 컴퓨터의 기본적인 단위
	 	* bit : 0, 1
	 	* 1 byte : 8 bit
	 	
	 */
	public static void main(String[] args) {

		System.out.println('A');
		System.out.println('A' + "BCD"); // 문자열 나옴
		System.out.println('A' + 'B');	// 65 + 66
		System.out.println('A' + 10);	// 65 + 10
		System.out.println(0x41 + 0x42);
		
		
	}
}
