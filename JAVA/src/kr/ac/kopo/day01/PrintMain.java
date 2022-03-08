package kr.ac.kopo.day01;

// ���� ������ �ּ�ó��
/*
 �ּ����� ����ִ� �ڵ�� �����Ͻ� ��ȯ���� ���� / .java�� .class�� ��ȯ�� �� ��ȯ�ȵ�.
 ������ �ּ�
 ����
 ����
 ...
 �������� �ּ�ó��
 
 �����ּ��� ��øó�� �ȵ�.
 */

/*
 	�������
 	1. ������ ���
 	2. �Ǽ��� ���
 	3. ������ ���('A', 'b') : �빮��('A'), �ҹ���('a'), ���ڹ���('4'), Ư������('!'), ���鹮��(�����̽�, ����, ��...)=> ��� ǥ������?? (�����̽� : ' ', ���� : '\n', �� : '\(�ͽ������� ������)t') 
 				�ѱ�('��', '��');
 	4. ���ڿ� ���("abc")
 	5. ������ ���(true, false)
 */

/*
	��¸޼ҵ�
	1. println() : ���๮�� ����
	2. print() : ���๮�� ����X
	3. printf() : JDK1.5 �߰�, ���๮�� ����X (f : formatting), ��¹�������, f�������� �� Ȯ��� ���¸� ������ �ִ�.
		��¹���
		 %d	: ����
		 %f	: �Ǽ�
		 %c : ����
		 %s : ���ڿ�
		 %b : ������
 */


public class PrintMain {
	
	public static void main(String[] args) {
		//println �Լ��� 5���� ����� ����ϴ� ���� ����
		System.out.println(10);
		System.out.println(12.34);
		System.out.println('A');
		System.out.println("Hello");
		System.out.println(true);	// ���ڳ� ���ڿ� �ƴϴ�!!!
		//ln�̶� line ��, ����Ű�� ������ �ִ�. ���๮��(�ٹٲ��ڵ�)�� ������ �ִ�. 
		System.out.println("23��");
		System.out.print(23);
		System.out.println("��");
		System.out.println(23 + "��"); // �������� �پ��� ����� ����ϰ� ���� �� + ���
		//�� �����Ѱ�??? ������ ���� + ���� = ����... �Ǽ� + �� = �� ... �� + �� = ��..
		// �ڹٿ����� ���ڿ� + ���ڿ� = ���ڿ� ����
		// ���ڿ� + ���� => ���ڿ��� �ν��Ѵ�. ������ ���ڿ��̸� ������ ���ڿ��� ���� //��Ģ���� �� �����ϰ� ���ڿ��� ���ϱ� ������ �����ϴ�.
		// "AB" + 4 + 12 => AB412 : ��ǻ�ʹ� ���ʿ��� 2���� ���. ��ü�� ���� ����. ****2���� ����****
		// 4 + 12 + "AB" => 16AB
		// 'A' + 'B' (���� + ����) => "AB"??(�ƴ�)
		System.out.println(10 + "+" + 20 + "=" + 10 + 20);
		System.out.println(10 + "+" + 20 + "=" + (10 + 20));
		
		System.out.printf("%d��\n", 23);	
		//System.out.println();
		System.out.printf("%d + %d = %d\n", 10, 20, 10+20);
		//�ڸ��� �����ϰ� ���� ��(������ ���߱�)
		System.out.printf("[%7d]\n", 1200);
		System.out.printf("[%7d]\n", 950);
		System.out.printf("[%7d]\n", 15800);
		
		//�ڸ��� �����ϰ� ���� ��(���� ���߱�)
		System.out.printf("[%-7d]\n", 1200);
		System.out.printf("[%-7d]\n", 950);
		System.out.printf("[%-7d]\n", 15800);
		System.out.printf("[%04d]\n", 35);
		//%f(�Ǽ�)�� ���ٸ� ���� ������ �Ҽ��� 7�ڸ����� ����(������) : ����ÿ� ����.
		//.1 �����ϸ� �ݿø���
		System.out.printf("[%.1f]\n", 12.3456);
		System.out.printf("%b\n", true);	
		
	}
}
















