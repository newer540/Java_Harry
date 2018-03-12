package codewars;

class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOcurrences) {
        int counter1;
        int counter2 = 0;
        int resultArr[];
        int sizeOfResultArr;

        //define the size of result array
        for (int i = 0; i < elements.length; i++) {
            counter1 = 0;
            for (int x = i; x < elements.length; x++) {
                if (elements[i] == elements[x]) counter1++;
                if (counter1 == maxOcurrences) {
                    counter2++;
                    counter1--;
                }
            }
        }
        sizeOfResultArr = elements.length - counter2;
        resultArr = new int[sizeOfResultArr];

        for (int i = 0; i < elements.length; i++) {
            counter1 = 0;
            for (int x = i; x < elements.length; x++) {
                if (elements[i] == elements[x]) counter1++;
                if (counter1 <= maxOcurrences) resultArr[i] = elements[i];
            }
        }
        return resultArr;
    }
}

public class EnoughIsEnoughCodewars {
    public static void main(String args[]) {
        int testArr[] = {1, 2, 3, 3, 3, 3, 4, 1, 2, 4, 2};
        int testArr1[];
        testArr1 = EnoughIsEnough.deleteNth(testArr, 2);
        for (int Q : testArr1) {
            System.out.print(Q + " ");
        }
    }
}
