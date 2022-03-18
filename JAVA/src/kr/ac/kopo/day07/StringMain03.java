package kr.ac.kopo.day07;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMain03 {

	public static void main(String[] args) {
		String str = "hello world!";
		
		/*
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'r')
				System.out.println("r 위치 : " + i);
		}
		*/
		
		//char search = 'r';
		//String search = "llo";
		String search = "l";
		System.out.println(search + "위치 : " + str.indexOf(search));
		System.out.println(search + "위치 : " + str.indexOf(search, 5));
		
		System.out.println("< f" + search + "위치 index 출력 >");
		int index = str.indexOf(search);
		//찾고자 하는 문자열이 없으면 -1 을 리턴한다.
		
		while(index != -1) {
			System.out.println("시작인덱스 : " + index);
			index = str.indexOf(search, index+1);
		}
		
		str = "hello world!";
		
		// 원본 파일이 바뀌는 것이 아니다. string은 불변클래스 
		String subStr = str.substring(3, 8);	// [3] ~ [8-1] 문자열로 변환
		System.out.println("subString(3,8) : " + subStr);
		System.out.println("subString(6)"); // 6부터 맨 마지막까지 문자를 추출하라는 뜻.
		
		String str2 = "hello" + "!!!!";
		str2 = "hello".concat("!!!!");
		System.out.println("concat() : " + str2);
		
		String result = str.replace("l", "rr");
		System.out.println("replace(\"l\", \"rr\") : " + result);
		
		str = "     hello     ";
		result = str.trim();
		System.out.printf("[%s] 길이 : %d\n", result, result.length()); 
		
		str = "Hello world!";
		System.out.println("str : " + str);
		System.out.println("대문자 : " + str.toUpperCase());
		System.out.println("소문자 : " + str.toLowerCase());
		
		String data = "홍길동전:허균:조선시대";
		String[] bookInfo = data.split(":");
		System.out.println("split() : " + Arrays.toString(bookInfo));
		
		int num = 123;
		String strNum = String.valueOf(num);
		//num이 가지고 있는 정수값을 문자열로 바꿔주는 것
		// num + "" -> ㅋㅅㅋ
	}

}










