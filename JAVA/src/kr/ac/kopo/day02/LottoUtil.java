package kr.ac.kopo.day02;
import java.util.Random;

/**
 * 문서 파일을 만들어주는 주석 : API 문서와 같은...
 * 로또와 관련된 여러가지 기능클래스
 * @author DA
 * 골뱅이 : 코드 주석(어노테이션) -> 정보 알려주는 것
 */
public class LottoUtil {
	
	/**
	 * 오늘의 로또 확률을 알려주는 메소드
	 */
	public void todayProbability() {
		
		Random r = new Random();
		int p = r.nextInt(101); //인티져 범위내에서의 난수 추출 -> 101은 임의의 숫자를 101로 나눠라. : 0 ~ 100

		
		System.out.println("오늘의 로또 확룔은 : " + p +  "%입니다 ");
	}
}
