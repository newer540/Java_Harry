package ownwork;

public class Exer5 {
    public static void main(String args[]) {
        int table[][] = new int[4][5];
        int lin[] = new int[20];

        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 5; j++)
                table[i][j] = (int) Math.random();

        System.out.println("Исходный двухмерный массив:");
        for (int a = 0; a < 4; a++)
            for (int v = 0; v < 5; v++)
                System.out.println(table[a][v]);

    }
}

