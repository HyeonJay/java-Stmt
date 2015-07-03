package part1.variable;

/*
 < 기본형 타입 8가지 >

 1. 논리형 ( 1 바이트 )
 boolean - 1byte

 2. 바이트 ( 1 바이트 )
 byte - 1byte

 3. 문자 ( 2 바이트 )
 char - 2byte

 4. 정수 ( 2, 4, 8 바이트 )
 short - 2byte
 int - 4byte
 long - 8byte

 5. 실수 ( 4, 8 바이트 )
 float - 4byte
 double - 8byte
 */

public class PrimitiveType {
	public static void main(String[] args) {

		// 논리형 1바이트, 초기값 : false;
		boolean result = true;

		// 문자형 , char 2바이트, 초기값 = \u0000
		char c = 'C'; // 알파벳 한 글자를 나타내며 대소문자 구분한다. 주의!! 싱글쿼터( ' ' )

		// 정수형
		byte varByte = 100; // 8비트
		short varShort = 10000; // 16비트
		int varInt = 10000000; // 32비트
		long varLong = 100L; // 64비트
		// 숫자값 뒤에 알파벳 L 또는 l을 포기함, 다만 대부분 소문자 보다는 대문자 L을 표기. -가독성 위해
		// 실수형 = 부동 소수점 타입

		float varFloat = 100.00f; // 32비트
		// 숫자값 뒤에 F 또는 f를 표기함.

		double varDouble = 100.00d; // 64비트
		// 숫자값 뒤에 D 또는 d를 표기함.

		// 1바이트 = 8비트
		// 1비트 : 숫자 0과 1로 이루어짐.

		/*
		 * 메모리 용량이 늘어난 요즘은 boolean, int, double
		 */
		// Q. 3.14를 콘솔에 출력하시오.
		double a = 3.14d;
		System.out.println("3.14를 출력한 값 : "+a);

	}
}
