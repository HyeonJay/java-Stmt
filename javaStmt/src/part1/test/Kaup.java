package part1.test;

import java.util.Scanner;

public class Kaup
{
	public void testMethod()
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ű�� �Է��ϼ���.");
		double height = scanner.nextDouble();

		System.out.println("�����Ը� �Է��ϼ���.");
		double weight = scanner.nextDouble();

		/*
		 * �Ʒ����� doubleŸ���� ������� int Ÿ���� ������ �Ҵ��ؾ� �ϹǷ� ĳ������ �Ͼ����, ���� ��Ŭ������ �����ϴ� �ڵ� �ϼ� ������� �ذ��Ѵ�.
		 */
		int idx = (int) ((weight / (height * height)) * 10000);

		String msg = "";

		if (idx > 30)
			msg = "��";

		else if (idx > 24 && idx <= 30)
			msg = "��ü��";

		else if (idx > 20 && idx <= 24)
			msg = "����";

		else if (idx > 15 && idx <= 20)
			msg = "��ü��";

		else if (idx > 13 && idx <= 15)
			msg = "����";

		else if (idx > 10 && idx <= 13)
			msg = "�������";

		else
			msg = "�Ҹ���";

		System.out.println(idx);
		/*
		 * idx > 24 ... ��ü�� idx > 20 ... ���� idx > 15 ... ��ü�� idx > 13 ... ���� idx > 10 ... ������� �̵����� �ƴϸ� ... �Ҹ���
		 */
		System.out.println("ī��������[ Ű = " + height + "cm, ������ = " + weight + "kg, ī�������� = " + msg + " ]");

	}

	public static void main(String[] args)
	{
		Kaup kaup = new Kaup();
		kaup.testMethod();
	}
}
