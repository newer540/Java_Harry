package chapter3;

/**
 * Created by hbagratyan on 21.03.2017.
 * trying to figure out how to use SWITCH
 */

public class Switch {
    public static void main (String args[]) {
        int i;

        for (i=0; i<2; i++)
            switch (i) {
                case 0:
                    System.out.println("i = 0");
                case 1:
                    System.out.println("i = 1");
                    break;
                case 2:
                    System.out.println("i = 2");
                    break;
                default:
                    System.out.println("i more than or equals 3");
                    break;
            }
         System.out.println("end");

    }
}
