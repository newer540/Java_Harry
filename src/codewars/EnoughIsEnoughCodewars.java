package codewars;

class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOcurrences) {
        int counter1;
        int counter2 = 0;
        int counter3;
        int resultArr[];
        int sizeOfResultArr = elements.length;

        //define the size of result array
        for (int i = 0; i < elements.length; i++) {
            counter1 = 0;
            for (int x = i; x < elements.length; x++) {
                if (elements[i] == elements[x]) counter1++;
                if (counter1 == maxOcurrences) {
                    counter2++;
                    counter1 = 0;
                }
            }
        }
        sizeOfResultArr = sizeOfResultArr - counter2;
        resultArr = new int[sizeOfResultArr];
        for (int k = 0; k < elements.length; k++) {
            counter3 = 0;
            for (int x = k; x < elements.length; x++) {
                if (elements[k] == elements[x]) counter3++;
                if (counter3 <= maxOcurrences) resultArr[x] = elements[x];
            }
        }
        return resultArr;
    }
}

public class EnoughIsEnoughCodewars {
    public static void main(String args[]) {
        int testArr[] = {1, 2, 3, 3, 4, 1, 2, 4, 2};
        int testArr1[];
        testArr1 = EnoughIsEnough.deleteNth(testArr, 2);
        for (int i = 0; i < testArr1.length; i++) {
            System.out.print(testArr1[1] + " ");
        }
    }
}