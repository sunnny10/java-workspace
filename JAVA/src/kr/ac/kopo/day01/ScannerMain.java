package kr.ac.kopo.day01;

import java.util.Scanner;

public class ScannerMain {

	public static void main(String[] args) {
		
		//�ڹٰ� �������ְ� �ִ� ��Ű��
		// Ű���忡�� 5���� �ڷ��� �Է¹��� �� �ִ�.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է� : ");
		//ù��° ���ڸ� ��������
		char ch = sc.nextLine().charAt(0);
		System.out.println("ch : " + ch);
		
		System.out.print("���ڿ��� �Է� : ");
		//�ϳ��� ���ڸ� �����ϴ� ���� ���ͳ� �����̽��� ��.... -> next()
		String str = sc.nextLine();
		System.out.println("str : " + str);
		//�������� �Է¹ޱ� ���ؼ��� nextline ���
		
		
		//���� �Է¹޴� �ڵ� next ��¼��..�� ����.
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int a = sc.nextInt() /* Ű����� �Է¹��� ���� */;
		System.out.println("a : " + a);
		
	}

}
