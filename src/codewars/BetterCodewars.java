package codewars;

class Kata {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sumOfClassPoint = 0;
        int avg;
        for (int x : classPoints)
            sumOfClassPoint += x;
        avg = sumOfClassPoint / classPoints.length;

        if (yourPoints > avg)
            return true;
        else return false;
    }
}

public class BetterCodewars {
    public static void main(String args[]) {
        int marks[] = {12, 12, 11, 23, 12, 14, 15};
        System.out.println(Kata.betterThanAverage(marks, 10));

    }
}
