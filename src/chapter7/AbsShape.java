package chapter7;

// Create an abstract class.
abstract class TwoDShape4 {
    private double width;
    private double height;
    private String name;
    // A default constructor.
    TwoDShape4() {
        width = height = 0.0;
        name = "null";
    }
    // Parameterized constructor.
    TwoDShape4(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }
    // Construct object with equal width and height.
    TwoDShape4(double x, String n) {
        width = height = x;
        name = n;
    }
    // Construct an object from an object.
    TwoDShape4(TwoDShape4 ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }
    // Accessor methods for width and height.
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }
    String getName() { return name; }
    void showDim() {
        System.out.println("Width and height are " +
                width + " and " + height);
    }
    // Now, area() is abstract.
    abstract double area();
}
// A subclass of TwoDShape for triangles.
class Triangle4 extends TwoDShape4 {
    private String style;
    // A default constructor.
    Triangle4() {
        super();
        style = "null";
    }
    // Constructor for Triangle.
    Triangle4(String s, double w, double h) {
        super(w, h, "triangle");
        style = s;
    }
    // Construct an isosceles triangle.
    Triangle4(double x) {
        super(x, "triangle"); // call superclass constructor
        style = "isosceles";
    }
    // Construct an object from an object.
    Triangle4(Triangle4 ob) {
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
// A subclass of TwoDShape for rectangles.
class Rectangle4 extends TwoDShape4 {
    // A default constructor.
    Rectangle4() {
        super();
    }
    // Constructor for Rectangle.
    Rectangle4(double w, double h) {
        super(w, h, "rectangle"); // call superclass constructor
    }
    // Construct a square.
    Rectangle4(double x) {
        super(x, "rectangle"); // call superclass constructor
    }
    // Construct an object from an object.
    Rectangle4(Rectangle4 ob) {
        super(ob); // pass object to TwoDShape constructor
    }
    boolean isSquare() {
        if(getWidth() == getHeight()) return true;
        return false;
    }
    double area() {
        return getWidth() * getHeight();
    }
}
class AbsShape {
    public static void main(String args[]) {
        TwoDShape4 shapes[] = new TwoDShape4[4];
        shapes[0] = new Triangle4("right", 8.0, 12.0);
        shapes[1] = new Rectangle4(10);
        shapes[2] = new Rectangle4(10, 4);
        shapes[3] = new Triangle4(7.0);
        for(int i=0; i < shapes.length; i++) {
            System.out.println("object is " +
                    shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());
            System.out.println();
        }
    }
}
