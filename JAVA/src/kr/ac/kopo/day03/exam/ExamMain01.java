package kr.ac.kopo.day03.exam;

/* 
	*
	*
	*
	*
	* 
*/

//자바에서 출력은 행 방식!!! <행우선 방식>
//열 방식 출력은 도스모드에서 한 번 내려온 커서가 다시 위로 올라오는 경우 없다.
/*
 * 
 * 
 * _ <-커서위치 여기임. 위로 못 올라간다.
 
 */
public class ExamMain01 {

	public static void main(String[] args) {
		
		//3가지 요소가 다 들어가는 것은 아님. 생략 가능
		//무한루프의 코드 : for( ; ;)
		for(int i = 1; i <= 10; i++) {
			System.out.println("Hello");
			
		}

		//한번에 하나의 문자나 정수만 찍을 수 있다는 제한 조건이 있다.
		for(int i=1; i<=5; i++) {
			System.out.print("*");
		//컨트롤 알트 방향키하면 복사됨.
		}
		System.out.print("*");
		//alt키 누르면 이동 : 잘라내기 안해도됨. 블록생성하면 여러줄됨
		
		
		//이중 for문
		//i 초기화는 1번, j 초기화는 3번
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++) {
			System.out.print(6-i);
		}
		
		System.out.println();
		
		for(int i=5; i>=1; i--) {
			System.out.print(i);
		}
		System.out.println();
	}	


}
