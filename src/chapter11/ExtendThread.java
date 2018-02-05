package chapter11;

/*
Project 11-1
Extend Thread.
*/
class MyThread3 extends Thread {
    int count;
    // Construct a new thread.
    MyThread3(String name) {
        super(name); // name thread
        count = 0;
        start(); // start the thread
    }
    // Begin execution of new thread.
    public void run() {
        System.out.println(getName() + " starting.");
        try {
            do {
                Thread.sleep(500);
                System.out.println("In " + getName() +
                        ", count is " + count);
                count++;
            } while(count < 10);
        }
        catch(InterruptedException exc) {
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " terminating.");
    }
}
class ExtendThread {
    public static void main(String args[]) {
        System.out.println("Main thread starting.");
        MyThread3 mt = new MyThread3("Child #1");
        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        } while (mt.count != 10);
        System.out.println("Main thread ending.");
    }
}