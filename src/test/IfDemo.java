package test;
/* ������������ ���������� ��������� if.
��������� ����� � �������� ����� ��� IfDemo.java.
*/
class IfDemo {
	public static void main (String args[]) {
		int a, b, c;
		a = 2;
		b = 3;
		
		if (a < b) System.out.println("a ������ b");
		// ����. ������ ������� �� ����� ���� ��������
		if (a == b) System.out.println("invisible");
		
		System.out.println();
		
		c = a - b; // ���������� "c" �������� �������� -1
		
		System.out.println("c �������� -1");
		if (c >= 0) System.out.println("c is not a negative number");
		if (c < 0) System.out.println("c - is negative");
		
		System.out.println();
		
		c = b - a; //���������� � ������ �������� ��������
		
		
		System.out.println("c �������� 1");
		if(c >=  0) System.out.println("c - �� ������������� �����");
		if(c < 0) System.out.println("c - ������������� �����");
		
		
	}

}
