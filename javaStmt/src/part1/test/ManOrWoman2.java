package part1.test;

import java.util.Scanner;

public class ManOrWoman2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ���. (��) 123456-4123456");
		String ssn = "", ans = ""; // int �� �ʱ�ȭ�� 0, String �ʱ�ȭ�� ""

		ssn = scanner.next();

		char ch = ssn.charAt(7); // ������ �ε��� ���� 0��� ��ġ�ϼ���

		// �������� ���������� �Ǻ��ϴ� �κ��� �������� '-' ���� ������ 4�� �ش��Ѵ�.
		// ��Ʈ�� ���ڿ��� ���� ���� �ε������ �ϴµ� 0 ���� �����Ѵ�.
		// ���� �������� �ε��� 0���� 1�̰� �ε��� 1���� 2�̴�.

		//����� .. ������ ���ϴ� ���� ������ ���� ��� �׽�Ʈ ���� ����غ��� ���
		//System.out.println("ch : " + ch);
		switch (ch)
		{
		case '1':
		case '3':
			ans = "����";
			break;

		case '2':
		case '4':
			ans = "����";
			break;

		case '5':
		case '6':
			ans = "�ܱ���";
			break;

		default:
			ans = "�߸��Է��ϼ̽��ϴ�.";
			break;
		}
		System.out.println(ans);
	}
}
