package part1.operator;

/*
 *Demo.java �̸��� ���̸� 
 Demo�� ���� �ҽ��� ���ϴ� ���̻��̹Ƿ�
 ���� �ҽ��� ������ Ŭ������� �ν��ϸ� �ȴ�.
 */



public class TwoHangDemo {
public static void main(String[] args) {
	int x = 20;
	int y = 7;
	
	int add, gob, mok, nmg, sub; //Ÿ���� ���� ������ ������ ���� �׷����� �����ϴ�.
	add = x + y;
	gob = x * y;
	mok = x / y ;
	nmg = x % y;
	sub = x - y;
	

	// ������ȣ�� *, �������� �� ��ȣ�� /, �������� ������ ���ϴ� ��ȣ�� %
	//���� ��ȣ�� -, ���� ��ȣ�� +�� ��
	//���� ������ gob, �������� �� ������ mok, ������ ������ nmg, ������ sub �� ����Ͻÿ�.
	

	
	System.out.println( "x�� �� : " + x + ", y�� �� : " + y + "\n");
	System.out.println("����\t ����\t ����\t ��\t ������\t");
	System.out.println( add + "\t  "+sub + "\t " + gob + "\t " + mok + "\t    " + nmg);
	
	System.out.println();
	System.out.println("x + y = " + add);
	System.out.println("x - y = " + sub);
	System.out.println("x * y = " + gob);
	System.out.println("x / y = " + mok);
	System.out.println("x % y = " + nmg);
}
}
