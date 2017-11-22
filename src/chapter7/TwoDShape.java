package chapter7;

class TwoDShape2 {
    private double width;
    private double height;
// A default constructor.
    TwoDShape2() {
        width = height = 0.0;
    }
    // Parameterized constructor.
    TwoDShape2(double w, double h) {
        width = w;
        height = h;
    }
    // Construct object with equal width and height.
    TwoDShape2(double x) {
        width = height = x;
    }
    // Construct an object from an object.
    TwoDShape2(TwoDShape2 ob) {
        width = ob.width;
        height = ob.height;
    }
    // Accessor methods for width and height.
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }
    void showDim() {
        System.out.println("Width and height are " +
                width + " and " + height);
    }
}
// A subclass of TwoDShape for triangles.
class Triangle2 extends TwoDShape2 {
    private String style;
    // A default constructor.
    Triangle2() {
        super();
        style = "null";
    }
// Constructor for Triangle.
    Triangle2(String s, double w, double h) {
        super(w, h); // call superclass constructor
        style = s;
    }
    // Construct an isosceles triangle.
    Triangle2(double x) {
        super(x); // call superclass constructor
        style = "isosceles";
    }
    // Construct an object from an object.
    Triangle2(Triangle2 ob) {
        super(ob); // pass object to TwoDShape constructor
        style = ob.style;
    }
    double area() {
        return getWidth() * getHeight() / 2;
    }
    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}
class Shapes7 {
    public static void main(String args[]) {
        Triangle2 t1 =
                new Triangle2("right", 8.0, 12.0);
// make a copy of t1
        Triangle2 t2 = new Triangle2(t1);
        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());
        System.out.println();
        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());
    }
}
