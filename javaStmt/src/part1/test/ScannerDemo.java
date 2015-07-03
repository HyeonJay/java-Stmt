package part1.test;

import java.util.Scanner;

public class ScannerDemo
{
	public static void main(String[] args)
	{
		/* 스캐너 클래스의 객체인 scanner을 생성하였다. */

		Scanner scanner = new Scanner(System.in); // 한번만 선언해주면 된다.

		System.out.println("숫자를 입력해 주세요");

		int a = scanner.nextInt();
		System.out.println(a);

		/* for문으로 입력된 값만큼의 합을 구하는 연산식을 구현하시오. */

		System.out.println("숫자를 입력하세요");
		int c = scanner.nextInt();

		int sum = 0; // for문의 결과 값을 출력하는 변수는 바깥쪽에 선언 및 초기화
		for (int i = 1; i <= c; i++)
		{
			sum += i;
		}
		System.out.println(sum); // 출력 값은 for문이 다 돈 다음에 나와야 하므로 바깥쪽
	}
}
