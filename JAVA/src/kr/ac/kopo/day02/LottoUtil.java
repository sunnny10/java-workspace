package kr.ac.kopo.day02;
import java.util.Random;

/**
 * ���� ������ ������ִ� �ּ� : API ������ ����...
 * �ζǿ� ���õ� �������� ���Ŭ����
 * @author DA
 * ����� : �ڵ� �ּ�(������̼�) -> ���� �˷��ִ� ��
 */
public class LottoUtil {
	
	/**
	 * ������ �ζ� Ȯ���� �˷��ִ� �޼ҵ�
	 */
	public void todayProbability() {
		
		Random r = new Random();
		int p = r.nextInt(101); //��Ƽ�� ������������ ���� ���� -> 101�� ������ ���ڸ� 101�� ������. : 0 ~ 100

		
		System.out.println("������ �ζ� Ȯ���� : " + p +  "%�Դϴ� ");
	}
}
