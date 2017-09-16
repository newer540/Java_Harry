package ownwork;
/*class Test {
int a;
Test(int i) { a = i; }
}
write a method called swap( ) that exchanges the contents of the objects referred to by two
Test object references.*/

class Test {
    int a;
    Test (int i){
        a = i;
    }

    void swap(Test ob1, Test ob2){
        int t = ob1.a;
        ob1.a = ob2.a;
        ob2.a = t;
    }
}
class Test11{
    public static void main(String args[]){
        Test b1 = new Test(1);
        Test b2 = new Test(2);

        b1.swap(b1, b2);

        System.out.println("b1 = " + b1.a + " b2 = " + b2.a);
    }
}