package part1.array;

/*
 * @Date : someday;
 * @Author : ;
 * @Story : 배열 할당시 선언과 동시에 할당하는 방식
 */
public class ArrayAssignDemo
{
	public static void main(String[] args)
	{
		int[] intArr =
		{ 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };
		
		int sum = 0, sum2 = 0;
		// for 문으로 돌려서 100부터 1000까지의 합을 출력하세요
		for (int i = 0; i < intArr.length; i++)
		{
			sum += intArr[i];
		}
		System.out.println(sum);

		/*
		 * 확장된 for문 배열을 출력할 때 limit값을 정할 필요 없이 무조건 전체 출력을 한다면 limit값 생략 가능
		 */
		for (int i : intArr)
		{
			sum2 += i;
		}
		System.out.println(sum2);
	}
}
