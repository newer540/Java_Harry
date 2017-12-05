package ownwork;

class Winners {
    String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma",
            "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};

    int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};

    int getWin() {
        for (int i = 0; i < times.length; i++) {
            int ind = 0;
            if (times[i] < times[ind]) {
                ind = i;
                return times[ind];
            }


        }
        return 0;
    }
}

public class Winner {
        public static void main(String args[]) {
            Winners as = new Winners();
            System.out.println(as.getWin());

        }

    }
