package part1.whileloop;

public class OddEvenSum
{
	public static void main(String[] args)
	{
		int num = 1, sum = 0, oddSum = 0, evenSum = 0; // ���� ������ �ʱ�ȭ �ʼ�

		while (num <= 10)
		{
			sum += num;
			num++;
		}
		System.out.println(sum);

		sum = 0;
		for (num = 1; num <= 10; num++)
		{
			sum += num;
		}
		System.out.println(sum);

		/* Ȧ��, ¦�� �� �� */
		/* Ȧ���� �� */
		num = 1;
		while (num <= 10)
		{
			oddSum += num;
			num += 2;
		}
		System.out.println("Ȧ���� �� : " + oddSum);

		/* ¦���� �� */
		num = 0;
		while (num <= 10)
		{
			evenSum += num;
			num += 2;
		}
		System.out.println("¦���� �� : " + evenSum);

		/*for + if���� ������ �� ��������� Ȧ¦�� ���*/
		oddSum = 0;
		evenSum = 0;

		for (num = 1; num <= 10; num++)
		{
			if (num % 2 == 1)
			{
				oddSum += num;
			}
			else
			evenSum += num;
		}
		System.out.println("[2]Ȧ���� �� : " + oddSum);
		System.out.println("[2]¦���� �� : " + evenSum);
	}
}
