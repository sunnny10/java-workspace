package kr.ac.kopo.day10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import kr.ac.kopo.day06.homework.Icecream;


public class DateMain {
	
	public static void main(String[] args) {
		
//		String pattern = "yyyy-MM-dd hh:mm:ss(E)";
		String pattern = "yyyy년도 MM월 dd일 hh시 mm분 ss초(E요일)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(new Date()));
		
		
		
		
		/*
		String str = "Hello World";
		System.out.println(str.toString());
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
//		int year = c.get(1);
		int year = c.get(Calendar.YEAR);
		//0 ~ 11월
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DAY_OF_MONTH);
		int day = c.get(Calendar.DAY_OF_WEEK);	// 1(일) ~ 7(토)
		String[] week = {"", "일", "월", "화", "수", "목", "금", "토"};
		System.out.println("오늘은 " + year + "년 " + month + "월 " + date + "일(" + week[day] + ")입니다");
		
		//2020년 5월 20일 요일????
		c.set(2020, 5-1, 20);
		day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("2020/5/20 " + week[day] + "요일");
		
		int lastday = c.getActualMaximum(Calendar.DATE);
//		int lastday = c.getActualMaximum(Calendar.MONTH);
		System.out.println(lastday);
		
		Date d = c.getTime();
		System.out.println(d); 
		*/
		
		/*
		Icecream ice = new Icecream();
		System.out.println(ice.toString());
		
		Date d = new Date();
		
		d를 찍을 때 toString()를 출력하라고 약속.
		
		// 주소가 아니라.... 다른 값이 찍힘.-> 이거는 재정의한것.
		//출력할 때 d가 아니라 숨어있는 메소드가 찍힘. d.toString()이 찍힌다. (toString()은 상속받은 object 클래스의 메소드) 근데 date 얘는 자기꺼에 맞춰서 오버라이딩함.
		 //toString() 생략되어있는 것이 약속이다.
		System.out.println(d.toString());
		int year = d.getYear() + 1900;
		// 월은 0~11까지 나옴
		int month = d.getMonth() + 1;
		int date = d.getDate();
		String[] week = {"일", "월", "화", "수", "목", "금", "토"};
		// 0~6
		int day = d.getDay();
		
		//1900년 기준으로 얼만큼 떨어져있는지 계산
		System.out.println("오늘은 " + year + "년 " + month + "월 " + date + "일(" + week[day] + ")입니다");
		// 오늘은 2022년 3월 23일(수)입니다
		
		*/
	}
}
