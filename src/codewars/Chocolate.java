package codewars;

public class Chocolate{
    public int breakChocolate(int n, int m) {
        if (n==1) return (m-1);
        else if (m==1) return (n-1);
        else if (n == 0 & m == 0) return -1;
        else return (n-1) + (n)*(m-1);
    }
}
class ChocolateDemo{
    public static void main (String args[]){
        Chocolate CHOC = new Chocolate();
        System.out.println(CHOC.breakChocolate(0,1));
    }
}
