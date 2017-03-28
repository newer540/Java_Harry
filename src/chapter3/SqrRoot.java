package chapter3;

/**
 * Created by hbagratyan on 21.03.2017.
 */
public class SqrRoot {
    public static void main(String args[]) {
        double num, sroot, rerr;

        for(num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("Square root from " + num + "equals"  + sroot);
            //вычислить ошибку округления
            rerr = num - (sroot * sroot);
            System.out.println("R. error: " + rerr);
            System.out.println();
        }
    }
}
