package ownwork;


import java.util.Arrays;
/*” вас есть двухмерный массив наполненный случайными числами,
в той же последовательности перенесите эти числа в одномерный массив.
 */

public class Exer5 {
    public static void main(String args[]) {
        int table[][] = new int[4][5];
        int lin[] = new int[20];
        int index = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                table[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("»сходный двухмерный массив:");
        for (int a = 0; a < 4; a++) {
            System.out.println();
            for (int v = 0; v < 5; v++) {
                System.out.print(table[a][v]);
            }
        }
        System.out.println();
        System.out.println();
        System.out.println(" опируем содержимое двухмерного массива в одномерный...");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++, index++) {
                lin[index] = table[i][j];
            }
        }


        System.out.println(" опирование завершено");
        System.out.println();
        System.out.println("—одержимое одномерного массива lin:");
        for (int x : lin) System.out.print(x);
        System.out.println();
    }
}








