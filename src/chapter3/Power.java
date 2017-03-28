package chapter3;

/**
 * Created by hbagratyan on 21.03.2017.
 * вычисление целых степеней числа 2
 * применение циклов
 */
public class Power {
    public static void main (String args[]) {
        int e;
        int result;

        for (int i=0; i < 10; i++) {
            result = 1;
            e = i;
            while (e > 0) {
                result *= 2;
                e--;

            }
            System.out.println("2 в степени " + i + " равно " + result);

        }
    }
}
