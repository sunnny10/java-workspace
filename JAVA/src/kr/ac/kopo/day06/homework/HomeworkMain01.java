package kr.ac.kopo.day06.homework;

import java.util.Scanner;
// 교수님 풀이


/*
 	nextLine() : 라인 단위로 입력받는다(엔터 기준) 을 썼더니 
 	아이스크림명 : 아이스크림 가격 : -> 이런 식으로 나옴. 
 		-> 그 이유는??? -> 자바가 키보드로부터 입력받을 때 '입력 버퍼'를 사용하기 때문이다. 근데 죄다 원래 키보드 입력이나 모니터 출력시 버퍼라는 것을 사용한다.
 		
 		입력 버퍼를 쓰는 이유 : 성능 향상.
 		
 		ram에 있는 변수의 값을 외부 장치인 키보드로부터 받거나 외부 장치인 모니터로 출력한다.
 		외부장치를 통해 ram에 있는 값을 업데이트하는 게 ram에서 변수에서 변수를 대입하는 속도보다 100백 이상 느리다.
 		문제는 문자열이나 정수를 입력할 때 세자리의 정수를 입력하는 속도와 6자리 정수를 입력하는 속도가 다르다. 6개 입력받아야 되니까
		그래서 속도 차이가 마니 난다.. 이거를 어케 해결하지? 어케 비슷하게 만들지? -> 그래서 버퍼라는 저장소를 사용해보자!
		버퍼란 
		정수를 입력할 거야 -> 키보드로부터 입력을 받는다.
		ex) 밥이 필요할 때마다 매번 시장에 간다? 귀찮다... 그러면 아침에 쌀 사러갔을 때 3끼에 필요한 거 다 사오자! 
		그런데 지금 필요한 건 1끼분이니까 나머지는 저장소에 저장해두고... 필요시 시장에 안가고 저장소에 있는 쌀을 소비한다. 시장에 갈 시간을 절약할 수 있다. 
		지금 필요한 건 1개지만 미리 사재기하고 저장해두고, 필요할 때마다 꺼내고 없으면 사러간다 => 이게 키보드에도 적용된다.
		
		매번 키보드 입력받으면 속도가 느려진다. -> 키보드 입력받을러 간 김에 죄다 입력받자. 한번에 키보드 입력 다 받고 그 입력받은 정보를 사용하자 => 입력 버퍼
		버퍼는 ram에 들어있다. 컴퓨터상 ram에 정보를 다 저장하니까.
		
		지금 키보드에서 입력받을 게 정수라 하더라도 그거랑 상관없이 다 입력받자!!! 그래서 무조건 버퍼를 써야되기 때문에 키보드 입력 받을 때 엔터 나오기 전까지 입력값을 모두 입력받겠다.
		
		쌀독에서 쌀독으로 쌀을 옮길 때 단위는 무조건 1톨... 한움쿰으로 가져올 수 없기 때문에 왔다갔다 하는 횟수를 줄이자 -> 바가지(버퍼)로 한번에 넣자. 옮기는 단위를 바꿀 수는 없으니까
		바가지에 넣은 쌀은 필요할 때만 준다.
		
		자바는 숫자는 0부터 9사이의 숫자문자, 0부터 9가 나올 때까지 정수로 인식한다. '4''5'까지는 정수로 인식 '\n'나오면 숫자아니니까 45를 소비, 변수에 넣는다. 실제 버퍼에는 엔터가 들어가있으므로
		다음에 문자를 받을 때 \n을 소비함. \n이 변수에 들어간다. 그런데 정수일 경우 0부터 9까지를 정수로 인식할 경우 엔터는 문자니까 버퍼에 이미 들어있어도 숫자 단위가 아니니까 공백은 버린다.(쌀을 먹으려 했는데
		부스러기를 먹는 너낌...=> 버퍼 
		비어있으니까 다시 키보드로 엔터가 나올 때까지 받는다. 받기는 받아도 조합할 때 에러남.
		
		*** 항상 버퍼가 있고 정수나 실수를 입력받을 때 버퍼에 최소 엔터가 남아있다. 그래서 정수나 실수 등 입력받고 다음에 문자나 문자열을 입력받을 때 이 엔터를 소비를 하기 때문에 올바르게 입력받지 못한다.
		
	 		출력버퍼의 경우 출력할 것을 모아두고, 누군가가 엔터를 쳐줘야 출력해줌
	 		
	 		그런데 버퍼는 하나기 때문에 입력으로 버퍼를 사용할 경우 출력 버퍼 못 쓰고 출력 버퍼 쓸 경우 입력 버퍼 못씀. os 처럼 사용

			버퍼로 일어난 문제 해결 방법 ? : 그런데 버퍼 문제 때문에 nextint, nextdouble 잘 안 쓴다.
				-> 정수 입력 받을 때 sc.nextline 써주거나 그냥 처음부터 sc.nextline으로 문자열로 받는다.
				
			버퍼에 있는 것을 문자열로 입력받는다. 변수에 저장 안하더라도 버퍼에 있는 것을 정수나 문자열 유형을 변환시키는 것을 버퍼가 소비한다고 표현.
	 		
 	next()는 단어 단위(스페이스 단위)로 입력 받음. -> 그래서 띄어쓰기(스페이스)하는 단어일 경우 제대로 값 못 받음.
 	
 */

public class HomeworkMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이스크림 몇개 구입하시겠습니까? => ");
		int count = sc.nextInt();
		
		//아이스크림을 저장할 수 있는 배열, 아이스크림 인스턴스 객체의 주소값, 참조값을 기억하는 참조배열만 만든 것. 실제 객체는 안 갖고 있다. 
		/*
		 	Icecream ice01;
		 	Icecream ice02;
		 	Icecream ice03;
		 	
		 	ice01 = new Icecream(); -> 일케 해줘야함.
		 */
		Icecream[] iceArr = new Icecream[count];
		 
		for(int i=0; i<count; i++) {
			
			iceArr[i] = new Icecream();	// 클래스 이름 뒤에 괄호가 붙으면 실제 아이스크림이 만들어지는 것.
			
			System.out.println("*** " + (i+1) + "번째 아이스크림 구매정보 입력 ***");
			System.out.print("아이크스림명 : ");
			iceArr[i].name = sc.nextLine();	// 위에서 객체 생성 안하면 nullpointexception 뜬다. 

			System.out.print("아이스크림 가격 : ");
			iceArr[i].price = Integer.parseInt(sc.nextLine());
		
		}
		
		System.out.println("< " + iceArr.length + "개 아이스크림 구매정보 출력 >");
		System.out.println("번호\t아이스크림명\t아이스크림가격");
		
		
		
		/*int no=0;
		//ice만 찍으면 주소값만 찍힌다.
		//ice에 0번지 대입, 1번지 대입...
		for(Icecream ice : iceArr) {
			System.out.println(++no + "\t" + ice.name + "\t" + ice.price);
		}
		*/
	}

}















