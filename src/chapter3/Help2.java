package chapter3;

/**
 * Created by hbagratyan on 28.03.2017.
 */
public class Help2 {
    public static void main (String args[])
            throws java.io.IOException {
        char choice, ignore;
        do {
            System.out.println("�������:\n1. if\n2. switch\n3.for\n4.while\n5.do-while\n��������:");
            choice = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        }while ( choice < '1' | choice > '5');
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
            case '3':
                System.out.println("O�epa�op for:\n");
                System.out.print("for(�����a���a���; �������; ��������)");
                System.out.println(" ��������;");
                break;
            case '4':
                System.out.println("O�epa�op while:\n");
                System.out.println("while(yc�o��e) ��������;");
                break;
            case '5':
                System.out.println("O�epa�op do-while:\n");
                System.out.println("do {");
                System.out.println(" ��������;");
                System.out.println("} while (�������);");
                break;
            default:
                System.out.print("�a�poc �� ������.");
        }
    }
}
