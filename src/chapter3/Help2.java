package chapter3;

/**
 * Created by hbagratyan on 28.03.2017.
 */
public class Help2 {
    public static void main (String args[])
            throws java.io.IOException {
        char choice, ignore;
        do {
            System.out.println("Справка:\n1. if\n2. switch\n3.for\n4.while\n5.do-while\nВыберите:");
            choice = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        }while ( choice < '1' | choice > '5');
        switch (choice) {
            case '1':
                System.out.println("Оператор if:\n");
                System.out.println("if{ycлoвиe) оператор;");
                System.out.println ("else оператор;");
                break;
            case '2':
                System.out.println("Oпepaтop switch:\n");
                System.out.println("switch(выpaжeниe) {");
                System.out.println(" case константа:");
                System.out.println(" последовательность операторов");
                System.out.println(" break;");
                System.out.println(" // ... ");
                System.out.println("}");
                break;
            case '3':
                System.out.println("Oпepaтop for:\n");
                System.out.print("for(инициaлизaция; условие; итерация)");
                System.out.println(" оператор;");
                break;
            case '4':
                System.out.println("Oпepaтop while:\n");
                System.out.println("while(ycлoвиe) оператор;");
                break;
            case '5':
                System.out.println("Oпepaтop do-while:\n");
                System.out.println("do {");
                System.out.println(" оператор;");
                System.out.println("} while (условие);");
                break;
            default:
                System.out.print("Зaпpoc не найден.");
        }
    }
}
