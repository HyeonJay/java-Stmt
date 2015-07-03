package part1.operator;

public class SamHangDemo {
	public static void main(String[] args) {
		int x = 1, y = 0, z = 0;
		boolean bool = false; // boolean은 논리 연산자

		z = bool ? x : y; // bool이 true 면 x, false면 y
		System.out.println("삼항연산자 결과 출력 : " + z);
		// bool이 true인 경우 : x 값인 1 출력
		// bool이 false인 경우 : x 값인 0 출력

		/*
		 * Q . 정수형 타입 flag은 10이다. 정수형 타입 flag2은 20이다. 주어진 식이 ( )?
		 * "flag은 flag2보다 큽니다." : "flag은 flag2보다 큽니다."
		 */

		int flag = 10;
		int flag2 = 20;
		// boolean result = flag > flag2;

		System.out.println((flag > flag2) ? "flag는 flag2보다 큽니다." : "flag는 flag2보다 작습니다");
		/*
		 출력 값( 리턴 값 ) 이 정수형이면 결과값에 해당하는 변수 타입을 int로 주고
		 출력 값( 리턴 값 ) 이 리터럴이면 결과값에 해당하는 변수 타입을 String이라고 준다.
		 */

	}
}
