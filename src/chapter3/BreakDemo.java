package chapter3;

// –асположение метки имеет большое значение
class BreakDemo {
    public static void main(String args[]) {
        int z, c;
        stop1: for (z = 0; z < 5; z++) {
                for (c = 0; c < 5; c++) {
                    if (c == 2) break stop1;
                System.out.println("z и c: " + z + " " + c);
            }
        }

            System.out.println();
            for(z=0;z<5;z++)
    stop2: {

        for (c=0; c < 5; c++) {
            if (c==2) break stop2;
            System.out.println("z и c: " + z + " " + c);
        }
        }
    }
}
