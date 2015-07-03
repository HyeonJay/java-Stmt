package part1.forloop;
/*
단항연산자
++   --   +   -   ~   !  
이항연산자
산술 연산자   *   /   %
비교연산자   <   >   <=   >=   ==   !=    instanceof
논리연산자   &   ^   |   &&   ||   
삼항연산자   ? :
대입연산자   = 
* */

public class ForLoopDemo {
	public static void main(String[] args) {

		/*
		 * for (val = 1; val < 11; val++) {
		 * System.out.println("1부터 10까지 범위의 수 : " + val); }
		 */

		for (int val = 1; val < 11; val++) {
			/*
			 * forloop의 장점 1. 초기화, 리미트 값 설정 , 증감값 설정을 한 컨디션 내부에서 일괄 설정하므로 가독성이
			 * 좋다. 따라서, while loop보다 권장한다.
			 */
			System.out.println("1부터 10까지 범위의 수 : " + val);

		}
	}

}
