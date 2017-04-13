package chapter4;

/**
 * Created by hbagratyan on 13.04.2017.
 */
class ChkNum {
    // return boolean true
    // if x is even
    boolean isEven(int x) {
        if ((x % 2) == 0) return true;
        else return false;
    }
}

class ParmDemo {
    public static void main(String args[]) {
        ChkNum e = new ChkNum();
        if (e.isEven(10)) System.out.print("10 is even");
        if (e.isEven(9)) System.out.print("9 is even");

    }
}