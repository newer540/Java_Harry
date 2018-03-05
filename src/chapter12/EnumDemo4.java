package chapter12;

// Demonstrate ordinal() and compareTo().
// An enumeration of Transport varieties.
enum Transport3 {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

class EnumDemo4 {
    public static void main(String args[]) {
        Transport3 tp, tp2, tp3;
// Obtain all ordinal values using ordinal().
        System.out.println("Here are all Transport constants" +
                " and their ordinal values: ");
        for (Transport3 t : Transport3.values())
            System.out.println(t + " " + t.ordinal());
        tp = Transport3.AIRPLANE;
        tp2 = Transport3.TRAIN;
        tp3 = Transport3.AIRPLANE;
        System.out.println();
// Demonstrate compareTo()
        if (tp.compareTo(tp2) < 0)
            System.out.println(tp + " comes before " + tp2);
        if (tp.compareTo(tp2) > 0)
            System.out.println(tp2 + " comes before " + tp);
        if (tp.compareTo(tp3) == 0)
            System.out.println(tp + " equals " + tp3);
    }
}
