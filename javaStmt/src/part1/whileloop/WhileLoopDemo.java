package part1.whileloop;

public class WhileLoopDemo {
	public static void main(String[] args) {
		int count = 1;
		int result = 0;
		// int count = 0;이라고 주는 것은 count변수를 0으로 초기화( initialize )한다고 한다.
		// 그런데 정수형 타입인 int의 디폴트 값인 0으로 주지 않고 1로 주는 것을 count 변수를 1로 초기화한다라고 지칭함.

	
		 while(count < 11 ) //count가 11보다 작은 상태 일때만 {
		 {
			 System.out.println("[1]1부터 10까지의 범위 안에 있는 수들은" + count + "입니다."); 
			 
			 System.out.println( count );
			 count++;
		 }
		
		 /*
		  초기값과 조건식( 컨디션 ) 과 출력문과의 상관관계..
		  [1] 컨디션 + 연산식 + 출력문
		  시작 값을 0 부터 시작하고 컨디션의 리미트 값은 범위값 미만으로 설정한다.
		  
		  [2] 컨디션 + 출력문 + 연산식 
		  시작값을 1부터 시작하고 컨디션의 리미트 값은 범위값 보다 1 큰값 미만으로 설정한다.
		  */
		 
		 count = 1;
		while (count < 11) {
			result += count;
			count++;
		}
		System.out.println("1부터 10까지의 합은 " + result + "입니다.");
	}
}
