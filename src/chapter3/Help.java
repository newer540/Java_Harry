package chapter3;

/**
 * Created by hbagratyan on 21.03.2017.
 */
public class Help {
    public static void main (String args[])
        throws java.io.IOException {
            char choice;
            System.out.println("Справка:\n1. if\n2. switch\nВыберите:");
            choice = (char) System.in.read();
            System.out.println("\n");
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
            default:
                    System.out.print("Зaпpoc не найден.");
        }

    }
}
