package chapter11;

class MyThread2 implements Runnable {
    int count;
    Thread thrd;
    // Construct a new thread.
    MyThread2(String name) {
        thrd = new Thread(this, name);
        count = 0;
        thrd.start(); // start the thread
    }
    // Begin execution of new thread.
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        try {
            do {
                Thread.sleep(500);
                System.out.println("In " + thrd.getName() +
                        ", count is " + count);
                count++;
            } while(count < 10);
        }
        catch(InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " terminating.");
    }
}
class UseThreadsImproved {
    public static void main(String args[]) {
        System.out.println("Main thread starting.");
        MyThread2 mt = new MyThread2("Child #1");
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