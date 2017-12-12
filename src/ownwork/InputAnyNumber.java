package ownwork;
import java.util.Scanner;

/*ѕользователь вводит число от 1 до 20, затем программа поэтапно
выводит следующую информацию:
1. „етное ли это число
2. ƒелитс€ ли число на три нацело
3.  вадрат этого числа
4. 2 в степени этого числа
 */
public class InputAnyNumber {
    public static void main(String args[]) {

        int number;
        int result = 1;
        System.out.println(" ¬ведите число от 1 до 20");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        if (0 < number & number < 21) {
            if ((number % 2) > 0) {
                System.out.println("¬веденное вами число нечетное");
            } else System.out.println("¬веденное вами число четное");
            if ((number % 3) > 0) {
                System.out.println("¬веденное вами число не делитс€ нацело на три");
            } else System.out.println("¬веденное вами число делитс€ нацело на три");
            System.out.println(" вадрат " + number + " равен " + number * number);
            for (int i = 0; i < number; i++) {
                result *= 2;

            }
            System.out.println("2 в степени " + number + " равно " + result);
        }

        else
            System.out.println("ќшибка диапазона!");
    }
}

