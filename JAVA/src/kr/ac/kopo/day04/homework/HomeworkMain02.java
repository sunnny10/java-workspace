package kr.ac.kopo.day04.homework;

public class HomeworkMain02 {

	public static void main(String[] args) {
		int snail = 0, hour = 0;
		
		// 올라가는데.. 점점 미끄러지는 경우...
		while(snail < 100)
		{
			snail += (snail < 50 ? 5-1 : 5-2);
			System.out.println("[" + ++hour + "시간후]달팽이가 올라간 총높이 : " + snail + "M");			
		}
		
		/*
		// 미끄러지기 전에 100m가 넘어갈 경우를 생각해야 한다.
		// 먼저 5m를 올라갔을 때 탈출했을 경우를 생각하면 snail += 5를 먼저, 그니까 먼저 탈출하고 미끄러질 경우를 생각하자.
		while((snail += 5) < 100) {
			snail += snail <50 ? -1 : -2;
			System.out.println("[" + ++hour + "시간후]달팽이가 올라간 총높이 : " + snail + "M");
		}
		System.out.println("[" + ++hour + "시간후]달팽이가 올라간 총높이 : " + snail + "M");
		*/
		
		
		/*
		while(snail < 100) {
			snail += 5;
			snail += snail <50 ? -1 : -2;
			System.out.println("[" + ++hour + "시간후]달팽이가 올라간 총높이 : " + snail + "M");
		}
		*/

	}

}
