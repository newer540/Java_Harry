package chapter3;

/**
 * Created by harry on 02-Apr-17.
 */
public class FindFac {
    public static void main (String args []) {
        for (int i = 2; i < 100; i++) {
            System.out.print("�������� " + i + " : ");
            for (int j = 2; j<=i/2 ; j++)
                if((i%j) == 0) System.out.print(j + " ");

            System.out.println();

        }
    }
}