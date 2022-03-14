package kr.ac.kopo.day02.homework;

public class HomeworkMain06 {

	public static void main(String[] args) {
		int cnt = 0;
		char c = 'A';
		
		
		while(true) {
			
			if(c >= 'A' && c <='Z') {
				cnt++;
				
			} else if(c >= 'a' && c <='z') {
				cnt++;
			}
			if(c > 'z') {
				break;
			}
				c++;

		}
		
		System.out.println("개수 ? " + cnt);
	}

}
