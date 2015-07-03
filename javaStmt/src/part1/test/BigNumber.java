package part1.test;

import java.util.Scanner;

public class BigNumber
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("A의 값을 입력하세요.");
		// a값을 입력 받는 로직
		int a = scanner.nextInt();

		System.out.print("B의 값을 입력하세요.");
		// b값을 입력 받는 로직
		int b = scanner.nextInt();

		System.out.print("C의 값을 입력하세요.");
		// c값을 입력 받는 로직
		int c = scanner.nextInt();

		if (a > b && a > c) // a가 b보다 크면서 c보다도 크다( 교집합 )
		{
			System.out.println("\n가장 큰 수는 A값인 " + a + "입니다.");
		}
		else if (b > a && b > c)
		{
			System.out.println("\n가장 큰 수는 B값인 " + b + "입니다.");
		}
		else
		{
			System.out.println("\n가장 큰 수는 C값인 " + c + "입니다.");
		}
	}
}
