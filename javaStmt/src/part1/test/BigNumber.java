package part1.test;

import java.util.Scanner;

public class BigNumber
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("A�� ���� �Է��ϼ���.");
		// a���� �Է� �޴� ����
		int a = scanner.nextInt();

		System.out.print("B�� ���� �Է��ϼ���.");
		// b���� �Է� �޴� ����
		int b = scanner.nextInt();

		System.out.print("C�� ���� �Է��ϼ���.");
		// c���� �Է� �޴� ����
		int c = scanner.nextInt();

		if (a > b && a > c) // a�� b���� ũ�鼭 c���ٵ� ũ��( ������ )
		{
			System.out.println("\n���� ū ���� A���� " + a + "�Դϴ�.");
		}
		else if (b > a && b > c)
		{
			System.out.println("\n���� ū ���� B���� " + b + "�Դϴ�.");
		}
		else
		{
			System.out.println("\n���� ū ���� C���� " + c + "�Դϴ�.");
		}
	}
}
