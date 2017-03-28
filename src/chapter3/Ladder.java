package chapter3;

/**
 * Created by hbagratyan on 20.03.2017.
 * educational java
 */
class Ladder {
    public static void main (String args[]) {
        int x;
        for(x = 0; x < 6; x++) {
            if (x ==1)
                System.out.println("x равно единице");
            else if (x == 2)
                System.out.println("x равно двум");
            else if (x == 3)
                System.out.println("x равно трем");
            else if (x == 4)
                System.out.println("x равно четырем");
            else  // условие, выполняет по умолчанию
                System.out.println("x вне диапазона 1 - 4");

        }
    }
}
