package kr.ac.kopo.day12;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 *	// 구현클래스 = 자식클래스
	Map : key, value 쌍의 집합, key에 대한 중복(X)
		- HashMap 
		- TreeMap
 */
public class MapMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
								  // 해시로 빠르게 찾는다
		Map<String, String> map = new HashMap<>();
		map.put("aaa", "1111");
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		map.put("ddd", "4444");
		
		System.out.println("< 패스워드 변경 서비스 >");
		System.out.print("아이디를 입력 : ");
		String id = sc.nextLine();
		if(!map.containsKey(id)) {
			System.out.println("입력하신 ["+id+"]는 존재하지 않습니다");
			System.out.println("서비스를 종료합니다");
//			System.exit(0);
			return;	//jvm이 메인 호출했으니까 끝남.
		}
		
		System.out.print("기존의 패스워드 입력 : ");
		String password = sc.nextLine();
		if(!map.get(id).equals(password)) {
			System.out.println("패스워드가 일치하지 않습니다");
			System.out.println("서비스를 종료합니다");
			return;
		}
		
		System.out.print("변경할 패스워드 입력 : ");
		String newPassword = sc.nextLine();
		map.put(id, newPassword);
		System.out.println("패스워드 변경이 완료되었습니다");
		
		System.out.println("< 회원 정보 출력 >");
		System.out.println("--------------------------------");
		System.out.println("아이디\t패스워드 ");
		System.out.println("--------------------------------");
		
		//key를 set형태로 구성, map에 있는 정보를 set형 객체로 변환해서 받는다.-> entryset
		//map은 키하고 value를 내부 클래스로 가짐 -> entry라고
		/*
		 	class Map {
		 		class Entry {
		 			private Object Key;
		 			private Object value;
		 			
		 		}
		 	}
		 	Map.class
		 	Map$Entry.class(이너클래스)
		 	
		 	실제 key하고 value는 entry가 갖고 있따. entry라는 클래스를 set형으로 뽑아달라
		 	
		 	entry< , > -> 제네릭 쓰니까
		 	
		 */
		
		/*
		// Map.entry : map 클래스가 가지고 있는 entry 클래스. key하고 value를 가지고 있는 entry 객체만 뽑아내는 것
		Set<Entry<String, String>> set = map.entrySet();
		for(Entry<String, String> e : set) {
			System.out.println(e.getKey() + "\t" + e.getValue());
		}
		System.out.println("--------------------------------");
		*/
		
		//키에 대한 중복 허용 안함
		Set<String> keys = map.keySet();	// map에 잇는  키들만 모아서 set(set 객체)형 만들려고... set형인 이유는 중복 허용 않고, 순서 없는게 똑같으니께
		for(String key : keys) {
			System.out.println(key + "\t" + map.get(key));
		}
	}

}
