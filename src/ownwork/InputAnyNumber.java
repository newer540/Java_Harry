package ownwork;
import java.util.Scanner;

/*������������ ������ ����� �� 1 �� 20, ����� ��������� ��������
������� ��������� ����������:
1. ������ �� ��� �����
2. ������� �� ����� �� ��� ������
3. ������� ����� �����
4. 2 � ������� ����� �����
 */
public class InputAnyNumber {
    public static void main(String args[]) {

        int number;
        int result = 1;
        System.out.println(" ������� ����� �� 1 �� 20");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        if (0 < number & number < 21) {
            if ((number % 2) > 0) {
                System.out.println("��������� ���� ����� ��������");
            } else System.out.println("��������� ���� ����� ������");
            if ((number % 3) > 0) {
                System.out.println("��������� ���� ����� �� ������� ������ �� ���");
            } else System.out.println("��������� ���� ����� ������� ������ �� ���");
            System.out.println("������� " + number + " ����� " + number * number);
            for (int i = 0; i < number; i++) {
                result *= 2;

            }
            System.out.println("2 � ������� " + number + " ����� " + result);
        }

        else
            System.out.println("������ ���������!");
    }
}

