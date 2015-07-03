package part1.array;

import java.util.Scanner;

public class IntArrayDemo
{
	public static void main(String[] args)
	{
		int sum = 0;

		int[] arr; // 배열의 선언
		arr = new int[3]; // 배열의 객체 선언 주의! 할당이 아님

		int[] arr2 = new int[3]; // 한줄로 선언과 객체 생성
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;

		for (int i = 0; i < 3; i++)
		{
          sum += arr2[i];
		}
		System.out.println(sum);
		
		//배열을 이용해서 11부터 20까지의 합을 구하세요. arr3 배열을 선언하고 출력하시오.
		System.out.println();
		
		int[ ] arr3 = new int[10];
		int j = 11;
		for( int i = 0; i <= 9; i++ )
		{
			arr3[i] = j;
			
			System.out.println(arr3[i] + "\t");
			j++;
		}
		System.out.println();
		sum = 0;
		for( int i = 0; i < 10; i++)
		{
			sum += arr3[i];
		}
		System.out.println(sum);
	}
}
