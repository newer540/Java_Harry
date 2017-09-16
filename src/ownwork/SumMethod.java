package ownwork;
/*Create a varargs method called sum( ) that sums the int values passed to it. Have it return
the result. Demonstrate its use.*/

public class SumMethod {
    private int total;

    int sum (int...x){
        for (int v = 0; v < x.length; v++) {
            total += x[v];
        }
        return total;
    }
}
class SumDemo{
    public  static void main(String args []){
        SumMethod S1 = new SumMethod();
        SumMethod S2 = new SumMethod();
        SumMethod S3 = new SumMethod();

        System.out.println(S1.sum(1, 2, 3, 4));
        System.out.println(S2.sum( 5, 10));
        System.out.println(S3.sum());

    }
}