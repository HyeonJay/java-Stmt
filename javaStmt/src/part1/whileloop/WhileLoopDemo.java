package part1.whileloop;

public class WhileLoopDemo {
	public static void main(String[] args) {
		int count = 1;
		int result = 0;
		// int count = 0;�̶�� �ִ� ���� count������ 0���� �ʱ�ȭ( initialize )�Ѵٰ� �Ѵ�.
		// �׷��� ������ Ÿ���� int�� ����Ʈ ���� 0���� ���� �ʰ� 1�� �ִ� ���� count ������ 1�� �ʱ�ȭ�Ѵٶ�� ��Ī��.

	
		 while(count < 11 ) //count�� 11���� ���� ���� �϶��� {
		 {
			 System.out.println("[1]1���� 10������ ���� �ȿ� �ִ� ������" + count + "�Դϴ�."); 
			 
			 System.out.println( count );
			 count++;
		 }
		
		 /*
		  �ʱⰪ�� ���ǽ�( ����� ) �� ��¹����� �������..
		  [1] ����� + ����� + ��¹�
		  ���� ���� 0 ���� �����ϰ� ������� ����Ʈ ���� ������ �̸����� �����Ѵ�.
		  
		  [2] ����� + ��¹� + ����� 
		  ���۰��� 1���� �����ϰ� ������� ����Ʈ ���� ������ ���� 1 ū�� �̸����� �����Ѵ�.
		  */
		 
		 count = 1;
		while (count < 11) {
			result += count;
			count++;
		}
		System.out.println("1���� 10������ ���� " + result + "�Դϴ�.");
	}
}
