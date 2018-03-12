package codewars;

class Dinglemouse {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears = 0;
        int dogYears = 0;

        if (humanYears == 1)
            catYears = 15;
        else if (humanYears == 2)
            catYears = 24;
        else if (humanYears > 2)
            catYears = 24 + (humanYears - 2) * 4;

        if (humanYears == 1)
            dogYears = 15;
        else if (humanYears == 2)
            dogYears = 24;
        else if (humanYears > 2)
            dogYears = 24 + (humanYears - 2) * 5;

        return new int[]{humanYears, catYears, dogYears};
    }
}

public class DinglemouseCodewars {
    public static void main(String args[]) {
        int testArray[] = Dinglemouse.humanYearsCatYearsDogYears(15);
        for (int x : testArray) {
            System.out.print(x + " ");
        }
    }

}