package part1.test;

import java.util.Scanner;

public class GetTime
{
	public static void main(String[] args)
	{
			Scanner scanner = new Scanner(System.in);
		
			System.out.println("�ʸ� �Է��ϼ���");
			
		int time = scanner.nextInt(); // ��
		int second = 0, minute = 0, hour = 0;

		second = time % 60; // 500�ʸ� 60���� ���� �������� ��
		minute = (time / 60) % 60; // 500�ʸ� 60���� ���� ���� �ٽ� 60���� ���� �������� ���϶� �ð��� ���Ͻð� ��µǰԲ��ϼ���
		hour = (time / 60) / 60;

		System.out.println(hour + "��");
		System.out.println(minute + "��");
		System.out.println(second + "��");
		
	/*System.out.println("\n�ð��� �Է��ϼ���.");
		System.out.print("�� : ");
		int h = scanner.nextInt();
		
		System.out.print("�� : ");
		int min = scanner.nextInt();
		
		System.out.print("�� : ");
		int sec = scanner.nextInt();
		
		System.out.print(h + "��");
		System.out.print(min + "��");
		System.out.println(sec + "��");
*/		
	}
}
