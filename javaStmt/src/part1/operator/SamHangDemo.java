package part1.operator;

public class SamHangDemo {
	public static void main(String[] args) {
		int x = 1, y = 0, z = 0;
		boolean bool = false; // boolean�� �� ������

		z = bool ? x : y; // bool�� true �� x, false�� y
		System.out.println("���׿����� ��� ��� : " + z);
		// bool�� true�� ��� : x ���� 1 ���
		// bool�� false�� ��� : x ���� 0 ���

		/*
		 * Q . ������ Ÿ�� flag�� 10�̴�. ������ Ÿ�� flag2�� 20�̴�. �־��� ���� ( )?
		 * "flag�� flag2���� Ů�ϴ�." : "flag�� flag2���� Ů�ϴ�."
		 */

		int flag = 10;
		int flag2 = 20;
		// boolean result = flag > flag2;

		System.out.println((flag > flag2) ? "flag�� flag2���� Ů�ϴ�." : "flag�� flag2���� �۽��ϴ�");
		/*
		 ��� ��( ���� �� ) �� �������̸� ������� �ش��ϴ� ���� Ÿ���� int�� �ְ�
		 ��� ��( ���� �� ) �� ���ͷ��̸� ������� �ش��ϴ� ���� Ÿ���� String�̶�� �ش�.
		 */

	}
}
