package ownwork;
//Ќапишите метод, который будет увеличивать заданный элемент массива на 10%.

class Xten {
    private double q[];
    int index;


    Xten(int size) {
        q = new double[size + 1];
        for (int i = 0; i < size; i++){
            q[i] = i;
        }
    }
    void Ten(int index) {
        q[index] *= 1.1;
    }
    double  Show(int index) {
        return q[index];
    }
}

class Demo{
    public static void main(String args[]){
Xten Ex1 = new Xten(12);
System.out.println ("»сходное число в €чейке 10: " + Ex1.Show(10));
Ex1.Ten(10);
System.out.println ("Ќовое число в €чейке 10: " + Ex1.Show(10));
Xten Ex2 = new Xten(15);
System.out.println ("»сходное число в €чейке 12: " + Ex2.Show(12));
Ex2.Ten(12);
System.out.println ("Ќовое число в €чейке 12: " + Ex2.Show(12));
    }
}

