package kr.ac.kopo.day07;

public class StringMain02 {

	public static void main(String[] args) {
		
		/* 똑같이 Hello로 찍히지만 차이가 있다
		 * "" : 상수문자열 - > 문자열 공간이 계속 만들어지는 것이 아니라 ram에 상수값들을 저장하는 공간(공유 영역 : 메소드 영역 - 공동, 공유할 수 있는 공간)이 따로 있어서 거기에 "Hello" 하나 만들어지고, str과 str2가 하나의 hello를 가리키고 있는것
		 * 상수 영역은 한 번 잡히면 프로그램이 끝날 때까지 계속 영역이 살아있다. 안사라짐.
		 * new로 쓰면 힙영역에 잡힌다 -> new할 때마다 공간이 따로따로 잡힌다. 
		 * new로 만들면 가바지 컬렉터가 필요없으면 사라짐.
		 * 
		 * */
		//String str = "Hello";
		//String str2 = "Hello";
		String str = new String("Hello");
		String str2 = new String("Hello");
		
		//위의 두 문자열이 같은지 확인할 때 if로 확인한다.
		// == : str과 str2가 가리키는 공간이 같은가? 주소가 같은가 물어보는 것. 주소값마 ㄴ비교
		// equals : 문자열과 문자열을 비교할 때 사용 str이 갖고 있는 문자열과 str2가 갖고 있는 문자열이 같을 때 사용
		
		if(str == str2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if(str.equals(str2) == true) {
			System.out.println("문자열비교 : 같다");
		}  else {
			System.out.println("문자열비교 : 다르다");
		}
		
		System.out.println("대소문문자관계없이 문자열 비교 : " + str.equalsIgnoreCase(str2));
	
		String[] names = {"홍길동", "홍길순", "홍길동", "박길동", "홍가네", "윤길동", "한길홍"};
		
		System.out.println("< 전체이름이 홍길동인 사람 출력 >");
		for(String name : names) {
			if(name.equals("홍길동")) {
				System.out.println(name);
			}
		}
		
		System.out.println("< 전체이름이 홍씨 사람 출력 >");
		for(String name : names) {
			if(name.startsWith("홍")) {
				System.out.println(name);
			}
		}
		
		System.out.println("< 전체이름이 홍씨 사람 출력 >");
		for(String name : names) {
			if(name.endsWith("길동")) {
				System.out.println(name);
			}
		}
		
		System.out.println("< 이름에 홍이 포함된 사람 출력 >");
		for(String name : names) {
			if(name.contains("홍")) {
				System.out.println(name);
			}
		}
		
		str = "apple";
		str2 = "banana";
		int compare = str.compareTo(str2);
		if(compare == 0) {
			System.out.println(str + "==" + str2);
		} else if(compare > 0) {
			System.out.println(str + ">" + str2); 
		} else { // compare < 0
			System.out.println(str + "<" + str2);
		}

	}
	

}
