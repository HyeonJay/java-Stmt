package part1.test;

import java.util.Scanner;

public class Notice
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		int kor = 0, eng = 0, math = 0, sum = 0; // ���������� �ʱ�ȭ �ʼ�
		double avg = 0.0d; // �Ǽ� ( �Ҽ��� ) Ÿ���� ����Ÿ������ �ʱ�ȭ
		String msg = ""; // ��Ʈ�� Ÿ���� ���ͷ��߿��� null�� �ʱ�ȭ

		/* ��ĳ�ʷ� ������ �Է��ϸ� �հ迡 ���� �հݿ��θ� �����ϴ� ���α׷� */

		System.out.print("���� ���� �Է� : ");
		kor = scanner.nextInt();

		System.out.print("���� ���� �Է� : ");
		eng = scanner.nextInt();

		System.out.print("���� ���� �Է� : ");
		math = scanner.nextInt();
		System.out.println();

		sum = (kor + eng + math);
		avg = sum / 3;
		System.out.println("��� : " + avg);
		System.out.println();
		/*
		 * ���ǿ� ���� ��� ���� ���� ������ �޶��� ��� 100�� : ���ʽ� ���� ��� 70 �̻� : �հ� ��� 70 �̸��̸� ���հ�
		 */

		if (avg == 100)
		{
			msg = "���ʽ� ����";
		}
		else if (avg >= 70)
		{
			msg = "�հ�";
		}
		else
		{
			msg = "���հ�";
		}
		System.out.println(msg);
	}
}
