package chapter4;
/**
 * Java class for Devexperts contest
 */
class Water {
    public static void main(String args[]){
        double glass1 = 1, glass2 = 0;
        for (int i = 1; i <= 50;) {
            glass2 = glass2 + (glass1 / 2);
            glass1 = glass1 - (glass1 / 2);
            glass1 = glass1 + (glass2 / 2);
            glass2 = glass2 - (glass2 / 2);
            i ++;
        }
      System.out.println ("В первом стакане осталось " + glass1 + " литров");
    }
}
