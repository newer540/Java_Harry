package chapter3;

/**
 * Created by harry on 02-Apr-17.
 */
public class Break4 {
    public static void main (String args[]) {
        int i;

        for (i = 1; i < 4; i++) {
            one: {
            two: {
            three: {

                System.out.println("\n i equals " + i);
                if (i == 1) break one;
                if (i == 2) break two;
                if (i == 3) break three;

                //Это не будет выведено
                System.out.print("this string will be never shown");

            }
            System.out.println("after three");
            }
            System.out.println("after two");
            }
            System.out.println("after one");
        }
        System.out.println("after for");
    }
}
