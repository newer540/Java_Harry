package chapter3;

/**
 * Created by hbagratyan on 21.03.2017.
 * вычисление целых степеней числа 2
 * применение циклов
 */
public class qwerty {
    public static void main(String args[]) {
        int e;
        for (int res = 2; res <= 512; res = res * 2) {
            e = 2;
            while (e < 11) {
                e++;

            }
            System.out.println("2 в степени " + e + " равняется " + res);
        }

    }
}
