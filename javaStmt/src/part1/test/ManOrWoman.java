package part1.test;

import java.util.Scanner;

public class ManOrWoman
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("주민등록번호를 입력하세요. (예) 123456-4123456");
		String ssn = ""; // int 형 초기화는 0, String 초기화는 ""

		ssn = scanner.next();

		char ch = ssn.charAt(7); // 적당한 인덱스 값을 0대신 대치하세요

		// 남자인지 여자인지를 판별하는 부분은 예문에서 '-' 다음 숫자인 4에 해당한다.
		// 스트링 문자열의 순서 값은 인덱스라고 하는데 0 부터 시작한다.
		// 따라서 예문에서 인덱스 0값은 1이고 인덱스 1값은 2이다.

		if (ch == '1' || ch == '3')  //char 타입은 ' '이고, String타입은 " "주의!!!
		{
			System.out.println("남자");
		}
		// 2와 4는 여자, 5와 6은 외국인 나머지 값은 잘 못된 입력값
		else if (ch == '2' || ch == '4')
		{
			System.out.println("여자");
		}
		else if (ch == '5' || ch == '6')
		{
			System.out.println("외국인");
		}
		else
		{
			System.out.println("잘못입력하셨습니다.");
		}
	}
}
