package test;
/*
������������ �������� ����� ������ int � double.
��������� ����� � �������� ����� ��� Exarnple�.java.
*/
class Example3 {
	public static void main (String args[]) {
		int var; //�������� ������������� ����������
		double x; // �������� ���������� � ��������� ������
		
		var = 10; 
		
		x = 10.0;
		
		System.out.println("���. �������� var: " + var);
		System.out.println("���. �������� x: " + x);
		System.out.println(); //����� ������ ������
		
		// ��������� �������� ����� ���������� �� 4
		var = var / 4;
		x = x / 4;
		
		System.out.println("�������� ���������� var ����� �������: " + var);
		System.out.println("�������� ���������� x ����� �������: " + x);
	}

}
