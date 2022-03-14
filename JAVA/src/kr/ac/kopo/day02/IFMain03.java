package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 * 다중 if
 * if(조건1) {
 * } else if(조건2) {
 * } else if(조건3) {
 * } else {
 * }
 * */
public class IFMain03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("집에서 출발한 시간을 입력하세요(7시30분 : 730) => ");
		int time = sc.nextInt();

		if (time < 800) {
			System.out.println("걸어서 학교에 간다");
		} else if (time < 815) {
				System.out.println("버스에 타고 학교에 간다");
			} else {
				System.out.println("택시에 타고 학교에 간다");
			}
		
		//;는 실행하려는 문장에 붙인다.
		if(time >= 800 && time <815) {
			System.out.println("버스를 타고 학교 간다.");
		} else if(time < 800) {
			System.out.println("걸어서 학교간다");
		} else {
			System.out.println("택시타고 학교간다");
		}
		
		sc.close();
	}
	

}

/*	종속적으로 보이지만 수평적인것... 근데 그렇게 안 보이니까 다중 if문으로 구성한다.
	if(조건1) {
		문장1;
	} else {
		if(조건2) {
			문장2;
		} else {
			if(조건3) {
				문장3;
				} else {
					if(조건4) {
						문장4;
						} else {
							if(조건5) {
								문장5;
								} else {
									문장 6;
									}
								}
								...
*/
