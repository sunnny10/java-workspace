package kr.ac.kopo.day06.homework;

import java.util.Scanner;
/*
 * 키보드 입력시 10 20 30 이렇게 한 줄로 받으면
 * 10 엔터 20 엔터 30 일케 들어가니까 10 보고 공백나오니까 num에 넣고, 입력받으려고 보니까 버퍼에 이미 값이 있으므로 키보드로부터 입력 안받고 버퍼에서 가져다 쓴다.
 */

public class a02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("실수 : ");
		// 해결방법 1
		double f = Double.parseDouble(sc.nextLine());
		// 해결방법 2
		double f2 = sc.nextDouble();
		sc.nextLine();
			
		System.out.print("정수 : ");
		int num = sc.nextInt();
		sc.nextLine();	// 한 라인, 엔터까지 입력받는다 -> 소비한다 -> 버피가 비어있다. : 근데 이렇게 두줄 치기 귀찮으니까 정수건 실수건 뭐건 무조건 nextline으로, 문자열로 입력받아서 버퍼를 비워준다.
		// 그래서 문자열을 정수로 바꿔줘야한다.
		
		System.out.print("정수 : ");
		int num2 = Integer.parseInt(sc.nextLine()); //"123" -> 정수 123 으로 변환시켜줘야 한다.
		
		
		
		// next()는 스페이스까지만 인식.
		// ....
		
		
		System.out.print("문자열 : ");
		String str = sc.nextLine(); // 엔터나올 때까지 받으므로 엔터까지 소비.
		
		// 일케 하면 정수에서 엔터 이미 받으니까 nextline에서 입력받을 때 영향을 받음.
		// 그래서 정수나 실수를 받고 나서 엔터가 남아있으니까 버퍼를 비워줘야 한다. -> sc.nextLine(); 일케 해줘야함.

		
		
		
		/*
		System.out.print("첫번째 정수 : ");
		int num = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.print("세번째 정수 : ");
		int num3 = sc.nextInt();
		*/
	}

}
