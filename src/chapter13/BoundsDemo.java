package chapter13;

// In this version of NumericFn, the type argument
// for T must be either Number, or a class derived
// from Number.
class NumericFn<T extends Number> {
    T num;
    // Pass the constructor a reference to
// a numeric object.
    NumericFn(T n) {
        num = n;
    }
    // Return the reciprocal.
    double reciprocal() {
        return 1 / num.doubleValue();
    }
    // Return the fractional component.
    double fraction() {
        return num.doubleValue() - num.intValue();
    }
// ...
}
// Demonstrate NumericFns.
class BoundsDemo {
    public static void main(String args[]) {
        NumericFn<Integer> iOb =
                new NumericFn<Integer>(5);
        System.out.println("Reciprocal of iOb is " +
                iOb.reciprocal());
        System.out.println("Fractional component of iOb is " +
                iOb.fraction());
        System.out.println();
        NumericFn<Double> dOb =
                new NumericFn<Double>(5.25);
        System.out.println("Reciprocal of dOb is " +
                dOb.reciprocal());
        System.out.println("Fractional component of dOb is " +
                dOb.fraction());
// This won't compile because String is not a
// subclass of Number.
// NumericFn<String> strOb = new NumericFn<String>("Error");
    }
}