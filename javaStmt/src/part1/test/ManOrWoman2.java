package part1.test;

import java.util.Scanner;

public class ManOrWoman2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("주민등록번호를 입력하세요. (예) 123456-4123456");
		String ssn = "", ans = ""; // int 형 초기화는 0, String 초기화는 ""

		ssn = scanner.next();

		char ch = ssn.charAt(7); // 적당한 인덱스 값을 0대신 대치하세요

		// 남자인지 여자인지를 판별하는 부분은 예문에서 '-' 다음 숫자인 4에 해당한다.
		// 스트링 문자열의 순서 값은 인덱스라고 하는데 0 부터 시작한다.
		// 따라서 예문에서 인덱스 0값은 1이고 인덱스 1값은 2이다.

		//디버깅 .. 에러나 원하는 값이 나오지 않을 경우 테스트 값을 출력해보는 경우
		//System.out.println("ch : " + ch);
		switch (ch)
		{
		case '1':
		case '3':
			ans = "남자";
			break;

		case '2':
		case '4':
			ans = "여자";
			break;

		case '5':
		case '6':
			ans = "외국인";
			break;

		default:
			ans = "잘못입력하셨습니다.";
			break;
		}
		System.out.println(ans);
	}
}
