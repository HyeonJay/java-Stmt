package part1.variable;

/*
 Casting (����ȯ )

 UpCasting( ������ �ڵ���ȯ )
 - ������ Ÿ���� ũ�Ⱑ ���� �ʿ��� ==> ū ������ ������ �̵���

 DownCasting( ����� ������ȯ )
 - ������ Ÿ���� ũ�Ⱑ ū �ʿ��� ==> ���� ������ ������ �̵���
 */

public class Casting {
	public static void main(String[] args) {
		int varInt = 100;
		double varDouble = 123.456d;

		//varDouble = varInt; //UpCasting

		System.out.println("DoubleŸ�� ���� �� ��� : " + varDouble);

		varInt = (int) varDouble; //DownCasting
	System.out.println( "DownCating�� ��� �� : " + varInt );
		/*
		 ��Ŭ������ fix available �ϴٸ鼭 �ִ� �������� ����� 
		 "��Ŭ���� ����( eclipse proposal )" �̶�� �ϸ� 
		 �� ��Ŭ���� ������ ���� ������ �����ϵ��� �Ѵ�.
		 */
		/*
		 ��... �ٿ� ĳ���� �� ���� ������ �ս�( Data loss )�� �Ͼ��.
		 */
		System.out.println();
	}
}
