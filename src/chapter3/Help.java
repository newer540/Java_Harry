package chapter3;

/**
 * Created by hbagratyan on 21.03.2017.
 */
public class Help {
    public static void main (String args[])
        throws java.io.IOException {
            char choice;
            System.out.println("�������:\n1. if\n2. switch\n��������:");
            choice = (char) System.in.read();
            System.out.println("\n");
        switch (choice) {
            case '1':
                System.out.println("�������� if:\n");
                System.out.println("if{yc�o��e) ��������;");
                System.out.println ("else ��������;");
                break;
            case '2':
                    System.out.println("O�epa�op switch:\n");
                    System.out.println("switch(��pa�e��e) {");
                    System.out.println(" case ���������:");
                    System.out.println(" ������������������ ����������");
                    System.out.println(" break;");
                    System.out.println(" // ... ");
                    System.out.println("}");
                    break;
            default:
                    System.out.print("�a�poc �� ������.");
        }

    }
}
