package part0.gangsa;

public class SumTen
{
	public static void main(String[] args)
	{
		int num = 0;
		int hap = 0;

		while (num < 11)
		{
			hap += num;
			num++;
		}
		System.out.println("while문 : 1부터 10까지의 합 = " + hap);

		int count = 1;
		int sum = 0;
		do
		{
			sum += count;
			count++;
		} while (count < 11);
		System.out.println("Do-While : 1부터 10까지의 합 = " + sum);

		int total = 0;
		for (int i = 0; i <= 10; i++)
		{
			total += i;
		}
		System.out.println("For-Loop : 1부터 10까지의 합 = " + total);
	}
}
