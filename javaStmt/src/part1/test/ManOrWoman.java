package part1.test;

import java.util.Scanner;

public class ManOrWoman
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ���. (��) 123456-4123456");
		String ssn = ""; // int �� �ʱ�ȭ�� 0, String �ʱ�ȭ�� ""

		ssn = scanner.next();

		char ch = ssn.charAt(7); // ������ �ε��� ���� 0��� ��ġ�ϼ���

		// �������� ���������� �Ǻ��ϴ� �κ��� �������� '-' ���� ������ 4�� �ش��Ѵ�.
		// ��Ʈ�� ���ڿ��� ���� ���� �ε������ �ϴµ� 0 ���� �����Ѵ�.
		// ���� �������� �ε��� 0���� 1�̰� �ε��� 1���� 2�̴�.

		if (ch == '1' || ch == '3')  //char Ÿ���� ' '�̰�, StringŸ���� " "����!!!
		{
			System.out.println("����");
		}
		// 2�� 4�� ����, 5�� 6�� �ܱ��� ������ ���� �� ���� �Է°�
		else if (ch == '2' || ch == '4')
		{
			System.out.println("����");
		}
		else if (ch == '5' || ch == '6')
		{
			System.out.println("�ܱ���");
		}
		else
		{
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
	}
}
