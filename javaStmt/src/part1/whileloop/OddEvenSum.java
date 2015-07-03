package part1.whileloop;

public class OddEvenSum
{
	public static void main(String[] args)
	{
		int num = 1, sum = 0, oddSum = 0, evenSum = 0; // 지역 변수는 초기화 필수

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

		/* 홀수, 짝수 의 합 */
		/* 홀수의 합 */
		num = 1;
		while (num <= 10)
		{
			oddSum += num;
			num += 2;
		}
		System.out.println("홀수의 합 : " + oddSum);

		/* 짝수의 합 */
		num = 0;
		while (num <= 10)
		{
			evenSum += num;
			num += 2;
		}
		System.out.println("짝수의 합 : " + evenSum);

		/*for + if문을 가지고 한 연산식으로 홀짝을 출력*/
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
		System.out.println("[2]홀수의 합 : " + oddSum);
		System.out.println("[2]짝수의 합 : " + evenSum);
	}
}
