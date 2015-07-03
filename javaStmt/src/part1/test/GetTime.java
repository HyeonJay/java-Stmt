package part1.test;

import java.util.Scanner;

public class GetTime
{
	public static void main(String[] args)
	{
			Scanner scanner = new Scanner(System.in);
		
			System.out.println("초를 입력하세요");
			
		int time = scanner.nextInt(); // 초
		int second = 0, minute = 0, hour = 0;

		second = time % 60; // 500초를 60으로 나눈 나머지는 초
		minute = (time / 60) % 60; // 500초를 60으로 나눈 몫을 다시 60으로 나눈 나머지는 분일때 시간을 구하시고 출력되게끔하세요
		hour = (time / 60) / 60;

		System.out.println(hour + "시");
		System.out.println(minute + "분");
		System.out.println(second + "초");
		
	/*System.out.println("\n시간을 입력하세요.");
		System.out.print("시 : ");
		int h = scanner.nextInt();
		
		System.out.print("분 : ");
		int min = scanner.nextInt();
		
		System.out.print("초 : ");
		int sec = scanner.nextInt();
		
		System.out.print(h + "시");
		System.out.print(min + "분");
		System.out.println(sec + "초");
*/		
	}
}
