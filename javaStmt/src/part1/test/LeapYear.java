package part1.test;

import java.util.Scanner;

/*
 * @Date : 2015. 6. 16
 * @Author : ;
 * @ Stroy : �Է¹��� ������ ���� �������� �ƴ����� �Ǻ��ϴ� �ǵ� ���α׷�
 * */

public class LeapYear
{
	public static void main(String[] args)
	{
		/*
		 * ������ 4�� ���� ���� 0 �̶�� ������ �� �ִ�. �׷��� �ش� ������ 100���� ������ �������� ����̴� ����̶� �ص� �ٽ� 400���� ���������� ������ �����̴�
		 */
		Scanner scanner = new Scanner(System.in);
		String yearmsg = "";

		System.out.print("�⵵�� �Է��ϼ��� :");
		int year = scanner.nextInt();

		if (year % 400 == 0)
		{
			// ���͸� if������ ���ʴ�� ������� ���� �� ������ �Ǹ��ϸ鼭 �Ϻη� ���� �����ϴ� ����
			// ���͸� ����� ������� ũ�� �ִ� �������� ���� �������� ����.
			yearmsg = "����";
		}
		else if (year % 100 == 0)
		{
			yearmsg = "���";
		}
		else if (year % 4 == 0)
		{
			yearmsg = "����";
		}
		else
		{
			yearmsg = "���";
		}
		System.out.println(yearmsg);
	}
}
