package kr.ac.kopo.day11.calendar;

import java.util.Scanner;

public class CalendarView {
	
	private Scanner sc = new Scanner(System.in);
	
	
	private int getInt(String msg) {
		System.out.print(msg);
		/*
		sc.nextInt();
		sc.nextLine();
		*/
		return Integer.parseInt(sc.nextLine());
	}
	
	public void process() {
		CalendarUtil util = new CalendarUtil();
		while(true){
			//1.특정년도 2.특정월 3.이전달  4.다음달 5. 현재달 0.종료
			int type = getInt("항목을 선택하세요(1.특정년도 2.특정월 3.종료) : ");
			switch (type) {
			case 1 :
				int year = getInt("년도를 입력하세요 : ");
				util.showByYear(year);
				break;
			case 2 :
				year = getInt("년도를 입력하세요 : ");
				int month = getInt("월을 입력하세요 : ");
				util.showByMonth(year, month);
				break;
			case 3 :
				System.out.println("프로그램을 종료합니다");
				// 어디 위치든간에 프로그램을 종료해라. 메인메소드의 종료 블럭을 만나지 않아도 강제로 종료 가능
				// () 안이 에러코드. 0은 정상적으로 종료하는 것이라고 알려주는 것
				// 활용제한자 : static, final, abstract 같이 클래스나 메소드의 성격을 정해주는 것
				// 패키지도 다르고 상속 관계도 아닌데 사용 가능하니까 public
				System.exit(0);
			}
		}	
	}
	
	
	
	
	
	
	
	
	
}
