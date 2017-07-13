package chapter5;

/**
 * Created by harry on 7/13/2017.
 * Учебное упражнение
 * нахождение среднего арифметического членов массива типа double
 */
public class Exer3 {
    public static void main (String args[]){
        double mas[] = { 1, 3, 34, 23, 555, 12, 65, 88, 10};
        double avg;
        double sum;
        sum = 0;
        for (double x: mas) sum+=x;
        System.out.println("Cумма членов массива mas[] равна: " + sum);
        avg = sum / mas.length;
        System.out.println("Среднее арифметическое членов массива num[] равно:" + avg);

    }

}
