package part1.array;

import java.util.Scanner;

public class IntArrayDemo
{
	public static void main(String[] args)
	{
		int sum = 0;

		int[] arr; // �迭�� ����
		arr = new int[3]; // �迭�� ��ü ���� ����! �Ҵ��� �ƴ�

		int[] arr2 = new int[3]; // ���ٷ� ����� ��ü ����
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;

		for (int i = 0; i < 3; i++)
		{
          sum += arr2[i];
		}
		System.out.println(sum);
		
		//�迭�� �̿��ؼ� 11���� 20������ ���� ���ϼ���. arr3 �迭�� �����ϰ� ����Ͻÿ�.
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
