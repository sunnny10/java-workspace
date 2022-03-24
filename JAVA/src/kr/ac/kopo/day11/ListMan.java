package kr.ac.kopo.day11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 	List : 순서 O, 중복 O
 		- ArrayList
 		- LinkedList
 		
 	add()
 	get()
 	size()
 	remove()
 	isEmpty()
 	contains()
 	clear()
 */
public class ListMan {

	public static void main(String[] args) {
		
		//wrapper 클래스 내일 설명~~~
//		List<String> list = new ArrayList<String>();
//		List<String> list = new ArrayList<>();	// 생략해도 됨. 어차피 string 형태로 객체 만들거 알아서...
		List<String> list = new LinkedList<>();	// 일케 바꿀 수 있음.. 데이터가 많아지면 ARRAYLIST가 무겁게 느껴져서 LINKEDLIST 객체로 바꾸면 어차피 메소드는 같으니까 결과는 같음.
		//제네릭은 저장되는 원소가 어떤 타입이냐의 문제
		//제네릭은 리스트가 갖고 있는 집합에 대한 타입
		// 제네릭을 쓰면 메소드나 매개변수를 동적으로 STRING으로 바꿔주는 거, T가 스트링으로 바꿔서 리턴해줌. classB<String>{} 일케 되가지고 클래스에 로드됨.
 		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("one");
		
		//0부터 몇번지까지 있더라 알려주는 것
		System.out.println("전체 원소의 개수 : " + list.size() + "개");
		// 콜렉션의 목적은 데이터를 모아두고 빠르게 검색하기
		System.out.println("< PRINT >");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("\"one\" 삭제 : " + (list.remove("one") ? "성공" : "실패"));
		System.out.println("\"one\" 삭제 : " + (list.remove("one") ? "성공" : "실패"));
		System.out.println("\"one\" 삭제 : " + (list.remove("one") ? "성공" : "실패"));
		
		System.out.println("< 1.5버전 >");
		for(String str : list) {
			System.out.println(str);
		}
		
		// 휘발성 메모리... -> 파일 io아니면 데이터베이스로 list 같은 걸로 저장한 거를 넣는다.
		System.out.println("0번지 문자열 : " + list.get(0));
		System.out.println("0번지 위치한 문자열 삭제 : " + list.remove(0));
		System.out.println("0번지 문자열 : " + list.get(0));
	} 

}
