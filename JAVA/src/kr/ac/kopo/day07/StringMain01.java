package kr.ac.kopo.day07;

import java.util.Arrays;

public class StringMain01 {

	public static void main(String[] args) {
		
		//String str = "hello";
		String str = new String("hello");
		char[] chars = {'h', 'e', 'l', 'l', 'o'};
		String str2 = new String(chars);
		byte[] bytes = {65, 67, 98, 120};
		String str3 = new String(bytes);
		// 서버 클라이언트 간 어떤 데이터를 주고 받을 때 바이트 단위로 주고 받는다. 
				
		System.out.println("str : " + str);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		
		str = new String("Hello World!!!");
		System.out.println("str : " + str + ", 길이 : " + str.length());
		
		int loc = 0;
		char[] words = new char[5];
		//words라는 배열의 0번지서부터 넣겠다. str의 6번지서부터 11번지 전까지 
		str.getChars(6, 11, words, 0);
//		for(int i=6; i<=10; i++) {
//			words[loc++] = str.charAt(i);
//		}
		
		// 이런 메소드들은 전부 String 클래스 안에 있기 때문에 String. 이렇게 접근해야 한다.
		
		// 보통 이런식으로 하면 배열길이 -1 일케 해야되니까 마지막 전까지 가져옴
		str.getChars(0, str.length(), words, 0);
		
		System.out.println("words : " + Arrays.toString(words)); 
		
	}

}
