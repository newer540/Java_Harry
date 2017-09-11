package ownwork;

class Bigger {
    int a;
    int b;

    String isBigger(int a, int b) {
        System.out.println(Math.min(a, b));
        return ("min: " + Math.min(a, b));

    }
}

class BiggerDemo {
    public static void main(String args[]) {
        Bigger b = new Bigger();
        b.isBigger(2, 7);
        b.isBigger(17, 28);
    }
}
