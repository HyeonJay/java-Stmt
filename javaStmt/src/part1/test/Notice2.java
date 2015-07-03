package part1.test;

import java.util.Scanner;

public class Notice2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		int kor = 0, eng = 0, math = 0, sum = 0; // 지역변수는 초기화 필수
		double avg = 0.0d; // 실수 ( 소수점 ) 타입은 더블타입으로 초기화
		String msg = ""; // 스트링 타입은 리터럴중에서 null로 초기화

		/* 스캐너로 성적을 입력하면 합계에 따라 합격여부를 통지하는 프로그램 */

		System.out.print("국어 점수 입력 : ");
		kor = scanner.nextInt();

		System.out.print("영어 점수 입력 : ");
		eng = scanner.nextInt();

		System.out.print("수학 점수 입력 : ");
		math = scanner.nextInt();
		System.out.println();

		sum = (kor + eng + math);
		avg = sum / 3d;
		System.out.println("평균 : " + avg);
		System.out.println();
		/*
		 * 조건에 따라 결과 값의 통지 내용이 달라짐 평균 100점 : 보너스 지급 평균 70 이상 : 합격 평균 70 미만이면 불합격
		 */
	int num = (int) (avg / 10);

		switch (num)
		{
		case 10:
			msg = "보너스 지급";
			break;

		case 7:
		case 8:
		case 9:
			msg = "합격";
			break;

		default:
			msg = "불합격";
			break;
		}
		System.out.println(msg);
	}
}
