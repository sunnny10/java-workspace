package kr.ac.kopo.day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 	Set : 순서(X), 중복(X) -> 원래 목적은 탐색, 전체 데이터를 다 접근하고 싶은 목적이 아님
 	 - HashSet
 	 - TreeSet
 	: 내가 이 데이터가 있는지 탐색해서 확인하는 게 목적이기 때문에 전체 데이터를 보는게 비효율적
 */
public class SetMain {

	public static void main(String[] args) {
		//set도 모든 객체들을 갖고 있을 수 있기 때문에 object 형태로 가지고 있었다.
		Set<String> set = new HashSet<>();
		//Set<String> set = new TreeSet<>(); -> 실제 데이터를 저장할 떄 왼쪽 오른쪽을 갖고 있기 떄문에 문자열의 경우 , 사전, 오름차순의 형태를 가짐
		System.out.println("\"one\"입력성공여부 : " + set.add("one"));
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		//중복 허용 안함, map하고 차이남..
		System.out.println("\"one\"입력성공여부 : " + set.add("one"));
		
		System.out.println("전체 원소의 개수 : " + set.size() + "개");
		
		/*
		 * 전체 데이터 접근방법 3가지
		 * 1. 1.5버전의 for문 이용(인덱스 사용해서는 못 만듦)
		 * 2. toArray() 메소드 이용
		 * 3. Iterator 객체 이용
		 */
		
		System.out.println("< 1.5 for문 이용한 출력 >");
		for(String str : set) {
			// 모든 객체들을 구분하기 위해 각자 독립된 형태의 해시코드를 가진다. 그 해시코드를 그룹핑해서.... 암튼 그래서 내가 입력한 거랑 다른 순서로 나온다.
			System.out.println(str);
		}
		
		//전체 데이터를 배열형태로 바꿔주면 전체 데이터로 보는데 더 편함. set은 그대로 있고, set에 있는 원소들을 배열에 넣어주는 것. object 배열로 나옴
		System.out.println("< toArray() 이용한 출력 >");
		//리턴형 : object -> 제네릭을 안써서
		Object[] arr = set.toArray();
		
		//리스트랑 셋이 원래 모든 데이터타입을 받는게 목표라서 Object 형태로 만듦.
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			//System.out.println(arr[i].toString());
		}
		
		/*
		 * Iterator(순환객체) 주요메소드
		 * 		- hasNext() : 데이터 존재 여부 판단 | 현재 iterator가 있는 위치에서 그 다음에 데이터가 있는지 확인, 데이터가 몇개 있는지 모르기 때문에
		 * 		- next()    : 데이터 접근 
		 */
		System.out.println("< Iterator 이용한 출력 >");
		//참조변수 하나, set 안에 들어있는 데이터에 직접 접근
		Iterator<String> ite = set.iterator();	// 아직 차고지에 있움
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}

}














